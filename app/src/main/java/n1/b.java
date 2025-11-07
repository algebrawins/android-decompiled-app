package n1;

import A0.C0015q;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class b extends AbstractC0347a {
    public static final Parcelable.Creator<b> CREATOR = new C0015q(24);

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f4347a;

    public b(PendingIntent pendingIntent) {
        this.f4347a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.b(parcel, 1, this.f4347a, r5);
        G4.h(parcel, g);
    }
}
