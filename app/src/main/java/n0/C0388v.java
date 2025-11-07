package n0;

/* renamed from: n0.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388v extends F2.g implements M2.l {

    /* renamed from: N  reason: collision with root package name */
    public int f4325N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ C0363F f4326O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0388v(C0363F c0363f, D2.d dVar) {
        super(1, dVar);
        this.f4326O = c0363f;
    }

    @Override // M2.l
    public final Object h(Object obj) {
        return new C0388v(this.f4326O, (D2.d) obj).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f4325N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            this.f4325N = 1;
            obj = this.f4326O.h(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
