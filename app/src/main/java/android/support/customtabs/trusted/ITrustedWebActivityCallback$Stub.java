package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.InterfaceC0154b;

/* loaded from: classes.dex */
public abstract class ITrustedWebActivityCallback$Stub extends Binder implements InterfaceC0154b {
    /* JADX WARN: Type inference failed for: r0v2, types: [c.b, c.a, java.lang.Object] */
    public static InterfaceC0154b asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0154b.g);
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0154b)) {
            return (InterfaceC0154b) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f2635l = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        Object obj;
        String str = InterfaceC0154b.g;
        if (r4 >= 1 && r4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (r4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (r4 != 2) {
            return super.onTransact(r4, parcel, parcel2, r7);
        } else {
            parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            Bundle bundle = (Bundle) obj;
            w();
            parcel2.writeNoException();
            return true;
        }
    }
}
