package W2;

import D.C;
import D2.i;
import N2.g;
import V2.A;
import V2.AbstractC0061s;
import V2.C0062t;
import V2.D;
import V2.S;
import a3.o;
import android.os.Handler;
import android.os.Looper;
import c3.f;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class c extends AbstractC0061s implements A {

    /* renamed from: L  reason: collision with root package name */
    public final Handler f1535L;

    /* renamed from: M  reason: collision with root package name */
    public final String f1536M;

    /* renamed from: N  reason: collision with root package name */
    public final boolean f1537N;

    /* renamed from: O  reason: collision with root package name */
    public final c f1538O;
    private volatile c _immediate;

    public c(Handler handler, String str, boolean z3) {
        this.f1535L = handler;
        this.f1536M = str;
        this.f1537N = z3;
        this._immediate = z3 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f1538O = cVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && ((c) obj).f1535L == this.f1535L) {
            return true;
        }
        return false;
    }

    @Override // V2.AbstractC0061s
    public final void h(i iVar, Runnable runnable) {
        if (!this.f1535L.post(runnable)) {
            CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
            S s3 = (S) iVar.f(C0062t.f1462K);
            if (s3 != null) {
                s3.a(cancellationException);
            }
            D.f1391b.h(iVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1535L);
    }

    @Override // V2.AbstractC0061s
    public final boolean l() {
        if (this.f1537N && g.a(Looper.myLooper(), this.f1535L.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // V2.AbstractC0061s
    public final String toString() {
        c cVar;
        String str;
        f fVar = D.f1390a;
        c cVar2 = o.f1877a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f1538O;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            if (this == cVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f1536M;
            if (str2 == null) {
                str2 = this.f1535L.toString();
            }
            if (this.f1537N) {
                return C.y(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
