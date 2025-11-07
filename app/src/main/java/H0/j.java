package H0;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f730a;

    /* renamed from: b  reason: collision with root package name */
    public final k f731b;

    /* renamed from: c  reason: collision with root package name */
    public final a f732c;

    public j(Object obj, k kVar, a aVar) {
        N2.g.e(obj, "value");
        this.f730a = obj;
        this.f731b = kVar;
        this.f732c = aVar;
    }

    @Override // H0.i
    public final Object a() {
        return this.f730a;
    }

    @Override // H0.i
    public final i d(String str, M2.l lVar) {
        Object obj = this.f730a;
        if (((Boolean) lVar.h(obj)).booleanValue()) {
            return this;
        }
        return new h(obj, str, this.f732c, this.f731b);
    }
}
