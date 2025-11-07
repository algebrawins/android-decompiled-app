package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class U6 extends AbstractC0347a {
    public static final Parcelable.Creator<U6> CREATOR = new C0563a(18);

    /* renamed from: a  reason: collision with root package name */
    public final double f5774a;

    /* renamed from: b  reason: collision with root package name */
    public final double f5775b;

    public U6(double d4, double d5) {
        this.f5774a = d4;
        this.f5775b = d5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 8);
        parcel.writeDouble(this.f5774a);
        G4.i(parcel, 2, 8);
        parcel.writeDouble(this.f5775b);
        G4.h(parcel, g);
    }
}
