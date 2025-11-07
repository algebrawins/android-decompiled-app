package com.google.android.gms.common.api;

import A0.C0015q;
import D.C;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h1.C0281a;
import h2.J;
import java.util.Arrays;
import k1.w;
import l1.AbstractC0347a;
import q0.k;
import x1.G4;

/* loaded from: classes.dex */
public final class Status extends AbstractC0347a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C0015q(12);

    /* renamed from: a  reason: collision with root package name */
    public final int f2726a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2727b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2728c;

    /* renamed from: d  reason: collision with root package name */
    public final PendingIntent f2729d;

    /* renamed from: e  reason: collision with root package name */
    public final C0281a f2730e;

    public Status(int r12, int r22, String str, PendingIntent pendingIntent, C0281a c0281a) {
        this.f2726a = r12;
        this.f2727b = r22;
        this.f2728c = str;
        this.f2729d = pendingIntent;
        this.f2730e = c0281a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f2726a != status.f2726a || this.f2727b != status.f2727b || !w.h(this.f2728c, status.f2728c) || !w.h(this.f2729d, status.f2729d) || !w.h(this.f2730e, status.f2730e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2726a), Integer.valueOf(this.f2727b), this.f2728c, this.f2729d, this.f2730e});
    }

    public final String toString() {
        J j3 = new J(this);
        String str = this.f2728c;
        if (str == null) {
            int r12 = this.f2727b;
            switch (r12) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = C.w("unknown status code: ", r12);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case k.STRING_FIELD_NUMBER /* 5 */:
                    str = "INVALID_ACCOUNT";
                    break;
                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        j3.n(str, "statusCode");
        j3.n(this.f2729d, "resolution");
        return j3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f2727b);
        G4.c(parcel, 2, this.f2728c);
        G4.b(parcel, 3, this.f2729d, r6);
        G4.b(parcel, 4, this.f2730e, r6);
        G4.i(parcel, 1000, 4);
        parcel.writeInt(this.f2726a);
        G4.h(parcel, g);
    }

    public Status(String str, int r8) {
        this(1, r8, str, null, null);
    }
}
