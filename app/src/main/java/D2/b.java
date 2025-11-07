package D2;

import M2.p;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f488J;

    public /* synthetic */ b(int r12) {
        this.f488J = r12;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        c cVar;
        switch (this.f488J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                String str = (String) obj;
                g gVar = (g) obj2;
                N2.g.e(str, "acc");
                N2.g.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                N2.g.e(iVar, "acc");
                N2.g.e(gVar2, "element");
                i n3 = iVar.n(gVar2.getKey());
                j jVar = j.f492J;
                if (n3 != jVar) {
                    e eVar = e.f491J;
                    f fVar = (f) n3.f(eVar);
                    if (fVar == null) {
                        cVar = new c(n3, gVar2);
                    } else {
                        i n4 = n3.n(eVar);
                        if (n4 == jVar) {
                            return new c(gVar2, fVar);
                        }
                        cVar = new c(new c(n4, gVar2), fVar);
                    }
                    return cVar;
                }
                return gVar2;
        }
    }
}
