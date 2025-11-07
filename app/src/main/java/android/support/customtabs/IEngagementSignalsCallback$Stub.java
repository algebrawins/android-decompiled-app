package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.f;

/* loaded from: classes.dex */
public abstract class IEngagementSignalsCallback$Stub extends Binder implements f {
    /* JADX WARN: Type inference failed for: r0v2, types: [b.e, java.lang.Object, b.f] */
    public static f asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(f.f2597e);
        if (queryLocalInterface != null && (queryLocalInterface instanceof f)) {
            return (f) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f2596l = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        String str = f.f2597e;
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
                if (r4 != 4) {
                    return super.onTransact(r4, parcel, parcel2, r7);
                }
                parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                }
                Bundle bundle = (Bundle) obj;
                p0();
            } else {
                parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator2.createFromParcel(parcel);
                }
                Bundle bundle2 = (Bundle) obj;
                J();
            }
        } else {
            parcel.readInt();
            Parcelable.Creator creator3 = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator3.createFromParcel(parcel);
            }
            Bundle bundle3 = (Bundle) obj;
            A();
        }
        return true;
    }
}
