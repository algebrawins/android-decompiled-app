package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* renamed from: x1.e1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597e1 extends AbstractC0347a {
    public static final Parcelable.Creator<C0597e1> CREATOR = new C0563a(9);

    /* renamed from: a  reason: collision with root package name */
    public int f5879a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f5880b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f5879a);
        G4.d(parcel, 3, this.f5880b);
        G4.h(parcel, g);
    }
}
