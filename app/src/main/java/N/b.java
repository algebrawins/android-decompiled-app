package N;

import android.opengl.EGLSurface;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final EGLSurface f872a;

    /* renamed from: b  reason: collision with root package name */
    public final int f873b;

    /* renamed from: c  reason: collision with root package name */
    public final int f874c;

    public b(EGLSurface eGLSurface, int r22, int r3) {
        if (eGLSurface != null) {
            this.f872a = eGLSurface;
            this.f873b = r22;
            this.f874c = r3;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f872a.equals(bVar.f872a) && this.f873b == bVar.f873b && this.f874c == bVar.f874c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f872a.hashCode() ^ 1000003) * 1000003) ^ this.f873b) * 1000003) ^ this.f874c;
    }

    public final String toString() {
        return "OutputSurface{eglSurface=" + this.f872a + ", width=" + this.f873b + ", height=" + this.f874c + "}";
    }
}
