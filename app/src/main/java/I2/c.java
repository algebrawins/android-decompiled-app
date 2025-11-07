package i2;

import A0.C0001b;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import d2.C0235c;
import h2.AbstractActivityC0292d;
import h2.J;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.n;
import java.util.HashMap;
import java.util.HashSet;
import k0.C0322i;
import q2.o;
import q2.r;
import r2.s;
import s2.C0454a;
import u2.C0478a;
import x1.AbstractC0689q5;
import x1.J4;
import y2.InterfaceC0939b;

/* loaded from: classes.dex */
public final class c implements InterfaceC0939b {

    /* renamed from: w  reason: collision with root package name */
    public static long f3418w = 1;

    /* renamed from: x  reason: collision with root package name */
    public static final HashMap f3419x = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f3420a;

    /* renamed from: b  reason: collision with root package name */
    public final n f3421b;

    /* renamed from: c  reason: collision with root package name */
    public final j2.b f3422c;

    /* renamed from: d  reason: collision with root package name */
    public final e f3423d;

    /* renamed from: e  reason: collision with root package name */
    public final C0454a f3424e;

    /* renamed from: f  reason: collision with root package name */
    public final C0001b f3425f;
    public final Q1.k g;

    /* renamed from: h  reason: collision with root package name */
    public final C0235c f3426h;

    /* renamed from: i  reason: collision with root package name */
    public final C0322i f3427i;

    /* renamed from: j  reason: collision with root package name */
    public final C0235c f3428j;

    /* renamed from: k  reason: collision with root package name */
    public final o f3429k;

    /* renamed from: l  reason: collision with root package name */
    public final J f3430l;

    /* renamed from: m  reason: collision with root package name */
    public final C0235c f3431m;

    /* renamed from: n  reason: collision with root package name */
    public final r f3432n;

    /* renamed from: o  reason: collision with root package name */
    public final C0235c f3433o;

    /* renamed from: p  reason: collision with root package name */
    public final C0322i f3434p;

    /* renamed from: q  reason: collision with root package name */
    public final J f3435q;

    /* renamed from: r  reason: collision with root package name */
    public final io.flutter.plugin.platform.j f3436r;

    /* renamed from: s  reason: collision with root package name */
    public final io.flutter.plugin.platform.i f3437s;

    /* renamed from: u  reason: collision with root package name */
    public final long f3439u;

    /* renamed from: t  reason: collision with root package name */
    public final HashSet f3438t = new HashSet();

    /* renamed from: v  reason: collision with root package name */
    public final a f3440v = new a(this);

    public c(AbstractActivityC0292d abstractActivityC0292d, FlutterJNI flutterJNI, io.flutter.plugin.platform.j jVar, boolean z3, boolean z4) {
        AssetManager assets;
        long j3 = f3418w;
        f3418w = 1 + j3;
        this.f3439u = j3;
        f3419x.put(Long.valueOf(j3), this);
        try {
            assets = abstractActivityC0292d.createPackageContext(abstractActivityC0292d.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0292d.getAssets();
        }
        C0001b L3 = C0001b.L();
        if (flutterJNI == null) {
            Object obj = L3.f84K;
            flutterJNI = new FlutterJNI();
        }
        this.f3420a = flutterJNI;
        j2.b bVar = new j2.b(flutterJNI, assets, this.f3439u);
        this.f3422c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f3862M);
        C0001b.L().getClass();
        this.f3425f = new C0001b(bVar, flutterJNI);
        new C0001b(bVar, "flutter/deferredcomponent", s.f4896a, 26).U(new C0322i(7, new Object()));
        C0001b.L().getClass();
        new HashMap();
        this.g = new Q1.k(bVar);
        J j4 = new J(bVar, 10);
        this.f3426h = new C0235c(bVar, 16);
        this.f3427i = new C0322i(bVar, 10);
        this.f3428j = new C0235c(bVar, 13);
        this.f3430l = new J(bVar, 11);
        J j5 = new J(bVar, abstractActivityC0292d.getPackageManager());
        this.f3429k = new o(bVar, z4);
        this.f3431m = new C0235c(bVar, 21);
        this.f3432n = new r(bVar);
        this.f3433o = new C0235c(bVar, 22);
        this.f3434p = new C0322i(bVar, 16);
        this.f3435q = new J(bVar, 14);
        C0454a c0454a = new C0454a(abstractActivityC0292d, j4);
        this.f3424e = c0454a;
        l2.c cVar = (l2.c) L3.f85L;
        if (!flutterJNI.isAttached()) {
            cVar.b(abstractActivityC0292d.getApplicationContext());
            cVar.a(abstractActivityC0292d, null);
        }
        io.flutter.plugin.platform.i iVar = new io.flutter.plugin.platform.i();
        iVar.f3565a = jVar.f3577a;
        iVar.f3568d = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f3440v);
        flutterJNI.setPlatformViewsController(jVar);
        flutterJNI.setPlatformViewsController2(iVar);
        flutterJNI.setLocalizationPlugin(c0454a);
        L3.getClass();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f3421b = new n(flutterJNI);
        this.f3436r = jVar;
        this.f3437s = iVar;
        e eVar = new e(abstractActivityC0292d.getApplicationContext(), this);
        this.f3423d = eVar;
        c0454a.b(abstractActivityC0292d.getResources().getConfiguration());
        if (z3 && cVar.f4112d.f1530a) {
            J4.a(this);
        }
        AbstractC0689q5.a(abstractActivityC0292d, this);
        eVar.a(new C0478a(j5));
    }
}
