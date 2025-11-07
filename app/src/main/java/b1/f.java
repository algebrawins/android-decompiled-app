package B1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import k1.p;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class f extends AbstractC0347a {
    public static final Parcelable.Creator<f> CREATOR = new C0015q(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f195a;

    /* renamed from: b  reason: collision with root package name */
    public final p f196b;

    public f(int r12, p pVar) {
        this.f195a = r12;
        this.f196b = pVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f195a);
        G4.b(parcel, 2, this.f196b, r5);
        G4.h(parcel, g);
    }
}
