package x1;

import java.util.Arrays;

/* renamed from: x1.x4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0743x4 {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC0735w4 f6130a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f6131b;

    public /* synthetic */ C0743x4(C0727v4 c0727v4) {
        this.f6130a = (EnumC0735w4) c0727v4.f6108J;
        this.f6131b = (Integer) c0727v4.f6109K;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0743x4)) {
            return false;
        }
        C0743x4 c0743x4 = (C0743x4) obj;
        if (k1.w.h(this.f6130a, c0743x4.f6130a) && k1.w.h(this.f6131b, c0743x4.f6131b) && k1.w.h(null, null) && k1.w.h(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6130a, this.f6131b, null, null});
    }
}
