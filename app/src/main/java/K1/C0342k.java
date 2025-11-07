package k1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: k1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342k extends AbstractC0347a {
    public static final Parcelable.Creator<C0342k> CREATOR = new C0015q(18);

    /* renamed from: a  reason: collision with root package name */
    public final int f4052a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4053b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4054c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4055d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4056e;

    public C0342k(int r12, boolean z3, boolean z4, int r4, int r5) {
        this.f4052a = r12;
        this.f4053b = z3;
        this.f4054c = z4;
        this.f4055d = r4;
        this.f4056e = r5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f4052a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f4053b ? 1 : 0);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f4054c ? 1 : 0);
        G4.i(parcel, 4, 4);
        parcel.writeInt(this.f4055d);
        G4.i(parcel, 5, 4);
        parcel.writeInt(this.f4056e);
        G4.h(parcel, g);
    }
}
