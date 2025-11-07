package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* renamed from: x1.v6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0729v6 extends AbstractC0347a {
    public static final Parcelable.Creator<C0729v6> CREATOR = new C0563a(6);

    /* renamed from: a  reason: collision with root package name */
    public String f6110a;

    /* renamed from: b  reason: collision with root package name */
    public String f6111b;

    /* renamed from: c  reason: collision with root package name */
    public int f6112c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 2, this.f6110a);
        G4.c(parcel, 3, this.f6111b);
        G4.i(parcel, 4, 4);
        parcel.writeInt(this.f6112c);
        G4.h(parcel, g);
    }
}
