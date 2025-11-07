package a3;

import V2.AbstractC0061s;
import V2.AbstractC0066x;
import V2.C;
import V2.C0057n;
import V2.C0058o;
import V2.J;
import V2.k0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h extends C implements F2.c, D2.d {

    /* renamed from: Q  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1856Q = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");

    /* renamed from: M  reason: collision with root package name */
    public final AbstractC0061s f1857M;

    /* renamed from: N  reason: collision with root package name */
    public final F2.b f1858N;

    /* renamed from: O  reason: collision with root package name */
    public Object f1859O;

    /* renamed from: P  reason: collision with root package name */
    public final Object f1860P;
    private volatile Object _reusableCancellableContinuation;

    public h(AbstractC0061s abstractC0061s, F2.b bVar) {
        super(-1);
        this.f1857M = abstractC0061s;
        this.f1858N = bVar;
        this.f1859O = a.f1845c;
        this.f1860P = a.l(bVar.e());
    }

    @Override // V2.C
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0058o) {
            ((C0058o) obj).f1453b.h(cancellationException);
        }
    }

    @Override // F2.c
    public final F2.c c() {
        F2.b bVar = this.f1858N;
        if (!(bVar instanceof F2.c)) {
            return null;
        }
        return bVar;
    }

    @Override // D2.d
    public final D2.i e() {
        return this.f1858N.e();
    }

    @Override // D2.d
    public final void i(Object obj) {
        Object c0057n;
        F2.b bVar = this.f1858N;
        D2.i e4 = bVar.e();
        Throwable a4 = B2.e.a(obj);
        if (a4 == null) {
            c0057n = obj;
        } else {
            c0057n = new C0057n(a4, false);
        }
        AbstractC0061s abstractC0061s = this.f1857M;
        if (abstractC0061s.l()) {
            this.f1859O = c0057n;
            this.f1389L = 0;
            abstractC0061s.h(e4, this);
            return;
        }
        J a5 = k0.a();
        if (a5.f1398L >= 4294967296L) {
            this.f1859O = c0057n;
            this.f1389L = 0;
            C2.g gVar = a5.f1400N;
            if (gVar == null) {
                gVar = new C2.g();
                a5.f1400N = gVar;
            }
            gVar.addLast(this);
            return;
        }
        a5.p(true);
        try {
            D2.i e5 = bVar.e();
            Object m3 = a.m(e5, this.f1860P);
            bVar.i(obj);
            a.g(e5, m3);
            do {
            } while (a5.r());
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // V2.C
    public final Object j() {
        Object obj = this.f1859O;
        this.f1859O = a.f1845c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1857M + ", " + AbstractC0066x.k(this.f1858N) + ']';
    }

    @Override // V2.C
    public final D2.d d() {
        return this;
    }
}
