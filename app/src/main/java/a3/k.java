package a3;

import V2.AbstractC0066x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k {

    /* renamed from: J  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1866J = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: K  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1867K = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* renamed from: L  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1868L = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        r6 = ((a3.r) r6).f1881a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
        if (r5.get(r4) == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a3.k i() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = a3.k.f1867K
            java.lang.Object r1 = r0.get(r9)
            a3.k r1 = (a3.k) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = a3.k.f1866J
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.m()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof a3.q
            if (r7 == 0) goto L38
            a3.q r6 = (a3.q) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof a3.r
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            a3.r r6 = (a3.r) r6
            a3.k r6 = r6.f1881a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            a3.k r3 = (a3.k) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            N2.g.c(r6, r4)
            r4 = r6
            a3.k r4 = (a3.k) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.k.i():a3.k");
    }

    public final void j(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1867K;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (k() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (m()) {
                kVar.i();
                return;
            }
            return;
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f1866J.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public final k l() {
        r rVar;
        k kVar;
        Object k3 = k();
        if (k3 instanceof r) {
            rVar = (r) k3;
        } else {
            rVar = null;
        }
        if (rVar == null || (kVar = rVar.f1881a) == null) {
            N2.g.c(k3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (k) k3;
        }
        return kVar;
    }

    public boolean m() {
        return k() instanceof r;
    }

    public String toString() {
        return new N2.k(this, AbstractC0066x.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0066x.b(this);
    }
}
