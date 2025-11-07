package Q;

import androidx.lifecycle.B;
import androidx.lifecycle.EnumC0137k;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements q {

    /* renamed from: J  reason: collision with root package name */
    public final E.c f1043J;

    /* renamed from: K  reason: collision with root package name */
    public final r f1044K;

    public c(r rVar, E.c cVar) {
        this.f1044K = rVar;
        this.f1043J = cVar;
    }

    @B(EnumC0137k.ON_DESTROY)
    public void onDestroy(r rVar) {
        E.c cVar = this.f1043J;
        synchronized (cVar.f502K) {
            try {
                c f2 = cVar.f(rVar);
                if (f2 != null) {
                    cVar.m(rVar);
                    for (a aVar : (Set) ((HashMap) cVar.f504M).get(f2)) {
                        ((HashMap) cVar.f503L).remove(aVar);
                    }
                    ((HashMap) cVar.f504M).remove(f2);
                    f2.f1044K.b().b(f2);
                }
            } finally {
            }
        }
    }

    @B(EnumC0137k.ON_START)
    public void onStart(r rVar) {
        this.f1043J.l(rVar);
    }

    @B(EnumC0137k.ON_STOP)
    public void onStop(r rVar) {
        this.f1043J.m(rVar);
    }
}
