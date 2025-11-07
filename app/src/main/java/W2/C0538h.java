package w2;

import java.util.List;

/* renamed from: w2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538h extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public /* synthetic */ Object f5373N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ List f5374O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0538h(List list, D2.d dVar) {
        super(2, dVar);
        this.f5374O = list;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        C0538h c0538h = new C0538h(this.f5374O, dVar);
        c0538h.f5373N = obj;
        return c0538h;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        D2.d dVar = (D2.d) obj2;
        B2.i iVar = B2.i.f210a;
        ((C0538h) f(dVar, (r0.b) obj)).k(iVar);
        return iVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        P1.a.b(obj);
        r0.b bVar = (r0.b) this.f5373N;
        List<String> list = this.f5374O;
        if (list != null) {
            for (String str : list) {
                N2.g.e(str, "name");
                r0.d dVar = new r0.d(str);
                bVar.b();
                bVar.f4871a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f4871a.clear();
        }
        return B2.i.f210a;
    }
}
