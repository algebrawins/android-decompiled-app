package V2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class V extends b0 {

    /* renamed from: L  reason: collision with root package name */
    public final boolean f1409L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(S s3) {
        super(true);
        C0053j c0053j;
        C0053j c0053j2;
        boolean z3 = true;
        H(s3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b0.f1427K;
        i iVar = (i) atomicReferenceFieldUpdater.get(this);
        if (iVar instanceof C0053j) {
            c0053j = (C0053j) iVar;
        } else {
            c0053j = null;
        }
        if (c0053j != null) {
            b0 n3 = c0053j.n();
            while (!n3.B()) {
                i iVar2 = (i) atomicReferenceFieldUpdater.get(n3);
                if (iVar2 instanceof C0053j) {
                    c0053j2 = (C0053j) iVar2;
                } else {
                    c0053j2 = null;
                }
                if (c0053j2 != null) {
                    n3 = c0053j2.n();
                }
            }
            this.f1409L = z3;
        }
        z3 = false;
        this.f1409L = z3;
    }

    @Override // V2.b0
    public final boolean B() {
        return this.f1409L;
    }

    @Override // V2.b0
    public final boolean C() {
        return true;
    }
}
