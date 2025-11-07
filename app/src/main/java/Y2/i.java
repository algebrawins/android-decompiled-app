package Y2;

import d2.C0235c;
import n0.C0384q;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ C0235c f1700J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ C0384q f1701K;

    public i(C0235c c0235c, C0384q c0384q) {
        this.f1700J = c0235c;
        this.f1701K = c0384q;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // Y2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(Y2.e r9, D2.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Y2.h
            if (r0 == 0) goto L13
            r0 = r10
            Y2.h r0 = (Y2.h) r0
            int r1 = r0.f1696N
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1696N = r1
            goto L18
        L13:
            Y2.h r0 = new Y2.h
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f1695M
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f1696N
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f1698P
            Z2.n r9 = (Z2.n) r9
            P1.a.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L7d
        L32:
            r10 = move-exception
            goto L89
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f1698P
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            P1.a.b(r10)
            goto La3
        L44:
            Y2.e r9 = r0.f1699Q
            java.lang.Object r2 = r0.f1698P
            Y2.i r2 = (Y2.i) r2
            P1.a.b(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8f
        L50:
            P1.a.b(r10)
            d2.c r10 = r8.f1700J     // Catch: java.lang.Throwable -> L8d
            r0.f1698P = r8     // Catch: java.lang.Throwable -> L8d
            r0.f1699Q = r9     // Catch: java.lang.Throwable -> L8d
            r0.f1696N = r5     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r10 = r10.h(r9, r0)     // Catch: java.lang.Throwable -> L8d
            if (r10 != r1) goto L62
            return r1
        L62:
            r2 = r8
        L63:
            Z2.n r10 = new Z2.n
            D2.i r4 = r0.f655K
            N2.g.b(r4)
            r10.<init>(r9, r4)
            n0.q r9 = r2.f1701K     // Catch: java.lang.Throwable -> L87
            r0.f1698P = r10     // Catch: java.lang.Throwable -> L87
            r0.f1699Q = r6     // Catch: java.lang.Throwable -> L87
            r0.f1696N = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = r9.p(r10, r6, r0)     // Catch: java.lang.Throwable -> L87
            if (r9 != r1) goto L7c
            return r1
        L7c:
            r9 = r10
        L7d:
            r9.n()
            B2.i r9 = B2.i.f210a
            return r9
        L83:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L89
        L87:
            r9 = move-exception
            goto L83
        L89:
            r9.n()
            throw r10
        L8d:
            r9 = move-exception
            r2 = r8
        L8f:
            Y2.t r10 = new Y2.t
            r10.<init>(r9)
            n0.q r2 = r2.f1701K
            r0.f1698P = r9
            r0.f1699Q = r6
            r0.f1696N = r4
            java.lang.Object r10 = Y2.r.a(r10, r2, r9, r0)
            if (r10 != r1) goto La3
            return r1
        La3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.i.h(Y2.e, D2.d):java.lang.Object");
    }
}
