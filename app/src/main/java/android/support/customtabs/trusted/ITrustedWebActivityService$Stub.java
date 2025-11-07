package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.InterfaceC0156d;
import q0.k;
import x1.AbstractC0608f4;

/* loaded from: classes.dex */
public abstract class ITrustedWebActivityService$Stub extends Binder implements InterfaceC0156d {
    /* JADX WARN: Type inference failed for: r0v2, types: [c.d, c.c, java.lang.Object] */
    public static InterfaceC0156d asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0156d.f2637h);
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0156d)) {
            return (InterfaceC0156d) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f2636l = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        String str = InterfaceC0156d.f2637h;
        if (r4 >= 1 && r4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (r4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Object obj = null;
        switch (r4) {
            case 2:
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                }
                Bundle bundle = (Bundle) obj;
                Bundle P3 = P();
                parcel2.writeNoException();
                AbstractC0608f4.a(parcel2, P3);
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator2.createFromParcel(parcel);
                }
                Bundle bundle2 = (Bundle) obj;
                U();
                parcel2.writeNoException();
                break;
            case 4:
                int o3 = o();
                parcel2.writeNoException();
                parcel2.writeInt(o3);
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                Bundle W3 = W();
                parcel2.writeNoException();
                AbstractC0608f4.a(parcel2, W3);
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator3.createFromParcel(parcel);
                }
                Bundle bundle3 = (Bundle) obj;
                Bundle q3 = q();
                parcel2.writeNoException();
                AbstractC0608f4.a(parcel2, q3);
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                Bundle u3 = u();
                parcel2.writeNoException();
                AbstractC0608f4.a(parcel2, u3);
                break;
            case 8:
            default:
                return super.onTransact(r4, parcel, parcel2, r7);
            case 9:
                parcel.readString();
                Parcelable.Creator creator4 = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator4.createFromParcel(parcel);
                }
                Bundle bundle4 = (Bundle) obj;
                parcel.readStrongBinder();
                Bundle i3 = i();
                parcel2.writeNoException();
                AbstractC0608f4.a(parcel2, i3);
                break;
        }
        return true;
    }
}
