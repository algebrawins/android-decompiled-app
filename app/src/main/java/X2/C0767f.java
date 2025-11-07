package x2;

import A.k;
import A0.C0001b;
import D.C;
import android.content.Context;
import android.util.Log;
import n2.InterfaceC0394a;
import w2.q;

/* renamed from: x2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767f implements InterfaceC0394a, o2.a {

    /* renamed from: J  reason: collision with root package name */
    public q f6159J;

    @Override // o2.a
    public final void a(i2.d dVar) {
        q qVar = this.f6159J;
        if (qVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            qVar.f5403L = dVar.f3441a;
        }
    }

    @Override // o2.a
    public final void c(i2.d dVar) {
        a(dVar);
    }

    @Override // o2.a
    public final void d() {
        q qVar = this.f6159J;
        if (qVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            qVar.f5403L = null;
        }
    }

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
        if (this.f6159J == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        C.O((r2.f) c0001b.f84K, null);
        this.f6159J = null;
    }

    @Override // o2.a
    public final void g() {
        d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w2.q, java.lang.Object] */
    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
        Context context = (Context) c0001b.f85L;
        k kVar = new k(22, context);
        ?? obj = new Object();
        obj.f5401J = context;
        obj.f5402K = kVar;
        this.f6159J = obj;
        C.O((r2.f) c0001b.f84K, obj);
    }
}
