package y;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f6178a;

    /* renamed from: b  reason: collision with root package name */
    public long f6179b = 1;

    public n(OutputConfiguration outputConfiguration) {
        this.f6178a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!Objects.equals(this.f6178a, nVar.f6178a) || this.f6179b != nVar.f6179b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f6178a.hashCode() ^ 31;
        int r12 = (hashCode << 5) - hashCode;
        long j3 = this.f6179b;
        return ((int) (j3 ^ (j3 >>> 32))) ^ r12;
    }
}
