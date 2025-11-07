package io.flutter.plugins.imagepicker;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public p f3641a;

    /* renamed from: b  reason: collision with root package name */
    public n f3642b;

    /* renamed from: c  reason: collision with root package name */
    public List f3643c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f3641a.equals(oVar.f3641a) && Objects.equals(this.f3642b, oVar.f3642b) && this.f3643c.equals(oVar.f3643c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3641a, this.f3642b, this.f3643c);
    }
}
