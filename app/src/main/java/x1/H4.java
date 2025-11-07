package x1;

/* loaded from: classes.dex */
public abstract class H4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.util.List r6, n0.C0378k r7, F2.b r8) {
        /*
            boolean r0 = r8 instanceof n0.C0372e
            if (r0 == 0) goto L13
            r0 = r8
            n0.e r0 = (n0.C0372e) r0
            int r1 = r0.f4268P
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4268P = r1
            goto L18
        L13:
            n0.e r0 = new n0.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4267O
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4268P
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f4266N
            java.io.Serializable r7 = r0.f4265M
            N2.o r7 = (N2.o) r7
            P1.a.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L67
        L30:
            r8 = move-exception
            goto L80
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f4265M
            java.util.List r6 = (java.util.List) r6
            P1.a.b(r8)
            goto L5c
        L42:
            P1.a.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            n0.g r2 = new n0.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f4265M = r8
            r0.f4268P = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L95
        L5b:
            r6 = r8
        L5c:
            N2.o r7 = new N2.o
            r7.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r6.next()
            M2.l r8 = (M2.l) r8
            r0.f4265M = r7     // Catch: java.lang.Throwable -> L30
            r0.f4266N = r6     // Catch: java.lang.Throwable -> L30
            r0.f4268P = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.h(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L67
            goto L95
        L80:
            java.lang.Object r2 = r7.f1007J
            if (r2 != 0) goto L87
            r7.f1007J = r8
            goto L67
        L87:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            G.i.a(r2, r8)
            goto L67
        L8d:
            java.lang.Object r6 = r7.f1007J
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L96
            B2.i r1 = B2.i.f210a
        L95:
            return r1
        L96:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.H4.a(java.util.List, n0.k, F2.b):java.lang.Object");
    }
}
