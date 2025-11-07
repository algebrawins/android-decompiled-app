package d3;

import M2.l;
import X2.o;
import a3.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3072b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3073c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3074d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3075e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3076f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final o f3077a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int r7) {
        if (r7 >= 0 && r7 <= 1) {
            j jVar = new j(0L, null, 2);
            this.head = jVar;
            this.tail = jVar;
            this._availablePermits = 1 - r7;
            this.f3077a = new o(1, this);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object b3;
        f fVar;
        long j3;
        while (true) {
            int andDecrement = f3076f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = B2.i.f210a;
                l lVar = this.f3077a;
                if (andDecrement > 0) {
                    cVar.l(obj, lVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3074d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f3075e.getAndIncrement(this);
                f fVar2 = f.f3070R;
                long j4 = andIncrement / i.f3083f;
                while (true) {
                    b3 = a3.a.b(jVar, j4, fVar2);
                    if (!a3.a.e(b3)) {
                        u c4 = a3.a.c(b3);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j3 = j4;
                            if (uVar.f1884L >= c4.f1884L) {
                                break;
                            } else if (!c4.i()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c4)) {
                                    if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                        if (c4.e()) {
                                            c4.d();
                                        }
                                        fVar2 = fVar;
                                        j4 = j3;
                                    }
                                }
                                if (uVar.e()) {
                                    uVar.d();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j4 = j3;
                }
                j jVar2 = (j) a3.a.c(b3);
                int r5 = (int) (andIncrement % i.f3083f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f3084N;
                while (!atomicReferenceArray.compareAndSet(r5, null, cVar)) {
                    if (atomicReferenceArray.get(r5) != null) {
                        U1.b bVar = i.f3079b;
                        U1.b bVar2 = i.f3080c;
                        while (!atomicReferenceArray.compareAndSet(r5, bVar, bVar2)) {
                            if (atomicReferenceArray.get(r5) != bVar) {
                                break;
                            }
                        }
                        cVar.l(obj, lVar);
                        return;
                    }
                }
                cVar.a(jVar2, r5);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c5, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.h.b():void");
    }
}
