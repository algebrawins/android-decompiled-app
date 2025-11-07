package a3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends q {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1849a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f1843a;

    @Override // a3.q
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1849a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        U1.b bVar = a.f1843a;
        if (obj2 == bVar) {
            U1.b c4 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == bVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, bVar, c4)) {
                        obj2 = c4;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != bVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract U1.b c(Object obj);
}
