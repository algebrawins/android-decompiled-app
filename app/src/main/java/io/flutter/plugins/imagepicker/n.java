package io.flutter.plugins.imagepicker;

import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public String f3639a;

    /* renamed from: b  reason: collision with root package name */
    public String f3640b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f3639a.equals(nVar.f3639a) && Objects.equals(this.f3640b, nVar.f3640b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3639a, this.f3640b);
    }
}
