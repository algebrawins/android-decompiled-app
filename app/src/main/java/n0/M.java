package n0;

/* loaded from: classes.dex */
public final class M extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public N2.m f4209N;

    /* renamed from: O  reason: collision with root package name */
    public int f4210O;

    /* renamed from: P  reason: collision with root package name */
    public /* synthetic */ Object f4211P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ N2.m f4212Q;

    /* renamed from: R  reason: collision with root package name */
    public final /* synthetic */ N f4213R;

    /* renamed from: S  reason: collision with root package name */
    public final /* synthetic */ Object f4214S;

    /* renamed from: T  reason: collision with root package name */
    public final /* synthetic */ boolean f4215T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N2.m mVar, N n3, Object obj, boolean z3, D2.d dVar) {
        super(2, dVar);
        this.f4212Q = mVar;
        this.f4213R = n3;
        this.f4214S = obj;
        this.f4215T = z3;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        M m3 = new M(this.f4212Q, this.f4213R, this.f4214S, this.f4215T, dVar);
        m3.f4211P = obj;
        return m3;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((M) f((D2.d) obj2, (p0.j) obj)).k(B2.i.f210a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // F2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r9) {
        /*
            r8 = this;
            E2.a r0 = E2.a.COROUTINE_SUSPENDED
            int r1 = r8.f4210O
            N2.m r2 = r8.f4212Q
            java.lang.Object r3 = r8.f4214S
            n0.N r4 = r8.f4213R
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            P1.a.b(r9)
            goto L65
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            N2.m r1 = r8.f4209N
            java.lang.Object r6 = r8.f4211P
            p0.j r6 = (p0.j) r6
            P1.a.b(r9)
            goto L4f
        L28:
            P1.a.b(r9)
            java.lang.Object r9 = r8.f4211P
            p0.j r9 = (p0.j) r9
            n0.X r1 = r4.h()
            r8.f4211P = r9
            r8.f4209N = r2
            r8.f4210O = r6
            k0.i r1 = r1.f4253b
            java.lang.Object r1 = r1.f3983K
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            r1 = r2
            r7 = r6
            r6 = r9
            r9 = r7
        L4f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.f1005J = r9
            r9 = 0
            r8.f4211P = r9
            r8.f4209N = r9
            r8.f4210O = r5
            java.lang.Object r9 = r6.b(r3, r8)
            if (r9 != r0) goto L65
            return r0
        L65:
            boolean r9 = r8.f4215T
            if (r9 == 0) goto L7d
            k0.i r9 = r4.f4223Q
            n0.c r0 = new n0.c
            if (r3 == 0) goto L74
            int r1 = r3.hashCode()
            goto L75
        L74:
            r1 = 0
        L75:
            int r2 = r2.f1005J
            r0.<init>(r3, r1, r2)
            r9.m(r0)
        L7d:
            B2.i r9 = B2.i.f210a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.M.k(java.lang.Object):java.lang.Object");
    }
}
