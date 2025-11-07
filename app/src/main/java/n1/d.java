package n1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class d extends AbstractC0347a {
    public static final Parcelable.Creator<d> CREATOR = new C0015q(26);

    /* renamed from: a  reason: collision with root package name */
    public final int f4350a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4351b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f4352c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f4353d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4354e;

    public d(int r3, int r4, Long l3, Long l4, int r7) {
        this.f4350a = r3;
        this.f4351b = r4;
        this.f4352c = l3;
        this.f4353d = l4;
        this.f4354e = r7;
        if (l3 == null || l4 == null || l4.longValue() == 0 || l4.longValue() != 0) {
            return;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f4350a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f4351b);
        Long l3 = this.f4352c;
        if (l3 != null) {
            G4.i(parcel, 3, 8);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.f4353d;
        if (l4 != null) {
            G4.i(parcel, 4, 8);
            parcel.writeLong(l4.longValue());
        }
        G4.i(parcel, 5, 4);
        parcel.writeInt(this.f4354e);
        G4.h(parcel, g);
    }
}
