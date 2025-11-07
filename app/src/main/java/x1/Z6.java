package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class Z6 extends AbstractC0347a {
    public static final Parcelable.Creator<Z6> CREATOR = new C0563a(24);

    /* renamed from: a  reason: collision with root package name */
    public final String f5825a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5826b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5827c;

    public Z6(int r12, String str, String str2) {
        this.f5825a = str;
        this.f5826b = str2;
        this.f5827c = r12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f5825a);
        G4.c(parcel, 2, this.f5826b);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f5827c);
        G4.h(parcel, g);
    }
}
