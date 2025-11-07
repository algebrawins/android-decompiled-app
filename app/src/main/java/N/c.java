package N;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f875a;

    /* renamed from: b  reason: collision with root package name */
    public final int f876b;

    /* renamed from: c  reason: collision with root package name */
    public final int f877c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f878d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f879e;

    /* renamed from: f  reason: collision with root package name */
    public final int f880f;
    public final boolean g;

    public c(UUID r12, int r22, int r3, Rect rect, Size size, int r6, boolean z3) {
        if (r12 != null) {
            this.f875a = r12;
            this.f876b = r22;
            this.f877c = r3;
            if (rect != null) {
                this.f878d = rect;
                if (size != null) {
                    this.f879e = size;
                    this.f880f = r6;
                    this.g = z3;
                    return;
                }
                throw new NullPointerException("Null size");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null uuid");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f875a.equals(cVar.f875a) && this.f876b == cVar.f876b && this.f877c == cVar.f877c && this.f878d.equals(cVar.f878d) && this.f879e.equals(cVar.f879e) && this.f880f == cVar.f880f && this.g == cVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int r12;
        int hashCode = (((((((((((this.f875a.hashCode() ^ 1000003) * 1000003) ^ this.f876b) * 1000003) ^ this.f877c) * 1000003) ^ this.f878d.hashCode()) * 1000003) ^ this.f879e.hashCode()) * 1000003) ^ this.f880f) * 1000003;
        if (this.g) {
            r12 = 1231;
        } else {
            r12 = 1237;
        }
        return hashCode ^ r12;
    }

    public final String toString() {
        return "OutConfig{uuid=" + this.f875a + ", targets=" + this.f876b + ", format=" + this.f877c + ", cropRect=" + this.f878d + ", size=" + this.f879e + ", rotationDegrees=" + this.f880f + ", mirroring=" + this.g + "}";
    }
}
