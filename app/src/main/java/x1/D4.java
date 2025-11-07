package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class D4 extends AbstractC0347a {
    public static final Parcelable.Creator<D4> CREATOR = new C0563a(2);

    /* renamed from: a  reason: collision with root package name */
    public String f5525a;

    /* renamed from: b  reason: collision with root package name */
    public String f5526b;

    /* renamed from: c  reason: collision with root package name */
    public String f5527c;

    /* renamed from: d  reason: collision with root package name */
    public String f5528d;

    /* renamed from: e  reason: collision with root package name */
    public String f5529e;

    /* renamed from: f  reason: collision with root package name */
    public String f5530f;
    public String g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 2, this.f5525a);
        G4.c(parcel, 3, this.f5526b);
        G4.c(parcel, 4, this.f5527c);
        G4.c(parcel, 5, this.f5528d);
        G4.c(parcel, 6, this.f5529e);
        G4.c(parcel, 7, this.f5530f);
        G4.c(parcel, 8, this.g);
        G4.h(parcel, g);
    }
}
