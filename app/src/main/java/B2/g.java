package B2;

import android.util.Size;
import android.view.Surface;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class g implements Serializable {

    /* renamed from: J  reason: collision with root package name */
    public final Surface f206J;

    /* renamed from: K  reason: collision with root package name */
    public final Size f207K;

    /* renamed from: L  reason: collision with root package name */
    public final float[] f208L;

    public g(Surface surface, Size size, Object obj) {
        this.f206J = surface;
        this.f207K = size;
        this.f208L = (float[]) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (N2.g.a(this.f206J, gVar.f206J) && N2.g.a(this.f207K, gVar.f207K) && this.f208L.equals(gVar.f208L)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int r02 = 0;
        Surface surface = this.f206J;
        if (surface == null) {
            hashCode = 0;
        } else {
            hashCode = surface.hashCode();
        }
        int r12 = hashCode * 31;
        Size size = this.f207K;
        if (size != null) {
            r02 = size.hashCode();
        }
        return this.f208L.hashCode() + ((r12 + r02) * 31);
    }

    public final String toString() {
        return "(" + this.f206J + ", " + this.f207K + ", " + this.f208L + ')';
    }
}
