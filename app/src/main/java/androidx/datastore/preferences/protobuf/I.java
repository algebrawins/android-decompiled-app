package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends AbstractC0113k {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2358c;

    /* renamed from: d  reason: collision with root package name */
    public int f2359d;

    /* renamed from: e  reason: collision with root package name */
    public int f2360e;

    /* renamed from: f  reason: collision with root package name */
    public int f2361f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public int f2362h;

    /* renamed from: i  reason: collision with root package name */
    public int f2363i = Integer.MAX_VALUE;

    public i(byte[] bArr, int r22, int r3, boolean z3) {
        this.f2358c = bArr;
        this.f2359d = r3 + r22;
        this.f2361f = r22;
        this.g = r22;
    }

    public final long A() {
        int r02 = this.f2361f;
        if (this.f2359d - r02 >= 8) {
            this.f2361f = r02 + 8;
            byte[] bArr = this.f2358c;
            return ((bArr[r02 + 7] & 255) << 56) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16) | ((bArr[r02 + 3] & 255) << 24) | ((bArr[r02 + 4] & 255) << 32) | ((bArr[r02 + 5] & 255) << 40) | ((bArr[r02 + 6] & 255) << 48);
        }
        throw I.e();
    }

    public final int B() {
        int r02;
        int r03 = this.f2361f;
        int r12 = this.f2359d;
        if (r12 != r03) {
            int r22 = r03 + 1;
            byte[] bArr = this.f2358c;
            byte b3 = bArr[r03];
            if (b3 >= 0) {
                this.f2361f = r22;
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
                this.f2361f = r13;
                return r02;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j3;
        long j4;
        long j5;
        long j6;
        int r02 = this.f2361f;
        int r12 = this.f2359d;
        if (r12 != r02) {
            int r22 = r02 + 1;
            byte[] bArr = this.f2358c;
            byte b3 = bArr[r02];
            if (b3 >= 0) {
                this.f2361f = r22;
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
                this.f2361f = r13;
                return j3;
            }
        }
        return D();
    }

    public final long D() {
        long j3 = 0;
        for (int r22 = 0; r22 < 64; r22 += 7) {
            int r3 = this.f2361f;
            if (r3 != this.f2359d) {
                this.f2361f = r3 + 1;
                byte b3 = this.f2358c[r3];
                j3 |= (b3 & Byte.MAX_VALUE) << r22;
                if ((b3 & 128) == 0) {
                    return j3;
                }
            } else {
                throw I.e();
            }
        }
        throw I.c();
    }

    public final void E() {
        int r02 = this.f2359d + this.f2360e;
        this.f2359d = r02;
        int r12 = r02 - this.g;
        int r22 = this.f2363i;
        if (r12 > r22) {
            int r13 = r12 - r22;
            this.f2360e = r13;
            this.f2359d = r02 - r13;
            return;
        }
        this.f2360e = 0;
    }

    public final void F(int r3) {
        if (r3 >= 0) {
            int r02 = this.f2359d;
            int r12 = this.f2361f;
            if (r3 <= r02 - r12) {
                this.f2361f = r12 + r3;
                return;
            }
        }
        if (r3 < 0) {
            throw I.d();
        }
        throw I.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final void a(int r22) {
        if (this.f2362h == r22) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int b() {
        return this.f2361f - this.g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final boolean c() {
        if (this.f2361f == this.f2359d) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final void d(int r12) {
        this.f2363i = r12;
        E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int e(int r22) {
        if (r22 >= 0) {
            int b3 = b() + r22;
            if (b3 >= 0) {
                int r23 = this.f2363i;
                if (b3 <= r23) {
                    this.f2363i = b3;
                    E();
                    return r23;
                }
                throw I.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw I.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final boolean f() {
        if (C() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final C0111h g() {
        byte[] bArr;
        int B3 = B();
        byte[] bArr2 = this.f2358c;
        if (B3 > 0) {
            int r22 = this.f2359d;
            int r3 = this.f2361f;
            if (B3 <= r22 - r3) {
                C0111h i3 = C0111h.i(bArr2, r3, B3);
                this.f2361f += B3;
                return i3;
            }
        }
        if (B3 == 0) {
            return C0111h.f2350L;
        }
        if (B3 > 0) {
            int r23 = this.f2359d;
            int r32 = this.f2361f;
            if (B3 <= r23 - r32) {
                int r02 = B3 + r32;
                this.f2361f = r02;
                bArr = Arrays.copyOfRange(bArr2, r32, r02);
                C0111h c0111h = C0111h.f2350L;
                return new C0111h(bArr);
            }
        }
        if (B3 <= 0) {
            if (B3 == 0) {
                bArr = G.f2299b;
                C0111h c0111h2 = C0111h.f2350L;
                return new C0111h(bArr);
            }
            throw I.d();
        }
        throw I.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int i() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int j() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final long k() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int m() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final long n() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int o() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final long p() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int q() {
        int B3 = B();
        return (-(B3 & 1)) ^ (B3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final long r() {
        long C3 = C();
        return (-(C3 & 1)) ^ (C3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final String s() {
        int B3 = B();
        if (B3 > 0) {
            int r12 = this.f2359d;
            int r22 = this.f2361f;
            if (B3 <= r12 - r22) {
                String str = new String(this.f2358c, r22, B3, G.f2298a);
                this.f2361f += B3;
                return str;
            }
        }
        if (B3 == 0) {
            return "";
        }
        if (B3 < 0) {
            throw I.d();
        }
        throw I.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final String t() {
        int B3 = B();
        if (B3 > 0) {
            int r12 = this.f2359d;
            int r22 = this.f2361f;
            if (B3 <= r12 - r22) {
                String a4 = y0.f2430a.a(this.f2358c, r22, B3);
                this.f2361f += B3;
                return a4;
            }
        }
        if (B3 == 0) {
            return "";
        }
        if (B3 <= 0) {
            throw I.d();
        }
        throw I.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int u() {
        if (c()) {
            this.f2362h = 0;
            return 0;
        }
        int B3 = B();
        this.f2362h = B3;
        if ((B3 >>> 3) != 0) {
            return B3;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final int v() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0113k
    public final long w() {
        return C();
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
                            F(4);
                            return true;
                        }
                        throw I.b();
                    }
                    y();
                    a(((r6 >>> 3) << 3) | 4);
                    return true;
                }
                F(B());
                return true;
            }
            F(8);
            return true;
        }
        int r62 = this.f2359d - this.f2361f;
        byte[] bArr = this.f2358c;
        if (r62 >= 10) {
            while (r22 < 10) {
                int r63 = this.f2361f;
                this.f2361f = r63 + 1;
                if (bArr[r63] < 0) {
                    r22++;
                }
            }
            throw I.c();
        }
        while (r22 < 10) {
            int r64 = this.f2361f;
            if (r64 != this.f2359d) {
                this.f2361f = r64 + 1;
                if (bArr[r64] < 0) {
                    r22++;
                }
            } else {
                throw I.e();
            }
        }
        throw I.c();
        return true;
    }

    public final int z() {
        int r02 = this.f2361f;
        if (this.f2359d - r02 >= 4) {
            this.f2361f = r02 + 4;
            byte[] bArr = this.f2358c;
            return ((bArr[r02 + 3] & 255) << 24) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16);
        }
        throw I.e();
    }
}
