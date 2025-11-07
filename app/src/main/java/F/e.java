package F;

import A0.A;
import A0.AbstractC0017t;
import A0.J;
import A0.z;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import x1.AbstractC0584c4;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Handler f602a;

    public static int a(J j3, AbstractC0017t abstractC0017t, View view, View view2, z zVar, boolean z3) {
        if (zVar.p() != 0 && j3.a() != 0 && view != null && view2 != null) {
            if (z3) {
                return Math.min(abstractC0017t.q(), abstractC0017t.i(view2) - abstractC0017t.n(view));
            }
            ((A) view.getLayoutParams()).getClass();
            throw null;
        }
        return 0;
    }

    public static int b(J j3, AbstractC0017t abstractC0017t, View view, View view2, z zVar, boolean z3) {
        if (zVar.p() != 0 && j3.a() != 0 && view != null && view2 != null) {
            if (!z3) {
                return j3.a();
            }
            abstractC0017t.i(view2);
            abstractC0017t.n(view);
            ((A) view.getLayoutParams()).getClass();
            throw null;
        }
        return 0;
    }

    public static Handler c() {
        if (f602a != null) {
            return f602a;
        }
        synchronized (e.class) {
            try {
                if (f602a == null) {
                    f602a = AbstractC0584c4.a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f602a;
    }
}
