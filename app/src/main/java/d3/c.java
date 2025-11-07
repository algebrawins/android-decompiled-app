package d3;

import M2.l;
import V2.C0050f;
import V2.InterfaceC0049e;
import V2.o0;
import a3.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c implements InterfaceC0049e, o0 {

    /* renamed from: J  reason: collision with root package name */
    public final C0050f f3067J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ d f3068K;

    public c(d dVar, C0050f c0050f) {
        this.f3068K = dVar;
        this.f3067J = c0050f;
    }

    @Override // V2.o0
    public final void a(u uVar, int r3) {
        this.f3067J.a(uVar, r3);
    }

    @Override // D2.d
    public final D2.i e() {
        return this.f3067J.f1437N;
    }

    @Override // D2.d
    public final void i(Object obj) {
        this.f3067J.i(obj);
    }

    @Override // V2.InterfaceC0049e
    public final void l(Object obj, l lVar) {
        B2.i iVar = B2.i.f210a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.g;
        d dVar = this.f3068K;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f3067J.l(iVar, new b(0, dVar, this));
    }

    @Override // V2.InterfaceC0049e
    public final U1.b m(Object obj, l lVar) {
        d dVar = this.f3068K;
        b bVar = new b(1, dVar, this);
        U1.b m3 = this.f3067J.m((B2.i) obj, bVar);
        if (m3 != null) {
            d.g.set(dVar, null);
        }
        return m3;
    }

    @Override // V2.InterfaceC0049e
    public final void o(Object obj) {
        this.f3067J.o(obj);
    }
}
