package D;

import A0.C0001b;
import android.widget.Toast;
import androidx.lifecycle.EnumC0137k;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.LinkedHashSet;
import k0.C0322i;
import p.C0419s;
import w.C0511v;
import w.EnumC0508s;
import w.RunnableC0509t;
import x.AbstractC0550e;
import x1.AbstractC0612g0;
import x1.AbstractC0624h4;
import x1.C0727v4;

/* loaded from: classes.dex */
public final /* synthetic */ class N implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f327J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f328K;

    public /* synthetic */ N(int r12, Object obj) {
        this.f327J = r12;
        this.f328K = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        switch (this.f327J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                P p2 = (P) this.f328K;
                synchronized (p2.f332d0) {
                    try {
                        p2.f334f0 = null;
                        X x3 = p2.f333e0;
                        if (x3 != null) {
                            p2.f333e0 = null;
                            p2.f(x3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((e0) this.f328K).n();
                return;
            case 2:
                ((E.e) this.f328K).c();
                return;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((N.n) this.f328K).close();
                return;
            case 4:
                N.f fVar = (N.f) this.f328K;
                fVar.f896j = true;
                fVar.a();
                return;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                ((l0) this.f328K).a();
                return;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((N.l) this.f328K).b();
                return;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((androidx.camera.core.impl.D) this.f328K).b();
                return;
            case 8:
                N.o oVar = (N.o) ((C0001b) this.f328K).f86M;
                if (oVar != null) {
                    for (V v3 : oVar.values()) {
                        v3.getClass();
                        AbstractC0612g0.a();
                        v3.c();
                        v3.f947n = true;
                    }
                    return;
                }
                return;
            case 9:
                ((C0419s) this.f328K).getClass();
                return;
            case 10:
                w.r rVar = (w.r) this.f328K;
                if (rVar.f5233c.f5246M == EnumC0508s.PENDING_OPEN) {
                    rVar.f5233c.H(false);
                    return;
                }
                return;
            case 11:
                C0322i c0322i = (C0322i) this.f328K;
                if (((C0511v) c0322i.f3983K).f5246M == EnumC0508s.OPENED) {
                    ((C0511v) c0322i.f3983K).y();
                    return;
                }
                return;
            case 12:
                ((H.j) this.f328K).cancel(true);
                return;
            case 13:
                androidx.lifecycle.E e4 = (androidx.lifecycle.E) this.f328K;
                N2.g.e(e4, "this$0");
                int r12 = e4.f2435K;
                androidx.lifecycle.t tVar = e4.f2439O;
                if (r12 == 0) {
                    e4.f2436L = true;
                    tVar.e(EnumC0137k.ON_PAUSE);
                }
                if (e4.f2434J == 0 && e4.f2436L) {
                    tVar.e(EnumC0137k.ON_STOP);
                    e4.f2437M = true;
                    return;
                }
                return;
            case 14:
                ((d2.m) this.f328K).f3036l = false;
                return;
            case 15:
                ((io.flutter.plugin.platform.j) this.f328K).f(false);
                return;
            case 16:
                ((l2.c) ((Y1.f) this.f328K).f1674c).f4113e.prefetchDefaultFontManager();
                return;
            case 17:
                ((androidx.camera.core.impl.i) this.f328K).a();
                return;
            case 18:
                ((androidx.camera.core.impl.a0) this.f328K).a();
                return;
            case 19:
                RunnableC0509t runnableC0509t = (RunnableC0509t) this.f328K;
                if (!runnableC0509t.f5235K) {
                    if (runnableC0509t.f5236L.f5242f.f5246M == EnumC0508s.REOPENING) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    AbstractC0624h4.f(null, z3);
                    if (runnableC0509t.f5236L.c()) {
                        runnableC0509t.f5236L.f5242f.G(true);
                        return;
                    } else {
                        runnableC0509t.f5236L.f5242f.H(true);
                        return;
                    }
                }
                return;
            case 20:
                for (w.d0 d0Var : (LinkedHashSet) this.f328K) {
                    d0Var.getClass();
                    d0Var.c(d0Var);
                }
                return;
            case 21:
                w.d0 d0Var2 = (w.d0) this.f328K;
                d0Var2.g(d0Var2);
                return;
            case 22:
                w.e0.t((w.e0) this.f328K);
                return;
            case 23:
                ((f0) this.f328K).a();
                return;
            case 24:
                AbstractC0550e.a(((x.v) this.f328K).f5476b);
                return;
            default:
                Toast toast = (Toast) ((C0727v4) this.f328K).f6109K;
                if (toast != null) {
                    toast.show();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ N(androidx.camera.core.impl.a0 a0Var, androidx.camera.core.impl.c0 c0Var) {
        this.f327J = 18;
        this.f328K = a0Var;
    }
}
