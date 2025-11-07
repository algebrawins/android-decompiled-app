package V2;

/* renamed from: V2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1452a;

    /* renamed from: b  reason: collision with root package name */
    public final M2.l f1453b;

    public C0058o(Object obj, M2.l lVar) {
        this.f1452a = obj;
        this.f1453b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0058o)) {
            return false;
        }
        C0058o c0058o = (C0058o) obj;
        if (N2.g.a(this.f1452a, c0058o.f1452a) && N2.g.a(this.f1453b, c0058o.f1453b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f1452a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f1453b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f1452a + ", onCancellation=" + this.f1453b + ')';
    }
}
