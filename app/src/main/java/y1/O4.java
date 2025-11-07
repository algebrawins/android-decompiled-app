package y1;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class O4 {

    /* renamed from: j  reason: collision with root package name */
    public static X4 f6273j;

    /* renamed from: k  reason: collision with root package name */
    public static final x1.L f6274k;

    /* renamed from: a  reason: collision with root package name */
    public final String f6275a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6276b;

    /* renamed from: c  reason: collision with root package name */
    public final N4 f6277c;

    /* renamed from: d  reason: collision with root package name */
    public final Q1.j f6278d;

    /* renamed from: e  reason: collision with root package name */
    public final C1.j f6279e;

    /* renamed from: f  reason: collision with root package name */
    public final C1.j f6280f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6281h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f6282i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f6274k = new x1.L(1, objArr);
    }

    public O4(Context context, Q1.j jVar, N4 n4) {
        int r4;
        new HashMap();
        this.f6275a = context.getPackageName();
        this.f6276b = Q1.c.a(context);
        this.f6278d = jVar;
        this.f6277c = n4;
        S4.b();
        this.g = "vision-common";
        Q1.f a4 = Q1.f.a();
        G.c cVar = new G.c(3, this);
        a4.getClass();
        this.f6279e = Q1.f.b(cVar);
        Q1.f a5 = Q1.f.a();
        jVar.getClass();
        w1.q qVar = new w1.q(jVar, 2);
        a5.getClass();
        this.f6280f = Q1.f.b(qVar);
        x1.L l3 = f6274k;
        if (l3.containsKey("vision-common")) {
            r4 = t1.e.d(context, (String) l3.get("vision-common"), false);
        } else {
            r4 = -1;
        }
        this.f6281h = r4;
    }
}
