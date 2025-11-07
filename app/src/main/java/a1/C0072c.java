package a1;

import java.util.Set;

/* renamed from: a1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072c {

    /* renamed from: a  reason: collision with root package name */
    public final long f1812a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1813b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f1814c;

    public C0072c(long j3, long j4, Set set) {
        this.f1812a = j3;
        this.f1813b = j4;
        this.f1814c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0072c)) {
            return false;
        }
        C0072c c0072c = (C0072c) obj;
        if (this.f1812a == c0072c.f1812a && this.f1813b == c0072c.f1813b && this.f1814c.equals(c0072c.f1814c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f1812a;
        long j4 = this.f1813b;
        return this.f1814c.hashCode() ^ ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f1812a + ", maxAllowedDelay=" + this.f1813b + ", flags=" + this.f1814c + "}";
    }
}
