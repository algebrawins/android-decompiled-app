package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import x1.W3;

/* renamed from: androidx.datastore.preferences.protobuf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0111h implements Iterable, Serializable {

    /* renamed from: L  reason: collision with root package name */
    public static final C0111h f2350L = new C0111h(G.f2299b);

    /* renamed from: M  reason: collision with root package name */
    public static final C0108f f2351M;

    /* renamed from: J  reason: collision with root package name */
    public int f2352J = 0;

    /* renamed from: K  reason: collision with root package name */
    public final byte[] f2353K;

    static {
        C0108f c0108f;
        if (AbstractC0102c.a()) {
            c0108f = new C0108f(1);
        } else {
            c0108f = new C0108f(0);
        }
        f2351M = c0108f;
    }

    public C0111h(byte[] bArr) {
        bArr.getClass();
        this.f2353K = bArr;
    }

    public static int h(int r3, int r4, int r5) {
        int r02 = r4 - r3;
        if ((r3 | r4 | r02 | (r5 - r4)) < 0) {
            if (r3 >= 0) {
                if (r4 < r3) {
                    throw new IndexOutOfBoundsException(D.C.x("Beginning index larger than ending index: ", r3, ", ", r4));
                }
                throw new IndexOutOfBoundsException(D.C.x("End index: ", r4, " >= ", r5));
            }
            throw new IndexOutOfBoundsException(D.C.v(r3, "Beginning index: ", " < 0"));
        }
        return r02;
    }

    public static C0111h i(byte[] bArr, int r4, int r5) {
        byte[] copyOfRange;
        h(r4, r4 + r5, bArr.length);
        switch (f2351M.f2341a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                copyOfRange = Arrays.copyOfRange(bArr, r4, r5 + r4);
                break;
            default:
                copyOfRange = new byte[r5];
                System.arraycopy(bArr, r4, copyOfRange, 0, r5);
                break;
        }
        return new C0111h(copyOfRange);
    }

    public byte e(int r22) {
        return this.f2353K[r22];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0111h) || size() != ((C0111h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C0111h) {
            C0111h c0111h = (C0111h) obj;
            int r12 = this.f2352J;
            int r3 = c0111h.f2352J;
            if (r12 != 0 && r3 != 0 && r12 != r3) {
                return false;
            }
            int size = size();
            if (size <= c0111h.size()) {
                if (size <= c0111h.size()) {
                    int k3 = k() + size;
                    int k4 = k();
                    int k5 = c0111h.k();
                    while (k4 < k3) {
                        if (this.f2353K[k4] != c0111h.f2353K[k5]) {
                            return false;
                        }
                        k4++;
                        k5++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0111h.size());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    public final int hashCode() {
        int r02 = this.f2352J;
        if (r02 == 0) {
            int size = size();
            int k3 = k();
            int r3 = size;
            for (int r22 = k3; r22 < k3 + size; r22++) {
                r3 = (r3 * 31) + this.f2353K[r22];
            }
            if (r3 == 0) {
                r02 = 1;
            } else {
                r02 = r3;
            }
            this.f2352J = r02;
        }
        return r02;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0106e(this);
    }

    public void j(byte[] bArr, int r4) {
        System.arraycopy(this.f2353K, 0, bArr, 0, r4);
    }

    public int k() {
        return 0;
    }

    public byte l(int r22) {
        return this.f2353K[r22];
    }

    public int size() {
        return this.f2353K.length;
    }

    public final String toString() {
        C0111h c0110g;
        String sb;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb = W3.a(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int h3 = h(0, 47, size());
            if (h3 == 0) {
                c0110g = f2350L;
            } else {
                c0110g = new C0110g(this.f2353K, k(), h3);
            }
            sb2.append(W3.a(c0110g));
            sb2.append("...");
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return D.C.z(sb3, sb, "\">");
    }
}
