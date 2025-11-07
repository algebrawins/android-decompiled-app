package h2;

import D.N;

/* loaded from: classes.dex */
public final class r implements io.flutter.embedding.engine.renderer.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.n f3352a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ N f3353b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f3354c;

    public r(t tVar, io.flutter.embedding.engine.renderer.n nVar, N n3) {
        this.f3354c = tVar;
        this.f3352a = nVar;
        this.f3353b = n3;
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void b() {
        C0299l c0299l;
        this.f3352a.f3498a.removeIsDisplayingFlutterUiListener(this);
        this.f3353b.run();
        t tVar = this.f3354c;
        if (!(tVar.f3358M instanceof C0299l) && (c0299l = tVar.f3357L) != null) {
            c0299l.c();
            C0299l c0299l2 = tVar.f3357L;
            if (c0299l2 != null) {
                c0299l2.f3334J.close();
                tVar.removeView(tVar.f3357L);
                tVar.f3357L = null;
            }
        }
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void a() {
    }
}
