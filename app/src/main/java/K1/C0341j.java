package k1;

import h1.C0281a;

/* renamed from: k1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341j implements InterfaceC0333a {

    /* renamed from: b  reason: collision with root package name */
    public static C0341j f4049b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0342k f4050c = new C0342k(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public Object f4051a;

    public /* synthetic */ C0341j(Object obj) {
        this.f4051a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [k1.j, java.lang.Object] */
    public static synchronized C0341j b() {
        C0341j c0341j;
        synchronized (C0341j.class) {
            try {
                if (f4049b == null) {
                    f4049b = new Object();
                }
                c0341j = f4049b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0341j;
    }

    @Override // k1.InterfaceC0333a
    public void a(C0281a c0281a) {
        boolean z3;
        if (c0281a.f3250b == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        B1.a aVar = (B1.a) this.f4051a;
        if (z3) {
            aVar.f(null, aVar.f2761w);
            return;
        }
        C0341j c0341j = aVar.f2753o;
        if (c0341j != null) {
            ((i1.h) c0341j.f4051a).D(c0281a);
        }
    }
}
