package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import d.InterfaceC0230b;

/* loaded from: classes.dex */
public abstract class INotificationSideChannel$Stub extends Binder implements InterfaceC0230b {
    /* JADX WARN: Type inference failed for: r0v2, types: [d.a, d.b, java.lang.Object] */
    public static InterfaceC0230b asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0230b.f2997i);
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0230b)) {
            return (InterfaceC0230b) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f2996l = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        Object obj;
        String str = InterfaceC0230b.f2997i;
        if (r4 >= 1 && r4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (r4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (r4 != 1) {
            if (r4 != 2) {
                if (r4 != 3) {
                    return super.onTransact(r4, parcel, parcel2, r7);
                }
                parcel.readString();
                j();
            } else {
                parcel.readString();
                parcel.readInt();
                parcel.readString();
                cancel();
            }
        } else {
            parcel.readString();
            parcel.readInt();
            parcel.readString();
            Parcelable.Creator creator = Notification.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            Notification notification = (Notification) obj;
            n0();
        }
        return true;
    }
}
