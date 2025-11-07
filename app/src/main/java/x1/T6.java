package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class T6 extends AbstractC0347a {
    public static final Parcelable.Creator<T6> CREATOR = new C0563a(17);

    /* renamed from: a  reason: collision with root package name */
    public final int f5759a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5760b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5761c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5762d;

    public T6(int r12, String str, String str2, String str3) {
        this.f5759a = r12;
        this.f5760b = str;
        this.f5761c = str2;
        this.f5762d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f5759a);
        G4.c(parcel, 2, this.f5760b);
        G4.c(parcel, 3, this.f5761c);
        G4.c(parcel, 4, this.f5762d);
        G4.h(parcel, g);
    }
}
