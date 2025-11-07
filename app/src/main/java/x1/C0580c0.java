package x1;

import java.util.Arrays;

/* renamed from: x1.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580c0 {

    /* renamed from: a  reason: collision with root package name */
    public final N4 f5856a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f5857b;

    /* renamed from: c  reason: collision with root package name */
    public final B6 f5858c;

    /* renamed from: d  reason: collision with root package name */
    public final G f5859d;

    /* renamed from: e  reason: collision with root package name */
    public final G f5860e;

    public /* synthetic */ C0580c0(E.c cVar) {
        this.f5856a = (N4) cVar.f502K;
        this.f5857b = (Boolean) cVar.f503L;
        this.f5858c = (B6) cVar.f504M;
        this.f5859d = (G) cVar.f505N;
        this.f5860e = (G) cVar.f506O;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0580c0)) {
            return false;
        }
        C0580c0 c0580c0 = (C0580c0) obj;
        if (k1.w.h(this.f5856a, c0580c0.f5856a) && k1.w.h(null, null) && k1.w.h(this.f5857b, c0580c0.f5857b) && k1.w.h(null, null) && k1.w.h(this.f5858c, c0580c0.f5858c) && k1.w.h(this.f5859d, c0580c0.f5859d) && k1.w.h(this.f5860e, c0580c0.f5860e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5856a, null, this.f5857b, null, this.f5858c, this.f5859d, this.f5860e});
    }
}
