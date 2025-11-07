package n0;

import V2.AbstractC0066x;
import V2.C0062t;
import V2.InterfaceC0063u;
import V2.h0;
import java.util.List;
import k0.C0322i;

/* loaded from: classes.dex */
public final class N implements InterfaceC0375h {

    /* renamed from: J  reason: collision with root package name */
    public final p0.e f4216J;

    /* renamed from: K  reason: collision with root package name */
    public final O1.a f4217K;

    /* renamed from: L  reason: collision with root package name */
    public final InterfaceC0063u f4218L;

    /* renamed from: O  reason: collision with root package name */
    public int f4221O;

    /* renamed from: P  reason: collision with root package name */
    public h0 f4222P;

    /* renamed from: R  reason: collision with root package name */
    public final a1.i f4224R;

    /* renamed from: S  reason: collision with root package name */
    public final B2.f f4225S;

    /* renamed from: T  reason: collision with root package name */
    public final B2.f f4226T;

    /* renamed from: U  reason: collision with root package name */
    public final a1.i f4227U;

    /* renamed from: M  reason: collision with root package name */
    public final A.a f4219M = new A.a(new C0386t(this, null));

    /* renamed from: N  reason: collision with root package name */
    public final d3.d f4220N = d3.e.a();

    /* renamed from: Q  reason: collision with root package name */
    public final C0322i f4223Q = new C0322i(2);

    /* JADX WARN: Type inference failed for: r3v4, types: [a1.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [a1.i, java.lang.Object] */
    public N(p0.e eVar, List list, O1.a aVar, InterfaceC0063u interfaceC0063u) {
        this.f4216J = eVar;
        this.f4217K = aVar;
        this.f4218L = interfaceC0063u;
        ?? obj = new Object();
        obj.f1835M = this;
        obj.f1832J = d3.e.a();
        V2.b0 b0Var = new V2.b0(true);
        b0Var.H(null);
        obj.f1833K = b0Var;
        obj.f1834L = C2.i.l(list);
        this.f4224R = obj;
        this.f4225S = new B2.f(new C0380m(this, 1));
        this.f4226T = new B2.f(new C0380m(this, 0));
        X2.o oVar = new X2.o(2, this);
        C0367K c0367k = new C0367K(this, null);
        ?? obj2 = new Object();
        obj2.f1832J = interfaceC0063u;
        obj2.f1833K = c0367k;
        obj2.f1834L = X2.j.a(Integer.MAX_VALUE, null, 6);
        obj2.f1835M = new C0322i(1);
        V2.S s3 = (V2.S) interfaceC0063u.h().f(C0062t.f1462K);
        if (s3 != null) {
            ((V2.b0) s3).I(false, true, new d3.b(2, oVar, obj2));
        }
        this.f4227U = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:18:0x004b, B:20:0x0053, B:22:0x0057, B:23:0x005a), top: B:31:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(n0.N r4, F2.b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof n0.C0387u
            if (r0 == 0) goto L16
            r0 = r5
            n0.u r0 = (n0.C0387u) r0
            int r1 = r0.f4324Q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f4324Q = r1
            goto L1b
        L16:
            n0.u r0 = new n0.u
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f4322O
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4324Q
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            d3.d r4 = r0.f4321N
            n0.N r0 = r0.f4320M
            P1.a.b(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            P1.a.b(r5)
            r0.f4320M = r4
            d3.d r5 = r4.f4220N
            r0.f4321N = r5
            r0.f4324Q = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L64
        L4a:
            r0 = 0
            int r1 = r4.f4221O     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + (-1)
            r4.f4221O = r1     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            V2.h0 r1 = r4.f4222P     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5a
            r1.a(r0)     // Catch: java.lang.Throwable -> L5d
        L5a:
            r4.f4222P = r0     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r4 = move-exception
            goto L65
        L5f:
            r5.e(r0)
            B2.i r1 = B2.i.f210a
        L64:
            return r1
        L65:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.N.a(n0.N, F2.b):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(12:5|6|(7:57|(1:(1:(1:61)(2:63|64))(3:65|66|67))(1:68)|62|17|(1:19)(1:23)|20|21)(4:8|9|10|(9:12|13|14|(1:24)|16|17|(0)(0)|20|21)(3:30|(1:32)(1:55)|(2:34|(2:36|(2:38|39))(2:47|48))(2:49|(2:51|52)(2:53|54))))|40|41|42|(1:44)|16|17|(0)(0)|20|21))|70|6|(0)(0)|40|41|42|(0)|16|17|(0)(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [M2.p, F2.g] */
    /* JADX WARN: Type inference failed for: r2v9, types: [M2.p, F2.g] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(n0.N r9, n0.P r10, F2.b r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.N.b(n0.N, n0.P, F2.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:18:0x004b, B:20:0x0052), top: B:28:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(n0.N r4, F2.b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof n0.C0390x
            if (r0 == 0) goto L16
            r0 = r5
            n0.x r0 = (n0.C0390x) r0
            int r1 = r0.f4337Q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f4337Q = r1
            goto L1b
        L16:
            n0.x r0 = new n0.x
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f4335O
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4337Q
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            d3.d r4 = r0.f4334N
            n0.N r0 = r0.f4333M
            P1.a.b(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            P1.a.b(r5)
            r0.f4333M = r4
            d3.d r5 = r4.f4220N
            r0.f4334N = r5
            r0.f4337Q = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L67
        L4a:
            r0 = 0
            int r1 = r4.f4221O     // Catch: java.lang.Throwable -> L60
            int r1 = r1 + r3
            r4.f4221O = r1     // Catch: java.lang.Throwable -> L60
            if (r1 != r3) goto L62
            V2.u r1 = r4.f4218L     // Catch: java.lang.Throwable -> L60
            n0.y r2 = new n0.y     // Catch: java.lang.Throwable -> L60
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L60
            V2.h0 r1 = V2.AbstractC0066x.g(r1, r2)     // Catch: java.lang.Throwable -> L60
            r4.f4222P = r1     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r4 = move-exception
            goto L68
        L62:
            r5.e(r0)
            B2.i r1 = B2.i.f210a
        L67:
            return r1
        L68:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.N.c(n0.N, F2.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(n0.N r8, boolean r9, D2.d r10) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.N.e(n0.N, boolean, D2.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea A[Catch: b -> 0x00ab, TryCatch #0 {b -> 0x00ab, blocks: (B:35:0x00a6, B:69:0x0144, B:40:0x00b4, B:66:0x0127, B:48:0x00d1, B:56:0x00ea, B:57:0x00ee, B:52:0x00da, B:63:0x0115), top: B:74:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [N2.o, java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [N2.m, java.lang.Object, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(n0.N r8, boolean r9, F2.b r10) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.N.g(n0.N, boolean, F2.b):java.lang.Object");
    }

    @Override // n0.InterfaceC0375h
    public final Object d(M2.p pVar, F2.g gVar) {
        D2.i iVar = gVar.f655K;
        N2.g.b(iVar);
        b0 b0Var = (b0) iVar.f(a0.f4257J);
        if (b0Var != null) {
            b0Var.c(this);
        }
        return AbstractC0066x.n(new b0(b0Var, this), new I(this, pVar, null), gVar);
    }

    @Override // n0.InterfaceC0375h
    public final Y2.d f() {
        return this.f4219M;
    }

    public final X h() {
        return (X) this.f4226T.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(F2.b r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof n0.C0392z
            if (r0 == 0) goto L13
            r0 = r6
            n0.z r0 = (n0.C0392z) r0
            int r1 = r0.f4344Q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4344Q = r1
            goto L18
        L13:
            n0.z r0 = new n0.z
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f4342O
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4344Q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f4341N
            n0.N r0 = r0.f4340M
            P1.a.b(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            n0.N r2 = r0.f4340M
            P1.a.b(r6)
            goto L51
        L3e:
            P1.a.b(r6)
            n0.X r6 = r5.h()
            r0.f4340M = r5
            r0.f4344Q = r4
            java.lang.Integer r6 = r6.a()
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            a1.i r4 = r2.f4224R     // Catch: java.lang.Throwable -> L6d
            r0.f4340M = r2     // Catch: java.lang.Throwable -> L6d
            r0.f4341N = r6     // Catch: java.lang.Throwable -> L6d
            r0.f4344Q = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.j(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L66
            return r1
        L66:
            B2.i r6 = B2.i.f210a
            return r6
        L69:
            r1 = r6
            r6 = r0
            r0 = r2
            goto L6f
        L6d:
            r0 = move-exception
            goto L69
        L6f:
            k0.i r0 = r0.f4223Q
            n0.Q r2 = new n0.Q
            r2.<init>(r1, r6)
            r0.m(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.N.i(F2.b):java.lang.Object");
    }

    public final Object j(F2.b bVar) {
        return ((p0.h) this.f4225S.a()).a(new C0384q(3, (D2.d) null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Type inference failed for: r14v2, types: [N2.m, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r12, boolean r13, F2.b r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof n0.L
            if (r0 == 0) goto L13
            r0 = r14
            n0.L r0 = (n0.L) r0
            int r1 = r0.f4208P
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4208P = r1
            goto L18
        L13:
            n0.L r0 = new n0.L
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f4206N
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4208P
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            N2.m r12 = r0.f4205M
            P1.a.b(r14)
            goto L58
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            P1.a.b(r14)
            N2.m r14 = new N2.m
            r14.<init>()
            B2.f r2 = r11.f4225S
            java.lang.Object r2 = r2.a()
            p0.h r2 = (p0.h) r2
            n0.M r10 = new n0.M
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f4205M = r14
            r0.f4208P = r3
            java.lang.Object r12 = r2.b(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.f1005J
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.N.k(java.lang.Object, boolean, F2.b):java.lang.Object");
    }
}
