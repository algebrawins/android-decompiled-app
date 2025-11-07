package io.flutter.plugins.imagepicker;

import java.util.Objects;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public z f3658a;

    /* renamed from: b  reason: collision with root package name */
    public x f3659b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f3658a.equals(yVar.f3658a) && Objects.equals(this.f3659b, yVar.f3659b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3658a, this.f3659b);
    }
}
