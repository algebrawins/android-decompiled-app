package B1;

import A0.C0015q;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class b extends AbstractC0347a {
    public static final Parcelable.Creator<b> CREATOR = new C0015q(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f190a;

    /* renamed from: b  reason: collision with root package name */
    public final int f191b;

    /* renamed from: c  reason: collision with root package name */
    public final Intent f192c;

    public b(int r12, int r22, Intent intent) {
        this.f190a = r12;
        this.f191b = r22;
        this.f192c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f190a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f191b);
        G4.b(parcel, 3, this.f192c, r5);
        G4.h(parcel, g);
    }
}
