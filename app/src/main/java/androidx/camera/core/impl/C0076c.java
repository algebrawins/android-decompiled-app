package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;

/* renamed from: androidx.camera.core.impl.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076c {

    /* renamed from: a  reason: collision with root package name */
    public final String f2176a;

    /* renamed from: b  reason: collision with root package name */
    public final Class f2177b;

    /* renamed from: c  reason: collision with root package name */
    public final CaptureRequest.Key f2178c;

    public C0076c(String str, Class cls, CaptureRequest.Key key) {
        if (str != null) {
            this.f2176a = str;
            if (cls != null) {
                this.f2177b = cls;
                this.f2178c = key;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0076c)) {
            return false;
        }
        C0076c c0076c = (C0076c) obj;
        if (this.f2176a.equals(c0076c.f2176a) && this.f2177b.equals(c0076c.f2177b)) {
            CaptureRequest.Key key = c0076c.f2178c;
            CaptureRequest.Key key2 = this.f2178c;
            if (key2 == null) {
                if (key == null) {
                    return true;
                }
            } else if (key2.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f2176a.hashCode() ^ 1000003) * 1000003) ^ this.f2177b.hashCode()) * 1000003;
        CaptureRequest.Key key = this.f2178c;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "Option{id=" + this.f2176a + ", valueClass=" + this.f2177b + ", token=" + this.f2178c + "}";
    }
}
