package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e.InterfaceC0246d;

/* loaded from: classes.dex */
public abstract class IResultReceiver$Stub extends Binder implements InterfaceC0246d {
    /* JADX WARN: Type inference failed for: r0v2, types: [e.a, java.lang.Object, e.d] */
    public static InterfaceC0246d asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0246d.f3089k);
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0246d)) {
            return (InterfaceC0246d) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f3086l = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        Object obj;
        String str = InterfaceC0246d.f3089k;
        if (r4 >= 1 && r4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (r4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (r4 != 1) {
            return super.onTransact(r4, parcel, parcel2, r7);
        } else {
            parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            Bundle bundle = (Bundle) obj;
            d();
            return true;
        }
    }
}
