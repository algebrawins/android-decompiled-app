package V2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Z implements N {

    /* renamed from: K  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1416K = AtomicIntegerFieldUpdater.newUpdater(Z.class, "_isCompleting");

    /* renamed from: L  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1417L = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_rootCause");

    /* renamed from: M  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1418M = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_exceptionsHolder");

    /* renamed from: J  reason: collision with root package name */
    public final d0 f1419J;
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    public Z(d0 d0Var, Throwable th) {
        this.f1419J = d0Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable c4 = c();
        if (c4 == null) {
            f1417L.set(this, th);
        } else if (th == c4) {
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1418M;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
            } else if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    @Override // V2.N
    public final boolean b() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final Throwable c() {
        return (Throwable) f1417L.get(this);
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f1416K.get(this) != 0) {
            return true;
        }
        return false;
    }

    @Override // V2.N
    public final d0 f() {
        return this.f1419J;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1418M;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable c4 = c();
        if (c4 != null) {
            arrayList.add(0, c4);
        }
        if (th != null && !th.equals(c4)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0066x.g);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + f1418M.get(this) + ", list=" + this.f1419J + ']';
    }
}
