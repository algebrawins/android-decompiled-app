package V0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f1362a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f1363b;

    /* renamed from: c  reason: collision with root package name */
    public final f f1364c;

    /* renamed from: d  reason: collision with root package name */
    public final long f1365d;

    /* renamed from: e  reason: collision with root package name */
    public final long f1366e;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f1367f;

    public b(String str, Integer num, f fVar, long j3, long j4, HashMap hashMap) {
        this.f1362a = str;
        this.f1363b = num;
        this.f1364c = fVar;
        this.f1365d = j3;
        this.f1366e = j4;
        this.f1367f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f1367f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f1367f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, V0.a] */
    public final a c() {
        ?? obj = new Object();
        String str = this.f1362a;
        if (str != null) {
            obj.f1356J = str;
            obj.f1357K = this.f1363b;
            f fVar = this.f1364c;
            if (fVar != null) {
                obj.f1358L = fVar;
                obj.f1359M = Long.valueOf(this.f1365d);
                obj.f1360N = Long.valueOf(this.f1366e);
                obj.f1361O = new HashMap(this.f1367f);
                return obj;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1362a.equals(bVar.f1362a)) {
            Integer num = bVar.f1363b;
            Integer num2 = this.f1363b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f1364c.equals(bVar.f1364c) && this.f1365d == bVar.f1365d && this.f1366e == bVar.f1366e && this.f1367f.equals(bVar.f1367f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f1362a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f1363b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j3 = this.f1365d;
        long j4 = this.f1366e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f1364c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f1367f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f1362a + ", code=" + this.f1363b + ", encodedPayload=" + this.f1364c + ", eventMillis=" + this.f1365d + ", uptimeMillis=" + this.f1366e + ", autoMetadata=" + this.f1367f + "}";
    }
}
