package o;

import d2.C0235c;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f4369J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f4370K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f4371L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ Object f4372M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ Object f4373N;

    public /* synthetic */ e(Object obj, Object obj2, Enum r3, String str, int r5) {
        this.f4369J = r5;
        this.f4370K = obj;
        this.f4371L = obj2;
        this.f4372M = r3;
        this.f4373N = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, d2.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f4370K
            x1.I6 r0 = (x1.I6) r0
            java.lang.Object r1 = r11.f4371L
            U1.h r1 = (U1.h) r1
            java.lang.Object r2 = r11.f4372M
            x1.O4 r2 = (x1.O4) r2
            java.lang.Object r3 = r11.f4373N
            java.lang.String r3 = (java.lang.String) r3
            r0.getClass()
            java.lang.Object r4 = r1.f1341K
            V0.a r4 = (V0.a) r4
            r4.f1357K = r2
            java.lang.Object r2 = r4.f1356J
            x1.g6 r2 = (x1.C0618g6) r2
            if (r2 == 0) goto L30
            java.lang.String r2 = r2.f5903d
            int r4 = x1.AbstractC0611g.f5891a
            if (r2 == 0) goto L30
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L2c
            goto L30
        L2c:
            k1.w.e(r2)
            goto L32
        L30:
            java.lang.String r2 = "NA"
        L32:
            d2.q r4 = new d2.q
            r4.<init>()
            java.lang.String r5 = r0.f5602a
            r4.f3048J = r5
            java.lang.String r5 = r0.f5603b
            r4.f3049K = r5
            java.lang.Class<x1.I6> r5 = x1.I6.class
            monitor-enter(r5)
            x1.G r6 = x1.I6.f5600k     // Catch: java.lang.Throwable -> Lb6
            if (r6 == 0) goto L48
            monitor-exit(r5)
            goto L7b
        L48:
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()     // Catch: java.lang.Throwable -> Lb6
            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> Lb6
            b0.d r6 = x1.AbstractC0576b4.a(r6)     // Catch: java.lang.Throwable -> Lb6
            x1.z r7 = new x1.z     // Catch: java.lang.Throwable -> Lb6
            r7.<init>()     // Catch: java.lang.Throwable -> Lb6
            r8 = 0
        L5a:
            b0.f r9 = r6.f2601a     // Catch: java.lang.Throwable -> Lb6
            int r9 = r9.size()     // Catch: java.lang.Throwable -> Lb6
            if (r8 >= r9) goto L74
            b0.f r9 = r6.f2601a     // Catch: java.lang.Throwable -> Lb6
            java.util.Locale r9 = r9.get(r8)     // Catch: java.lang.Throwable -> Lb6
            U1.g r10 = Q1.c.f1064a     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r9 = r9.toLanguageTag()     // Catch: java.lang.Throwable -> Lb6
            r7.a(r9)     // Catch: java.lang.Throwable -> Lb6
            int r8 = r8 + 1
            goto L5a
        L74:
            x1.G r6 = r7.c()     // Catch: java.lang.Throwable -> Lb6
            x1.I6.f5600k = r6     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r5)
        L7b:
            r4.f3052N = r6
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.f3055Q = r5
            r4.f3051M = r2
            r4.f3050L = r3
            C1.j r2 = r0.f5607f
            boolean r2 = r2.f()
            if (r2 == 0) goto L96
            C1.j r2 = r0.f5607f
            java.lang.Object r2 = r2.d()
            java.lang.String r2 = (java.lang.String) r2
            goto L9c
        L96:
            Q1.j r2 = r0.f5605d
            java.lang.String r2 = r2.a()
        L9c:
            r4.f3053O = r2
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.f3057S = r2
            int r2 = r0.f5608h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.f3058T = r2
            r1.f1342L = r4
            x1.F6 r0 = r0.f5604c
            r0.a(r1)
            return
        Lb6:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r5.isEmpty() == false) goto L9;
     */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, d2.q] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.run():void");
    }

    public e(C0235c c0235c, f fVar, k kVar, j jVar) {
        this.f4369J = 0;
        this.f4373N = c0235c;
        this.f4370K = fVar;
        this.f4371L = kVar;
        this.f4372M = jVar;
    }
}
