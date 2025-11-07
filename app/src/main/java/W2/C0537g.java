package w2;

/* renamed from: w2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537g {

    /* renamed from: a  reason: collision with root package name */
    public final String f5371a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5372b;

    public C0537g(String str, boolean z3) {
        this.f5371a = str;
        this.f5372b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0537g)) {
            return false;
        }
        C0537g c0537g = (C0537g) obj;
        if (N2.g.a(this.f5371a, c0537g.f5371a) && this.f5372b == c0537g.f5372b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int r12;
        String str = this.f5371a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int r02 = hashCode * 31;
        if (this.f5372b) {
            r12 = 1231;
        } else {
            r12 = 1237;
        }
        return r02 + r12;
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f5371a + ", useDataStore=" + this.f5372b + ")";
    }
}
