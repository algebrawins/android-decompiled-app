package androidx.lifecycle;

import h2.AbstractActivityC0292d;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: J  reason: collision with root package name */
    public final A f2477J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f2478K;

    /* renamed from: L  reason: collision with root package name */
    public int f2479L = -1;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ z f2480M;

    public x(z zVar, A a4) {
        this.f2480M = zVar;
        this.f2477J = a4;
    }

    public final void a(boolean z3) {
        int r6;
        boolean z4;
        boolean z5;
        if (z3 == this.f2478K) {
            return;
        }
        this.f2478K = z3;
        if (z3) {
            r6 = 1;
        } else {
            r6 = -1;
        }
        z zVar = this.f2480M;
        int r22 = zVar.f2487c;
        zVar.f2487c = r6 + r22;
        if (!zVar.f2488d) {
            zVar.f2488d = true;
            while (true) {
                try {
                    int r3 = zVar.f2487c;
                    if (r22 == r3) {
                        break;
                    }
                    if (r22 == 0 && r3 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (r22 > 0 && r3 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z4) {
                        zVar.f();
                    } else if (z5) {
                        zVar.g();
                    }
                    r22 = r3;
                } catch (Throwable th) {
                    zVar.f2488d = false;
                    throw th;
                }
            }
            zVar.f2488d = false;
        }
        if (this.f2478K) {
            zVar.c(this);
        }
    }

    public void b() {
    }

    public boolean c(AbstractActivityC0292d abstractActivityC0292d) {
        return false;
    }

    public abstract boolean d();
}
