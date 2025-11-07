package A0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new C0015q(0);

    /* renamed from: a  reason: collision with root package name */
    public int f153a;

    /* renamed from: b  reason: collision with root package name */
    public int f154b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f155c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r22) {
        parcel.writeInt(this.f153a);
        parcel.writeInt(this.f154b);
        parcel.writeInt(this.f155c ? 1 : 0);
    }
}
