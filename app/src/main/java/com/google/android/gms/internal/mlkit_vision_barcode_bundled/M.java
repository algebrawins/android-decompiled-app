package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class M extends S0 {
    public static final Logger g = Logger.getLogger(M.class.getName());

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f2816h = AbstractC0181e1.f2901e;

    /* renamed from: c  reason: collision with root package name */
    public C0220v0 f2817c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f2818d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2819e;

    /* renamed from: f  reason: collision with root package name */
    public int f2820f;

    public M(byte[] bArr, int r6) {
        int length = bArr.length;
        if (((length - r6) | r6) >= 0) {
            this.f2818d = bArr;
            this.f2820f = 0;
            this.f2819e = r6;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(r6)));
    }

    public static int I(int r02, D d4, N0 n02) {
        int b3 = d4.b(n02);
        int L3 = L(r02 << 3);
        return L3 + L3 + b3;
    }

    public static int J(int r02) {
        if (r02 >= 0) {
            return L(r02);
        }
        return 10;
    }

    public static int K(String str) {
        int length;
        try {
            length = AbstractC0187g1.c(str);
        } catch (C0184f1 unused) {
            length = str.getBytes(AbstractC0192j0.f2920a).length;
        }
        return L(length) + length;
    }

    public static int L(int r12) {
        if ((r12 & (-128)) == 0) {
            return 1;
        }
        if ((r12 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & r12) == 0) {
            return 3;
        }
        if ((r12 & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int M(long j3) {
        int r02;
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (j3 < 0) {
            return 10;
        }
        if (((-34359738368L) & j3) != 0) {
            j3 >>>= 28;
            r02 = 6;
        } else {
            r02 = 2;
        }
        if (((-2097152) & j3) != 0) {
            j3 >>>= 14;
            r02 += 2;
        }
        if ((j3 & (-16384)) != 0) {
            return r02 + 1;
        }
        return r02;
    }

    public final void A(long j3, int r3) {
        F((r3 << 3) | 1);
        B(j3);
    }

    public final void B(long j3) {
        try {
            byte[] bArr = this.f2818d;
            int r4 = this.f2820f;
            int r5 = r4 + 1;
            this.f2820f = r5;
            bArr[r4] = (byte) (((int) j3) & 255);
            int r6 = r4 + 2;
            this.f2820f = r6;
            bArr[r5] = (byte) (((int) (j3 >> 8)) & 255);
            int r52 = r4 + 3;
            this.f2820f = r52;
            bArr[r6] = (byte) (((int) (j3 >> 16)) & 255);
            int r62 = r4 + 4;
            this.f2820f = r62;
            bArr[r52] = (byte) (((int) (j3 >> 24)) & 255);
            int r53 = r4 + 5;
            this.f2820f = r53;
            bArr[r62] = (byte) (((int) (j3 >> 32)) & 255);
            int r63 = r4 + 6;
            this.f2820f = r63;
            bArr[r53] = (byte) (((int) (j3 >> 40)) & 255);
            int r54 = r4 + 7;
            this.f2820f = r54;
            bArr[r63] = (byte) (((int) (j3 >> 48)) & 255);
            this.f2820f = r4 + 8;
            bArr[r54] = (byte) (((int) (j3 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new K2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2820f), Integer.valueOf(this.f2819e), 1), e4);
        }
    }

    public final void C(String str, int r9) {
        F((r9 << 3) | 2);
        int r92 = this.f2820f;
        try {
            int L3 = L(str.length() * 3);
            int L4 = L(str.length());
            byte[] bArr = this.f2818d;
            int r3 = this.f2819e;
            if (L4 == L3) {
                int r02 = r92 + L4;
                this.f2820f = r02;
                int b3 = AbstractC0187g1.b(str, bArr, r02, r3 - r02);
                this.f2820f = r92;
                F((b3 - r92) - L4);
                this.f2820f = b3;
            } else {
                F(AbstractC0187g1.c(str));
                int r03 = this.f2820f;
                this.f2820f = AbstractC0187g1.b(str, bArr, r03, r3 - r03);
            }
        } catch (C0184f1 e4) {
            this.f2820f = r92;
            g.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(AbstractC0192j0.f2920a);
            try {
                int length = bytes.length;
                F(length);
                w(bytes, 0, length);
            } catch (IndexOutOfBoundsException e5) {
                throw new K2.b(e5);
            }
        } catch (IndexOutOfBoundsException e6) {
            throw new K2.b(e6);
        }
    }

    public final void D(int r12, int r22) {
        F((r12 << 3) | r22);
    }

    public final void E(int r12, int r22) {
        F(r12 << 3);
        F(r22);
    }

    public final void F(int r8) {
        while (true) {
            int r12 = r8 & (-128);
            byte[] bArr = this.f2818d;
            if (r12 == 0) {
                int r13 = this.f2820f;
                this.f2820f = r13 + 1;
                bArr[r13] = (byte) r8;
                return;
            }
            try {
                int r14 = this.f2820f;
                this.f2820f = r14 + 1;
                bArr[r14] = (byte) ((r8 & 127) | RecognitionOptions.ITF);
                r8 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new K2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2820f), Integer.valueOf(this.f2819e), 1), e4);
            }
            throw new K2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2820f), Integer.valueOf(this.f2819e), 1), e4);
        }
    }

    public final void G(long j3, int r3) {
        F(r3 << 3);
        H(j3);
    }

    public final void H(long j3) {
        byte[] bArr = this.f2818d;
        boolean z3 = f2816h;
        int r8 = this.f2819e;
        if (z3 && r8 - this.f2820f >= 10) {
            while ((j3 & (-128)) != 0) {
                int r22 = this.f2820f;
                this.f2820f = r22 + 1;
                AbstractC0181e1.f2899c.d(bArr, AbstractC0181e1.f2902f + r22, (byte) ((((int) j3) & 127) | RecognitionOptions.ITF));
                j3 >>>= 7;
            }
            int r23 = this.f2820f;
            this.f2820f = 1 + r23;
            long j4 = AbstractC0181e1.f2902f;
            AbstractC0181e1.f2899c.d(bArr, j4 + r23, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            try {
                int r24 = this.f2820f;
                this.f2820f = r24 + 1;
                bArr[r24] = (byte) ((((int) j3) & 127) | RecognitionOptions.ITF);
                j3 >>>= 7;
            } catch (IndexOutOfBoundsException e4) {
                throw new K2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2820f), Integer.valueOf(r8), 1), e4);
            }
        }
        int r25 = this.f2820f;
        this.f2820f = r25 + 1;
        bArr[r25] = (byte) j3;
    }

    public final void v(byte b3) {
        try {
            byte[] bArr = this.f2818d;
            int r22 = this.f2820f;
            this.f2820f = r22 + 1;
            bArr[r22] = b3;
        } catch (IndexOutOfBoundsException e4) {
            throw new K2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2820f), Integer.valueOf(this.f2819e), 1), e4);
        }
    }

    public final void w(byte[] bArr, int r6, int r7) {
        try {
            System.arraycopy(bArr, r6, this.f2818d, this.f2820f, r7);
            this.f2820f += r7;
        } catch (IndexOutOfBoundsException e4) {
            throw new K2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2820f), Integer.valueOf(this.f2819e), Integer.valueOf(r7)), e4);
        }
    }

    public final void x(int r12, L l3) {
        F((r12 << 3) | 2);
        F(l3.j());
        l3.r(this);
    }

    public final void y(int r12, int r22) {
        F((r12 << 3) | 5);
        z(r22);
    }

    public final void z(int r9) {
        try {
            byte[] bArr = this.f2818d;
            int r4 = this.f2820f;
            int r5 = r4 + 1;
            this.f2820f = r5;
            bArr[r4] = (byte) (r9 & 255);
            int r6 = r4 + 2;
            this.f2820f = r6;
            bArr[r5] = (byte) ((r9 >> 8) & 255);
            int r52 = r4 + 3;
            this.f2820f = r52;
            bArr[r6] = (byte) ((r9 >> 16) & 255);
            this.f2820f = r4 + 4;
            bArr[r52] = (byte) ((r9 >> 24) & 255);
        } catch (IndexOutOfBoundsException e4) {
            throw new K2.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2820f), Integer.valueOf(this.f2819e), 1), e4);
        }
    }
}
