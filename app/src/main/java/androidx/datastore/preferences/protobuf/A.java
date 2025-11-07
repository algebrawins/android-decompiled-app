package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class A implements Cloneable {

    /* renamed from: J  reason: collision with root package name */
    public final D f2296J;

    /* renamed from: K  reason: collision with root package name */
    public D f2297K;

    public A(D d4) {
        this.f2296J = d4;
        if (!d4.i()) {
            this.f2297K = d4.k();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final D a() {
        D b3 = b();
        b3.getClass();
        if (D.h(b3, true)) {
            return b3;
        }
        throw new o0();
    }

    public final D b() {
        if (!this.f2297K.i()) {
            return this.f2297K;
        }
        D d4 = this.f2297K;
        d4.getClass();
        C0109f0 c0109f0 = C0109f0.f2342c;
        c0109f0.getClass();
        c0109f0.a(d4.getClass()).h(d4);
        d4.j();
        return this.f2297K;
    }

    public final void c() {
        if (!this.f2297K.i()) {
            D k3 = this.f2296J.k();
            D d4 = this.f2297K;
            C0109f0 c0109f0 = C0109f0.f2342c;
            c0109f0.getClass();
            c0109f0.a(k3.getClass()).c(k3, d4);
            this.f2297K = k3;
        }
    }

    public final Object clone() {
        A a4 = (A) this.f2296J.e(C.NEW_BUILDER);
        a4.f2297K = b();
        return a4;
    }
}
