package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* renamed from: x1.a6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570a6 extends AbstractC0347a {
    public static final Parcelable.Creator<C0570a6> CREATOR = new C0563a(5);

    /* renamed from: a  reason: collision with root package name */
    public String f5834a;

    /* renamed from: b  reason: collision with root package name */
    public String f5835b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 2, this.f5834a);
        G4.c(parcel, 3, this.f5835b);
        G4.h(parcel, g);
    }
}
