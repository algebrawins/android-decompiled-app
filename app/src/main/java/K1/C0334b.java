package k1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: k1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334b extends AbstractC0347a {
    public static final Parcelable.Creator<C0334b> CREATOR = new C0015q(21);

    /* renamed from: a  reason: collision with root package name */
    public final C0342k f4017a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4018b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4019c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f4020d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4021e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f4022f;

    public C0334b(C0342k c0342k, boolean z3, boolean z4, int[] r4, int r5, int[] r6) {
        this.f4017a = c0342k;
        this.f4018b = z3;
        this.f4019c = z4;
        this.f4020d = r4;
        this.f4021e = r5;
        this.f4022f = r6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.b(parcel, 1, this.f4017a, r5);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f4018b ? 1 : 0);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f4019c ? 1 : 0);
        int[] r52 = this.f4020d;
        if (r52 != null) {
            int g3 = G4.g(parcel, 4);
            parcel.writeIntArray(r52);
            G4.h(parcel, g3);
        }
        G4.i(parcel, 5, 4);
        parcel.writeInt(this.f4021e);
        int[] r53 = this.f4022f;
        if (r53 != null) {
            int g4 = G4.g(parcel, 6);
            parcel.writeIntArray(r53);
            G4.h(parcel, g4);
        }
        G4.h(parcel, g);
    }
}
