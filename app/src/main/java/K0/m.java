package K0;

import android.graphics.Rect;
import f0.N;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final H0.b f845a;

    /* renamed from: b  reason: collision with root package name */
    public final N f846b;

    public m(H0.b bVar, N n3) {
        N2.g.e(n3, "_windowInsetsCompat");
        this.f845a = bVar;
        this.f846b = n3;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!m.class.equals(cls)) {
            return false;
        }
        N2.g.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        m mVar = (m) obj;
        if (N2.g.a(this.f845a, mVar.f845a) && N2.g.a(this.f846b, mVar.f846b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f846b.hashCode() + (this.f845a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f845a + ", windowInsetsCompat=" + this.f846b + ')';
    }

    /* JADX WARN: 'thıs' call moved to the top of the method (can break code semantics) */
    public m(Rect rect, N n3) {
        this(new H0.b(rect), n3);
        N2.g.e(n3, "insets");
    }
}
