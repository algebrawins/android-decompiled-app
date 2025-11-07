package D;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: D.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042x {

    /* renamed from: c  reason: collision with root package name */
    public static final C0042x f479c = new C0042x(0, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final C0042x f480d = new C0042x(1, 8);

    /* renamed from: e  reason: collision with root package name */
    public static final C0042x f481e = new C0042x(3, 10);

    /* renamed from: f  reason: collision with root package name */
    public static final C0042x f482f = new C0042x(4, 10);
    public static final C0042x g = new C0042x(5, 10);

    /* renamed from: h  reason: collision with root package name */
    public static final C0042x f483h = new C0042x(6, 10);

    /* renamed from: i  reason: collision with root package name */
    public static final C0042x f484i = new C0042x(6, 8);

    /* renamed from: a  reason: collision with root package name */
    public final int f485a;

    /* renamed from: b  reason: collision with root package name */
    public final int f486b;

    public C0042x(int r12, int r22) {
        this.f485a = r12;
        this.f486b = r22;
    }

    public final boolean a() {
        if (b() && this.f485a != 1 && this.f486b == 10) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        int r02 = this.f485a;
        if (r02 != 0 && r02 != 2 && this.f486b != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0042x)) {
            return false;
        }
        C0042x c0042x = (C0042x) obj;
        if (this.f485a == c0042x.f485a && this.f486b == c0042x.f486b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f486b ^ ((this.f485a ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.f485a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                str = "HDR10_PLUS";
                break;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        sb.append(this.f486b);
        sb.append("}");
        return sb.toString();
    }
}
