package io.flutter.plugins.imagepicker;

import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f3645a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f3646b;

    /* renamed from: c  reason: collision with root package name */
    public Long f3647c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f3645a.equals(rVar.f3645a) && this.f3646b.equals(rVar.f3646b) && Objects.equals(this.f3647c, rVar.f3647c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3645a, this.f3646b, this.f3647c);
    }
}
