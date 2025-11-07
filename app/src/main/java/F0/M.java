package f0;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class M {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f3169b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final N f3170a;

    static {
        G d4;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 30) {
            d4 = new F();
        } else if (r02 >= 29) {
            d4 = new E();
        } else {
            d4 = new D();
        }
        d4.b().f3171a.a().f3171a.b().f3171a.c();
    }

    public M(N n3) {
        this.f3170a = n3;
    }

    public N a() {
        return this.f3170a;
    }

    public N b() {
        return this.f3170a;
    }

    public N c() {
        return this.f3170a;
    }

    public C0258d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m3 = (M) obj;
        if (i() == m3.i() && h() == m3.h() && Objects.equals(g(), m3.g()) && Objects.equals(f(), m3.f()) && Objects.equals(e(), m3.e())) {
            return true;
        }
        return false;
    }

    public Y.c f() {
        return Y.c.f1636e;
    }

    public Y.c g() {
        return Y.c.f1636e;
    }

    public boolean h() {
        return false;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(i()), Boolean.valueOf(h()), g(), f(), e());
    }

    public boolean i() {
        return false;
    }

    public void d(View view) {
    }

    public void j(Y.c[] cVarArr) {
    }

    public void k(N n3) {
    }

    public void l(Y.c cVar) {
    }
}
