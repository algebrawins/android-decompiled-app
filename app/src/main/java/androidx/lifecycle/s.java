package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public l f2463a;

    /* renamed from: b  reason: collision with root package name */
    public p f2464b;

    public final void a(r rVar, EnumC0137k enumC0137k) {
        l a4 = enumC0137k.a();
        l lVar = this.f2463a;
        N2.g.e(lVar, "state1");
        if (a4 != null && a4.compareTo(lVar) < 0) {
            lVar = a4;
        }
        this.f2463a = lVar;
        this.f2464b.h(rVar, enumC0137k);
        this.f2463a = a4;
    }
}
