package j1;

import h1.C0283c;
import h2.J;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final C0302a f3828a;

    /* renamed from: b  reason: collision with root package name */
    public final C0283c f3829b;

    public /* synthetic */ n(C0302a c0302a, C0283c c0283c) {
        this.f3828a = c0302a;
        this.f3829b = c0283c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (k1.w.h(this.f3828a, nVar.f3828a) && k1.w.h(this.f3829b, nVar.f3829b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3828a, this.f3829b});
    }

    public final String toString() {
        J j3 = new J(this);
        j3.n(this.f3828a, "key");
        j3.n(this.f3829b, "feature");
        return j3.toString();
    }
}
