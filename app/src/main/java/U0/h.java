package U0;

import D.C;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f1284a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1285b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1286c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1287d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1288e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1289f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1290h;

    /* renamed from: i  reason: collision with root package name */
    public final String f1291i;

    /* renamed from: j  reason: collision with root package name */
    public final String f1292j;

    /* renamed from: k  reason: collision with root package name */
    public final String f1293k;

    /* renamed from: l  reason: collision with root package name */
    public final String f1294l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f1284a = num;
        this.f1285b = str;
        this.f1286c = str2;
        this.f1287d = str3;
        this.f1288e = str4;
        this.f1289f = str5;
        this.g = str6;
        this.f1290h = str7;
        this.f1291i = str8;
        this.f1292j = str9;
        this.f1293k = str10;
        this.f1294l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f1284a;
        if (num != null ? num.equals(((h) aVar).f1284a) : ((h) aVar).f1284a == null) {
            String str = this.f1285b;
            if (str != null ? str.equals(((h) aVar).f1285b) : ((h) aVar).f1285b == null) {
                String str2 = this.f1286c;
                if (str2 != null ? str2.equals(((h) aVar).f1286c) : ((h) aVar).f1286c == null) {
                    String str3 = this.f1287d;
                    if (str3 != null ? str3.equals(((h) aVar).f1287d) : ((h) aVar).f1287d == null) {
                        String str4 = this.f1288e;
                        if (str4 != null ? str4.equals(((h) aVar).f1288e) : ((h) aVar).f1288e == null) {
                            String str5 = this.f1289f;
                            if (str5 != null ? str5.equals(((h) aVar).f1289f) : ((h) aVar).f1289f == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(((h) aVar).g) : ((h) aVar).g == null) {
                                    String str7 = this.f1290h;
                                    if (str7 != null ? str7.equals(((h) aVar).f1290h) : ((h) aVar).f1290h == null) {
                                        String str8 = this.f1291i;
                                        if (str8 != null ? str8.equals(((h) aVar).f1291i) : ((h) aVar).f1291i == null) {
                                            String str9 = this.f1292j;
                                            if (str9 != null ? str9.equals(((h) aVar).f1292j) : ((h) aVar).f1292j == null) {
                                                String str10 = this.f1293k;
                                                if (str10 != null ? str10.equals(((h) aVar).f1293k) : ((h) aVar).f1293k == null) {
                                                    String str11 = this.f1294l;
                                                    if (str11 == null) {
                                                        if (((h) aVar).f1294l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((h) aVar).f1294l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int r02 = 0;
        Integer num = this.f1284a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int r12 = (hashCode ^ 1000003) * 1000003;
        String str = this.f1285b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int r13 = (r12 ^ hashCode2) * 1000003;
        String str2 = this.f1286c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int r14 = (r13 ^ hashCode3) * 1000003;
        String str3 = this.f1287d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int r15 = (r14 ^ hashCode4) * 1000003;
        String str4 = this.f1288e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int r16 = (r15 ^ hashCode5) * 1000003;
        String str5 = this.f1289f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int r17 = (r16 ^ hashCode6) * 1000003;
        String str6 = this.g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int r18 = (r17 ^ hashCode7) * 1000003;
        String str7 = this.f1290h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int r19 = (r18 ^ hashCode8) * 1000003;
        String str8 = this.f1291i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int r110 = (r19 ^ hashCode9) * 1000003;
        String str9 = this.f1292j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int r111 = (r110 ^ hashCode10) * 1000003;
        String str10 = this.f1293k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int r112 = (r111 ^ hashCode11) * 1000003;
        String str11 = this.f1294l;
        if (str11 != null) {
            r02 = str11.hashCode();
        }
        return r02 ^ r112;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f1284a);
        sb.append(", model=");
        sb.append(this.f1285b);
        sb.append(", hardware=");
        sb.append(this.f1286c);
        sb.append(", device=");
        sb.append(this.f1287d);
        sb.append(", product=");
        sb.append(this.f1288e);
        sb.append(", osBuild=");
        sb.append(this.f1289f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.f1290h);
        sb.append(", locale=");
        sb.append(this.f1291i);
        sb.append(", country=");
        sb.append(this.f1292j);
        sb.append(", mccMnc=");
        sb.append(this.f1293k);
        sb.append(", applicationBuild=");
        return C.z(sb, this.f1294l, "}");
    }
}
