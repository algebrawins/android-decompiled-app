package n0;

/* renamed from: n0.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360C extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public Throwable f4167N;

    /* renamed from: O  reason: collision with root package name */
    public int f4168O;

    /* renamed from: P  reason: collision with root package name */
    public /* synthetic */ boolean f4169P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ N f4170Q;

    /* renamed from: R  reason: collision with root package name */
    public final /* synthetic */ int f4171R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0360C(N n3, int r22, D2.d dVar) {
        super(2, dVar);
        this.f4170Q = n3;
        this.f4171R = r22;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        C0360C c0360c = new C0360C(this.f4170Q, this.f4171R, dVar);
        c0360c.f4169P = ((Boolean) obj).booleanValue();
        return c0360c;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0360C) f((D2.d) obj2, bool)).k(B2.i.f210a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // F2.b
    public final Object k(Object obj) {
        Throwable th;
        int r7;
        boolean z3;
        Y y3;
        boolean z4;
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        boolean z5 = this.f4168O;
        N n3 = this.f4170Q;
        try {
        } catch (Throwable th2) {
            if (z5 != 0) {
                X h3 = n3.h();
                this.f4167N = th2;
                this.f4169P = z5;
                this.f4168O = 2;
                Integer a4 = h3.a();
                if (a4 == aVar) {
                    return aVar;
                }
                z3 = z5;
                th = th2;
                obj = a4;
            } else {
                boolean z6 = z5;
                th = th2;
                r7 = this.f4171R;
                z3 = z6;
            }
        }
        if (z5 != 0) {
            if (z5 != 1) {
                if (z5 == 2) {
                    z3 = this.f4169P;
                    th = this.f4167N;
                    P1.a.b(obj);
                    r7 = ((Number) obj).intValue();
                    Q q3 = new Q(r7, th);
                    z4 = z3;
                    y3 = q3;
                    return new B2.c(y3, Boolean.valueOf(z4));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z7 = this.f4169P;
            P1.a.b(obj);
            z5 = z7;
        } else {
            P1.a.b(obj);
            boolean z8 = this.f4169P;
            this.f4169P = z8;
            this.f4168O = 1;
            obj = N.g(n3, z8, this);
            z5 = z8;
            if (obj == aVar) {
                return aVar;
            }
        }
        y3 = (Y) obj;
        z4 = z5;
        return new B2.c(y3, Boolean.valueOf(z4));
    }
}
