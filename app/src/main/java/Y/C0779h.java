package y;

import android.os.Build;

/* renamed from: y.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779h {

    /* renamed from: a  reason: collision with root package name */
    public final C0776e f6169a;

    public C0779h(C0776e c0776e) {
        this.f6169a = c0776e;
    }

    public static C0779h a(Object obj) {
        int r12;
        if (obj == null || (r12 = Build.VERSION.SDK_INT) < 23) {
            return null;
        }
        if (r12 >= 31) {
            return new C0779h(new C0776e(obj));
        }
        return new C0779h(new C0776e(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0779h)) {
            return false;
        }
        return this.f6169a.equals(((C0779h) obj).f6169a);
    }

    public final int hashCode() {
        return this.f6169a.hashCode();
    }

    public final String toString() {
        return this.f6169a.toString();
    }
}
