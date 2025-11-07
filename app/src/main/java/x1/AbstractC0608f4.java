package x1;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: x1.f4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0608f4 {
    public static void a(Parcel parcel, Bundle bundle) {
        if (bundle != null) {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 1);
            return;
        }
        parcel.writeInt(0);
    }
}
