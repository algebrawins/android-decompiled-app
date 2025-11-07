package i1;

import A0.C0001b;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import h2.D;
import h2.J;
import j1.C0302a;
import j1.C0304c;
import j1.m;
import j1.t;
import j1.v;
import j1.x;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import k1.C0334b;
import k1.C0341j;
import k1.C0342k;
import k1.w;
import u1.HandlerC0477e;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3409a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3410b;

    /* renamed from: c  reason: collision with root package name */
    public final J f3411c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3412d;

    /* renamed from: e  reason: collision with root package name */
    public final C0302a f3413e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3414f;
    public final O1.a g;

    /* renamed from: h  reason: collision with root package name */
    public final C0304c f3415h;

    public f(Context context, J j3, b bVar, e eVar) {
        boolean z3;
        w.f(context, "Null context is not permitted.");
        w.f(j3, "Api must not be null.");
        w.f(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f3409a = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 30) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str = null;
        if (z3) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f3410b = str;
        this.f3411c = j3;
        this.f3412d = bVar;
        this.f3413e = new C0302a(j3, bVar, str);
        C0304c e4 = C0304c.e(this.f3409a);
        this.f3415h = e4;
        this.f3414f = e4.f3805h.getAndIncrement();
        this.g = eVar.f3408a;
        HandlerC0477e handlerC0477e = e4.f3810m;
        handlerC0477e.sendMessage(handlerC0477e.obtainMessage(7, this));
    }

    public final C0001b a() {
        C0001b c0001b = new C0001b(18, false);
        Set emptySet = Collections.emptySet();
        if (((R.c) c0001b.f85L) == null) {
            c0001b.f85L = new R.c(0);
        }
        ((R.c) c0001b.f85L).addAll(emptySet);
        Context context = this.f3409a;
        c0001b.f86M = context.getClass().getName();
        c0001b.f84K = context.getPackageName();
        return c0001b;
    }

    public final C1.j b(int r14, D d4) {
        long j3;
        C1.g gVar = new C1.g();
        C0304c c0304c = this.f3415h;
        c0304c.getClass();
        int r3 = d4.f3291c;
        if (r3 != 0) {
            C0302a c0302a = this.f3413e;
            t tVar = null;
            if (c0304c.a()) {
                C0342k c0342k = (C0342k) C0341j.b().f4051a;
                boolean z3 = true;
                if (c0342k != null) {
                    if (c0342k.f4053b) {
                        m mVar = (m) c0304c.f3807j.get(c0302a);
                        if (mVar != null) {
                            c cVar = mVar.f3816m;
                            if (cVar instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                                if (aVar.f2759u != null && !aVar.b()) {
                                    C0334b a4 = t.a(mVar, aVar, r3);
                                    if (a4 != null) {
                                        mVar.f3826w++;
                                        z3 = a4.f4019c;
                                    }
                                }
                            }
                        }
                        z3 = c0342k.f4054c;
                    }
                }
                long j4 = 0;
                if (z3) {
                    j3 = System.currentTimeMillis();
                } else {
                    j3 = 0;
                }
                if (z3) {
                    j4 = SystemClock.elapsedRealtime();
                }
                tVar = new t(c0304c, r3, c0302a, j3, j4);
            }
            if (tVar != null) {
                C1.j jVar = gVar.f239a;
                HandlerC0477e handlerC0477e = c0304c.f3810m;
                handlerC0477e.getClass();
                G.h hVar = new G.h(2, handlerC0477e);
                jVar.getClass();
                jVar.f247b.g(new C1.i(hVar, tVar));
                jVar.l();
            }
        }
        x xVar = new x(r14, d4, gVar, this.g);
        HandlerC0477e handlerC0477e2 = c0304c.f3810m;
        handlerC0477e2.sendMessage(handlerC0477e2.obtainMessage(4, new v(xVar, c0304c.f3806i.get(), this)));
        return gVar.f239a;
    }
}
