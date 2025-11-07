package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class F1 extends AbstractC0347a {
    public static final Parcelable.Creator<F1> CREATOR = new C0563a(22);

    /* renamed from: a  reason: collision with root package name */
    public int f5543a;

    /* renamed from: b  reason: collision with root package name */
    public int f5544b;

    /* renamed from: c  reason: collision with root package name */
    public int f5545c;

    /* renamed from: d  reason: collision with root package name */
    public int f5546d;

    /* renamed from: e  reason: collision with root package name */
    public int f5547e;

    /* renamed from: f  reason: collision with root package name */
    public int f5548f;
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public String f5549h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f5543a);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f5544b);
        G4.i(parcel, 4, 4);
        parcel.writeInt(this.f5545c);
        G4.i(parcel, 5, 4);
        parcel.writeInt(this.f5546d);
        G4.i(parcel, 6, 4);
        parcel.writeInt(this.f5547e);
        G4.i(parcel, 7, 4);
        parcel.writeInt(this.f5548f);
        G4.i(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        G4.c(parcel, 9, this.f5549h);
        G4.h(parcel, g);
    }
}
