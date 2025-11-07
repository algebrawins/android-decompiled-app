package h2;

import A0.C0001b;
import a2.C0073a;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0137k;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import k0.C0322i;
import y2.AbstractC0938a;

/* renamed from: h2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0292d extends Activity implements androidx.lifecycle.r {

    /* renamed from: N  reason: collision with root package name */
    public static final int f3313N = View.generateViewId();

    /* renamed from: J  reason: collision with root package name */
    public boolean f3314J = false;

    /* renamed from: K  reason: collision with root package name */
    public C0295g f3315K;

    /* renamed from: L  reason: collision with root package name */
    public final androidx.lifecycle.t f3316L;

    /* renamed from: M  reason: collision with root package name */
    public final OnBackInvokedCallback f3317M;

    public AbstractActivityC0292d() {
        OnBackInvokedCallback onBackInvokedCallback;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 33) {
            onBackInvokedCallback = null;
        } else if (r02 >= 34) {
            onBackInvokedCallback = new C0291c(this);
        } else {
            onBackInvokedCallback = new OnBackInvokedCallback() { // from class: h2.b
                public final void onBackInvoked() {
                    AbstractActivityC0292d.this.onBackPressed();
                }
            };
        }
        this.f3317M = onBackInvokedCallback;
        this.f3316L = new androidx.lifecycle.t(this);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t b() {
        return this.f3316L;
    }

    public final String c() {
        String dataString;
        if ((getApplicationInfo().flags & 2) != 0 && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    public final EnumC0296h d() {
        if (getIntent().hasExtra("background_mode")) {
            return EnumC0296h.valueOf(getIntent().getStringExtra("background_mode"));
        }
        return EnumC0296h.opaque;
    }

    public final String e() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String f() {
        String str;
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle h3 = h();
            if (h3 != null) {
                str = h3.getString("io.flutter.Entrypoint");
            } else {
                str = null;
            }
            if (str == null) {
                return "main";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle h3 = h();
            if (h3 == null) {
                return null;
            }
            return h3.getString("io.flutter.InitialRoute");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle h() {
        return getPackageManager().getActivityInfo(getComponentName(), RecognitionOptions.ITF).metaData;
    }

    public final void i(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z3 && !this.f3314J) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f3317M);
                this.f3314J = true;
            }
        } else if (!z3 && this.f3314J && Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f3317M);
            this.f3314J = false;
        }
    }

    public final boolean j() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        if (e() == null && !this.f3315K.f3327f) {
            return getIntent().getBooleanExtra("destroy_engine_with_activity", true);
        }
        return booleanExtra;
    }

    public final boolean k() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        if (e() != null) {
            return false;
        }
        return true;
    }

    public final boolean l(String str) {
        C0295g c0295g = this.f3315K;
        if (c0295g == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        } else if (!c0295g.f3329i) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
            return false;
        } else {
            return true;
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int r5, int r6, Intent intent) {
        if (l("onActivityResult")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            if (c0295g.f3323b != null) {
                Objects.toString(intent);
                i2.e eVar = c0295g.f3323b.f3423d;
                if (eVar.g()) {
                    AbstractC0938a.b("FlutterEngineConnectionRegistry#onActivityResult");
                    try {
                        i2.d dVar = (i2.d) eVar.g;
                        dVar.getClass();
                        Iterator it = new HashSet(dVar.f3444d).iterator();
                        while (true) {
                            boolean z3 = false;
                            while (it.hasNext()) {
                                if (((r2.o) it.next()).b(r5, r6, intent) || z3) {
                                    z3 = true;
                                }
                            }
                            Trace.endSection();
                            return;
                        }
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (l("onBackPressed")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                ((C0001b) cVar.f3427i.f3983K).M("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(49:1|2|(1:6)|8|(1:10)|11|(2:13|(4:15|(1:17)|18|(2:20|21))(2:23|(4:25|(3:27|93|34)|40|(1:42)(2:43|44))(41:45|(1:47)|48|(1:50)|51|(1:53)(2:109|(1:111))|54|(1:56)|57|(1:59)|60|(1:62)|63|(1:65)|66|(1:68)|69|(1:71)|72|(1:74)|75|(1:77)|78|(1:80)|81|(1:83)|84|(2:86|(1:88)(1:89))|90|(1:92)|93|(1:95)|96|(1:98)|99|(1:101)|102|(1:104)|105|(1:107)|108)))|112|113|114|(1:116)|117|118|(1:120)|121|(1:123)(1:268)|124|(2:126|(1:128)(2:129|(1:131)(1:132)))|133|(4:135|136|137|(1:139)(2:254|(1:256)(2:257|258)))(1:267)|140|(1:142)|143|(1:145)(1:253)|146|(1:148)(1:252)|149|(1:151)(1:251)|(5:153|(1:155)(1:241)|156|(1:158)(1:240)|159)(5:242|(1:244)(1:250)|245|(1:247)(1:249)|248)|160|(6:162|(1:164)|165|(4:167|(1:169)(1:178)|170|(3:172|(1:174)|175)(2:176|177))|179|180)|181|(1:183)|184|(1:186)|187|188|189|190|(2:(1:236)(1:194)|195)(1:237)|196|(2:197|(1:199)(1:200))|201|(2:202|(2:204|(1:206)(3:207|208|209))(3:210|211|(2:213|(2:214|(2:216|(1:218)(3:219|220|221))(3:222|223|(2:225|(2:227|(1:229))(2:230|231))(2:232|233))))(2:234|235)))|165|(0)|179|180|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x049c, code lost:
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05df  */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.view.TextureView, h2.p] */
    /* JADX WARN: Type inference failed for: r6v17, types: [io.flutter.embedding.engine.renderer.p, android.view.View] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.AbstractActivityC0292d.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (l("onDestroy")) {
            this.f3315K.e();
            this.f3315K.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f3317M);
            this.f3314J = false;
        }
        C0295g c0295g = this.f3315K;
        if (c0295g != null) {
            c0295g.f3322a = null;
            c0295g.f3323b = null;
            c0295g.f3324c = null;
            c0295g.f3325d = null;
            this.f3315K = null;
        }
        this.f3316L.e(EnumC0137k.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (l("onNewIntent")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                i2.e eVar = cVar.f3423d;
                if (eVar.g()) {
                    AbstractC0938a.b("FlutterEngineConnectionRegistry#onNewIntent");
                    try {
                        Iterator it = ((i2.d) eVar.g).f3445e.iterator();
                        while (it.hasNext()) {
                            ((C0073a) it.next()).j(intent);
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
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
                }
                String d4 = c0295g.d(intent);
                if (d4 != null && !d4.isEmpty()) {
                    C0322i c0322i = c0295g.f3323b.f3427i;
                    c0322i.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("location", d4);
                    ((C0001b) c0322i.f3983K).M("pushRouteInformation", hashMap, null);
                    return;
                }
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (l("onPause")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            c0295g.f3322a.getClass();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                q2.b bVar = q2.b.INACTIVE;
                Q1.k kVar = cVar.g;
                kVar.a(bVar, kVar.f1083a);
            }
        }
        this.f3316L.e(EnumC0137k.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (l("onPostResume")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            if (c0295g.f3323b != null) {
                B.a aVar = c0295g.f3325d;
                if (aVar != null) {
                    aVar.e();
                }
                Iterator it = c0295g.f3323b.f3436r.f3583h.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.p) it.next()).getClass();
                    throw null;
                }
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int r5, String[] strArr, int[] r7) {
        if (l("onRequestPermissionsResult")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            if (c0295g.f3323b != null) {
                Arrays.toString(strArr);
                Arrays.toString(r7);
                i2.e eVar = c0295g.f3323b.f3423d;
                if (eVar.g()) {
                    AbstractC0938a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
                    try {
                        Iterator it = ((i2.d) eVar.g).f3443c.iterator();
                        while (true) {
                            boolean z3 = false;
                            while (it.hasNext()) {
                                if (((r2.p) it.next()).a(r5, strArr, r7) || z3) {
                                    z3 = true;
                                }
                            }
                            Trace.endSection();
                            return;
                        }
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f3316L.e(EnumC0137k.ON_RESUME);
        if (l("onResume")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            c0295g.f3322a.getClass();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                q2.b bVar = q2.b.RESUMED;
                Q1.k kVar = cVar.g;
                kVar.a(bVar, kVar.f1083a);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (l("onSaveInstanceState")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            if (c0295g.f3322a.k()) {
                bundle.putByteArray("framework", c0295g.f3323b.f3429k.f4826b);
            }
            c0295g.f3322a.getClass();
            Bundle bundle2 = new Bundle();
            i2.e eVar = c0295g.f3323b.f3423d;
            if (eVar.g()) {
                AbstractC0938a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((i2.d) eVar.g).g.iterator();
                    if (!it.hasNext()) {
                        Trace.endSection();
                    } else if (it.next() == null) {
                        throw null;
                    } else {
                        throw new ClassCastException();
                    }
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (c0295g.f3322a.e() != null && !c0295g.f3322a.j()) {
                bundle.putBoolean("enableOnBackInvokedCallbackState", c0295g.f3322a.f3314J);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onStart() {
        /*
            r6 = this;
            super.onStart()
            androidx.lifecycle.t r0 = r6.f3316L
            androidx.lifecycle.k r1 = androidx.lifecycle.EnumC0137k.ON_START
            r0.e(r1)
            java.lang.String r0 = "onStart"
            boolean r0 = r6.l(r0)
            if (r0 == 0) goto Lc2
            h2.g r0 = r6.f3315K
            r0.c()
            h2.d r1 = r0.f3322a
            java.lang.String r1 = r1.e()
            if (r1 == 0) goto L21
            goto Lb5
        L21:
            i2.c r1 = r0.f3323b
            j2.b r1 = r1.f3422c
            boolean r1 = r1.f3864O
            if (r1 == 0) goto L2b
            goto Lb5
        L2b:
            h2.d r1 = r0.f3322a
            java.lang.String r1 = r1.g()
            if (r1 != 0) goto L44
            h2.d r1 = r0.f3322a
            r1.getClass()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r1 = r0.d(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "/"
        L44:
            h2.d r2 = r0.f3322a
            r2.getClass()
            r3 = 0
            android.os.Bundle r2 = r2.h()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            if (r2 == 0) goto L57
            java.lang.String r4 = "io.flutter.EntrypointUri"
            java.lang.String r2 = r2.getString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            goto L58
        L57:
            r2 = r3
        L58:
            h2.d r4 = r0.f3322a
            r4.f()
            i2.c r4 = r0.f3323b
            k0.i r4 = r4.f3427i
            java.lang.Object r4 = r4.f3983K
            A0.b r4 = (A0.C0001b) r4
            java.lang.String r5 = "setInitialRoute"
            r4.M(r5, r1, r3)
            h2.d r1 = r0.f3322a
            java.lang.String r1 = r1.c()
            if (r1 == 0) goto L78
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L86
        L78:
            A0.b r1 = A0.C0001b.L()
            java.lang.Object r1 = r1.f85L
            l2.c r1 = (l2.c) r1
            W1.k r1 = r1.f4112d
            java.lang.Object r1 = r1.f1532c
            java.lang.String r1 = (java.lang.String) r1
        L86:
            if (r2 != 0) goto L94
            j2.a r2 = new j2.a
            h2.d r3 = r0.f3322a
            java.lang.String r3 = r3.f()
            r2.<init>(r1, r3)
            goto La0
        L94:
            j2.a r3 = new j2.a
            h2.d r4 = r0.f3322a
            java.lang.String r4 = r4.f()
            r3.<init>(r1, r2, r4)
            r2 = r3
        La0:
            i2.c r1 = r0.f3323b
            j2.b r1 = r1.f3422c
            h2.d r3 = r0.f3322a
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "dart_entrypoint_args"
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            java.util.List r3 = (java.util.List) r3
            r1.a(r2, r3)
        Lb5:
            java.lang.Integer r1 = r0.f3330j
            if (r1 == 0) goto Lc2
            h2.t r0 = r0.f3324c
            int r1 = r1.intValue()
            r0.setVisibility(r1)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.AbstractActivityC0292d.onStart():void");
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (l("onStop")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            c0295g.f3322a.getClass();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                q2.b bVar = q2.b.PAUSED;
                Q1.k kVar = cVar.g;
                kVar.a(bVar, kVar.f1083a);
            }
            c0295g.f3330j = Integer.valueOf(c0295g.f3324c.getVisibility());
            c0295g.f3324c.setVisibility(8);
            i2.c cVar2 = c0295g.f3323b;
            if (cVar2 != null) {
                cVar2.f3421b.a(40);
            }
        }
        this.f3316L.e(EnumC0137k.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int r7) {
        super.onTrimMemory(r7);
        if (l("onTrimMemory")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                if (c0295g.f3328h && r7 >= 10) {
                    FlutterJNI flutterJNI = cVar.f3422c.f3859J;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C0322i c0322i = c0295g.f3323b.f3434p;
                    c0322i.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    ((a1.i) c0322i.f3983K).k(hashMap, null);
                }
                c0295g.f3323b.f3421b.a(r7);
                io.flutter.plugin.platform.j jVar = c0295g.f3323b.f3436r;
                if (r7 < 40) {
                    jVar.getClass();
                    return;
                }
                Iterator it = jVar.f3583h.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.p) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (l("onUserLeaveHint")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                i2.e eVar = cVar.f3423d;
                if (eVar.g()) {
                    AbstractC0938a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
                    try {
                        Iterator it = ((i2.d) eVar.g).f3446f.iterator();
                        if (!it.hasNext()) {
                            Trace.endSection();
                            return;
                        } else if (it.next() == null) {
                            throw null;
                        } else {
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (l("onWindowFocusChanged")) {
            C0295g c0295g = this.f3315K;
            c0295g.c();
            c0295g.f3322a.getClass();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                Q1.k kVar = cVar.g;
                if (z3) {
                    kVar.a((q2.b) kVar.f1084b, true);
                } else {
                    kVar.a((q2.b) kVar.f1084b, false);
                }
            }
        }
    }
}
