package y;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* renamed from: y.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781j {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f6171a;

    /* renamed from: b  reason: collision with root package name */
    public String f6172b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6173c;

    /* renamed from: d  reason: collision with root package name */
    public long f6174d = 1;

    public C0781j(OutputConfiguration outputConfiguration) {
        this.f6171a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0781j)) {
            return false;
        }
        C0781j c0781j = (C0781j) obj;
        if (!Objects.equals(this.f6171a, c0781j.f6171a) || this.f6173c != c0781j.f6173c || this.f6174d != c0781j.f6174d || !Objects.equals(this.f6172b, c0781j.f6172b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f6171a.hashCode() ^ 31;
        int r02 = (this.f6173c ? 1 : 0) ^ ((hashCode2 << 5) - hashCode2);
        int r12 = (r02 << 5) - r02;
        String str = this.f6172b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int r03 = hashCode ^ r12;
        int r13 = (r03 << 5) - r03;
        long j3 = this.f6174d;
        return ((int) (j3 ^ (j3 >>> 32))) ^ r13;
    }
}
