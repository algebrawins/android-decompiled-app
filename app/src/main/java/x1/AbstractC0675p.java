package x1;

import java.util.Map;
import java.util.Set;

/* renamed from: x1.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0675p {

    /* renamed from: J  reason: collision with root package name */
    public transient C0635k f6064J;

    /* renamed from: K  reason: collision with root package name */
    public transient C0627j f6065K;

    public final Map a() {
        C0627j c0627j = this.f6065K;
        if (c0627j == null) {
            C0683q c0683q = (C0683q) this;
            C0627j c0627j2 = new C0627j(c0683q, c0683q.f6069L);
            this.f6065K = c0627j2;
            return c0627j2;
        }
        return c0627j;
    }

    public final Set b() {
        C0635k c0635k = this.f6064J;
        if (c0635k == null) {
            C0683q c0683q = (C0683q) this;
            C0635k c0635k2 = new C0635k(c0683q, c0683q.f6069L);
            this.f6064J = c0635k2;
            return c0635k2;
        }
        return c0635k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0675p)) {
            return false;
        }
        return a().equals(((AbstractC0675p) obj).a());
    }

    public final int hashCode() {
        return ((C0627j) a()).f5937L.hashCode();
    }

    public final String toString() {
        return ((C0627j) a()).f5937L.toString();
    }
}
