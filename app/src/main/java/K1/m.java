package k1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m implements i1.b {

    /* renamed from: c  reason: collision with root package name */
    public static final m f4059c = new m(null);

    /* renamed from: b  reason: collision with root package name */
    public final String f4060b;

    public /* synthetic */ m(String str) {
        this.f4060b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return w.h(this.f4060b, ((m) obj).f4060b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4060b});
    }
}
