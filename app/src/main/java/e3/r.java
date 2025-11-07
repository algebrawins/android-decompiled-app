package e3;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final q f3139a = new q(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f3140b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference[] f3141c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3140b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int r12 = 0; r12 < highestOneBit; r12++) {
            atomicReferenceArr[r12] = new AtomicReference();
        }
        f3141c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        int r3;
        N2.g.e(qVar, "segment");
        if (qVar.f3138f == null && qVar.g == null) {
            if (qVar.f3136d) {
                return;
            }
            AtomicReference atomicReference = f3141c[(int) (Thread.currentThread().getId() & (f3140b - 1))];
            q qVar2 = f3139a;
            q qVar3 = (q) atomicReference.getAndSet(qVar2);
            if (qVar3 == qVar2) {
                return;
            }
            if (qVar3 != null) {
                r3 = qVar3.f3135c;
            } else {
                r3 = 0;
            }
            if (r3 >= 65536) {
                atomicReference.set(qVar3);
                return;
            }
            qVar.f3138f = qVar3;
            qVar.f3134b = 0;
            qVar.f3135c = r3 + 8192;
            atomicReference.set(qVar);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final q b() {
        AtomicReference atomicReference = f3141c[(int) (Thread.currentThread().getId() & (f3140b - 1))];
        q qVar = f3139a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f3138f);
        qVar2.f3138f = null;
        qVar2.f3135c = 0;
        return qVar2;
    }
}
