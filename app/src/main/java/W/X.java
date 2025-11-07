package w;

import D.C0036q;
import D.C0042x;
import android.util.Range;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.EnumC0097z;
import java.util.Set;

/* loaded from: classes.dex */
public final class X implements androidx.camera.core.impl.k0 {

    /* renamed from: J  reason: collision with root package name */
    public final androidx.camera.core.impl.O f5093J;

    public X() {
        androidx.camera.core.impl.O b3 = androidx.camera.core.impl.O.b();
        b3.g(androidx.camera.core.impl.k0.f2220z, new Object());
        this.f5093J = b3;
    }

    @Override // androidx.camera.core.impl.H
    public final /* synthetic */ C0042x B() {
        return D.C.e(this);
    }

    @Override // androidx.camera.core.impl.A
    public final Object E(C0076c c0076c, EnumC0097z enumC0097z) {
        return this.f5093J.E(c0076c, enumC0097z);
    }

    @Override // androidx.camera.core.impl.A
    public final Set J(C0076c c0076c) {
        return this.f5093J.J(c0076c);
    }

    @Override // I.l
    public final /* synthetic */ String L() {
        return D.C.j(this);
    }

    @Override // I.l
    public final /* synthetic */ String N(String str) {
        return D.C.k(this, str);
    }

    @Override // androidx.camera.core.impl.k0
    public final /* synthetic */ boolean O() {
        return D.C.m(this);
    }

    @Override // androidx.camera.core.impl.V
    public final androidx.camera.core.impl.A V() {
        return this.f5093J;
    }

    @Override // androidx.camera.core.impl.k0
    public final Range W() {
        return (Range) i0(androidx.camera.core.impl.k0.f2214D, null);
    }

    @Override // androidx.camera.core.impl.A
    public final void X(C.f fVar) {
        this.f5093J.X(fVar);
    }

    @Override // androidx.camera.core.impl.H
    public final int b0() {
        return ((Integer) e(androidx.camera.core.impl.H.f2135l)).intValue();
    }

    @Override // androidx.camera.core.impl.A
    public final Object e(C0076c c0076c) {
        return this.f5093J.e(c0076c);
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC0097z g0(C0076c c0076c) {
        return this.f5093J.g0(c0076c);
    }

    @Override // androidx.camera.core.impl.k0
    public final /* synthetic */ int i() {
        return D.C.i(this);
    }

    @Override // androidx.camera.core.impl.A
    public final Object i0(C0076c c0076c, Object obj) {
        androidx.camera.core.impl.O o3 = this.f5093J;
        o3.getClass();
        try {
            return o3.e(c0076c);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // androidx.camera.core.impl.k0
    public final androidx.camera.core.impl.m0 m() {
        return androidx.camera.core.impl.m0.METERING_REPEATING;
    }

    @Override // androidx.camera.core.impl.A
    public final Set o() {
        return this.f5093J.o();
    }

    @Override // androidx.camera.core.impl.k0
    public final C0036q p() {
        return (C0036q) i0(androidx.camera.core.impl.k0.f2213C, null);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ boolean q(C0076c c0076c) {
        return D.C.a(this, c0076c);
    }

    @Override // androidx.camera.core.impl.k0
    public final /* synthetic */ boolean t() {
        return D.C.l(this);
    }

    @Override // androidx.camera.core.impl.k0
    public final androidx.camera.core.impl.c0 u() {
        return (androidx.camera.core.impl.c0) i0(androidx.camera.core.impl.k0.f2218x, null);
    }

    @Override // androidx.camera.core.impl.k0
    public final /* synthetic */ int v() {
        return D.C.h(this);
    }

    @Override // I.n
    public final void x() {
        if (i0(I.n.f783e, null) == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override // androidx.camera.core.impl.k0
    public final C0488D y() {
        return (C0488D) i0(androidx.camera.core.impl.k0.f2220z, null);
    }
}
