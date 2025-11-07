package i2;

import A.m;
import A0.C0001b;
import A0.Q;
import android.content.Context;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.t;
import d2.C0235c;
import h2.AbstractActivityC0292d;
import h2.C0295g;
import java.util.HashMap;
import k0.C0322i;
import n2.InterfaceC0394a;
import w.d0;
import w.e0;
import y2.AbstractC0938a;
import z.C0944E;
import z.C0953f;
import z.C0955h;
import z.z;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3447a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3448b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3449c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3450d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3451e;

    /* renamed from: f  reason: collision with root package name */
    public Object f3452f;
    public Object g;

    public e(Context context, c cVar) {
        this.f3448b = new HashMap();
        this.f3449c = new HashMap();
        this.f3447a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f3450d = cVar;
        j2.b bVar = cVar.f3422c;
        P1.c cVar2 = cVar.f3436r.f3577a;
        this.f3451e = new C0001b(context, bVar, cVar.f3421b, 19);
    }

    public void a(InterfaceC0394a interfaceC0394a) {
        AbstractC0938a.b("FlutterEngineConnectionRegistry#add ".concat(interfaceC0394a.getClass().getSimpleName()));
        try {
            Class<?> cls = interfaceC0394a.getClass();
            HashMap hashMap = (HashMap) this.f3448b;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0394a + ") but it was already registered with this FlutterEngine (" + ((c) this.f3450d) + ").");
                Trace.endSection();
                return;
            }
            interfaceC0394a.toString();
            hashMap.put(interfaceC0394a.getClass(), interfaceC0394a);
            interfaceC0394a.h((C0001b) this.f3451e);
            if (interfaceC0394a instanceof o2.a) {
                o2.a aVar = (o2.a) interfaceC0394a;
                ((HashMap) this.f3449c).put(interfaceC0394a.getClass(), aVar);
                if (g()) {
                    aVar.a((d) this.g);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void b(AbstractActivityC0292d abstractActivityC0292d, t tVar) {
        this.g = new d(abstractActivityC0292d, tVar);
        if (abstractActivityC0292d.getIntent() != null) {
            abstractActivityC0292d.getIntent().getBooleanExtra("enable-software-rendering", false);
        }
        c cVar = (c) this.f3450d;
        io.flutter.plugin.platform.j jVar = cVar.f3436r;
        jVar.getClass();
        if (jVar.f3578b == null) {
            jVar.f3578b = abstractActivityC0292d;
            jVar.f3580d = cVar.f3421b;
            j2.b bVar = cVar.f3422c;
            C0235c c0235c = new C0235c(bVar, 19);
            jVar.f3582f = c0235c;
            c0235c.f3003K = jVar.f3595t;
            io.flutter.plugin.platform.i iVar = cVar.f3437s;
            if (iVar.f3566b == null) {
                iVar.f3566b = abstractActivityC0292d;
                C0322i c0322i = new C0322i(bVar, 12);
                iVar.f3569e = c0322i;
                c0322i.f3983K = iVar.f3576m;
                for (o2.a aVar : ((HashMap) this.f3449c).values()) {
                    if (this.f3447a) {
                        aVar.c((d) this.g);
                    } else {
                        aVar.a((d) this.g);
                    }
                }
                this.f3447a = false;
                return;
            }
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public C0235c c() {
        Object d0Var;
        boolean z3 = this.f3447a;
        G.l lVar = (G.l) this.f3448b;
        V0.a aVar = (V0.a) this.f3451e;
        G.e eVar = (G.e) this.f3449c;
        if (z3) {
            d0Var = new e0((Q) this.f3452f, (Q) this.g, eVar, lVar, aVar, (Handler) this.f3450d);
        } else {
            d0Var = new d0(aVar, lVar, eVar, (Handler) this.f3450d);
        }
        return new C0235c(27, d0Var);
    }

    public void d() {
        if (g()) {
            AbstractC0938a.b("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (o2.a aVar : ((HashMap) this.f3449c).values()) {
                    aVar.d();
                }
                e();
                Trace.endSection();
                return;
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
    }

    public void e() {
        c cVar = (c) this.f3450d;
        io.flutter.plugin.platform.j jVar = cVar.f3436r;
        C0235c c0235c = jVar.f3582f;
        if (c0235c != null) {
            c0235c.f3003K = null;
        }
        jVar.e();
        jVar.f3582f = null;
        jVar.f3578b = null;
        jVar.f3580d = null;
        io.flutter.plugin.platform.i iVar = cVar.f3437s;
        C0322i c0322i = iVar.f3569e;
        if (c0322i != null) {
            c0322i.f3983K = null;
        }
        Surface surface = iVar.f3574k;
        if (surface != null) {
            surface.release();
            iVar.f3574k = null;
            iVar.f3575l = null;
        }
        iVar.f3569e = null;
        iVar.f3566b = null;
        this.f3452f = null;
        this.g = null;
    }

    public void f() {
        if (g()) {
            d();
        }
    }

    public boolean g() {
        if (((C0295g) this.f3452f) != null) {
            return true;
        }
        return false;
    }

    public e(Q q3, Q q4, G.e eVar, G.l lVar, V0.a aVar, Handler handler) {
        this.f3448b = lVar;
        this.f3449c = eVar;
        this.f3450d = handler;
        this.f3451e = aVar;
        this.f3452f = q3;
        this.g = q4;
        this.f3447a = q4.a(C0944E.class) || q3.a(z.class) || q3.a(C0955h.class) || new m(q3).f25a || ((C0953f) q4.b(C0953f.class)) != null;
    }
}
