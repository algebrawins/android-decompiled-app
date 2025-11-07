package Q;

import I.f;
import androidx.lifecycle.r;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final r f1037a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1038b;

    public a(r rVar, f fVar) {
        if (rVar != null) {
            this.f1037a = rVar;
            if (fVar != null) {
                this.f1038b = fVar;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1037a.equals(aVar.f1037a) && this.f1038b.equals(aVar.f1038b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1037a.hashCode() ^ 1000003) * 1000003) ^ this.f1038b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f1037a + ", cameraId=" + this.f1038b + "}";
    }
}
