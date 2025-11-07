package U0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a  reason: collision with root package name */
    public final long f1298a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f1299b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1300c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f1301d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1302e;

    /* renamed from: f  reason: collision with root package name */
    public final long f1303f;
    public final n g;

    public k(long j3, Integer num, long j4, byte[] bArr, String str, long j5, n nVar) {
        this.f1298a = j3;
        this.f1299b = num;
        this.f1300c = j4;
        this.f1301d = bArr;
        this.f1302e = str;
        this.f1303f = j5;
        this.g = nVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f1298a == kVar.f1298a && ((num = this.f1299b) != null ? num.equals(kVar.f1299b) : kVar.f1299b == null)) {
            if (this.f1300c == kVar.f1300c) {
                if (rVar instanceof k) {
                    bArr = ((k) rVar).f1301d;
                } else {
                    bArr = kVar.f1301d;
                }
                if (Arrays.equals(this.f1301d, bArr)) {
                    String str = kVar.f1302e;
                    String str2 = this.f1302e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f1303f == kVar.f1303f) {
                            n nVar = kVar.g;
                            n nVar2 = this.g;
                            if (nVar2 == null) {
                                if (nVar == null) {
                                    return true;
                                }
                            } else if (nVar2.equals(nVar)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j3 = this.f1298a;
        int r12 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        int r3 = 0;
        Integer num = this.f1299b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j4 = this.f1300c;
        int hashCode3 = (((((r12 ^ hashCode) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f1301d)) * 1000003;
        String str = this.f1302e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j5 = this.f1303f;
        int r13 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        n nVar = this.g;
        if (nVar != null) {
            r3 = nVar.hashCode();
        }
        return r13 ^ r3;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f1298a + ", eventCode=" + this.f1299b + ", eventUptimeMs=" + this.f1300c + ", sourceExtension=" + Arrays.toString(this.f1301d) + ", sourceExtensionJsonProto3=" + this.f1302e + ", timezoneOffsetSeconds=" + this.f1303f + ", networkConnectionInfo=" + this.g + "}";
    }
}
