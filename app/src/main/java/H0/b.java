package H0;

import D.C;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f714a;

    /* renamed from: b  reason: collision with root package name */
    public final int f715b;

    /* renamed from: c  reason: collision with root package name */
    public final int f716c;

    /* renamed from: d  reason: collision with root package name */
    public final int f717d;

    public b(Rect rect) {
        int r02 = rect.left;
        int r12 = rect.top;
        int r22 = rect.right;
        int r4 = rect.bottom;
        this.f714a = r02;
        this.f715b = r12;
        this.f716c = r22;
        this.f717d = r4;
        if (r02 <= r22) {
            if (r12 <= r4) {
                return;
            }
            throw new IllegalArgumentException(C.x("top must be less than or equal to bottom, top: ", r12, ", bottom: ", r4).toString());
        }
        throw new IllegalArgumentException(C.x("Left must be less than or equal to right, left: ", r02, ", right: ", r22).toString());
    }

    public final int a() {
        return this.f717d - this.f715b;
    }

    public final int b() {
        return this.f716c - this.f714a;
    }

    public final Rect c() {
        return new Rect(this.f714a, this.f715b, this.f716c, this.f717d);
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
        if (!b.class.equals(cls)) {
            return false;
        }
        N2.g.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        if (this.f714a == bVar.f714a && this.f715b == bVar.f715b && this.f716c == bVar.f716c && this.f717d == bVar.f717d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f714a * 31) + this.f715b) * 31) + this.f716c) * 31) + this.f717d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f714a + ',' + this.f715b + ',' + this.f716c + ',' + this.f717d + "] }";
    }
}
