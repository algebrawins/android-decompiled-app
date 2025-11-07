package V2;

/* renamed from: V2.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0061s extends D2.a implements D2.f {

    /* renamed from: K  reason: collision with root package name */
    public static final r f1460K = new r(D2.e.f491J, C0060q.f1457K);

    public AbstractC0061s() {
        super(D2.e.f491J);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [M2.l, N2.h] */
    @Override // D2.a, D2.i
    public final D2.g f(D2.h hVar) {
        N2.g.e(hVar, "key");
        if (hVar instanceof r) {
            r rVar = (r) hVar;
            D2.h hVar2 = this.f487J;
            if (hVar2 != rVar && rVar.f1459K != hVar2) {
                return null;
            }
            D2.g gVar = (D2.g) rVar.f1458J.h(this);
            if (!(gVar instanceof D2.g)) {
                return null;
            }
            return gVar;
        } else if (D2.e.f491J != hVar) {
            return null;
        } else {
            return this;
        }
    }

    public abstract void h(D2.i iVar, Runnable runnable);

    public boolean l() {
        return !(this instanceof l0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [M2.l, N2.h] */
    @Override // D2.a, D2.i
    public final D2.i n(D2.h hVar) {
        N2.g.e(hVar, "key");
        boolean z3 = hVar instanceof r;
        D2.j jVar = D2.j.f492J;
        if (z3) {
            r rVar = (r) hVar;
            D2.h hVar2 = this.f487J;
            if ((hVar2 == rVar || rVar.f1459K == hVar2) && ((D2.g) rVar.f1458J.h(this)) != null) {
                return jVar;
            }
        } else if (D2.e.f491J == hVar) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0066x.b(this);
    }
}
