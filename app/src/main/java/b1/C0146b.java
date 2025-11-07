package b1;

/* renamed from: b1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146b {

    /* renamed from: a  reason: collision with root package name */
    public final long f2612a;

    /* renamed from: b  reason: collision with root package name */
    public final V0.c f2613b;

    /* renamed from: c  reason: collision with root package name */
    public final V0.b f2614c;

    public C0146b(long j3, V0.c cVar, V0.b bVar) {
        this.f2612a = j3;
        this.f2613b = cVar;
        this.f2614c = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0146b)) {
            return false;
        }
        C0146b c0146b = (C0146b) obj;
        if (this.f2612a == c0146b.f2612a && this.f2613b.equals(c0146b.f2613b) && this.f2614c.equals(c0146b.f2614c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f2612a;
        return this.f2614c.hashCode() ^ ((((((int) ((j3 >>> 32) ^ j3)) ^ 1000003) * 1000003) ^ this.f2613b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f2612a + ", transportContext=" + this.f2613b + ", event=" + this.f2614c + "}";
    }
}
