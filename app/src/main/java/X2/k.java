package X2;

import a3.u;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class k extends u {

    /* renamed from: N  reason: collision with root package name */
    public final c f1625N;

    /* renamed from: O  reason: collision with root package name */
    public final AtomicReferenceArray f1626O;

    public k(long j3, k kVar, c cVar, int r5) {
        super(j3, kVar, r5);
        this.f1625N = cVar;
        this.f1626O = new AtomicReferenceArray(e.f1604b * 2);
    }

    @Override // a3.u
    public final int f() {
        return e.f1604b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
        if (r1 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        N2.g.b(r4);
        r7 = r4.f1601K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
        r7 = a3.a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
        if (r7 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
        V2.AbstractC0066x.d(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    @Override // a3.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r7, D2.i r8) {
        /*
            r6 = this;
            int r0 = X2.e.f1604b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f1626O
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof V2.o0
            X2.c r4 = r6.f1625N
            r5 = 0
            if (r3 != 0) goto L71
            boolean r3 = r2 instanceof X2.t
            if (r3 == 0) goto L22
            goto L71
        L22:
            U1.b r3 = X2.e.f1611j
            if (r2 == r3) goto L5b
            U1.b r3 = X2.e.f1612k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            U1.b r3 = X2.e.g
            if (r2 == r3) goto L12
            U1.b r3 = X2.e.f1608f
            if (r2 != r3) goto L34
            goto L12
        L34:
            U1.b r7 = X2.e.f1610i
            if (r2 == r7) goto L5a
            U1.b r7 = X2.e.f1606d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            U1.b r7 = X2.e.f1613l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r5)
            if (r1 == 0) goto L70
            N2.g.b(r4)
            M2.l r7 = r4.f1601K
            if (r7 == 0) goto L70
            B2.b r7 = a3.a.a(r7, r0, r5)
            if (r7 == 0) goto L70
            V2.AbstractC0066x.d(r8, r7)
        L70:
            return
        L71:
            if (r1 == 0) goto L76
            U1.b r3 = X2.e.f1611j
            goto L78
        L76:
            U1.b r3 = X2.e.f1612k
        L78:
            boolean r2 = r6.j(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r5)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L98
            N2.g.b(r4)
            M2.l r7 = r4.f1601K
            if (r7 == 0) goto L98
            B2.b r7 = a3.a.a(r7, r0, r5)
            if (r7 == 0) goto L98
            V2.AbstractC0066x.d(r8, r7)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.k.g(int, D2.i):void");
    }

    public final boolean j(int r4, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f1626O;
        int r42 = (r4 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(r42, obj, obj2)) {
            if (atomicReferenceArray.get(r42) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int r22) {
        return this.f1626O.get((r22 * 2) + 1);
    }

    public final void l(int r5, boolean z3) {
        if (z3) {
            c cVar = this.f1625N;
            N2.g.b(cVar);
            cVar.C((this.f1884L * e.f1604b) + r5);
        }
        h();
    }

    public final void m(int r22, Object obj) {
        this.f1626O.lazySet(r22 * 2, obj);
    }

    public final void n(int r22, U1.b bVar) {
        this.f1626O.set((r22 * 2) + 1, bVar);
    }
}
