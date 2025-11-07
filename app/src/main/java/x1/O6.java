package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class O6 extends AbstractC0347a {
    public static final Parcelable.Creator<O6> CREATOR = new C0563a(10);

    /* renamed from: a  reason: collision with root package name */
    public final int f5692a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f5693b;

    public O6(int r12, String[] strArr) {
        this.f5692a = r12;
        this.f5693b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f5692a);
        G4.d(parcel, 2, this.f5693b);
        G4.h(parcel, g);
    }
}
