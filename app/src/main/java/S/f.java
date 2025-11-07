package S;

import x1.AbstractC0691r0;

/* loaded from: classes.dex */
public final class f extends AbstractC0691r0 {
    @Override // x1.AbstractC0691r0
    public final boolean a(h hVar, d dVar, d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f1185K == dVar) {
                    hVar.f1185K = dVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x1.AbstractC0691r0
    public final boolean b(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f1184J == obj) {
                    hVar.f1184J = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x1.AbstractC0691r0
    public final boolean c(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f1186L == gVar) {
                    hVar.f1186L = gVar2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x1.AbstractC0691r0
    public final void d(g gVar, g gVar2) {
        gVar.f1179b = gVar2;
    }

    @Override // x1.AbstractC0691r0
    public final void e(g gVar, Thread thread) {
        gVar.f1178a = thread;
    }
}
