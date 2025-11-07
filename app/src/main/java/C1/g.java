package C1;

import k1.w;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final j f239a = new j();

    public g() {
    }

    public final boolean a(Exception exc) {
        j jVar = this.f239a;
        jVar.getClass();
        w.f(exc, "Exception must not be null");
        synchronized (jVar.f246a) {
            try {
                if (jVar.f248c) {
                    return false;
                }
                jVar.f248c = true;
                jVar.f251f = exc;
                jVar.f247b.h(jVar);
                return true;
            } finally {
            }
        }
    }

    public g(A.a aVar) {
        A.c cVar = new A.c(7, this);
        aVar.getClass();
        A.a aVar2 = new A.a(8, cVar);
        ((j) aVar.f1K).b(h.f240a, aVar2);
    }
}
