package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class Y6 extends AbstractC0347a {
    public static final Parcelable.Creator<Y6> CREATOR = new C0563a(23);

    /* renamed from: a  reason: collision with root package name */
    public final String f5815a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5816b;

    public Y6(String str, String str2) {
        this.f5815a = str;
        this.f5816b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f5815a);
        G4.c(parcel, 2, this.f5816b);
        G4.h(parcel, g);
    }
}
