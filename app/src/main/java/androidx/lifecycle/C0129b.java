package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129b {

    /* renamed from: a  reason: collision with root package name */
    public final int f2451a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f2452b;

    public C0129b(int r12, Method method) {
        this.f2451a = r12;
        this.f2452b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0129b)) {
            return false;
        }
        C0129b c0129b = (C0129b) obj;
        if (this.f2451a == c0129b.f2451a && this.f2452b.getName().equals(c0129b.f2452b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2452b.getName().hashCode() + (this.f2451a * 31);
    }
}
