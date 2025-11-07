package d2;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: d2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0241i extends N2.f implements M2.l {

    /* renamed from: R  reason: collision with root package name */
    public final /* synthetic */ int f3019R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0241i(int r12, Object obj, Class cls, String str, String str2, int r6, int r7) {
        super(r12, obj, cls, str, str2, r6);
        this.f3019R = r7;
    }

    @Override // M2.l
    public final Object h(Object obj) {
        switch (this.f3019R) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                S1.b bVar = (S1.b) obj;
                ((C0242j) this.f989K).getClass();
                if (bVar == null) {
                    W1.e eVar = (W1.e) Q1.g.c().a(W1.e.class);
                    eVar.getClass();
                    return eVar.a(W1.a.f1497P);
                }
                return ((W1.e) Q1.g.c().a(W1.e.class)).a(bVar);
            default:
                r2.p pVar = (r2.p) obj;
                N2.g.e(pVar, "p0");
                ((i2.d) this.f989K).f3443c.add(pVar);
                return B2.i.f210a;
        }
    }
}
