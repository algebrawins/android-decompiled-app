package b1;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* renamed from: b1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145a {

    /* renamed from: f  reason: collision with root package name */
    public static final C0145a f2606f = new C0145a(10485760, 200, ModuleDescriptor.MODULE_VERSION, 604800000, 81920);

    /* renamed from: a  reason: collision with root package name */
    public final long f2607a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2608b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2609c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2610d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2611e;

    public C0145a(long j3, int r3, int r4, long j4, int r7) {
        this.f2607a = j3;
        this.f2608b = r3;
        this.f2609c = r4;
        this.f2610d = j4;
        this.f2611e = r7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0145a)) {
            return false;
        }
        C0145a c0145a = (C0145a) obj;
        if (this.f2607a == c0145a.f2607a && this.f2608b == c0145a.f2608b && this.f2609c == c0145a.f2609c && this.f2610d == c0145a.f2610d && this.f2611e == c0145a.f2611e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f2607a;
        long j4 = this.f2610d;
        return this.f2611e ^ ((((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f2608b) * 1000003) ^ this.f2609c) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003);
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f2607a + ", loadBatchSize=" + this.f2608b + ", criticalSectionEnterTimeoutMs=" + this.f2609c + ", eventCleanUpAge=" + this.f2610d + ", maxBlobByteSizePerRow=" + this.f2611e + "}";
    }
}
