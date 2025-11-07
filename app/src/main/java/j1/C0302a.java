package j1;

import h2.J;
import java.util.Arrays;

/* renamed from: j1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302a {

    /* renamed from: a  reason: collision with root package name */
    public final int f3786a;

    /* renamed from: b  reason: collision with root package name */
    public final J f3787b;

    /* renamed from: c  reason: collision with root package name */
    public final i1.b f3788c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3789d;

    public C0302a(J j3, i1.b bVar, String str) {
        this.f3787b = j3;
        this.f3788c = bVar;
        this.f3789d = str;
        this.f3786a = Arrays.hashCode(new Object[]{j3, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0302a)) {
            return false;
        }
        C0302a c0302a = (C0302a) obj;
        if (!k1.w.h(this.f3787b, c0302a.f3787b) || !k1.w.h(this.f3788c, c0302a.f3788c) || !k1.w.h(this.f3789d, c0302a.f3789d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3786a;
    }
}
