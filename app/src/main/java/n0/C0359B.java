package n0;

/* renamed from: n0.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359B extends F2.g implements M2.l {

    /* renamed from: N  reason: collision with root package name */
    public Throwable f4164N;

    /* renamed from: O  reason: collision with root package name */
    public int f4165O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ N f4166P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0359B(N n3, D2.d dVar) {
        super(1, dVar);
        this.f4166P = n3;
    }

    @Override // M2.l
    public final Object h(Object obj) {
        return new C0359B(this.f4166P, (D2.d) obj).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        Throwable th;
        Y y3;
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f4165O;
        N n3 = this.f4166P;
        try {
        } catch (Throwable th2) {
            X h3 = n3.h();
            this.f4164N = th2;
            this.f4165O = 2;
            Integer a4 = h3.a();
            if (a4 == aVar) {
                return aVar;
            }
            th = th2;
            obj = a4;
        }
        if (r12 != 0) {
            if (r12 != 1) {
                if (r12 == 2) {
                    th = this.f4164N;
                    P1.a.b(obj);
                    y3 = new Q(((Number) obj).intValue(), th);
                    return new B2.c(y3, Boolean.TRUE);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P1.a.b(obj);
        } else {
            P1.a.b(obj);
            this.f4165O = 1;
            obj = N.g(n3, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        y3 = (Y) obj;
        return new B2.c(y3, Boolean.TRUE);
    }
}
