package k1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class x extends AbstractC0347a {
    public static final Parcelable.Creator<x> CREATOR = new C0015q(19);

    /* renamed from: a  reason: collision with root package name */
    public final int f4085a;

    public x(int r12) {
        this.f4085a = r12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f4085a);
        G4.h(parcel, g);
    }
}
