package androidx.camera.core.impl;

import D.C0042x;
import android.util.Range;
import android.util.Size;
import v.C0479a;

/* renamed from: androidx.camera.core.impl.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079f {

    /* renamed from: e  reason: collision with root package name */
    public static final Range f2191e = new Range(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final Size f2192a;

    /* renamed from: b  reason: collision with root package name */
    public final C0042x f2193b;

    /* renamed from: c  reason: collision with root package name */
    public final Range f2194c;

    /* renamed from: d  reason: collision with root package name */
    public final C0479a f2195d;

    public C0079f(Size size, C0042x c0042x, Range range, C0479a c0479a) {
        this.f2192a = size;
        this.f2193b = c0042x;
        this.f2194c = range;
        this.f2195d = c0479a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a1.i, java.lang.Object] */
    public final a1.i a() {
        ?? obj = new Object();
        obj.f1832J = this.f2192a;
        obj.f1833K = this.f2193b;
        obj.f1834L = this.f2194c;
        obj.f1835M = this.f2195d;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0079f)) {
            return false;
        }
        C0079f c0079f = (C0079f) obj;
        if (this.f2192a.equals(c0079f.f2192a) && this.f2193b.equals(c0079f.f2193b) && this.f2194c.equals(c0079f.f2194c)) {
            C0479a c0479a = c0079f.f2195d;
            C0479a c0479a2 = this.f2195d;
            if (c0479a2 == null) {
                if (c0479a == null) {
                    return true;
                }
            } else if (c0479a2.equals(c0479a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((this.f2192a.hashCode() ^ 1000003) * 1000003) ^ this.f2193b.hashCode()) * 1000003) ^ this.f2194c.hashCode()) * 1000003;
        C0479a c0479a = this.f2195d;
        if (c0479a == null) {
            hashCode = 0;
        } else {
            hashCode = c0479a.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.f2192a + ", dynamicRange=" + this.f2193b + ", expectedFrameRateRange=" + this.f2194c + ", implementationOptions=" + this.f2195d + "}";
    }
}
