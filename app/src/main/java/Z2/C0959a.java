package z2;

import A0.C0001b;
import N2.g;
import android.content.Context;
import n2.InterfaceC0394a;
import r2.f;

/* renamed from: z2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959a implements InterfaceC0394a {

    /* renamed from: J  reason: collision with root package name */
    public C0001b f6585J;

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
        g.e(c0001b, "p0");
        C0001b c0001b2 = this.f6585J;
        if (c0001b2 != null) {
            c0001b2.U(null);
        }
        this.f6585J = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [x1.v4, java.lang.Object, r2.m] */
    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
        g.e(c0001b, "binding");
        f fVar = (f) c0001b.f84K;
        g.d(fVar, "getBinaryMessenger(...)");
        Context context = (Context) c0001b.f85L;
        g.d(context, "getApplicationContext(...)");
        C0001b c0001b2 = new C0001b(fVar, "PonnamKarthik/fluttertoast", 26);
        this.f6585J = c0001b2;
        ?? obj = new Object();
        obj.f6108J = context;
        c0001b2.U(obj);
    }
}
