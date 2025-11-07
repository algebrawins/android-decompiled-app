package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import x1.V3;

/* renamed from: androidx.datastore.preferences.protobuf.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116n extends V3 {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f2395f = Logger.getLogger(C0116n.class.getName());
    public static final boolean g = v0.f2427e;

    /* renamed from: a  reason: collision with root package name */
    public Q f2396a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2397b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2398c;

    /* renamed from: d  reason: collision with root package name */
    public int f2399d;

    /* renamed from: e  reason: collision with root package name */
    public final OutputStream f2400e;

    public C0116n(OutputStream outputStream, int r3) {
        if (r3 >= 0) {
            int max = Math.max(r3, 20);
            this.f2397b = new byte[max];
            this.f2398c = max;
            if (outputStream != null) {
                this.f2400e = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public static int A(long j3, int r22) {
        return B(j3) + x(r22);
    }

    public static int B(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public static int g(int r02) {
        return x(r02) + 1;
    }

    public static int h(int r02, C0111h c0111h) {
        return i(c0111h) + x(r02);
    }

    public static int i(C0111h c0111h) {
        int size = c0111h.size();
        return z(size) + size;
    }

    public static int j(int r02) {
        return x(r02) + 8;
    }

    public static int k(int r22, int r3) {
        return B(r3) + x(r22);
    }

    public static int l(int r02) {
        return x(r02) + 4;
    }

    public static int m(int r02) {
        return x(r02) + 8;
    }

    public static int n(int r02) {
        return x(r02) + 4;
    }

    public static int o(int r02, AbstractC0098a abstractC0098a, i0 i0Var) {
        return abstractC0098a.a(i0Var) + (x(r02) * 2);
    }

    public static int p(int r22, int r3) {
        return B(r3) + x(r22);
    }

    public static int q(long j3, int r22) {
        return B(j3) + x(r22);
    }

    public static int r(int r02) {
        return x(r02) + 4;
    }

    public static int s(int r02) {
        return x(r02) + 8;
    }

    public static int t(int r12, int r22) {
        return z((r22 >> 31) ^ (r22 << 1)) + x(r12);
    }

    public static int u(long j3, int r5) {
        return B((j3 >> 63) ^ (j3 << 1)) + x(r5);
    }

    public static int v(String str, int r12) {
        return w(str) + x(r12);
    }

    public static int w(String str) {
        int length;
        try {
            length = y0.a(str);
        } catch (x0 unused) {
            length = str.getBytes(G.f2298a).length;
        }
        return z(length) + length;
    }

    public static int x(int r02) {
        return z(r02 << 3);
    }

    public static int y(int r02, int r12) {
        return z(r12) + x(r02);
    }

    public static int z(int r02) {
        return (352 - (Integer.numberOfLeadingZeros(r02) * 9)) >>> 6;
    }

    public final void C() {
        this.f2400e.write(this.f2397b, 0, this.f2399d);
        this.f2399d = 0;
    }

    public final void D(int r3) {
        if (this.f2398c - this.f2399d < r3) {
            C();
        }
    }

    public final void E(byte b3) {
        if (this.f2399d == this.f2398c) {
            C();
        }
        int r02 = this.f2399d;
        this.f2399d = r02 + 1;
        this.f2397b[r02] = b3;
    }

    public final void F(byte[] bArr, int r6, int r7) {
        int r02 = this.f2399d;
        int r12 = this.f2398c;
        int r22 = r12 - r02;
        byte[] bArr2 = this.f2397b;
        if (r22 >= r7) {
            System.arraycopy(bArr, r6, bArr2, r02, r7);
            this.f2399d += r7;
            return;
        }
        System.arraycopy(bArr, r6, bArr2, r02, r22);
        int r62 = r6 + r22;
        int r72 = r7 - r22;
        this.f2399d = r12;
        C();
        if (r72 <= r12) {
            System.arraycopy(bArr, r62, bArr2, 0, r72);
            this.f2399d = r72;
            return;
        }
        this.f2400e.write(bArr, r62, r72);
    }

    public final void G(int r22, boolean z3) {
        D(11);
        d(r22, 0);
        byte b3 = z3 ? (byte) 1 : (byte) 0;
        int r3 = this.f2399d;
        this.f2399d = r3 + 1;
        this.f2397b[r3] = b3;
    }

    public final void H(int r22, C0111h c0111h) {
        R(r22, 2);
        I(c0111h);
    }

    public final void I(C0111h c0111h) {
        T(c0111h.size());
        a(c0111h.f2353K, c0111h.k(), c0111h.size());
    }

    public final void J(int r22, int r3) {
        D(14);
        d(r22, 5);
        b(r3);
    }

    public final void K(int r22) {
        D(4);
        b(r22);
    }

    public final void L(long j3, int r4) {
        D(18);
        d(r4, 1);
        c(j3);
    }

    public final void M(long j3) {
        D(8);
        c(j3);
    }

    public final void N(int r22, int r3) {
        D(20);
        d(r22, 0);
        if (r3 >= 0) {
            e(r3);
        } else {
            f(r3);
        }
    }

    public final void O(int r3) {
        if (r3 >= 0) {
            T(r3);
        } else {
            V(r3);
        }
    }

    public final void P(String str, int r3) {
        R(r3, 2);
        Q(str);
    }

    public final void Q(String str) {
        try {
            int length = str.length() * 3;
            int z3 = z(length);
            int r22 = z3 + length;
            int r3 = this.f2398c;
            if (r22 > r3) {
                byte[] bArr = new byte[length];
                int b3 = y0.f2430a.b(str, bArr, 0, length);
                T(b3);
                F(bArr, 0, b3);
                return;
            }
            if (r22 > r3 - this.f2399d) {
                C();
            }
            int z4 = z(str.length());
            int r23 = this.f2399d;
            byte[] bArr2 = this.f2397b;
            try {
                try {
                    if (z4 == z3) {
                        int r12 = r23 + z4;
                        this.f2399d = r12;
                        int b4 = y0.f2430a.b(str, bArr2, r12, r3 - r12);
                        this.f2399d = r23;
                        e((b4 - r23) - z4);
                        this.f2399d = b4;
                    } else {
                        int a4 = y0.a(str);
                        e(a4);
                        this.f2399d = y0.f2430a.b(str, bArr2, this.f2399d, a4);
                    }
                } catch (ArrayIndexOutOfBoundsException e4) {
                    throw new K2.b(e4);
                }
            } catch (x0 e5) {
                this.f2399d = r23;
                throw e5;
            }
        } catch (x0 e6) {
            f2395f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
            byte[] bytes = str.getBytes(G.f2298a);
            try {
                T(bytes.length);
                a(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e7) {
                throw new K2.b(e7);
            }
        }
    }

    public final void R(int r12, int r22) {
        T((r12 << 3) | r22);
    }

    public final void S(int r22, int r3) {
        D(20);
        d(r22, 0);
        e(r3);
    }

    public final void T(int r22) {
        D(5);
        e(r22);
    }

    public final void U(long j3, int r4) {
        D(20);
        d(r4, 0);
        f(j3);
    }

    public final void V(long j3) {
        D(10);
        f(j3);
    }

    @Override // x1.V3
    public final void a(byte[] bArr, int r22, int r3) {
        F(bArr, r22, r3);
    }

    public final void b(int r6) {
        int r02 = this.f2399d;
        int r12 = r02 + 1;
        this.f2399d = r12;
        byte[] bArr = this.f2397b;
        bArr[r02] = (byte) (r6 & 255);
        int r22 = r02 + 2;
        this.f2399d = r22;
        bArr[r12] = (byte) ((r6 >> 8) & 255);
        int r13 = r02 + 3;
        this.f2399d = r13;
        bArr[r22] = (byte) ((r6 >> 16) & 255);
        this.f2399d = r02 + 4;
        bArr[r13] = (byte) ((r6 >> 24) & 255);
    }

    public final void c(long j3) {
        int r02 = this.f2399d;
        int r12 = r02 + 1;
        this.f2399d = r12;
        byte[] bArr = this.f2397b;
        bArr[r02] = (byte) (j3 & 255);
        int r4 = r02 + 2;
        this.f2399d = r4;
        bArr[r12] = (byte) ((j3 >> 8) & 255);
        int r13 = r02 + 3;
        this.f2399d = r13;
        bArr[r4] = (byte) ((j3 >> 16) & 255);
        int r42 = r02 + 4;
        this.f2399d = r42;
        bArr[r13] = (byte) (255 & (j3 >> 24));
        int r14 = r02 + 5;
        this.f2399d = r14;
        bArr[r42] = (byte) (((int) (j3 >> 32)) & 255);
        int r22 = r02 + 6;
        this.f2399d = r22;
        bArr[r14] = (byte) (((int) (j3 >> 40)) & 255);
        int r15 = r02 + 7;
        this.f2399d = r15;
        bArr[r22] = (byte) (((int) (j3 >> 48)) & 255);
        this.f2399d = r02 + 8;
        bArr[r15] = (byte) (((int) (j3 >> 56)) & 255);
    }

    public final void d(int r12, int r22) {
        e((r12 << 3) | r22);
    }

    public final void e(int r5) {
        boolean z3 = g;
        byte[] bArr = this.f2397b;
        if (z3) {
            while ((r5 & (-128)) != 0) {
                int r02 = this.f2399d;
                this.f2399d = r02 + 1;
                v0.j(bArr, r02, (byte) ((r5 | RecognitionOptions.ITF) & 255));
                r5 >>>= 7;
            }
            int r03 = this.f2399d;
            this.f2399d = r03 + 1;
            v0.j(bArr, r03, (byte) r5);
            return;
        }
        while ((r5 & (-128)) != 0) {
            int r04 = this.f2399d;
            this.f2399d = r04 + 1;
            bArr[r04] = (byte) ((r5 | RecognitionOptions.ITF) & 255);
            r5 >>>= 7;
        }
        int r05 = this.f2399d;
        this.f2399d = r05 + 1;
        bArr[r05] = (byte) r5;
    }

    public final void f(long j3) {
        boolean z3 = g;
        byte[] bArr = this.f2397b;
        if (z3) {
            while ((j3 & (-128)) != 0) {
                int r02 = this.f2399d;
                this.f2399d = r02 + 1;
                v0.j(bArr, r02, (byte) ((((int) j3) | RecognitionOptions.ITF) & 255));
                j3 >>>= 7;
            }
            int r03 = this.f2399d;
            this.f2399d = r03 + 1;
            v0.j(bArr, r03, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int r04 = this.f2399d;
            this.f2399d = r04 + 1;
            bArr[r04] = (byte) ((((int) j3) | RecognitionOptions.ITF) & 255);
            j3 >>>= 7;
        }
        int r05 = this.f2399d;
        this.f2399d = r05 + 1;
        bArr[r05] = (byte) j3;
    }
}
