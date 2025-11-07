package E;

import D.l0;
import N.g;
import android.util.Size;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public l0 f493a;

    /* renamed from: b  reason: collision with root package name */
    public final Size f494b;

    /* renamed from: c  reason: collision with root package name */
    public final int f495c;

    /* renamed from: d  reason: collision with root package name */
    public final int f496d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f497e;

    /* renamed from: f  reason: collision with root package name */
    public final g f498f;
    public final g g;

    public a(Size size, int r22, int r3, boolean z3, g gVar, g gVar2) {
        if (size != null) {
            this.f494b = size;
            this.f495c = r22;
            this.f496d = r3;
            this.f497e = z3;
            this.f498f = gVar;
            this.g = gVar2;
            return;
        }
        throw new NullPointerException("Null size");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f494b.equals(aVar.f494b) && this.f495c == aVar.f495c && this.f496d == aVar.f496d && this.f497e == aVar.f497e && this.f498f.equals(aVar.f498f) && this.g.equals(aVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int r22;
        int hashCode = (((((this.f494b.hashCode() ^ 1000003) * 1000003) ^ this.f495c) * 1000003) ^ this.f496d) * 1000003;
        if (this.f497e) {
            r22 = 1231;
        } else {
            r22 = 1237;
        }
        return ((((hashCode ^ r22) * (-721379959)) ^ this.f498f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f494b + ", inputFormat=" + this.f495c + ", outputFormat=" + this.f496d + ", virtualCamera=" + this.f497e + ", imageReaderProxyProvider=null, requestEdge=" + this.f498f + ", errorEdge=" + this.g + "}";
    }
}
