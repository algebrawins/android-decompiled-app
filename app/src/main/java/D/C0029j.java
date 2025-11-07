package D;

import android.view.Surface;

/* renamed from: D.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029j {

    /* renamed from: a  reason: collision with root package name */
    public final int f408a;

    /* renamed from: b  reason: collision with root package name */
    public final Surface f409b;

    public C0029j(int r12, Surface surface) {
        this.f408a = r12;
        this.f409b = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0029j)) {
            return false;
        }
        C0029j c0029j = (C0029j) obj;
        if (this.f408a == c0029j.f408a && this.f409b.equals(c0029j.f409b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f409b.hashCode() ^ ((this.f408a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.f408a + ", surface=" + this.f409b + "}";
    }
}
