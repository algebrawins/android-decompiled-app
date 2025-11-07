package w2;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final String f5358a;

    /* renamed from: b  reason: collision with root package name */
    public final M f5359b;

    public O(String str, M m3) {
        N2.g.e(m3, "type");
        this.f5358a = str;
        this.f5359b = m3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o3 = (O) obj;
        if (N2.g.a(this.f5358a, o3.f5358a) && this.f5359b == o3.f5359b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f5358a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f5359b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f5358a + ", type=" + this.f5359b + ")";
    }
}
