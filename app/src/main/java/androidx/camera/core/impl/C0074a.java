package androidx.camera.core.impl;

import D.C0042x;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import v.C0479a;

/* renamed from: androidx.camera.core.impl.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074a {

    /* renamed from: a  reason: collision with root package name */
    public final C0080g f2164a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2165b;

    /* renamed from: c  reason: collision with root package name */
    public final Size f2166c;

    /* renamed from: d  reason: collision with root package name */
    public final C0042x f2167d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f2168e;

    /* renamed from: f  reason: collision with root package name */
    public final C0479a f2169f;
    public final Range g;

    public C0074a(C0080g c0080g, int r22, Size size, C0042x c0042x, ArrayList arrayList, C0479a c0479a, Range range) {
        if (c0080g != null) {
            this.f2164a = c0080g;
            this.f2165b = r22;
            if (size != null) {
                this.f2166c = size;
                if (c0042x != null) {
                    this.f2167d = c0042x;
                    this.f2168e = arrayList;
                    this.f2169f = c0479a;
                    this.g = range;
                    return;
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0074a)) {
            return false;
        }
        C0074a c0074a = (C0074a) obj;
        if (this.f2164a.equals(c0074a.f2164a) && this.f2165b == c0074a.f2165b && this.f2166c.equals(c0074a.f2166c) && this.f2167d.equals(c0074a.f2167d) && this.f2168e.equals(c0074a.f2168e)) {
            C0479a c0479a = c0074a.f2169f;
            C0479a c0479a2 = this.f2169f;
            if (c0479a2 != null ? c0479a2.equals(c0479a) : c0479a == null) {
                Range range = c0074a.g;
                Range range2 = this.g;
                if (range2 == null) {
                    if (range == null) {
                        return true;
                    }
                } else if (range2.equals(range)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((this.f2164a.hashCode() ^ 1000003) * 1000003) ^ this.f2165b) * 1000003) ^ this.f2166c.hashCode()) * 1000003) ^ this.f2167d.hashCode()) * 1000003) ^ this.f2168e.hashCode()) * 1000003;
        int r22 = 0;
        C0479a c0479a = this.f2169f;
        if (c0479a == null) {
            hashCode = 0;
        } else {
            hashCode = c0479a.hashCode();
        }
        int r02 = (hashCode2 ^ hashCode) * 1000003;
        Range range = this.g;
        if (range != null) {
            r22 = range.hashCode();
        }
        return r02 ^ r22;
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f2164a + ", imageFormat=" + this.f2165b + ", size=" + this.f2166c + ", dynamicRange=" + this.f2167d + ", captureTypes=" + this.f2168e + ", implementationOptions=" + this.f2169f + ", targetFrameRate=" + this.g + "}";
    }
}
