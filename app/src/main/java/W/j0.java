package w;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements S.j {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5174J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ j1.o f5175K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ I.a f5176L;

    public /* synthetic */ j0(j1.o oVar, I.a aVar, int r3) {
        this.f5174J = r3;
        this.f5175K = oVar;
        this.f5176L = aVar;
    }

    @Override // S.j
    public final Object a0(final S.i iVar) {
        switch (this.f5174J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                final j1.o oVar = this.f5175K;
                oVar.getClass();
                final I.a aVar = this.f5176L;
                ((G.l) oVar.f3832c).execute(new Runnable() { // from class: w.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r4) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                oVar.c(iVar, aVar);
                                return;
                            default:
                                oVar.c(iVar, aVar);
                                return;
                        }
                    }
                });
                return "setZoomRatio";
            default:
                final j1.o oVar2 = this.f5175K;
                oVar2.getClass();
                final I.a aVar2 = this.f5176L;
                ((G.l) oVar2.f3832c).execute(new Runnable() { // from class: w.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r4) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                oVar2.c(iVar, aVar2);
                                return;
                            default:
                                oVar2.c(iVar, aVar2);
                                return;
                        }
                    }
                });
                return "setLinearZoom";
        }
    }
}
