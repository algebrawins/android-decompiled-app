package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class W6 extends AbstractC0347a {
    public static final Parcelable.Creator<W6> CREATOR = new C0563a(20);

    /* renamed from: a  reason: collision with root package name */
    public final int f5796a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5797b;

    public W6(String str, int r22) {
        this.f5796a = r22;
        this.f5797b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f5796a);
        G4.c(parcel, 2, this.f5797b);
        G4.h(parcel, g);
    }
}
