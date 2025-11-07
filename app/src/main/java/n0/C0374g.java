package n0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: n0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374g extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public Iterator f4270N;

    /* renamed from: O  reason: collision with root package name */
    public Object f4271O;

    /* renamed from: P  reason: collision with root package name */
    public int f4272P;

    /* renamed from: Q  reason: collision with root package name */
    public /* synthetic */ Object f4273Q;

    /* renamed from: R  reason: collision with root package name */
    public final /* synthetic */ List f4274R;

    /* renamed from: S  reason: collision with root package name */
    public final /* synthetic */ ArrayList f4275S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0374g(List list, ArrayList arrayList, D2.d dVar) {
        super(2, dVar);
        this.f4274R = list;
        this.f4275S = arrayList;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        C0374g c0374g = new C0374g(this.f4274R, this.f4275S, dVar);
        c0374g.f4273Q = obj;
        return c0374g;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((C0374g) f((D2.d) obj2, obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        Iterator it;
        List list;
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r02 = this.f4272P;
        if (r02 != 0) {
            if (r02 != 1) {
                if (r02 == 2) {
                    it = this.f4270N;
                    list = (List) this.f4273Q;
                    P1.a.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f4271O;
                Iterator it2 = this.f4270N;
                List list2 = (List) this.f4273Q;
                P1.a.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new F2.g(1, null));
                    this.f4273Q = list2;
                    this.f4270N = it2;
                    this.f4271O = null;
                    this.f4272P = 2;
                    throw null;
                }
            }
        } else {
            P1.a.b(obj);
            obj = this.f4273Q;
            it = this.f4274R.iterator();
            list = this.f4275S;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.f4273Q = list;
            this.f4270N = it;
            this.f4271O = obj;
            this.f4272P = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
