package h1;

import A0.C0015q;
import D.C;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h2.J;
import java.util.Arrays;
import k1.w;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: h1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281a extends AbstractC0347a {

    /* renamed from: a  reason: collision with root package name */
    public final int f3249a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3250b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f3251c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3252d;

    /* renamed from: e  reason: collision with root package name */
    public static final C0281a f3248e = new C0281a(0);
    public static final Parcelable.Creator<C0281a> CREATOR = new C0015q(9);

    public C0281a(int r12, int r22, PendingIntent pendingIntent, String str) {
        this.f3249a = r12;
        this.f3250b = r22;
        this.f3251c = pendingIntent;
        this.f3252d = str;
    }

    public static String a(int r22) {
        if (r22 != 99) {
            if (r22 != 1500) {
                switch (r22) {
                    case -1:
                        return "UNKNOWN";
                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case q0.k.STRING_FIELD_NUMBER /* 5 */:
                        return "INVALID_ACCOUNT";
                    case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        return "RESOLUTION_REQUIRED";
                    case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (r22) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                return C.v(r22, "UNKNOWN_ERROR_CODE(", ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0281a)) {
            return false;
        }
        C0281a c0281a = (C0281a) obj;
        if (this.f3250b == c0281a.f3250b && w.h(this.f3251c, c0281a.f3251c) && w.h(this.f3252d, c0281a.f3252d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3250b), this.f3251c, this.f3252d});
    }

    public final String toString() {
        J j3 = new J(this);
        j3.n(a(this.f3250b), "statusCode");
        j3.n(this.f3251c, "resolution");
        j3.n(this.f3252d, "message");
        return j3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f3249a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f3250b);
        G4.b(parcel, 3, this.f3251c, r6);
        G4.c(parcel, 4, this.f3252d);
        G4.h(parcel, g);
    }

    public C0281a(int r3) {
        this(1, r3, null, null);
    }

    public C0281a(int r3, PendingIntent pendingIntent) {
        this(1, r3, pendingIntent, null);
    }
}
