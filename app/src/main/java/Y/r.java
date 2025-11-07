package y;

import android.view.Surface;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6186a;

    public r(Surface surface) {
        this.f6186a = new q(surface);
    }

    public void a(Surface surface) {
        if (e() != surface) {
            if (!f()) {
                throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
            }
            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
        }
        throw new IllegalStateException("Surface is already added!");
    }

    public void b() {
        ((q) this.f6186a).f6185f = true;
    }

    public Object c() {
        return null;
    }

    public String d() {
        return ((q) this.f6186a).f6184e;
    }

    public Surface e() {
        List list = ((q) this.f6186a).f6180a;
        if (list.size() == 0) {
            return null;
        }
        return (Surface) list.get(0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        return Objects.equals(this.f6186a, ((r) obj).f6186a);
    }

    public boolean f() {
        return ((q) this.f6186a).f6185f;
    }

    public void g(long j3) {
        ((q) this.f6186a).g = j3;
    }

    public void h(String str) {
        ((q) this.f6186a).f6184e = str;
    }

    public final int hashCode() {
        return this.f6186a.hashCode();
    }

    public r(Object obj) {
        this.f6186a = obj;
    }

    public void i(long j3) {
    }
}
