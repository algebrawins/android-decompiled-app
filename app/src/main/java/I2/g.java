package i2;

import A.m;
import A0.C0001b;
import h2.AbstractActivityC0292d;
import j2.C0307a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3455a = new ArrayList();

    public g(AbstractActivityC0292d abstractActivityC0292d, String[] strArr) {
        l2.c cVar = (l2.c) C0001b.L().f85L;
        if (!cVar.f4109a) {
            cVar.b(abstractActivityC0292d.getApplicationContext());
            cVar.a(abstractActivityC0292d.getApplicationContext(), strArr);
        }
    }

    public final c a(m mVar) {
        c cVar;
        AbstractActivityC0292d abstractActivityC0292d = (AbstractActivityC0292d) mVar.f27c;
        C0307a c0307a = (C0307a) mVar.f28d;
        String str = (String) mVar.f29e;
        List<String> list = (List) mVar.f30f;
        io.flutter.plugin.platform.j jVar = new io.flutter.plugin.platform.j();
        boolean z3 = mVar.f25a;
        boolean z4 = mVar.f26b;
        if (c0307a == null) {
            l2.c cVar2 = (l2.c) C0001b.L().f85L;
            if (cVar2.f4109a) {
                c0307a = new C0307a((String) cVar2.f4112d.f1532c, "main");
            } else {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
        }
        ArrayList arrayList = this.f3455a;
        if (arrayList.size() == 0) {
            cVar = new c(abstractActivityC0292d, null, jVar, z3, z4);
            if (str != null) {
                ((C0001b) cVar.f3427i.f3983K).M("setInitialRoute", str, null);
            }
            cVar.f3422c.a(c0307a, list);
        } else {
            c cVar3 = (c) arrayList.get(0);
            if (cVar3.f3420a.isAttached()) {
                long j3 = c.f3418w;
                cVar = new c(abstractActivityC0292d, cVar3.f3420a.spawn(c0307a.f3858c, c0307a.f3857b, str, list, j3), jVar, z3, z4);
            } else {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
        }
        arrayList.add(cVar);
        cVar.f3438t.add(new f(this, cVar));
        return cVar;
    }
}
