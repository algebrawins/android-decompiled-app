package n1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: n1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393a extends AbstractC0347a {
    public static final Parcelable.Creator<C0393a> CREATOR = new C0015q(23);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4345a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4346b;

    public C0393a(int r12, boolean z3) {
        this.f4345a = z3;
        this.f4346b = r12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f4345a ? 1 : 0);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f4346b);
        G4.h(parcel, g);
    }
}
