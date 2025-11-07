package Q;

import D.InterfaceC0031l;
import D.r0;
import I.h;
import android.os.Build;
import androidx.camera.core.impl.AbstractC0088p;
import androidx.camera.core.impl.C0077d;
import androidx.camera.core.impl.InterfaceC0087o;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.r;
import androidx.lifecycle.B;
import androidx.lifecycle.EnumC0137k;
import androidx.lifecycle.l;
import androidx.lifecycle.q;
import h2.AbstractActivityC0292d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements q, InterfaceC0031l {

    /* renamed from: K  reason: collision with root package name */
    public final AbstractActivityC0292d f1040K;

    /* renamed from: L  reason: collision with root package name */
    public final h f1041L;

    /* renamed from: J  reason: collision with root package name */
    public final Object f1039J = new Object();

    /* renamed from: M  reason: collision with root package name */
    public boolean f1042M = false;

    public b(AbstractActivityC0292d abstractActivityC0292d, h hVar) {
        this.f1040K = abstractActivityC0292d;
        this.f1041L = hVar;
        if (abstractActivityC0292d.f3316L.f2467c.a(l.STARTED)) {
            hVar.h();
        } else {
            hVar.u();
        }
        abstractActivityC0292d.f3316L.a(this);
    }

    public final void g(InterfaceC0087o interfaceC0087o) {
        h hVar = this.f1041L;
        synchronized (hVar.f762S) {
            try {
                A.a aVar = AbstractC0088p.f2225a;
                if (!hVar.f757N.isEmpty() && !((C0077d) ((A.a) hVar.f761R).f1K).equals((C0077d) aVar.f1K)) {
                    throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
                }
                hVar.f761R = aVar;
                if (((S) aVar.V()).i0(InterfaceC0087o.f2224j, null) == null) {
                    hVar.f767X.getClass();
                    hVar.f753J.g(hVar.f761R);
                } else {
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D.InterfaceC0031l
    public final r k() {
        return this.f1041L.f768Y;
    }

    @B(EnumC0137k.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.r rVar) {
        synchronized (this.f1039J) {
            h hVar = this.f1041L;
            hVar.B((ArrayList) hVar.x());
        }
    }

    @B(EnumC0137k.ON_PAUSE)
    public void onPause(androidx.lifecycle.r rVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1041L.f753J.c(false);
        }
    }

    @B(EnumC0137k.ON_RESUME)
    public void onResume(androidx.lifecycle.r rVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1041L.f753J.c(true);
        }
    }

    @B(EnumC0137k.ON_START)
    public void onStart(androidx.lifecycle.r rVar) {
        synchronized (this.f1039J) {
            try {
                if (!this.f1042M) {
                    this.f1041L.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @B(EnumC0137k.ON_STOP)
    public void onStop(androidx.lifecycle.r rVar) {
        synchronized (this.f1039J) {
            try {
                if (!this.f1042M) {
                    this.f1041L.u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(List list) {
        synchronized (this.f1039J) {
            this.f1041L.f(list);
        }
    }

    public final androidx.lifecycle.r q() {
        AbstractActivityC0292d abstractActivityC0292d;
        synchronized (this.f1039J) {
            abstractActivityC0292d = this.f1040K;
        }
        return abstractActivityC0292d;
    }

    public final List r() {
        List unmodifiableList;
        synchronized (this.f1039J) {
            unmodifiableList = Collections.unmodifiableList(this.f1041L.x());
        }
        return unmodifiableList;
    }

    public final boolean s(r0 r0Var) {
        boolean contains;
        synchronized (this.f1039J) {
            contains = ((ArrayList) this.f1041L.x()).contains(r0Var);
        }
        return contains;
    }

    public final void t() {
        synchronized (this.f1039J) {
            try {
                if (this.f1042M) {
                    return;
                }
                onStop(this.f1040K);
                this.f1042M = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        synchronized (this.f1039J) {
            h hVar = this.f1041L;
            hVar.B((ArrayList) hVar.x());
        }
    }

    public final void v() {
        synchronized (this.f1039J) {
            try {
                if (!this.f1042M) {
                    return;
                }
                this.f1042M = false;
                if (this.f1040K.f3316L.f2467c.a(l.STARTED)) {
                    onStart(this.f1040K);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
