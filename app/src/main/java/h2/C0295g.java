package h2;

import A0.C0001b;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterJNI;
import j2.C0307a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n2.InterfaceC0394a;
import y2.AbstractC0938a;

/* renamed from: h2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295g {

    /* renamed from: a  reason: collision with root package name */
    public AbstractActivityC0292d f3322a;

    /* renamed from: b  reason: collision with root package name */
    public i2.c f3323b;

    /* renamed from: c  reason: collision with root package name */
    public t f3324c;

    /* renamed from: d  reason: collision with root package name */
    public B.a f3325d;

    /* renamed from: e  reason: collision with root package name */
    public ViewTreeObserver$OnPreDrawListenerC0294f f3326e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3327f;
    public boolean g;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3329i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f3330j;

    /* renamed from: k  reason: collision with root package name */
    public final C0293e f3331k = new C0293e(0, this);

    /* renamed from: h  reason: collision with root package name */
    public boolean f3328h = false;

    public C0295g(AbstractActivityC0292d abstractActivityC0292d) {
        this.f3322a = abstractActivityC0292d;
    }

    public final void a(A.m mVar) {
        String c4 = this.f3322a.c();
        if (c4 == null || c4.isEmpty()) {
            c4 = (String) ((l2.c) C0001b.L().f85L).f4112d.f1532c;
        }
        C0307a c0307a = new C0307a(c4, this.f3322a.f());
        String g = this.f3322a.g();
        if (g == null) {
            AbstractActivityC0292d abstractActivityC0292d = this.f3322a;
            abstractActivityC0292d.getClass();
            g = d(abstractActivityC0292d.getIntent());
            if (g == null) {
                g = "/";
            }
        }
        mVar.f28d = c0307a;
        mVar.f29e = g;
        mVar.f30f = (List) this.f3322a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (!this.f3322a.j()) {
            AbstractActivityC0292d abstractActivityC0292d = this.f3322a;
            abstractActivityC0292d.getClass();
            Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0292d + " connection to the engine " + abstractActivityC0292d.f3315K.f3323b + " evicted by another attaching activity");
            C0295g c0295g = abstractActivityC0292d.f3315K;
            if (c0295g != null) {
                c0295g.e();
                abstractActivityC0292d.f3315K.f();
                return;
            }
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f3322a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final void c() {
        if (this.f3322a != null) {
            return;
        }
        throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }

    public final String d(Intent intent) {
        boolean z3;
        Uri data;
        AbstractActivityC0292d abstractActivityC0292d = this.f3322a;
        abstractActivityC0292d.getClass();
        try {
            Bundle h3 = abstractActivityC0292d.h();
            int r12 = i.f3332a;
            if (h3 != null && h3.containsKey("flutter_deeplinking_enabled")) {
                z3 = h3.getBoolean("flutter_deeplinking_enabled");
            } else {
                z3 = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            z3 = false;
        }
        if (z3 && (data = intent.getData()) != null) {
            return data.toString();
        }
        return null;
    }

    public final void e() {
        c();
        if (this.f3326e != null) {
            this.f3324c.getViewTreeObserver().removeOnPreDrawListener(this.f3326e);
            this.f3326e = null;
        }
        t tVar = this.f3324c;
        if (tVar != null) {
            tVar.a();
            t tVar2 = this.f3324c;
            tVar2.f3360O.remove(this.f3331k);
        }
    }

    public final void f() {
        if (!this.f3329i) {
            return;
        }
        c();
        this.f3322a.getClass();
        this.f3322a.getClass();
        AbstractActivityC0292d abstractActivityC0292d = this.f3322a;
        abstractActivityC0292d.getClass();
        if (abstractActivityC0292d.isChangingConfigurations()) {
            i2.e eVar = this.f3323b.f3423d;
            if (eVar.g()) {
                AbstractC0938a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                try {
                    eVar.f3447a = true;
                    for (o2.a aVar : ((HashMap) eVar.f3449c).values()) {
                        aVar.g();
                    }
                    eVar.e();
                    Trace.endSection();
                } finally {
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            }
        } else {
            this.f3323b.f3423d.d();
        }
        B.a aVar2 = this.f3325d;
        if (aVar2 != null) {
            ((J) aVar2.f173L).f3304L = null;
            this.f3325d = null;
        }
        this.f3322a.getClass();
        i2.c cVar = this.f3323b;
        if (cVar != null) {
            q2.b bVar = q2.b.DETACHED;
            Q1.k kVar = cVar.g;
            kVar.a(bVar, kVar.f1083a);
        }
        if (this.f3322a.j()) {
            i2.c cVar2 = this.f3323b;
            Iterator it = cVar2.f3438t.iterator();
            while (it.hasNext()) {
                ((i2.b) it.next()).b();
            }
            i2.e eVar2 = cVar2.f3423d;
            eVar2.f();
            HashMap hashMap = (HashMap) eVar2.f3448b;
            Iterator it2 = new HashSet(hashMap.keySet()).iterator();
            while (it2.hasNext()) {
                Class cls = (Class) it2.next();
                InterfaceC0394a interfaceC0394a = (InterfaceC0394a) hashMap.get(cls);
                if (interfaceC0394a != null) {
                    AbstractC0938a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                    try {
                        if (interfaceC0394a instanceof o2.a) {
                            if (eVar2.g()) {
                                ((o2.a) interfaceC0394a).d();
                            }
                            ((HashMap) eVar2.f3449c).remove(cls);
                        }
                        interfaceC0394a.f((C0001b) eVar2.f3451e);
                        hashMap.remove(cls);
                        Trace.endSection();
                    } finally {
                    }
                }
            }
            hashMap.clear();
            while (true) {
                io.flutter.plugin.platform.j jVar = cVar2.f3436r;
                SparseArray sparseArray = jVar.f3585j;
                if (sparseArray.size() <= 0) {
                    break;
                }
                jVar.f3595t.z(sparseArray.keyAt(0));
            }
            while (true) {
                io.flutter.plugin.platform.i iVar = cVar2.f3437s;
                SparseArray sparseArray2 = iVar.g;
                if (sparseArray2.size() <= 0) {
                    break;
                }
                iVar.f3576m.l(sparseArray2.keyAt(0));
            }
            cVar2.f3422c.f3859J.setPlatformMessageHandler(null);
            FlutterJNI flutterJNI = cVar2.f3420a;
            flutterJNI.removeEngineLifecycleListener(cVar2.f3440v);
            flutterJNI.setDeferredComponentManager(null);
            flutterJNI.detachFromNativeAndReleaseResources();
            C0001b.L().getClass();
            i2.c.f3419x.remove(Long.valueOf(cVar2.f3439u));
            if (this.f3322a.e() != null) {
                if (P1.c.f1032b == null) {
                    P1.c.f1032b = new P1.c(1);
                }
                P1.c cVar3 = P1.c.f1032b;
                cVar3.f1033a.remove(this.f3322a.e());
            }
            this.f3323b = null;
        }
        this.f3329i = false;
    }
}
