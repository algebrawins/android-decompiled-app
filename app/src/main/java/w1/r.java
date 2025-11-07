package w1;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final l f5315b = l.a(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);

    /* renamed from: a  reason: collision with root package name */
    public final String f5316a;

    /* JADX WARN: Type inference failed for: r2v3, types: [w1.u, java.lang.Object] */
    public r(Context context, Q1.j jVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        Q1.c.a(context);
        synchronized (u.class) {
            if (u.f5319J == null) {
                u.f5319J = new Object();
            }
        }
        this.f5316a = "common";
        Q1.f a4 = Q1.f.a();
        G.c cVar = new G.c(1, this);
        a4.getClass();
        Q1.f.b(cVar);
        Q1.f a5 = Q1.f.a();
        jVar.getClass();
        q qVar = new q(jVar, 0);
        a5.getClass();
        Q1.f.b(qVar);
        l lVar = f5315b;
        if (lVar.containsKey("common")) {
            t1.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
