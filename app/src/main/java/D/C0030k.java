package D;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: D.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030k {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f412a;

    /* renamed from: b  reason: collision with root package name */
    public final int f413b;

    /* renamed from: c  reason: collision with root package name */
    public final int f414c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f415d;

    /* renamed from: e  reason: collision with root package name */
    public final Matrix f416e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f417f;

    public C0030k(Rect rect, int r22, int r3, boolean z3, Matrix matrix, boolean z4) {
        if (rect != null) {
            this.f412a = rect;
            this.f413b = r22;
            this.f414c = r3;
            this.f415d = z3;
            if (matrix != null) {
                this.f416e = matrix;
                this.f417f = z4;
                return;
            }
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        throw new NullPointerException("Null getCropRect");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0030k)) {
            return false;
        }
        C0030k c0030k = (C0030k) obj;
        if (this.f412a.equals(c0030k.f412a) && this.f413b == c0030k.f413b && this.f414c == c0030k.f414c && this.f415d == c0030k.f415d && this.f416e.equals(c0030k.f416e) && this.f417f == c0030k.f417f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int r22;
        int hashCode = (((((this.f412a.hashCode() ^ 1000003) * 1000003) ^ this.f413b) * 1000003) ^ this.f414c) * 1000003;
        int r3 = 1237;
        if (this.f415d) {
            r22 = 1231;
        } else {
            r22 = 1237;
        }
        int hashCode2 = (((hashCode ^ r22) * 1000003) ^ this.f416e.hashCode()) * 1000003;
        if (this.f417f) {
            r3 = 1231;
        }
        return hashCode2 ^ r3;
    }

    public final String toString() {
        return "TransformationInfo{getCropRect=" + this.f412a + ", getRotationDegrees=" + this.f413b + ", getTargetRotation=" + this.f414c + ", hasCameraTransform=" + this.f415d + ", getSensorToBufferTransform=" + this.f416e + ", getMirroring=" + this.f417f + "}";
    }
}
