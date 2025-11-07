package V2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a0 extends a3.b {

    /* renamed from: b  reason: collision with root package name */
    public final W f1421b;

    /* renamed from: c  reason: collision with root package name */
    public d0 f1422c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b0 f1423d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ N f1424e;

    public a0(W w3, b0 b0Var, N n3) {
        this.f1423d = b0Var;
        this.f1424e = n3;
        this.f1421b = w3;
    }

    @Override // a3.b
    public final void b(Object obj, Object obj2) {
        boolean z3;
        a3.k kVar;
        a3.k kVar2 = (a3.k) obj;
        if (obj2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        a3.k kVar3 = this.f1421b;
        if (z3) {
            kVar = kVar3;
        } else {
            kVar = this.f1422c;
        }
        if (kVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a3.k.f1866J;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar2, this, kVar)) {
                if (atomicReferenceFieldUpdater.get(kVar2) != this) {
                    return;
                }
            }
            if (z3) {
                a3.k kVar4 = this.f1422c;
                N2.g.b(kVar4);
                kVar3.j(kVar4);
            }
        }
    }

    @Override // a3.b
    public final U1.b c(Object obj) {
        a3.k kVar = (a3.k) obj;
        if (this.f1423d.E() == this.f1424e) {
            return null;
        }
        return a3.a.f1847e;
    }
}
