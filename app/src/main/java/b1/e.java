package B1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class e extends AbstractC0347a {
    public static final Parcelable.Creator<e> CREATOR = new C0015q(4);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f193a;

    /* renamed from: b  reason: collision with root package name */
    public final String f194b;

    public e(String str, ArrayList arrayList) {
        this.f193a = arrayList;
        this.f194b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        ArrayList arrayList = this.f193a;
        if (arrayList != null) {
            int g3 = G4.g(parcel, 1);
            parcel.writeStringList(arrayList);
            G4.h(parcel, g3);
        }
        G4.c(parcel, 2, this.f194b);
        G4.h(parcel, g);
    }
}
