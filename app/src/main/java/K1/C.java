package k1;

import A0.C0015q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h1.C0283c;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class C extends AbstractC0347a {
    public static final Parcelable.Creator<C> CREATOR = new C0015q(20);

    /* renamed from: a  reason: collision with root package name */
    public Bundle f3992a;

    /* renamed from: b  reason: collision with root package name */
    public C0283c[] f3993b;

    /* renamed from: c  reason: collision with root package name */
    public int f3994c;

    /* renamed from: d  reason: collision with root package name */
    public C0334b f3995d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        Bundle bundle = this.f3992a;
        if (bundle != null) {
            int g3 = G4.g(parcel, 1);
            parcel.writeBundle(bundle);
            G4.h(parcel, g3);
        }
        G4.e(parcel, 2, this.f3993b, r5);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f3994c);
        G4.b(parcel, 4, this.f3995d, r5);
        G4.h(parcel, g);
    }
}
