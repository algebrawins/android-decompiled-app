package j2;

import D.C;

/* renamed from: j2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3856a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3857b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3858c;

    public C0307a(String str, String str2) {
        this.f3856a = str;
        this.f3857b = null;
        this.f3858c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0307a.class != obj.getClass()) {
            return false;
        }
        C0307a c0307a = (C0307a) obj;
        if (!this.f3856a.equals(c0307a.f3856a)) {
            return false;
        }
        return this.f3858c.equals(c0307a.f3858c);
    }

    public final int hashCode() {
        return this.f3858c.hashCode() + (this.f3856a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f3856a);
        sb.append(", function: ");
        return C.z(sb, this.f3858c, " )");
    }

    public C0307a(String str, String str2, String str3) {
        this.f3856a = str;
        this.f3857b = str2;
        this.f3858c = str3;
    }
}
