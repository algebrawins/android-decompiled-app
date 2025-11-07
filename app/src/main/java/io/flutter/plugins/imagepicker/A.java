package io.flutter.plugins.imagepicker;

import java.util.Objects;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    public Long f3606a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A.class == obj.getClass()) {
            return Objects.equals(this.f3606a, ((A) obj).f3606a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3606a);
    }
}
