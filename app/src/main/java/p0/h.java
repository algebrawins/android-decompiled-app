package p0;

import d2.C0235c;
import e3.l;
import java.util.concurrent.atomic.AtomicBoolean;
import n0.InterfaceC0368a;
import n0.X;

/* loaded from: classes.dex */
public final class h implements InterfaceC0368a {

    /* renamed from: a  reason: collision with root package name */
    public final e3.i f4775a;

    /* renamed from: b  reason: collision with root package name */
    public final l f4776b;

    /* renamed from: c  reason: collision with root package name */
    public final X f4777c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4778d;

    /* renamed from: e  reason: collision with root package name */
    public final C0235c f4779e;

    /* renamed from: f  reason: collision with root package name */
    public final d3.d f4780f;

    public h(e3.i iVar, l lVar, X x3, d dVar) {
        N2.g.e(iVar, "fileSystem");
        N2.g.e(lVar, "path");
        N2.g.e(x3, "coordinator");
        this.f4775a = iVar;
        this.f4776b = lVar;
        this.f4777c = x3;
        this.f4778d = dVar;
        this.f4779e = new C0235c();
        this.f4780f = d3.e.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:28|29))(2:30|(6:32|33|34|35|36|(1:38)(1:39))(2:49|50))|13|14|15|(2:(1:18)|19)(1:21)))|52|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: all -> 0x007f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x007f, blocks: (B:33:0x007e, B:43:0x0091, B:39:0x0089), top: B:60:0x0020 }] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [F2.b, p0.f] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p0.h] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [n0.q] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(n0.C0384q r9, F2.b r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p0.f
            if (r0 == 0) goto L13
            r0 = r10
            p0.f r0 = (p0.f) r0
            int r1 = r0.f4767R
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4767R = r1
            goto L18
        L13:
            p0.f r0 = new p0.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f4765P
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4767R
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            boolean r9 = r0.f4764O
            p0.b r1 = r0.f4763N
            p0.h r0 = r0.f4762M
            P1.a.b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L6e
        L2e:
            r10 = move-exception
            goto L89
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            P1.a.b(r10)
            d2.c r10 = r8.f4779e
            java.lang.Object r10 = r10.f3003K
            java.util.concurrent.atomic.AtomicBoolean r10 = (java.util.concurrent.atomic.AtomicBoolean) r10
            boolean r10 = r10.get()
            if (r10 != 0) goto La1
            d3.d r10 = r8.f4780f
            boolean r10 = r10.d(r3)
            p0.b r2 = new p0.b     // Catch: java.lang.Throwable -> L97
            e3.i r5 = r8.f4775a     // Catch: java.lang.Throwable -> L97
            e3.l r6 = r8.f4776b     // Catch: java.lang.Throwable -> L97
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L97
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L87
            r0.f4762M = r8     // Catch: java.lang.Throwable -> L87
            r0.f4763N = r2     // Catch: java.lang.Throwable -> L87
            r0.f4764O = r10     // Catch: java.lang.Throwable -> L87
            r0.f4767R = r4     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = r9.p(r2, r5, r0)     // Catch: java.lang.Throwable -> L87
            if (r9 != r1) goto L69
            return r1
        L69:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L6e:
            r1.close()     // Catch: java.lang.Throwable -> L73
            r1 = r3
            goto L74
        L73:
            r1 = move-exception
        L74:
            if (r1 != 0) goto L7e
            if (r9 == 0) goto L7d
            d3.d r9 = r0.f4780f
            r9.e(r3)
        L7d:
            return r10
        L7e:
            throw r1     // Catch: java.lang.Throwable -> L7f
        L7f:
            r10 = move-exception
            goto L99
        L81:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
            goto L89
        L87:
            r9 = move-exception
            goto L81
        L89:
            r1.close()     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r1 = move-exception
            G.i.a(r10, r1)     // Catch: java.lang.Throwable -> L7f
        L91:
            throw r10     // Catch: java.lang.Throwable -> L7f
        L92:
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
            goto L99
        L97:
            r9 = move-exception
            goto L92
        L99:
            if (r9 == 0) goto La0
            d3.d r9 = r0.f4780f
            r9.e(r3)
        La0:
            throw r10
        La1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "StorageConnection has already been disposed."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.h.a(n0.q, F2.b):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(3:(4:(2:3|(12:5|6|7|(1:(1:(7:11|12|13|15|16|17|(4:19|(1:21)|22|23)(1:25))(2:35|36))(1:37))(2:60|(2:62|(7:64|(1:68)|70|(3:73|(1:84)(2:81|82)|71)|87|88|(1:90)(1:91))(2:93|94))(2:95|96))|38|39|40|41|42|43|44|(1:46)(5:47|15|16|17|(0)(0))))|43|44|(0)(0))|41|42)|7|(0)(0)|38|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012c, code lost:
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012f, code lost:
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0130, code lost:
        r6 = r0;
        r2 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c A[Catch: all -> 0x012c, IOException -> 0x012f, TRY_ENTER, TryCatch #9 {IOException -> 0x012f, all -> 0x012c, blocks: (B:57:0x011c, B:59:0x0124, B:67:0x013c, B:73:0x0148, B:74:0x014b), top: B:97:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c A[Catch: all -> 0x012c, IOException -> 0x012f, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x012f, all -> 0x012c, blocks: (B:57:0x011c, B:59:0x0124, B:67:0x013c, B:73:0x0148, B:74:0x014b), top: B:97:0x0021 }] */
    /* JADX WARN: Type inference failed for: r0v3, types: [e3.i, e3.f] */
    /* JADX WARN: Type inference failed for: r0v5, types: [e3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v26, types: [d3.a] */
    /* JADX WARN: Type inference failed for: r10v9, types: [M2.p] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [e3.l] */
    /* JADX WARN: Type inference failed for: r3v6, types: [M2.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(n0.M r10, F2.b r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.h.b(n0.M, F2.b):java.lang.Object");
    }

    @Override // n0.InterfaceC0368a
    public final void close() {
        ((AtomicBoolean) this.f4779e.f3003K).set(true);
        this.f4778d.a();
    }
}
