package androidx.camera.core.impl;

import android.util.Size;
import java.util.HashMap;

/* renamed from: androidx.camera.core.impl.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081h {

    /* renamed from: a  reason: collision with root package name */
    public final Size f2199a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2200b;

    /* renamed from: c  reason: collision with root package name */
    public final Size f2201c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f2202d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f2203e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f2204f;
    public final HashMap g;

    public C0081h(Size size, HashMap hashMap, Size size2, HashMap hashMap2, Size size3, HashMap hashMap3, HashMap hashMap4) {
        if (size != null) {
            this.f2199a = size;
            this.f2200b = hashMap;
            if (size2 != null) {
                this.f2201c = size2;
                this.f2202d = hashMap2;
                if (size3 != null) {
                    this.f2203e = size3;
                    this.f2204f = hashMap3;
                    this.g = hashMap4;
                    return;
                }
                throw new NullPointerException("Null recordSize");
            }
            throw new NullPointerException("Null previewSize");
        }
        throw new NullPointerException("Null analysisSize");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0081h)) {
            return false;
        }
        C0081h c0081h = (C0081h) obj;
        if (this.f2199a.equals(c0081h.f2199a) && this.f2200b.equals(c0081h.f2200b) && this.f2201c.equals(c0081h.f2201c) && this.f2202d.equals(c0081h.f2202d) && this.f2203e.equals(c0081h.f2203e) && this.f2204f.equals(c0081h.f2204f) && this.g.equals(c0081h.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f2199a.hashCode() ^ 1000003) * 1000003) ^ this.f2200b.hashCode()) * 1000003) ^ this.f2201c.hashCode()) * 1000003) ^ this.f2202d.hashCode()) * 1000003) ^ this.f2203e.hashCode()) * 1000003) ^ this.f2204f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f2199a + ", s720pSizeMap=" + this.f2200b + ", previewSize=" + this.f2201c + ", s1440pSizeMap=" + this.f2202d + ", recordSize=" + this.f2203e + ", maximumSizeMap=" + this.f2204f + ", ultraMaximumSizeMap=" + this.g + "}";
    }
}
