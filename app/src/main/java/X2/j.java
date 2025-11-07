package X2;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final i f1624a = new Object();

    public static c a(int r22, a aVar, int r4) {
        c mVar;
        if ((r4 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if (r22 != -2) {
            if (r22 != -1) {
                if (r22 != 0) {
                    if (r22 != Integer.MAX_VALUE) {
                        if (aVar == a.SUSPEND) {
                            return new c(r22, null);
                        }
                        return new m(r22, aVar, null);
                    }
                    return new c(Integer.MAX_VALUE, null);
                } else if (aVar == a.SUSPEND) {
                    mVar = new c(0, null);
                } else {
                    mVar = new m(1, aVar, null);
                }
            } else if (aVar == a.SUSPEND) {
                return new m(1, a.DROP_OLDEST, null);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
        } else if (aVar == a.SUSPEND) {
            g.g.getClass();
            mVar = new c(f.f1622b, null);
        } else {
            mVar = new m(1, aVar, null);
        }
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Type inference failed for: r0v2, types: [F2.b, X2.n, D2.d] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r5v5, types: [M2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(X2.q r4, K0.j r5, F2.b r6) {
        /*
            boolean r0 = r6 instanceof X2.n
            if (r0 == 0) goto L13
            r0 = r6
            X2.n r0 = (X2.n) r0
            int r1 = r0.f1630O
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1630O = r1
            goto L18
        L13:
            X2.n r0 = new X2.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1629N
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f1630O
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            M2.a r5 = r0.f1628M
            P1.a.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L65
        L29:
            r4 = move-exception
            goto L6b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            P1.a.b(r6)
            D2.i r6 = r0.f655K
            N2.g.b(r6)
            V2.t r2 = V2.C0062t.f1462K
            D2.g r6 = r6.f(r2)
            if (r6 != r4) goto L6f
            r0.f1628M = r5     // Catch: java.lang.Throwable -> L29
            r0.f1630O = r3     // Catch: java.lang.Throwable -> L29
            V2.f r6 = new V2.f     // Catch: java.lang.Throwable -> L29
            D2.d r0 = x1.AbstractC0564a0.a(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.v()     // Catch: java.lang.Throwable -> L29
            X2.o r0 = new X2.o     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L29
            X2.p r4 = (X2.p) r4     // Catch: java.lang.Throwable -> L29
            r4.X(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.u()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L65
            return r1
        L65:
            r5.a()
            B2.i r4 = B2.i.f210a
            return r4
        L6b:
            r5.a()
            throw r4
        L6f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.j.b(X2.q, K0.j, F2.b):java.lang.Object");
    }
}
