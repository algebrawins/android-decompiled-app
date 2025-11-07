package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a  reason: collision with root package name */
    public final D f2805a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2806b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f2807c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2808d;

    public J0(D d4, String str, Object[] objArr) {
        this.f2805a = d4;
        this.f2806b = str;
        this.f2807c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f2808d = charAt;
            return;
        }
        int r4 = charAt & 8191;
        int r02 = 13;
        int r12 = 1;
        while (true) {
            int r22 = r12 + 1;
            char charAt2 = str.charAt(r12);
            if (charAt2 >= 55296) {
                r4 |= (charAt2 & 8191) << r02;
                r02 += 13;
                r12 = r22;
            } else {
                this.f2808d = r4 | (charAt2 << r02);
                return;
            }
        }
    }

    public final D a() {
        return this.f2805a;
    }

    public final int b() {
        return (this.f2808d & 1) != 0 ? 1 : 2;
    }

    public final String c() {
        return this.f2806b;
    }

    public final Object[] d() {
        return this.f2807c;
    }
}
