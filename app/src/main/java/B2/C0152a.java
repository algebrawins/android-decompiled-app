package b2;

import A0.C0001b;
import N2.g;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import n2.InterfaceC0394a;
import r2.f;

/* renamed from: b2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152a implements InterfaceC0394a {

    /* renamed from: J  reason: collision with root package name */
    public C0001b f2634J;

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
        g.e(c0001b, "binding");
        C0001b c0001b2 = this.f2634J;
        if (c0001b2 != null) {
            c0001b2.U(null);
        } else {
            g.g("methodChannel");
            throw null;
        }
    }

    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
        g.e(c0001b, "binding");
        f fVar = (f) c0001b.f84K;
        g.d(fVar, "getBinaryMessenger(...)");
        Context context = (Context) c0001b.f85L;
        g.d(context, "getApplicationContext(...)");
        this.f2634J = new C0001b(fVar, "dev.fluttercommunity.plus/device_info", 26);
        PackageManager packageManager = context.getPackageManager();
        g.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        g.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        A.f fVar2 = new A.f(25, packageManager, (ActivityManager) systemService);
        C0001b c0001b2 = this.f2634J;
        if (c0001b2 != null) {
            c0001b2.U(fVar2);
        } else {
            g.g("methodChannel");
            throw null;
        }
    }
}
