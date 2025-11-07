package V0;

import A0.C0001b;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final c f1379a;

    /* renamed from: b  reason: collision with root package name */
    public final S0.b f1380b;

    /* renamed from: c  reason: collision with root package name */
    public final S0.d f1381c;

    /* renamed from: d  reason: collision with root package name */
    public final i f1382d;

    public h(c cVar, S0.b bVar, S0.d dVar, i iVar) {
        this.f1379a = cVar;
        this.f1380b = bVar;
        this.f1381c = dVar;
        this.f1382d = iVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, V0.a] */
    public final void a(S0.a aVar) {
        c cVar = this.f1379a;
        S0.d dVar = this.f1381c;
        S0.b bVar = this.f1380b;
        i iVar = this.f1382d;
        C0001b a4 = c.a();
        String str = cVar.f1368a;
        if (str != null) {
            a4.f85L = str;
            S0.c cVar2 = aVar.f1195b;
            if (cVar2 != null) {
                a4.f86M = cVar2;
                a4.f84K = cVar.f1369b;
                c h3 = a4.h();
                ?? obj = new Object();
                obj.f1361O = new HashMap();
                obj.f1359M = Long.valueOf(iVar.f1384a.c());
                obj.f1360N = Long.valueOf(iVar.f1385b.c());
                obj.f1356J = "FIREBASE_ML_SDK";
                obj.f1358L = new f(bVar, (byte[]) dVar.apply(aVar.f1194a));
                obj.f1357K = null;
                b c4 = obj.c();
                Z0.b bVar2 = (Z0.b) iVar.f1386c;
                bVar2.getClass();
                bVar2.f1762b.execute(new Z0.a(bVar2, h3, c4, 0));
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null backendName");
    }
}
