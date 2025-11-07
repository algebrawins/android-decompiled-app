package B1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import h1.C0281a;
import k1.q;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class g extends AbstractC0347a {
    public static final Parcelable.Creator<g> CREATOR = new C0015q(6);

    /* renamed from: a  reason: collision with root package name */
    public final int f197a;

    /* renamed from: b  reason: collision with root package name */
    public final C0281a f198b;

    /* renamed from: c  reason: collision with root package name */
    public final q f199c;

    public g(int r12, C0281a c0281a, q qVar) {
        this.f197a = r12;
        this.f198b = c0281a;
        this.f199c = qVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f197a);
        G4.b(parcel, 2, this.f198b, r5);
        G4.b(parcel, 3, this.f199c, r5);
        G4.h(parcel, g);
    }
}
