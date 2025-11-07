package androidx.versionedparcelable;

import A0.C0015q;
import F0.b;
import F0.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0015q(7);

    /* renamed from: a  reason: collision with root package name */
    public final c f2585a;

    public ParcelImpl(Parcel parcel) {
        this.f2585a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r22) {
        new b(parcel).i(this.f2585a);
    }
}
