package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public abstract class W implements Cloneable, A0 {

    /* renamed from: J  reason: collision with root package name */
    public final AbstractC0168a0 f2862J;

    /* renamed from: K  reason: collision with root package name */
    public AbstractC0168a0 f2863K;

    public W(AbstractC0168a0 abstractC0168a0) {
        this.f2862J = abstractC0168a0;
        if (!abstractC0168a0.k()) {
            this.f2863K = (AbstractC0168a0) abstractC0168a0.m(4, null);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0
    public final boolean a() {
        return AbstractC0168a0.j(this.f2863K, false);
    }

    public final void b(AbstractC0168a0 abstractC0168a0) {
        if (!this.f2862J.equals(abstractC0168a0)) {
            if (!this.f2863K.k()) {
                g();
            }
            AbstractC0168a0 abstractC0168a02 = this.f2863K;
            H0.f2796c.b(abstractC0168a02.getClass()).d(abstractC0168a02, abstractC0168a0);
        }
    }

    public final AbstractC0168a0 c() {
        AbstractC0168a0 d4 = d();
        d4.getClass();
        if (AbstractC0168a0.j(d4, true)) {
            return d4;
        }
        throw new U0();
    }

    public final Object clone() {
        W w3 = (W) this.f2862J.m(5, null);
        w3.f2863K = d();
        return w3;
    }

    public AbstractC0168a0 d() {
        if (!this.f2863K.k()) {
            return this.f2863K;
        }
        AbstractC0168a0 abstractC0168a0 = this.f2863K;
        abstractC0168a0.getClass();
        H0.f2796c.b(abstractC0168a0.getClass()).a(abstractC0168a0);
        abstractC0168a0.g();
        return this.f2863K;
    }

    public /* bridge */ D e() {
        return d();
    }

    public final void f() {
        if (!this.f2863K.k()) {
            g();
        }
    }

    public void g() {
        AbstractC0168a0 abstractC0168a0 = (AbstractC0168a0) this.f2862J.m(4, null);
        H0.f2796c.b(abstractC0168a0.getClass()).d(abstractC0168a0, this.f2863K);
        this.f2863K = abstractC0168a0;
    }
}
