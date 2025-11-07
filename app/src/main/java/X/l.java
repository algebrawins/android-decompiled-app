package X;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f1564a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f1565b;

    public l(Resources resources, Resources.Theme theme) {
        this.f1564a = resources;
        this.f1565b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f1564a.equals(lVar.f1564a) && Objects.equals(this.f1565b, lVar.f1565b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1564a, this.f1565b);
    }
}
