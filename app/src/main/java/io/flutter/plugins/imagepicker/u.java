package io.flutter.plugins.imagepicker;

import java.util.Objects;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public Double f3653a;

    /* renamed from: b  reason: collision with root package name */
    public Double f3654b;

    /* renamed from: c  reason: collision with root package name */
    public Long f3655c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (Objects.equals(this.f3653a, uVar.f3653a) && Objects.equals(this.f3654b, uVar.f3654b) && this.f3655c.equals(uVar.f3655c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3653a, this.f3654b, this.f3655c);
    }
}
