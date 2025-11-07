package y;

import android.os.Build;
import android.view.Surface;

/* renamed from: y.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0780i {

    /* renamed from: a  reason: collision with root package name */
    public final r f6170a;

    public C0780i(int r3, Surface surface) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 33) {
            this.f6170a = new p(r3, surface);
        } else if (r02 >= 28) {
            this.f6170a = new o(r3, surface);
        } else if (r02 >= 26) {
            this.f6170a = new m(r3, surface);
        } else if (r02 >= 24) {
            this.f6170a = new k(r3, surface);
        } else {
            this.f6170a = new r(surface);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0780i)) {
            return false;
        }
        return this.f6170a.equals(((C0780i) obj).f6170a);
    }

    public final int hashCode() {
        return this.f6170a.hashCode();
    }

    public C0780i(k kVar) {
        this.f6170a = kVar;
    }
}
