package H0;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: O  reason: collision with root package name */
    public static final l f733O;

    /* renamed from: J  reason: collision with root package name */
    public final int f734J;

    /* renamed from: K  reason: collision with root package name */
    public final int f735K;

    /* renamed from: L  reason: collision with root package name */
    public final int f736L;

    /* renamed from: M  reason: collision with root package name */
    public final String f737M;

    /* renamed from: N  reason: collision with root package name */
    public final B2.f f738N = new B2.f(new G0.a(1, this));

    static {
        new l(0, 0, 0, "");
        f733O = new l(0, 1, 0, "");
        new l(1, 0, 0, "");
    }

    public l(int r12, int r22, int r3, String str) {
        this.f734J = r12;
        this.f735K = r22;
        this.f736L = r3;
        this.f737M = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        N2.g.e(lVar, "other");
        Object a4 = this.f738N.a();
        N2.g.d(a4, "<get-bigInteger>(...)");
        Object a5 = lVar.f738N.a();
        N2.g.d(a5, "<get-bigInteger>(...)");
        return ((BigInteger) a4).compareTo((BigInteger) a5);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f734J != lVar.f734J || this.f735K != lVar.f735K || this.f736L != lVar.f736L) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((527 + this.f734J) * 31) + this.f735K) * 31) + this.f736L;
    }

    public final String toString() {
        String str;
        String str2 = this.f737M;
        if (!U2.i.g(str2)) {
            str = "-" + str2;
        } else {
            str = "";
        }
        return this.f734J + '.' + this.f735K + '.' + this.f736L + str;
    }
}
