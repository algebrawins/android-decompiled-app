package a1;

import d1.InterfaceC0232a;
import java.util.HashMap;

/* renamed from: a1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071b {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0232a f1810a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1811b;

    public C0071b(InterfaceC0232a interfaceC0232a, HashMap hashMap) {
        this.f1810a = interfaceC0232a;
        this.f1811b = hashMap;
    }

    public final long a(S0.c cVar, long j3, int r12) {
        long j4;
        long c4 = j3 - this.f1810a.c();
        C0072c c0072c = (C0072c) this.f1811b.get(cVar);
        long j5 = c0072c.f1812a;
        int r122 = r12 - 1;
        if (j5 > 1) {
            j4 = j5;
        } else {
            j4 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, r122) * j5 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j4 * r122))), c4), c0072c.f1813b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0071b)) {
            return false;
        }
        C0071b c0071b = (C0071b) obj;
        if (this.f1810a.equals(c0071b.f1810a) && this.f1811b.equals(c0071b.f1811b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1810a.hashCode() ^ 1000003) * 1000003) ^ this.f1811b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f1810a + ", values=" + this.f1811b + "}";
    }
}
