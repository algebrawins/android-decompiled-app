package U0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a  reason: collision with root package name */
    public final long f1304a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1305b;

    /* renamed from: c  reason: collision with root package name */
    public final j f1306c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f1307d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1308e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f1309f;
    public final w g;

    public l(long j3, long j4, j jVar, Integer num, String str, ArrayList arrayList, w wVar) {
        this.f1304a = j3;
        this.f1305b = j4;
        this.f1306c = jVar;
        this.f1307d = num;
        this.f1308e = str;
        this.f1309f = arrayList;
        this.g = wVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f1304a == lVar.f1304a) {
            if (this.f1305b == lVar.f1305b) {
                if (this.f1306c.equals(lVar.f1306c)) {
                    Integer num = lVar.f1307d;
                    Integer num2 = this.f1307d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = lVar.f1308e;
                        String str2 = this.f1308e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f1309f.equals(lVar.f1309f)) {
                                w wVar = lVar.g;
                                w wVar2 = this.g;
                                if (wVar2 == null) {
                                    if (wVar == null) {
                                        return true;
                                    }
                                } else if (wVar2.equals(wVar)) {
                                    return true;
                                }
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
        long j3 = this.f1304a;
        long j4 = this.f1305b;
        int hashCode3 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f1306c.hashCode()) * 1000003;
        int r22 = 0;
        Integer num = this.f1307d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int r12 = (hashCode3 ^ hashCode) * 1000003;
        String str = this.f1308e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode4 = (((r12 ^ hashCode2) * 1000003) ^ this.f1309f.hashCode()) * 1000003;
        w wVar = this.g;
        if (wVar != null) {
            r22 = wVar.hashCode();
        }
        return hashCode4 ^ r22;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f1304a + ", requestUptimeMs=" + this.f1305b + ", clientInfo=" + this.f1306c + ", logSource=" + this.f1307d + ", logSourceName=" + this.f1308e + ", logEvents=" + this.f1309f + ", qosTier=" + this.g + "}";
    }
}
