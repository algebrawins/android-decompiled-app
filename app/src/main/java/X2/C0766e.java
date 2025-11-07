package x2;

import java.util.Map;
import java.util.Objects;

/* renamed from: x2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766e {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f6156a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f6157b;

    /* renamed from: c  reason: collision with root package name */
    public Map f6158c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0766e.class != obj.getClass()) {
            return false;
        }
        C0766e c0766e = (C0766e) obj;
        if (this.f6156a.equals(c0766e.f6156a) && this.f6157b.equals(c0766e.f6157b) && this.f6158c.equals(c0766e.f6158c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6156a, this.f6157b, this.f6158c);
    }
}
