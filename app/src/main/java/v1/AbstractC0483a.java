package v1;

import D.C;
import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0483a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f5045a = 0;

    static {
        AbstractC0483a.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException(C.w("Parcel data not fully consumed, unread size: ", dataAvail));
    }

    public static void c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
