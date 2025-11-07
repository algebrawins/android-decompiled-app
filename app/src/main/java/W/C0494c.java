package w;

/* renamed from: w.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494c {

    /* renamed from: a  reason: collision with root package name */
    public final int f5127a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5128b;

    public C0494c(int r12, int r22) {
        this.f5127a = r12;
        this.f5128b = r22;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0494c)) {
            return false;
        }
        C0494c c0494c = (C0494c) obj;
        if (this.f5127a == c0494c.f5127a && this.f5128b == c0494c.f5128b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5127a ^ 1000003) * 1000003) ^ this.f5128b;
    }

    public final String toString() {
        return "FeatureSettings{cameraMode=" + this.f5127a + ", requiredMaxBitDepth=" + this.f5128b + "}";
    }
}
