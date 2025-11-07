package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class J3 extends AbstractC0347a {
    public static final Parcelable.Creator<J3> CREATOR = new C0563a(0);

    /* renamed from: a  reason: collision with root package name */
    public int f5616a;

    /* renamed from: b  reason: collision with root package name */
    public String f5617b;

    /* renamed from: c  reason: collision with root package name */
    public String f5618c;

    /* renamed from: d  reason: collision with root package name */
    public String f5619d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f5616a);
        G4.c(parcel, 3, this.f5617b);
        G4.c(parcel, 4, this.f5618c);
        G4.c(parcel, 5, this.f5619d);
        G4.h(parcel, g);
    }
}
