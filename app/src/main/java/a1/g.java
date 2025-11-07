package a1;

import D.C;
import U0.j;
import U0.k;
import U0.l;
import U0.n;
import U0.p;
import U0.t;
import U0.u;
import U0.w;
import android.content.Context;
import android.util.Log;
import b1.C0146b;
import b1.InterfaceC0147c;
import c1.InterfaceC0161c;
import d1.InterfaceC0232a;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p.t0;
import x1.A0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1822a;

    /* renamed from: b  reason: collision with root package name */
    public final W0.g f1823b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC0147c f1824c;

    /* renamed from: d  reason: collision with root package name */
    public final d f1825d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f1826e;

    /* renamed from: f  reason: collision with root package name */
    public final InterfaceC0161c f1827f;
    public final InterfaceC0232a g;

    public g(Context context, W0.g gVar, InterfaceC0147c interfaceC0147c, d dVar, Executor executor, InterfaceC0161c interfaceC0161c, InterfaceC0232a interfaceC0232a) {
        this.f1822a = context;
        this.f1823b = gVar;
        this.f1824c = interfaceC0147c;
        this.f1825d = dVar;
        this.f1826e = executor;
        this.f1827f = interfaceC0161c;
        this.g = interfaceC0232a;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [p.t0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [p.t0, java.lang.Object] */
    public final void a(V0.c cVar, int r40) {
        W0.a aVar;
        String str;
        T0.c l02;
        String str2;
        Integer num;
        t0 t0Var;
        long longValue;
        String str3;
        W0.h a4 = this.f1823b.a(cVar.f1368a);
        A.f fVar = new A.f(19, this, cVar);
        b1.h hVar = (b1.h) this.f1827f;
        Iterable<C0146b> iterable = (Iterable) hVar.h(fVar);
        if (!iterable.iterator().hasNext()) {
            return;
        }
        if (a4 == null) {
            A0.a("Uploader", "Unknown backend for %s, deleting event batch for it...", cVar);
            aVar = new W0.a(W0.c.FATAL_ERROR, -1L);
        } else {
            ArrayList arrayList = new ArrayList();
            for (C0146b c0146b : iterable) {
                arrayList.add(c0146b.f2614c);
            }
            T0.d dVar = (T0.d) a4;
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                V0.b bVar = (V0.b) it.next();
                String str4 = bVar.f1362a;
                if (!hashMap.containsKey(str4)) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(bVar);
                    hashMap.put(str4, arrayList2);
                } else {
                    ((List) hashMap.get(str4)).add(bVar);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                V0.b bVar2 = (V0.b) ((List) entry.getValue()).get(0);
                w wVar = w.DEFAULT;
                long c4 = dVar.f1219f.c();
                long c5 = dVar.f1218e.c();
                j jVar = new j(p.ANDROID_FIREBASE, new U0.h(Integer.valueOf(bVar2.b("sdk-version")), bVar2.a("model"), bVar2.a("hardware"), bVar2.a("device"), bVar2.a("product"), bVar2.a("os-uild"), bVar2.a("manufacturer"), bVar2.a("fingerprint"), bVar2.a("locale"), bVar2.a("country"), bVar2.a("mcc_mnc"), bVar2.a("application_build")));
                try {
                    num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                    str2 = null;
                } catch (NumberFormatException unused) {
                    str2 = (String) entry.getKey();
                    num = null;
                }
                ArrayList arrayList4 = new ArrayList();
                for (V0.b bVar3 : (List) entry.getValue()) {
                    V0.f fVar2 = bVar3.f1364c;
                    S0.b bVar4 = fVar2.f1376a;
                    Iterator it3 = it2;
                    boolean equals = bVar4.equals(new S0.b("proto"));
                    byte[] bArr = fVar2.f1377b;
                    if (equals) {
                        ?? obj = new Object();
                        obj.f4721d = bArr;
                        t0Var = obj;
                    } else if (bVar4.equals(new S0.b("json"))) {
                        String str5 = new String(bArr, Charset.forName("UTF-8"));
                        ?? obj2 = new Object();
                        obj2.f4722e = str5;
                        t0Var = obj2;
                    } else {
                        Log.w("TransportRuntime.".concat("CctTransportBackend"), "Received event of unsupported encoding " + bVar4 + ". Skipping...");
                        it2 = it3;
                    }
                    t0Var.f4718a = Long.valueOf(bVar3.f1365d);
                    t0Var.f4720c = Long.valueOf(bVar3.f1366e);
                    String str6 = (String) bVar3.f1367f.get("tz-offset");
                    if (str6 == null) {
                        longValue = 0;
                    } else {
                        longValue = Long.valueOf(str6).longValue();
                    }
                    t0Var.f4723f = Long.valueOf(longValue);
                    t0Var.g = new n(u.a(bVar3.b("net-type")), t.a(bVar3.b("mobile-subtype")));
                    Integer num2 = bVar3.f1363b;
                    if (num2 != null) {
                        t0Var.f4719b = num2;
                    }
                    if (((Long) t0Var.f4718a) == null) {
                        str3 = " eventTimeMs";
                    } else {
                        str3 = "";
                    }
                    if (((Long) t0Var.f4720c) == null) {
                        str3 = str3.concat(" eventUptimeMs");
                    }
                    if (((Long) t0Var.f4723f) == null) {
                        str3 = C.y(str3, " timezoneOffsetSeconds");
                    }
                    if (str3.isEmpty()) {
                        arrayList4.add(new k(((Long) t0Var.f4718a).longValue(), (Integer) t0Var.f4719b, ((Long) t0Var.f4720c).longValue(), (byte[]) t0Var.f4721d, (String) t0Var.f4722e, ((Long) t0Var.f4723f).longValue(), (n) t0Var.g));
                        it2 = it3;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                }
                arrayList3.add(new l(c4, c5, jVar, num, str2, arrayList4, wVar));
                it2 = it2;
            }
            U0.i iVar = new U0.i(arrayList3);
            byte[] bArr2 = cVar.f1369b;
            URL url = dVar.f1217d;
            if (bArr2 != null) {
                try {
                    T0.a a5 = T0.a.a(bArr2);
                    str = a5.f1207b;
                    if (str == null) {
                        str = null;
                    }
                    String str7 = a5.f1206a;
                    if (str7 != null) {
                        url = T0.d.b(str7);
                    }
                } catch (IllegalArgumentException unused2) {
                    aVar = new W0.a(W0.c.FATAL_ERROR, -1L);
                }
            } else {
                str = null;
            }
            try {
                T0.b bVar5 = new T0.b(url, iVar, str);
                A.a aVar2 = new A.a(18, dVar);
                int r02 = 5;
                do {
                    l02 = aVar2.l0(bVar5);
                    URL url2 = l02.f1212b;
                    if (url2 != null) {
                        A0.a("CctTransportBackend", "Following redirect to: %s", url2);
                        bVar5 = new T0.b(url2, bVar5.f1209b, bVar5.f1210c);
                    } else {
                        bVar5 = null;
                    }
                    if (bVar5 == null) {
                        break;
                    }
                    r02--;
                } while (r02 >= 1);
                int r03 = l02.f1211a;
                if (r03 == 200) {
                    aVar = new W0.a(W0.c.OK, l02.f1213c);
                } else {
                    if (r03 < 500 && r03 != 404) {
                        aVar = new W0.a(W0.c.FATAL_ERROR, -1L);
                    }
                    aVar = new W0.a(W0.c.TRANSIENT_ERROR, -1L);
                }
            } catch (IOException e4) {
                Log.e("TransportRuntime.".concat("CctTransportBackend"), "Could not make request to the backend", e4);
                aVar = new W0.a(W0.c.TRANSIENT_ERROR, -1L);
            }
        }
        hVar.h(new B.a(this, aVar, iterable, cVar, r40));
    }
}
