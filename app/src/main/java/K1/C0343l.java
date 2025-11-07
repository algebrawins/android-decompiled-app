package k1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: k1.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343l extends AbstractC0347a {
    public static final Parcelable.Creator<C0343l> CREATOR = new C0015q(14);

    /* renamed from: a  reason: collision with root package name */
    public final int f4057a;

    /* renamed from: b  reason: collision with root package name */
    public List f4058b;

    public C0343l(int r12, List list) {
        this.f4057a = r12;
        this.f4058b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f4057a);
        G4.f(parcel, 2, this.f4058b);
        G4.h(parcel, g);
    }
}
