package D;

import android.graphics.Matrix;

/* renamed from: D.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027g implements U {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.camera.core.impl.h0 f390a;

    /* renamed from: b  reason: collision with root package name */
    public final long f391b;

    /* renamed from: c  reason: collision with root package name */
    public final int f392c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f393d;

    public C0027g(androidx.camera.core.impl.h0 h0Var, long j3, int r4, Matrix matrix) {
        if (h0Var != null) {
            this.f390a = h0Var;
            this.f391b = j3;
            this.f392c = r4;
            this.f393d = matrix;
            return;
        }
        throw new NullPointerException("Null tagBundle");
    }

    @Override // D.U
    public final androidx.camera.core.impl.h0 a() {
        return this.f390a;
    }

    @Override // D.U
    public final long c() {
        return this.f391b;
    }

    @Override // D.U
    public final int d() {
        return this.f392c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0027g)) {
            return false;
        }
        C0027g c0027g = (C0027g) obj;
        if (this.f390a.equals(c0027g.f390a) && this.f391b == c0027g.f391b && this.f392c == c0027g.f392c && this.f393d.equals(c0027g.f393d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f391b;
        return ((((((this.f390a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f392c) * 1000003) ^ this.f393d.hashCode();
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f390a + ", timestamp=" + this.f391b + ", rotationDegrees=" + this.f392c + ", sensorToBufferTransformMatrix=" + this.f393d + "}";
    }
}
