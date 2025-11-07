package androidx.camera.core.impl;

import D.C0036q;
import D.C0042x;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import w.C0488D;

/* loaded from: classes.dex */
public final class F implements k0, J, I.m {

    /* renamed from: K  reason: collision with root package name */
    public static final C0076c f2121K = new C0076c("camerax.core.imageAnalysis.backpressureStrategy", D.D.class, null);

    /* renamed from: L  reason: collision with root package name */
    public static final C0076c f2122L = new C0076c("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE, null);

    /* renamed from: M  reason: collision with root package name */
    public static final C0076c f2123M = new C0076c("camerax.core.imageAnalysis.imageReaderProxyProvider", D.Y.class, null);

    /* renamed from: N  reason: collision with root package name */
    public static final C0076c f2124N = new C0076c("camerax.core.imageAnalysis.outputImageFormat", D.G.class, null);

    /* renamed from: O  reason: collision with root package name */
    public static final C0076c f2125O = new C0076c("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class, null);

    /* renamed from: P  reason: collision with root package name */
    public static final C0076c f2126P = new C0076c("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class, null);

    /* renamed from: J  reason: collision with root package name */
    public final S f2127J;

    public F(S s3) {
        this.f2127J = s3;
    }

    @Override // androidx.camera.core.impl.J
    public final O.b A() {
        int r02 = I.f2137a;
        return (O.b) i0(J.f2146v, null);
    }

    @Override // androidx.camera.core.impl.H
    public final /* synthetic */ C0042x B() {
        return D.C.e(this);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ Object E(C0076c c0076c, EnumC0097z enumC0097z) {
        return D.C.q(this, c0076c, enumC0097z);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ Set J(C0076c c0076c) {
        return D.C.g(this, c0076c);
    }

    @Override // androidx.camera.core.impl.J
    public final Size K() {
        int r02 = I.f2137a;
        return (Size) i0(J.f2144t, null);
    }

    @Override // I.l
    public final /* synthetic */ String L() {
        return D.C.j(this);
    }

    @Override // androidx.camera.core.impl.J
    public final boolean M() {
        int r02 = I.f2137a;
        return q(J.f2138n);
    }

    @Override // I.l
    public final /* synthetic */ String N(String str) {
        return D.C.k(this, str);
    }

    @Override // androidx.camera.core.impl.k0
    public final /* synthetic */ boolean O() {
        return D.C.m(this);
    }

    @Override // androidx.camera.core.impl.J
    public final Size Q() {
        int r02 = I.f2137a;
        return (Size) i0(J.f2143s, null);
    }

    @Override // androidx.camera.core.impl.J
    public final List R() {
        int r02 = I.f2137a;
        return (List) i0(J.f2145u, null);
    }

    @Override // androidx.camera.core.impl.J
    public final int S() {
        int r02 = I.f2137a;
        return ((Integer) e(J.f2138n)).intValue();
    }

    @Override // androidx.camera.core.impl.J
    public final O.b U() {
        int r02 = I.f2137a;
        return (O.b) e(J.f2146v);
    }

    @Override // androidx.camera.core.impl.V
    public final A V() {
        return this.f2127J;
    }

    @Override // androidx.camera.core.impl.k0
    public final Range W() {
        return (Range) i0(k0.f2214D, null);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ void X(C.f fVar) {
        D.C.b(this, fVar);
    }

    @Override // androidx.camera.core.impl.H
    public final int b0() {
        return 35;
    }

    @Override // androidx.camera.core.impl.J
    public final /* synthetic */ int d() {
        return I.c(this);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ Object e(C0076c c0076c) {
        return D.C.o(this, c0076c);
    }

    @Override // androidx.camera.core.impl.J
    public final /* synthetic */ int f0() {
        return I.a(this);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ EnumC0097z g0(C0076c c0076c) {
        return D.C.f(this, c0076c);
    }

    @Override // androidx.camera.core.impl.k0
    public final /* synthetic */ int i() {
        return D.C.i(this);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ Object i0(C0076c c0076c, Object obj) {
        return D.C.p(this, c0076c, obj);
    }

    @Override // androidx.camera.core.impl.J
    public final /* synthetic */ int j() {
        return I.d(this);
    }

    @Override // androidx.camera.core.impl.J
    public final Size k() {
        int r02 = I.f2137a;
        return (Size) i0(J.f2142r, null);
    }

    @Override // androidx.camera.core.impl.k0
    public final /* synthetic */ m0 m() {
        return D.C.d(this);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ Set o() {
        return D.C.n(this);
    }

    @Override // androidx.camera.core.impl.k0
    public final C0036q p() {
        return (C0036q) i0(k0.f2213C, null);
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
    public final c0 u() {
        return (c0) i0(k0.f2218x, null);
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
        return (C0488D) i0(k0.f2220z, null);
    }

    @Override // androidx.camera.core.impl.J
    public final /* synthetic */ ArrayList z() {
        return I.b(this);
    }
}
