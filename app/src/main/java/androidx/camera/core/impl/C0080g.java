package androidx.camera.core.impl;

import android.util.Size;

/* renamed from: androidx.camera.core.impl.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080g {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f2196a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f2197b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2198c;

    public C0080g(g0 g0Var, f0 f0Var, long j3) {
        if (g0Var != null) {
            this.f2196a = g0Var;
            if (f0Var != null) {
                this.f2197b = f0Var;
                this.f2198c = j3;
                return;
            }
            throw new NullPointerException("Null configSize");
        }
        throw new NullPointerException("Null configType");
    }

    public static C0080g a(g0 g0Var, f0 f0Var) {
        return new C0080g(g0Var, f0Var, 0L);
    }

    public static C0080g b(int r3, int r4, Size size, C0081h c0081h) {
        g0 g0Var;
        if (r4 == 35) {
            g0Var = g0.YUV;
        } else if (r4 == 256) {
            g0Var = g0.JPEG;
        } else if (r4 == 32) {
            g0Var = g0.RAW;
        } else {
            g0Var = g0.PRIV;
        }
        f0 f0Var = f0.NOT_SUPPORT;
        int a4 = M.a.a(size);
        if (r3 == 1) {
            if (a4 <= M.a.a((Size) c0081h.f2200b.get(Integer.valueOf(r4)))) {
                f0Var = f0.s720p;
            } else {
                if (a4 <= M.a.a((Size) c0081h.f2202d.get(Integer.valueOf(r4)))) {
                    f0Var = f0.s1440p;
                }
            }
        } else if (a4 <= M.a.a(c0081h.f2199a)) {
            f0Var = f0.VGA;
        } else if (a4 <= M.a.a(c0081h.f2201c)) {
            f0Var = f0.PREVIEW;
        } else if (a4 <= M.a.a(c0081h.f2203e)) {
            f0Var = f0.RECORD;
        } else {
            if (a4 <= M.a.a((Size) c0081h.f2204f.get(Integer.valueOf(r4)))) {
                f0Var = f0.MAXIMUM;
            } else {
                Size size2 = (Size) c0081h.g.get(Integer.valueOf(r4));
                if (size2 != null) {
                    if (a4 <= size2.getHeight() * size2.getWidth()) {
                        f0Var = f0.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return a(g0Var, f0Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0080g)) {
            return false;
        }
        C0080g c0080g = (C0080g) obj;
        if (this.f2196a.equals(c0080g.f2196a) && this.f2197b.equals(c0080g.f2197b) && this.f2198c == c0080g.f2198c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f2198c;
        return ((((this.f2196a.hashCode() ^ 1000003) * 1000003) ^ this.f2197b.hashCode()) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        return "SurfaceConfig{configType=" + this.f2196a + ", configSize=" + this.f2197b + ", streamUseCase=" + this.f2198c + "}";
    }
}
