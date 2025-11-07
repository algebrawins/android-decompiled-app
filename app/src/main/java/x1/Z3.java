package x1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class Z3 {
    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
