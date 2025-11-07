package Z0;

import A0.C0001b;
import H.e;
import N.g;
import Q1.n;
import T0.d;
import W0.h;
import android.os.Handler;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;
import x1.C0580c0;
import x1.C0588d0;
import x1.C0635k;
import x1.C0659n;
import x1.C0683q;
import x1.C0695r4;
import x1.I6;
import x1.M4;
import x1.O4;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f1756J;

    /* renamed from: K  reason: collision with root package name */
    public Object f1757K;

    /* renamed from: L  reason: collision with root package name */
    public Object f1758L;

    /* renamed from: M  reason: collision with root package name */
    public Object f1759M;

    public /* synthetic */ a() {
        this.f1756J = 1;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, V0.a] */
    /* JADX WARN: Type inference failed for: r3v18, types: [w2.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, V0.a] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        C0659n c0659n;
        M4 m4;
        switch (this.f1756J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                b bVar = (b) this.f1757K;
                V0.c cVar = (V0.c) this.f1758L;
                String str = cVar.f1368a;
                V0.b bVar2 = (V0.b) this.f1759M;
                Logger logger = b.f1760f;
                try {
                    h a4 = bVar.f1763c.a(str);
                    if (a4 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((b1.h) bVar.f1765e).h(new C0001b(bVar, cVar, ((d) a4).a(bVar2), 11));
                    }
                    return;
                } catch (Exception e4) {
                    logger.warning("Error scheduling event " + e4.getMessage());
                    return;
                }
            case 1:
                try {
                    obj = ((c0.c) this.f1757K).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f1759M).post(new e(15, (g) this.f1758L, obj));
                return;
            default:
                I6 r02 = (I6) this.f1757K;
                HashMap hashMap = r02.f5610j;
                O4 o4 = (O4) this.f1758L;
                C0683q c0683q = (C0683q) hashMap.get(o4);
                if (c0683q != null) {
                    Iterator it = ((C0635k) c0683q.b()).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Object obj2 = (Collection) c0683q.f6069L.get(next);
                        if (obj2 == null) {
                            obj2 = new ArrayList(3);
                        }
                        List list = (List) obj2;
                        if (list instanceof RandomAccess) {
                            c0659n = new C0659n(c0683q, next, list, null);
                        } else {
                            c0659n = new C0659n(c0683q, next, list, null);
                        }
                        ArrayList arrayList = new ArrayList(c0659n);
                        Collections.sort(arrayList);
                        ?? obj3 = new Object();
                        Iterator it2 = arrayList.iterator();
                        long j3 = 0;
                        while (it2.hasNext()) {
                            j3 += ((Long) it2.next()).longValue();
                        }
                        obj3.f1356J = Long.valueOf((j3 / arrayList.size()) & Long.MAX_VALUE);
                        obj3.f1359M = Long.valueOf(I6.a(arrayList, 100.0d) & Long.MAX_VALUE);
                        obj3.f1361O = Long.valueOf(I6.a(arrayList, 75.0d) & Long.MAX_VALUE);
                        obj3.f1358L = Long.valueOf(I6.a(arrayList, 50.0d) & Long.MAX_VALUE);
                        obj3.f1357K = Long.valueOf(I6.a(arrayList, 25.0d) & Long.MAX_VALUE);
                        obj3.f1360N = Long.valueOf(I6.a(arrayList, 0.0d) & Long.MAX_VALUE);
                        C0695r4 c0695r4 = new C0695r4(obj3);
                        int size = arrayList.size();
                        C0580c0 c0580c0 = (C0580c0) next;
                        ?? obj4 = new Object();
                        if (((W1.h) ((A.a) this.f1759M).f1K).f1522i) {
                            m4 = M4.zzc;
                        } else {
                            m4 = M4.zzb;
                        }
                        obj4.f1358L = m4;
                        ?? obj5 = new Object();
                        obj5.f5402K = Integer.valueOf(size & Integer.MAX_VALUE);
                        obj5.f5401J = c0580c0;
                        obj5.f5403L = c0695r4;
                        obj4.f1361O = new C0588d0(obj5);
                        n.zza.execute(new o.e(r02, new U1.h(obj4, 0), o4, r02.c(), 1));
                    }
                    hashMap.remove(o4);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int r4) {
        this.f1756J = r4;
        this.f1757K = obj;
        this.f1758L = obj2;
        this.f1759M = obj3;
    }
}
