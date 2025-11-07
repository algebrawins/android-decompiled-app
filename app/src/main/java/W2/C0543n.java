package w2;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: w2.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543n implements Y2.d {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5390J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Y2.d f5391K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ r0.d f5392L;

    public /* synthetic */ C0543n(Y2.d dVar, r0.d dVar2, int r3) {
        this.f5390J = r3;
        this.f5391K = dVar;
        this.f5392L = dVar2;
    }

    @Override // Y2.d
    public final Object h(Y2.e eVar, D2.d dVar) {
        switch (this.f5390J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Object h3 = this.f5391K.h(new C0542m(eVar, this.f5392L, 0), dVar);
                if (h3 != E2.a.COROUTINE_SUSPENDED) {
                    return B2.i.f210a;
                }
                return h3;
            case 1:
                Object h4 = this.f5391K.h(new C0542m(eVar, this.f5392L, 1), dVar);
                if (h4 != E2.a.COROUTINE_SUSPENDED) {
                    return B2.i.f210a;
                }
                return h4;
            case 2:
                Object h5 = this.f5391K.h(new C0542m(eVar, this.f5392L, 2), dVar);
                if (h5 != E2.a.COROUTINE_SUSPENDED) {
                    return B2.i.f210a;
                }
                return h5;
            default:
                Object h6 = this.f5391K.h(new C0542m(eVar, this.f5392L, 3), dVar);
                if (h6 != E2.a.COROUTINE_SUSPENDED) {
                    return B2.i.f210a;
                }
                return h6;
        }
    }
}
