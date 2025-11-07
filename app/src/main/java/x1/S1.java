package x1;

/* loaded from: classes.dex */
public final class S1 implements H1.d {

    /* renamed from: a  reason: collision with root package name */
    public static final S1 f5732a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final H1.c f5733b = new H1.c("maxMs", D.C.C(D.C.A(S.class, new N(1, Q.zza))));

    /* renamed from: c  reason: collision with root package name */
    public static final H1.c f5734c = new H1.c("minMs", D.C.C(D.C.A(S.class, new N(2, Q.zza))));

    /* renamed from: d  reason: collision with root package name */
    public static final H1.c f5735d = new H1.c("avgMs", D.C.C(D.C.A(S.class, new N(3, Q.zza))));

    /* renamed from: e  reason: collision with root package name */
    public static final H1.c f5736e = new H1.c("firstQuartileMs", D.C.C(D.C.A(S.class, new N(4, Q.zza))));

    /* renamed from: f  reason: collision with root package name */
    public static final H1.c f5737f = new H1.c("medianMs", D.C.C(D.C.A(S.class, new N(5, Q.zza))));
    public static final H1.c g = new H1.c("thirdQuartileMs", D.C.C(D.C.A(S.class, new N(6, Q.zza))));

    @Override // H1.a
    public final void a(Object obj, Object obj2) {
        C0695r4 c0695r4 = (C0695r4) obj;
        H1.e eVar = (H1.e) obj2;
        eVar.d(f5733b, c0695r4.f6077a);
        eVar.d(f5734c, c0695r4.f6078b);
        eVar.d(f5735d, c0695r4.f6079c);
        eVar.d(f5736e, c0695r4.f6080d);
        eVar.d(f5737f, c0695r4.f6081e);
        eVar.d(g, c0695r4.f6082f);
    }
}
