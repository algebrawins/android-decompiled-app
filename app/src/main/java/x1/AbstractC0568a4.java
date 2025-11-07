package x1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x1.a4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0568a4 {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
