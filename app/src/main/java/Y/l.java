package y;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f6175a;

    /* renamed from: b  reason: collision with root package name */
    public String f6176b;

    /* renamed from: c  reason: collision with root package name */
    public long f6177c = 1;

    public l(OutputConfiguration outputConfiguration) {
        this.f6175a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!Objects.equals(this.f6175a, lVar.f6175a) || this.f6177c != lVar.f6177c || !Objects.equals(this.f6176b, lVar.f6176b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f6175a.hashCode() ^ 31;
        int r12 = (hashCode2 << 5) - hashCode2;
        String str = this.f6176b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int r02 = hashCode ^ r12;
        int r13 = (r02 << 5) - r02;
        long j3 = this.f6177c;
        return ((int) (j3 ^ (j3 >>> 32))) ^ r13;
    }
}
