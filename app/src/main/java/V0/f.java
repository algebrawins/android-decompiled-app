package V0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final S0.b f1376a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f1377b;

    public f(S0.b bVar, byte[] bArr) {
        if (bVar != null) {
            if (bArr != null) {
                this.f1376a = bVar;
                this.f1377b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f1376a.equals(fVar.f1376a)) {
            return false;
        }
        return Arrays.equals(this.f1377b, fVar.f1377b);
    }

    public final int hashCode() {
        return ((this.f1376a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1377b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f1376a + ", bytes=[...]}";
    }
}
