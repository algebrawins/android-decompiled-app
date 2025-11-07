package x1;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import k1.C0340h;

/* loaded from: classes.dex */
public final class I6 {

    /* renamed from: k  reason: collision with root package name */
    public static G f5600k;

    /* renamed from: l  reason: collision with root package name */
    public static final L f5601l;

    /* renamed from: a  reason: collision with root package name */
    public final String f5602a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5603b;

    /* renamed from: c  reason: collision with root package name */
    public final F6 f5604c;

    /* renamed from: d  reason: collision with root package name */
    public final Q1.j f5605d;

    /* renamed from: e  reason: collision with root package name */
    public final C1.j f5606e;

    /* renamed from: f  reason: collision with root package name */
    public final C1.j f5607f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5608h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f5609i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f5610j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f5601l = new L(0, objArr);
    }

    public I6(Context context, Q1.j jVar, F6 f6, String str) {
        int r3;
        this.f5602a = context.getPackageName();
        this.f5603b = Q1.c.a(context);
        this.f5605d = jVar;
        this.f5604c = f6;
        N6.b();
        this.g = str;
        Q1.f a4 = Q1.f.a();
        G.c cVar = new G.c(2, this);
        a4.getClass();
        this.f5606e = Q1.f.b(cVar);
        Q1.f a5 = Q1.f.a();
        jVar.getClass();
        w1.q qVar = new w1.q(jVar, 1);
        a5.getClass();
        this.f5607f = Q1.f.b(qVar);
        L l3 = f5601l;
        if (l3.containsKey(str)) {
            r3 = t1.e.d(context, (String) l3.get(str), false);
        } else {
            r3 = -1;
        }
        this.f5608h = r3;
    }

    public static long a(ArrayList arrayList, double d4) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d4 / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(H6 h6, O4 o4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!d(o4, elapsedRealtime)) {
            return;
        }
        this.f5609i.put(o4, Long.valueOf(elapsedRealtime));
        Q1.n.zza.execute(new o.e(this, h6.a(), o4, c(), 1));
    }

    public final String c() {
        C1.j jVar = this.f5606e;
        if (jVar.f()) {
            return (String) jVar.d();
        }
        return C0340h.f4039c.a(this.g);
    }

    public final boolean d(O4 o4, long j3) {
        HashMap hashMap = this.f5609i;
        if (hashMap.get(o4) == null || j3 - ((Long) hashMap.get(o4)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
