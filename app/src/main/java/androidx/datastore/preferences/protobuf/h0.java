package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final D f2354a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2355b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f2356c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2357d;

    public h0(D d4, String str, Object[] objArr) {
        this.f2354a = d4;
        this.f2355b = str;
        this.f2356c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2357d = charAt;
            return;
        }
        int r4 = charAt & 8191;
        int r02 = 1;
        int r12 = 13;
        while (true) {
            int r22 = r02 + 1;
            char charAt2 = str.charAt(r02);
            if (charAt2 >= 55296) {
                r4 |= (charAt2 & 8191) << r12;
                r12 += 13;
                r02 = r22;
            } else {
                this.f2357d = r4 | (charAt2 << r12);
                return;
            }
        }
    }

    public final AbstractC0098a a() {
        return this.f2354a;
    }

    public final Object[] b() {
        return this.f2356c;
    }

    public final String c() {
        return this.f2355b;
    }

    public final EnumC0107e0 d() {
        int r02 = this.f2357d;
        if ((r02 & 1) != 0) {
            return EnumC0107e0.PROTO2;
        }
        if ((r02 & 4) == 4) {
            return EnumC0107e0.EDITIONS;
        }
        return EnumC0107e0.PROTO3;
    }
}
