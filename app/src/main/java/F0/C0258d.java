package f0;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: f0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258d {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f3186a;

    public C0258d(DisplayCutout displayCutout) {
        this.f3186a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0258d.class == obj.getClass()) {
            return Objects.equals(this.f3186a, ((C0258d) obj).f3186a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f3186a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3186a + "}";
    }
}
