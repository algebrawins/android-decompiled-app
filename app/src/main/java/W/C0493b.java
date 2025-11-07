package w;

import android.util.Size;

/* renamed from: w.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493b {

    /* renamed from: a  reason: collision with root package name */
    public final String f5122a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f5123b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.camera.core.impl.c0 f5124c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.camera.core.impl.k0 f5125d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f5126e;

    public C0493b(String str, Class cls, androidx.camera.core.impl.c0 c0Var, androidx.camera.core.impl.k0 k0Var, Size size) {
        if (str != null) {
            this.f5122a = str;
            this.f5123b = cls;
            if (c0Var != null) {
                this.f5124c = c0Var;
                if (k0Var != null) {
                    this.f5125d = k0Var;
                    this.f5126e = size;
                    return;
                }
                throw new NullPointerException("Null useCaseConfig");
            }
            throw new NullPointerException("Null sessionConfig");
        }
        throw new NullPointerException("Null useCaseId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0493b)) {
            return false;
        }
        C0493b c0493b = (C0493b) obj;
        if (this.f5122a.equals(c0493b.f5122a) && this.f5123b.equals(c0493b.f5123b) && this.f5124c.equals(c0493b.f5124c) && this.f5125d.equals(c0493b.f5125d)) {
            Size size = c0493b.f5126e;
            Size size2 = this.f5126e;
            if (size2 == null) {
                if (size == null) {
                    return true;
                }
            } else if (size2.equals(size)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f5122a.hashCode() ^ 1000003) * 1000003) ^ this.f5123b.hashCode()) * 1000003) ^ this.f5124c.hashCode()) * 1000003) ^ this.f5125d.hashCode()) * 1000003;
        Size size = this.f5126e;
        if (size == null) {
            hashCode = 0;
        } else {
            hashCode = size.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.f5122a + ", useCaseType=" + this.f5123b + ", sessionConfig=" + this.f5124c + ", useCaseConfig=" + this.f5125d + ", surfaceResolution=" + this.f5126e + "}";
    }
}
