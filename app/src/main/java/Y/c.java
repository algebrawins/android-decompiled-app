package Y;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f1636e = new c(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f1637a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1638b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1639c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1640d;

    public c(int r12, int r22, int r3, int r4) {
        this.f1637a = r12;
        this.f1638b = r22;
        this.f1639c = r3;
        this.f1640d = r4;
    }

    public static c a(int r12, int r22, int r3, int r4) {
        if (r12 == 0 && r22 == 0 && r3 == 0 && r4 == 0) {
            return f1636e;
        }
        return new c(r12, r22, r3, r4);
    }

    public final Insets b() {
        return b.a(this.f1637a, this.f1638b, this.f1639c, this.f1640d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1640d == cVar.f1640d && this.f1637a == cVar.f1637a && this.f1639c == cVar.f1639c && this.f1638b == cVar.f1638b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f1637a * 31) + this.f1638b) * 31) + this.f1639c) * 31) + this.f1640d;
    }

    public final String toString() {
        return "Insets{left=" + this.f1637a + ", top=" + this.f1638b + ", right=" + this.f1639c + ", bottom=" + this.f1640d + '}';
    }
}
