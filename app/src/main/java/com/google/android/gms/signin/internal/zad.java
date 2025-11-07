package com.google.android.gms.signin.internal;

import B1.b;
import B1.c;
import B1.e;
import B1.g;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import h1.C0281a;
import q0.k;
import u1.AbstractC0474b;

/* loaded from: classes.dex */
public abstract class zad extends zab implements c {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean v0(int r12, Parcel parcel, Parcel parcel2) {
        switch (r12) {
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                C0281a c0281a = (C0281a) AbstractC0474b.a(parcel, C0281a.CREATOR);
                b bVar = (b) AbstractC0474b.a(parcel, b.CREATOR);
                AbstractC0474b.b(parcel);
                break;
            case 4:
                Status status = (Status) AbstractC0474b.a(parcel, Status.CREATOR);
                AbstractC0474b.b(parcel);
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
            default:
                return false;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                Status status2 = (Status) AbstractC0474b.a(parcel, Status.CREATOR);
                AbstractC0474b.b(parcel);
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                Status status3 = (Status) AbstractC0474b.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) AbstractC0474b.a(parcel, GoogleSignInAccount.CREATOR);
                AbstractC0474b.b(parcel);
                break;
            case 8:
                AbstractC0474b.b(parcel);
                l0((g) AbstractC0474b.a(parcel, g.CREATOR));
                break;
            case 9:
                e eVar = (e) AbstractC0474b.a(parcel, e.CREATOR);
                AbstractC0474b.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
