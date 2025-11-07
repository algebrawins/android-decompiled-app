package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.h;

/* loaded from: classes.dex */
public abstract class IPostMessageService$Stub extends Binder implements h {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, b.g, b.h] */
    public static h asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(h.f2599f);
        if (queryLocalInterface != null && (queryLocalInterface instanceof h)) {
            return (h) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f2598l = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        String str = h.f2599f;
        if (r4 >= 1 && r4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (r4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Object obj = null;
        if (r4 != 2) {
            if (r4 != 3) {
                return super.onTransact(r4, parcel, parcel2, r7);
            }
            ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
            parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            }
            Bundle bundle = (Bundle) obj;
            g();
            parcel2.writeNoException();
        } else {
            ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
            Parcelable.Creator creator2 = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator2.createFromParcel(parcel);
            }
            Bundle bundle2 = (Bundle) obj;
            e();
            parcel2.writeNoException();
        }
        return true;
    }
}
