package V2;

import java.util.concurrent.CancellationException;

/* renamed from: V2.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056m {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1443a;

    /* renamed from: b  reason: collision with root package name */
    public final F f1444b;

    /* renamed from: c  reason: collision with root package name */
    public final M2.l f1445c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1446d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f1447e;

    public C0056m(Object obj, F f2, M2.l lVar, Object obj2, Throwable th) {
        this.f1443a = obj;
        this.f1444b = f2;
        this.f1445c = lVar;
        this.f1446d = obj2;
        this.f1447e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0056m a(C0056m c0056m, F f2, CancellationException cancellationException, int r9) {
        Object obj = c0056m.f1443a;
        if ((r9 & 2) != 0) {
            f2 = c0056m.f1444b;
        }
        F f4 = f2;
        M2.l lVar = c0056m.f1445c;
        Object obj2 = c0056m.f1446d;
        CancellationException cancellationException2 = cancellationException;
        if ((r9 & 16) != 0) {
            cancellationException2 = c0056m.f1447e;
        }
        c0056m.getClass();
        return new C0056m(obj, f4, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0056m)) {
            return false;
        }
        C0056m c0056m = (C0056m) obj;
        if (N2.g.a(this.f1443a, c0056m.f1443a) && N2.g.a(this.f1444b, c0056m.f1444b) && N2.g.a(this.f1445c, c0056m.f1445c) && N2.g.a(this.f1446d, c0056m.f1446d) && N2.g.a(this.f1447e, c0056m.f1447e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int r02 = 0;
        Object obj = this.f1443a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int r12 = hashCode * 31;
        F f2 = this.f1444b;
        if (f2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f2.hashCode();
        }
        int r13 = (r12 + hashCode2) * 31;
        M2.l lVar = this.f1445c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int r14 = (r13 + hashCode3) * 31;
        Object obj2 = this.f1446d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int r15 = (r14 + hashCode4) * 31;
        Throwable th = this.f1447e;
        if (th != null) {
            r02 = th.hashCode();
        }
        return r15 + r02;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f1443a + ", cancelHandler=" + this.f1444b + ", onCancellation=" + this.f1445c + ", idempotentResume=" + this.f1446d + ", cancelCause=" + this.f1447e + ')';
    }

    public /* synthetic */ C0056m(Object obj, F f2, M2.l lVar, CancellationException cancellationException, int r13) {
        this(obj, (r13 & 2) != 0 ? null : f2, (r13 & 4) != 0 ? null : lVar, (Object) null, (r13 & 16) != 0 ? null : cancellationException);
    }
}
