package androidx.camera.core.impl;

import D.C0042x;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.impl.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078e {

    /* renamed from: a  reason: collision with root package name */
    public final D f2186a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2187b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2188c;

    /* renamed from: d  reason: collision with root package name */
    public final C0042x f2189d;

    public C0078e(D d4, List list, int r3, C0042x c0042x) {
        this.f2186a = d4;
        this.f2187b = list;
        this.f2188c = r3;
        this.f2189d = c0042x;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a1.i, java.lang.Object] */
    public static a1.i a(D d4) {
        ?? obj = new Object();
        if (d4 != null) {
            obj.f1832J = d4;
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                obj.f1833K = emptyList;
                obj.f1834L = -1;
                obj.f1835M = C0042x.f480d;
                return obj;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }
        throw new NullPointerException("Null surface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0078e)) {
            return false;
        }
        C0078e c0078e = (C0078e) obj;
        if (this.f2186a.equals(c0078e.f2186a) && this.f2187b.equals(c0078e.f2187b) && this.f2188c == c0078e.f2188c && this.f2189d.equals(c0078e.f2189d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f2186a.hashCode() ^ 1000003) * 1000003) ^ this.f2187b.hashCode()) * (-721379959)) ^ this.f2188c) * 1000003) ^ this.f2189d.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f2186a + ", sharedSurfaces=" + this.f2187b + ", physicalCameraId=null, surfaceGroupId=" + this.f2188c + ", dynamicRange=" + this.f2189d + "}";
    }
}
