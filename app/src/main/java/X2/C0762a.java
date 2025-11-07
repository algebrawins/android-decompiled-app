package x2;

import java.util.Objects;

/* renamed from: x2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762a {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f6151a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0762a.class == obj.getClass()) {
            return this.f6151a.equals(((C0762a) obj).f6151a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6151a);
    }
}
