package n1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class c extends AbstractC0347a {
    public static final Parcelable.Creator<c> CREATOR = new C0015q(25);

    /* renamed from: a  reason: collision with root package name */
    public final int f4348a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4349b;

    public c(int r12, boolean z3) {
        this.f4348a = r12;
        this.f4349b = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f4348a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f4349b ? 1 : 0);
        G4.h(parcel, g);
    }
}
