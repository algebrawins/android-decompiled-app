package I;

import D.s0;

/* loaded from: classes.dex */
public final class a implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final float f742a;

    /* renamed from: b  reason: collision with root package name */
    public final float f743b;

    /* renamed from: c  reason: collision with root package name */
    public final float f744c;

    /* renamed from: d  reason: collision with root package name */
    public final float f745d;

    public a(float f2, float f4, float f5, float f6) {
        this.f742a = f2;
        this.f743b = f4;
        this.f744c = f5;
        this.f745d = f6;
    }

    public static a e(s0 s0Var) {
        return new a(s0Var.b(), s0Var.a(), s0Var.d(), s0Var.c());
    }

    @Override // D.s0
    public final float a() {
        return this.f743b;
    }

    @Override // D.s0
    public final float b() {
        return this.f742a;
    }

    @Override // D.s0
    public final float c() {
        return this.f745d;
    }

    @Override // D.s0
    public final float d() {
        return this.f744c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Float.floatToIntBits(this.f742a) == Float.floatToIntBits(aVar.f742a) && Float.floatToIntBits(this.f743b) == Float.floatToIntBits(aVar.f743b) && Float.floatToIntBits(this.f744c) == Float.floatToIntBits(aVar.f744c) && Float.floatToIntBits(this.f745d) == Float.floatToIntBits(aVar.f745d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f742a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f743b)) * 1000003) ^ Float.floatToIntBits(this.f744c)) * 1000003) ^ Float.floatToIntBits(this.f745d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f742a + ", maxZoomRatio=" + this.f743b + ", minZoomRatio=" + this.f744c + ", linearZoom=" + this.f745d + "}";
    }
}
