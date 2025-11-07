package Q1;

import android.content.Context;
import k1.w;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f1072b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static g f1073c;

    /* renamed from: a  reason: collision with root package name */
    public F1.h f1074a;

    public static g c() {
        boolean z3;
        g gVar;
        synchronized (f1072b) {
            if (f1073c != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            w.g("MlKitContext has not been initialized", z3);
            gVar = f1073c;
            w.e(gVar);
        }
        return gVar;
    }

    public final Object a(Class cls) {
        boolean z3;
        if (f1073c == this) {
            z3 = true;
        } else {
            z3 = false;
        }
        w.g("MlKitContext has been deleted", z3);
        w.e(this.f1074a);
        return this.f1074a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
