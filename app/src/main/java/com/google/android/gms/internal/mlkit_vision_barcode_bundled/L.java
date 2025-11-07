package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class L implements Iterable, Serializable {

    /* renamed from: K  reason: collision with root package name */
    public static final K f2812K = new K(AbstractC0192j0.f2921b);

    /* renamed from: J  reason: collision with root package name */
    public int f2813J = 0;

    static {
        int r02 = F.f2787a;
    }

    public static L i(Iterator it, int r9) {
        L l3;
        if (r9 > 0) {
            if (r9 == 1) {
                return (L) it.next();
            }
            int r12 = r9 >>> 1;
            L i3 = i(it, r12);
            L i4 = i(it, r9 - r12);
            if (Integer.MAX_VALUE - i3.j() >= i4.j()) {
                if (i4.j() == 0) {
                    return i3;
                }
                if (i3.j() != 0) {
                    int j3 = i4.j() + i3.j();
                    if (j3 < 128) {
                        int j4 = i3.j();
                        int j5 = i4.j();
                        int r3 = j4 + j5;
                        byte[] bArr = new byte[r3];
                        t(0, j4, i3.j());
                        t(0, j4, r3);
                        if (j4 > 0) {
                            i3.k(0, 0, j4, bArr);
                        }
                        t(0, j5, i4.j());
                        t(j4, r3, r3);
                        if (j5 > 0) {
                            i4.k(0, j4, j5, bArr);
                        }
                        return new K(bArr);
                    }
                    if (i3 instanceof M0) {
                        M0 m02 = (M0) i3;
                        L l4 = m02.f2824N;
                        int j6 = i4.j() + l4.j();
                        L l5 = m02.f2823M;
                        if (j6 < 128) {
                            int j7 = l4.j();
                            int j8 = i4.j();
                            int r22 = j7 + j8;
                            byte[] bArr2 = new byte[r22];
                            t(0, j7, l4.j());
                            t(0, j7, r22);
                            if (j7 > 0) {
                                l4.k(0, 0, j7, bArr2);
                            }
                            t(0, j8, i4.j());
                            t(j7, r22, r22);
                            if (j8 > 0) {
                                i4.k(0, j7, j8, bArr2);
                            }
                            l3 = new M0(l5, new K(bArr2));
                            return l3;
                        } else if (l5.l() > l4.l() && m02.f2826P > i4.l()) {
                            return new M0(l5, new M0(l4, i4));
                        }
                    }
                    if (j3 >= M0.z(Math.max(i3.l(), i4.l()) + 1)) {
                        l3 = new M0(i3, i4);
                    } else {
                        C0220v0 c0220v0 = new C0220v0(2);
                        c0220v0.f(i3);
                        c0220v0.f(i4);
                        ArrayDeque arrayDeque = (ArrayDeque) c0220v0.f2985a;
                        l3 = (L) arrayDeque.pop();
                        while (!arrayDeque.isEmpty()) {
                            l3 = new M0((L) arrayDeque.pop(), l3);
                        }
                    }
                    return l3;
                }
                return i4;
            }
            throw new IllegalArgumentException(D.C.x("ByteString would be too long: ", i3.j(), "+", i4.j()));
        }
        throw new IllegalArgumentException(D.C.v(r9, "length (", ") must be >= 1"));
    }

    public static int t(int r3, int r4, int r5) {
        int r12 = r4 - r3;
        if ((r3 | r4 | r12 | (r5 - r4)) < 0) {
            if (r3 >= 0) {
                if (r4 < r3) {
                    throw new IndexOutOfBoundsException(D.C.x("Beginning index larger than ending index: ", r3, ", ", r4));
                }
                throw new IndexOutOfBoundsException(D.C.x("End index: ", r4, " >= ", r5));
            }
            throw new IndexOutOfBoundsException(D.C.v(r3, "Beginning index: ", " < 0"));
        }
        return r12;
    }

    public static K v(byte[] bArr, int r4, int r5) {
        t(r4, r4 + r5, bArr.length);
        byte[] bArr2 = new byte[r5];
        System.arraycopy(bArr, r4, bArr2, 0, r5);
        return new K(bArr2);
    }

    public static L w(InputStream inputStream) {
        K v3;
        ArrayList arrayList = new ArrayList();
        int r12 = RecognitionOptions.QR_CODE;
        while (true) {
            byte[] bArr = new byte[r12];
            int r4 = 0;
            while (r4 < r12) {
                int read = inputStream.read(bArr, r4, r12 - r4);
                if (read == -1) {
                    break;
                }
                r4 += read;
            }
            if (r4 == 0) {
                v3 = null;
            } else {
                v3 = v(bArr, 0, r4);
            }
            if (v3 == null) {
                break;
            }
            arrayList.add(v3);
            r12 = Math.min(r12 + r12, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f2812K;
        }
        return i(arrayList.iterator(), size);
    }

    public static void y(int r3, int r4) {
        if (((r4 - (r3 + 1)) | r3) < 0) {
            if (r3 < 0) {
                throw new ArrayIndexOutOfBoundsException(D.C.w("Index < 0: ", r3));
            }
            throw new ArrayIndexOutOfBoundsException(D.C.x("Index > length: ", r3, ", ", r4));
        }
    }

    public abstract byte e(int r12);

    public abstract byte h(int r12);

    public final int hashCode() {
        int r02 = this.f2813J;
        if (r02 == 0) {
            int j3 = j();
            r02 = n(j3, 0, j3);
            if (r02 == 0) {
                r02 = 1;
            }
            this.f2813J = r02;
        }
        return r02;
    }

    public abstract int j();

    public abstract void k(int r12, int r22, int r3, byte[] bArr);

    public abstract int l();

    public abstract boolean m();

    public abstract int n(int r12, int r22, int r3);

    public abstract int o(int r12, int r22, int r3);

    public abstract L p(int r12, int r22);

    public abstract String q(Charset charset);

    public abstract void r(M m3);

    public abstract boolean s();

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int j3 = j();
        if (j() <= 50) {
            concat = S0.b(this);
        } else {
            concat = S0.b(p(0, 47)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(j3);
        sb.append(" contents=\"");
        return D.C.z(sb, concat, "\">");
    }

    @Override // java.lang.Iterable
    /* renamed from: u */
    public I iterator() {
        return new H(this);
    }

    public final String x(Charset charset) {
        if (j() == 0) {
            return "";
        }
        return q(charset);
    }
}
