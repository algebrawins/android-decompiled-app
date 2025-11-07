package k1;

import A0.C0015q;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class p extends AbstractC0347a {
    public static final Parcelable.Creator<p> CREATOR = new C0015q(16);

    /* renamed from: a  reason: collision with root package name */
    public final int f4066a;

    /* renamed from: b  reason: collision with root package name */
    public final Account f4067b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4068c;

    /* renamed from: d  reason: collision with root package name */
    public final GoogleSignInAccount f4069d;

    public p(int r12, Account account, int r3, GoogleSignInAccount googleSignInAccount) {
        this.f4066a = r12;
        this.f4067b = account;
        this.f4068c = r3;
        this.f4069d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f4066a);
        G4.b(parcel, 2, this.f4067b, r6);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f4068c);
        G4.b(parcel, 4, this.f4069d, r6);
        G4.h(parcel, g);
    }
}
