package D2;

import M2.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: J  reason: collision with root package name */
    public final i f489J;

    /* renamed from: K  reason: collision with root package name */
    public final g f490K;

    public c(i iVar, g gVar) {
        N2.g.e(iVar, "left");
        N2.g.e(gVar, "element");
        this.f489J = iVar;
        this.f490K = gVar;
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int r02 = 2;
            c cVar2 = cVar;
            int r3 = 2;
            while (true) {
                i iVar = cVar2.f489J;
                if (iVar instanceof c) {
                    cVar2 = (c) iVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    break;
                }
                r3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f489J;
                if (iVar2 instanceof c) {
                    cVar3 = (c) iVar2;
                } else {
                    cVar3 = null;
                }
                if (cVar3 == null) {
                    break;
                }
                r02++;
            }
            if (r3 != r02) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f490K;
                if (!N2.g.a(cVar.f(gVar.getKey()), gVar)) {
                    z3 = false;
                    break;
                }
                i iVar3 = cVar4.f489J;
                if (iVar3 instanceof c) {
                    cVar4 = (c) iVar3;
                } else {
                    N2.g.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z3 = N2.g.a(cVar.f(gVar2.getKey()), gVar2);
                    break;
                }
            }
            if (!z3) {
                return false;
            }
        }
        return true;
    }

    @Override // D2.i
    public final g f(h hVar) {
        N2.g.e(hVar, "key");
        c cVar = this;
        while (true) {
            g f2 = cVar.f490K.f(hVar);
            if (f2 != null) {
                return f2;
            }
            i iVar = cVar.f489J;
            if (iVar instanceof c) {
                cVar = (c) iVar;
            } else {
                return iVar.f(hVar);
            }
        }
    }

    public final int hashCode() {
        return this.f490K.hashCode() + this.f489J.hashCode();
    }

    @Override // D2.i
    public final Object j(Object obj, p pVar) {
        return pVar.g(this.f489J.j(obj, pVar), this.f490K);
    }

    @Override // D2.i
    public final i k(i iVar) {
        N2.g.e(iVar, "context");
        if (iVar == j.f492J) {
            return this;
        }
        return (i) iVar.j(this, new b(1));
    }

    @Override // D2.i
    public final i n(h hVar) {
        N2.g.e(hVar, "key");
        g gVar = this.f490K;
        g f2 = gVar.f(hVar);
        i iVar = this.f489J;
        if (f2 != null) {
            return iVar;
        }
        i n3 = iVar.n(hVar);
        if (n3 == iVar) {
            return this;
        }
        if (n3 != j.f492J) {
            return new c(n3, gVar);
        }
        return gVar;
    }

    public final String toString() {
        return "[" + ((String) j("", new b(0))) + ']';
    }
}
