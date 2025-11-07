package D;

import android.graphics.Rect;
import android.util.Size;

/* renamed from: D.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028h {

    /* renamed from: a  reason: collision with root package name */
    public final Size f398a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f399b;

    /* renamed from: c  reason: collision with root package name */
    public final int f400c;

    public C0028h(Size size, Rect rect, int r3) {
        this.f398a = size;
        this.f399b = rect;
        this.f400c = r3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0028h)) {
            return false;
        }
        C0028h c0028h = (C0028h) obj;
        if (this.f398a.equals(c0028h.f398a) && this.f399b.equals(c0028h.f399b) && this.f400c == c0028h.f400c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f398a.hashCode() ^ 1000003) * 1000003) ^ this.f399b.hashCode()) * 1000003) ^ this.f400c;
    }

    public final String toString() {
        return "ResolutionInfoInternal{resolution=" + this.f398a + ", cropRect=" + this.f399b + ", rotationDegrees=" + this.f400c + "}";
    }
}
