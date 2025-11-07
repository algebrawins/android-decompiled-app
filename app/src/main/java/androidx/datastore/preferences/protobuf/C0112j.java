package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112j extends AbstractC0113k {

    /* renamed from: c  reason: collision with root package name */
    public final InputStream f2364c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f2365d;

    /* renamed from: e  reason: collision with root package name */
    public int f2366e;

    /* renamed from: f  reason: collision with root package name */
    public int f2367f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f2368h;

    /* renamed from: i  reason: collision with root package name */
    public int f2369i;

    /* renamed from: j  reason: collision with root package name */
    public int f2370j = Integer.MAX_VALUE;

    public C0112j(InputStream inputStream) {
        Charset charset = G.f2298a;
        this.f2364c = inputStream;
        this.f2365d = new byte[RecognitionOptions.AZTEC];
        this.f2366e = 0;
        this.g = 0;
        this.f2369i = 0;
    }

    public final byte[] A(int r8) {
        if (r8 == 0) {
            return G.f2299b;
        }
        if (r8 >= 0) {
            int r02 = this.f2369i;
            int r12 = this.g;
            int r22 = r02 + r12 + r8;
            if (r22 - Integer.MAX_VALUE <= 0) {
                int r3 = this.f2370j;
                if (r22 <= r3) {
                    int r03 = this.f2366e - r12;
                    int r13 = r8 - r03;
                    InputStream inputStream = this.f2364c;
                    if (r13 >= 4096) {
                        try {
                            if (r13 > inputStream.available()) {
                                return null;
                            }
                        } catch (I e4) {
                            e4.f2300J = true;
                            throw e4;
                        }
                    }
                    byte[] bArr = new byte[r8];
                    System.arraycopy(this.f2365d, this.g, bArr, 0, r03);
                    this.f2369i += this.f2366e;
                    this.g = 0;
                    this.f2366e = 0;
                    while (r03 < r8) {
                        try {
                            int read = inputStream.read(bArr, r03, r8 - r03);
                            if (read != -1) {
                                this.f2369i += read;
                                r03 += read;
                            } else {
                                throw I.e();
                            }
                        } catch (I e5) {
                            e5.f2300J = true;
                            throw e5;
                        }
                    }
                    return bArr;
                }
                J((r3 - r02) - r12);
                throw I.e();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw I.d();
    }

    public final ArrayList B(int r7) {
        ArrayList arrayList = new ArrayList();
        while (r7 > 0) {
            int min = Math.min(r7, (int) RecognitionOptions.AZTEC);
            byte[] bArr = new byte[min];
            int r3 = 0;
            while (r3 < min) {
                int read = this.f2364c.read(bArr, r3, min - r3);
                if (read != -1) {
                    this.f2369i += read;
                    r3 += read;
                } else {
                    throw I.e();
                }
            }
            r7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int r02 = this.g;
        if (this.f2366e - r02 < 4) {
            I(4);
            r02 = this.g;
        }
        this.g = r02 + 4;
        byte[] bArr = this.f2365d;
        return ((bArr[r02 + 3] & 255) << 24) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16);
    }

    public final long D() {
        int r02 = this.g;
        if (this.f2366e - r02 < 8) {
            I(8);
            r02 = this.g;
        }
        this.g = r02 + 8;
        byte[] bArr = this.f2365d;
        return ((bArr[r02 + 7] & 255) << 56) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16) | ((bArr[r02 + 3] & 255) << 24) | ((bArr[r02 + 4] & 255) << 32) | ((bArr[r02 + 5] & 255) << 40) | ((bArr[r02 + 6] & 255) << 48);
    }

    public final int E() {
        int r02;
        int r03 = this.g;
        int r12 = this.f2366e;
        if (r12 != r03) {
            int r22 = r03 + 1;
            byte[] bArr = this.f2365d;
            byte b3 = bArr[r03];
            if (b3 >= 0) {
                this.g = r22;
                return b3;
            } else if (r12 - r22 >= 9) {
                int r13 = r03 + 2;
                int r23 = (bArr[r22] << 7) ^ b3;
                if (r23 < 0) {
                    r02 = r23 ^ (-128);
                } else {
                    int r4 = r03 + 3;
                    int r14 = (bArr[r13] << 14) ^ r23;
                    if (r14 >= 0) {
                        r02 = r14 ^ 16256;
                    } else {
                        int r24 = r03 + 4;
                        int r15 = r14 ^ (bArr[r4] << 21);
                        if (r15 < 0) {
                            r02 = (-2080896) ^ r15;
                        } else {
                            r4 = r03 + 5;
                            byte b4 = bArr[r24];
                            int r16 = (r15 ^ (b4 << 28)) ^ 266354560;
                            if (b4 < 0) {
                                r24 = r03 + 6;
                                if (bArr[r4] < 0) {
                                    r4 = r03 + 7;
                                    if (bArr[r24] < 0) {
                                        r24 = r03 + 8;
                                        if (bArr[r4] < 0) {
                                            r4 = r03 + 9;
                                            if (bArr[r24] < 0) {
                                                int r04 = r03 + 10;
                                                if (bArr[r4] >= 0) {
                                                    r13 = r04;
                                                    r02 = r16;
                                                }
                                            }
                                        }
                                    }
                                }
                                r02 = r16;
                            }
                            r02 = r16;
                        }
                        r13 = r24;
                    }
                    r13 = r4;
                }
                this.g = r13;
                return r02;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j3;
        long j4;
        long j5;
        long j6;
        int r02 = this.g;
        int r12 = this.f2366e;
        if (r12 != r02) {
            int r22 = r02 + 1;
            byte[] bArr = this.f2365d;
            byte b3 = bArr[r02];
            if (b3 >= 0) {
                this.g = r22;
                return b3;
            } else if (r12 - r22 >= 9) {
                int r13 = r02 + 2;
                int r23 = (bArr[r22] << 7) ^ b3;
                if (r23 < 0) {
                    j3 = r23 ^ (-128);
                } else {
                    int r4 = r02 + 3;
                    int r14 = (bArr[r13] << 14) ^ r23;
                    if (r14 >= 0) {
                        j3 = r14 ^ 16256;
                        r13 = r4;
                    } else {
                        int r24 = r02 + 4;
                        int r15 = r14 ^ (bArr[r4] << 21);
                        if (r15 < 0) {
                            j6 = (-2080896) ^ r15;
                        } else {
                            long j7 = r15;
                            r13 = r02 + 5;
                            long j8 = j7 ^ (bArr[r24] << 28);
                            if (j8 >= 0) {
                                j5 = 266354560;
                            } else {
                                r24 = r02 + 6;
                                long j9 = j8 ^ (bArr[r13] << 35);
                                if (j9 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    r13 = r02 + 7;
                                    j8 = j9 ^ (bArr[r24] << 42);
                                    if (j8 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        r24 = r02 + 8;
                                        j9 = j8 ^ (bArr[r13] << 49);
                                        if (j9 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            r13 = r02 + 9;
                                            long j10 = (j9 ^ (bArr[r24] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                int r03 = r02 + 10;
                                                if (bArr[r13] >= 0) {
                                                    r13 = r03;
                                                }
                                            }
                                            j3 = j10;
                                        }
                                    }
                                }
                                j6 = j4 ^ j9;
                            }
                            j3 = j5 ^ j8;
                        }
                        r13 = r24;
                        j3 = j6;
                    }
                }
                this.g = r13;
                return j3;
            }
        }
        return G();
    }

    public final long G() {
        long j3 = 0;
        for (int r22 = 0; r22 < 64; r22 += 7) {
            if (this.g == this.f2366e) {
                I(1);
            }
            int r3 = this.g;
            this.g = r3 + 1;
            byte b3 = this.f2365d[r3];
            j3 |= (b3 & Byte.MAX_VALUE) << r22;
            if ((b3 & 128) == 0) {
                return j3;
            }
        }
        throw I.c();
    }

    public final void H() {
        int r02 = this.f2366e + this.f2367f;
        this.f2366e = r02;
        int r12 = this.f2369i + r02;
        int r22 = this.f2370j;
        if (r12 > r22) {
            int r13 = r12 - r22;
            this.f2367f = r13;
            this.f2366e = r02 - r13;
            return;
        }
        this.f2367f = 0;
    }

    public final void I(int r3) {
        if (!K(r3)) {
            if (r3 > (Integer.MAX_VALUE - this.f2369i) - this.g) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw I.e();
        }
    }

    public final void J(int r11) {
        int r02 = this.f2366e;
        int r12 = this.g;
        if (r11 <= r02 - r12 && r11 >= 0) {
            this.g = r12 + r11;
            return;
        }
        InputStream inputStream = this.f2364c;
        if (r11 >= 0) {
            int r3 = this.f2369i;
            int r4 = r3 + r12;
            int r5 = r4 + r11;
            int r6 = this.f2370j;
            if (r5 <= r6) {
                this.f2369i = r4;
                int r03 = r02 - r12;
                this.f2366e = 0;
                this.g = 0;
                while (r03 < r11) {
                    long j3 = r11 - r03;
                    try {
                        try {
                            long skip = inputStream.skip(j3);
                            int r9 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (r9 >= 0 && skip <= j3) {
                                if (r9 == 0) {
                                    break;
                                }
                                r03 += (int) skip;
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (I e4) {
                            e4.f2300J = true;
                            throw e4;
                        }
                    } catch (Throwable th) {
                        this.f2369i += r03;
                        H();
                        throw th;
                    }
                }
                this.f2369i += r03;
                H();
                if (r03 < r11) {
                    int r04 = this.f2366e;
                    int r22 = r04 - this.g;
                    this.g = r04;
                    I(1);
                    while (true) {
                        int r05 = r11 - r22;
                        int r32 = this.f2366e;
                        if (r05 > r32) {
                            r22 += r32;
                            this.g = r32;
                            I(1);
                        } else {
                            this.g = r05;
                            return;
                        }
                    }
                }
            } else {
                J((r6 - r3) - r12);
                throw I.e();
            }
        } else {
            throw I.d();
        }
    }

    public final boolean K(int r7) {
        InputStream inputStream;
        int r02 = this.g;
        int r12 = r02 + r7;
        int r22 = this.f2366e;
        if (r12 > r22) {
            int r13 = this.f2369i;
            if (r7 > (Integer.MAX_VALUE - r13) - r02 || r13 + r02 + r7 > this.f2370j) {
                return false;
            }
            byte[] bArr = this.f2365d;
            if (r02 > 0) {
                if (r22 > r02) {
                    System.arraycopy(bArr, r02, bArr, 0, r22 - r02);
                }
                this.f2369i += r02;
                this.f2366e -= r02;
                this.g = 0;
            }
            int r03 = this.f2366e;
            int min = Math.min(bArr.length - r03, (Integer.MAX_VALUE - this.f2369i) - r03);
            try {
                int read = this.f2364c.read(bArr, r03, min);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f2366e += read;
                    H();
                    if (this.f2366e >= r7) {
                        return true;
                    }
                    return K(r7);
                }
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (I e4) {
                e4.f2300J = true;
                throw e4;
            }
        }
        throw new IllegalStateException(D.C.v(r7, "refillBuffer() called when ", " bytes were already available in buffer"));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final void a(int r22) {
        if (this.f2368h == r22) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int b() {
        return this.f2369i + this.g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final boolean c() {
        if (this.g == this.f2366e && !K(1)) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final void d(int r12) {
        this.f2370j = r12;
        H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int e(int r3) {
        if (r3 >= 0) {
            int r02 = this.f2369i + this.g + r3;
            if (r02 >= 0) {
                int r32 = this.f2370j;
                if (r02 <= r32) {
                    this.f2370j = r02;
                    H();
                    return r32;
                }
                throw I.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw I.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final boolean f() {
        if (F() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final C0111h g() {
        int E3 = E();
        int r12 = this.f2366e;
        int r22 = this.g;
        int r13 = r12 - r22;
        byte[] bArr = this.f2365d;
        if (E3 <= r13 && E3 > 0) {
            C0111h i3 = C0111h.i(bArr, r22, E3);
            this.g += E3;
            return i3;
        } else if (E3 == 0) {
            return C0111h.f2350L;
        } else {
            if (E3 >= 0) {
                byte[] A3 = A(E3);
                if (A3 != null) {
                    return C0111h.i(A3, 0, A3.length);
                }
                int r14 = this.g;
                int r4 = this.f2366e;
                int r5 = r4 - r14;
                this.f2369i += r4;
                this.g = 0;
                this.f2366e = 0;
                ArrayList B3 = B(E3 - r5);
                byte[] bArr2 = new byte[E3];
                System.arraycopy(bArr, r14, bArr2, 0, r5);
                Iterator it = B3.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, r5, bArr3.length);
                    r5 += bArr3.length;
                }
                C0111h c0111h = C0111h.f2350L;
                return new C0111h(bArr2);
            }
            throw I.d();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int i() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final long k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int m() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final long n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int o() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final long p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int q() {
        int E3 = E();
        return (-(E3 & 1)) ^ (E3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final long r() {
        long F3 = F();
        return (-(F3 & 1)) ^ (F3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final String s() {
        int E3 = E();
        byte[] bArr = this.f2365d;
        if (E3 > 0) {
            int r22 = this.f2366e;
            int r3 = this.g;
            if (E3 <= r22 - r3) {
                String str = new String(bArr, r3, E3, G.f2298a);
                this.g += E3;
                return str;
            }
        }
        if (E3 == 0) {
            return "";
        }
        if (E3 >= 0) {
            if (E3 <= this.f2366e) {
                I(E3);
                String str2 = new String(bArr, this.g, E3, G.f2298a);
                this.g += E3;
                return str2;
            }
            return new String(z(E3), G.f2298a);
        }
        throw I.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final String t() {
        int E3 = E();
        int r12 = this.g;
        int r22 = this.f2366e;
        int r3 = r22 - r12;
        byte[] bArr = this.f2365d;
        if (E3 <= r3 && E3 > 0) {
            this.g = r12 + E3;
        } else if (E3 == 0) {
            return "";
        } else {
            if (E3 >= 0) {
                r12 = 0;
                if (E3 <= r22) {
                    I(E3);
                    this.g = E3;
                } else {
                    bArr = z(E3);
                }
            } else {
                throw I.d();
            }
        }
        return y0.f2430a.a(bArr, r12, E3);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int u() {
        if (c()) {
            this.f2368h = 0;
            return 0;
        }
        int E3 = E();
        this.f2368h = E3;
        if ((E3 >>> 3) != 0) {
            return E3;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int v() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final long w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final boolean x(int r6) {
        int r02 = r6 & 7;
        int r22 = 0;
        if (r02 != 0) {
            if (r02 != 1) {
                if (r02 != 2) {
                    if (r02 != 3) {
                        if (r02 == 4) {
                            return false;
                        }
                        if (r02 == 5) {
                            J(4);
                            return true;
                        }
                        throw I.b();
                    }
                    y();
                    a(((r6 >>> 3) << 3) | 4);
                    return true;
                }
                J(E());
                return true;
            }
            J(8);
            return true;
        }
        int r62 = this.f2366e - this.g;
        byte[] bArr = this.f2365d;
        if (r62 >= 10) {
            while (r22 < 10) {
                int r63 = this.g;
                this.g = r63 + 1;
                if (bArr[r63] < 0) {
                    r22++;
                }
            }
            throw I.c();
        }
        while (r22 < 10) {
            if (this.g == this.f2366e) {
                I(1);
            }
            int r64 = this.g;
            this.g = r64 + 1;
            if (bArr[r64] < 0) {
                r22++;
            }
        }
        throw I.c();
        return true;
    }

    public final byte[] z(int r6) {
        byte[] A3 = A(r6);
        if (A3 != null) {
            return A3;
        }
        int r02 = this.g;
        int r12 = this.f2366e;
        int r22 = r12 - r02;
        this.f2369i += r12;
        this.g = 0;
        this.f2366e = 0;
        ArrayList B3 = B(r6 - r22);
        byte[] bArr = new byte[r6];
        System.arraycopy(this.f2365d, r02, bArr, 0, r22);
        Iterator it = B3.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, r22, bArr2.length);
            r22 += bArr2.length;
        }
        return bArr;
    }
}
