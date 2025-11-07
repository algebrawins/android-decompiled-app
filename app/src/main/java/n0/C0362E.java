package n0;

/* renamed from: n0.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362E extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public Object f4181N;

    /* renamed from: O  reason: collision with root package name */
    public int f4182O;

    /* renamed from: P  reason: collision with root package name */
    public /* synthetic */ boolean f4183P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ N f4184Q;

    /* renamed from: R  reason: collision with root package name */
    public final /* synthetic */ int f4185R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0362E(N n3, int r22, D2.d dVar) {
        super(2, dVar);
        this.f4184Q = n3;
        this.f4185R = r22;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        C0362E c0362e = new C0362E(this.f4184Q, this.f4185R, dVar);
        c0362e.f4183P = ((Boolean) obj).booleanValue();
        return c0362e;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0362E) f((D2.d) obj2, bool)).k(B2.i.f210a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // F2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r7) {
        /*
            r6 = this;
            E2.a r0 = E2.a.COROUTINE_SUSPENDED
            int r1 = r6.f4182O
            n0.N r2 = r6.f4184Q
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r6.f4181N
            P1.a.b(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            boolean r1 = r6.f4183P
            P1.a.b(r7)
            goto L32
        L22:
            P1.a.b(r7)
            boolean r1 = r6.f4183P
            r6.f4183P = r1
            r6.f4182O = r4
            java.lang.Object r7 = r2.j(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            if (r1 == 0) goto L4c
            n0.X r1 = r2.h()
            r6.f4181N = r7
            r6.f4182O = r3
            java.lang.Integer r1 = r1.a()
            if (r1 != r0) goto L43
            return r0
        L43:
            r0 = r7
            r7 = r1
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L51
        L4c:
            int r0 = r6.f4185R
            r5 = r0
            r0 = r7
            r7 = r5
        L51:
            n0.c r1 = new n0.c
            if (r0 == 0) goto L5a
            int r2 = r0.hashCode()
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r1.<init>(r0, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0362E.k(java.lang.Object):java.lang.Object");
    }
}
