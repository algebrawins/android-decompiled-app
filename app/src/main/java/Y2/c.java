package Y2;

/* loaded from: classes.dex */
public final class c extends Z2.f {

    /* renamed from: M  reason: collision with root package name */
    public final K0.k f1684M;

    /* renamed from: N  reason: collision with root package name */
    public final K0.k f1685N;

    public c(K0.k kVar, D2.i iVar, int r3, X2.a aVar) {
        super(iVar, r3, aVar);
        this.f1684M = kVar;
        this.f1685N = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // Z2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(X2.q r6, D2.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Y2.b
            if (r0 == 0) goto L13
            r0 = r7
            Y2.b r0 = (Y2.b) r0
            int r1 = r0.f1683P
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1683P = r1
            goto L1a
        L13:
            Y2.b r0 = new Y2.b
            F2.b r7 = (F2.b) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.f1681N
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f1683P
            B2.i r3 = B2.i.f210a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            X2.q r6 = r0.f1680M
            P1.a.b(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            P1.a.b(r7)
            r0.f1680M = r6
            r0.f1683P = r4
            K0.k r7 = r5.f1684M
            java.lang.Object r7 = r7.g(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            X2.p r6 = (X2.p) r6
            X2.c r6 = r6.f1633M
            boolean r6 = r6.s()
            if (r6 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.c.a(X2.q, D2.d):java.lang.Object");
    }

    @Override // Z2.f
    public final Z2.f b(D2.i iVar, int r4, X2.a aVar) {
        return new c(this.f1685N, iVar, r4, aVar);
    }

    @Override // Z2.f
    public final String toString() {
        return "block[" + this.f1684M + "] -> " + super.toString();
    }
}
