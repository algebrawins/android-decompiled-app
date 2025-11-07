package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.b;
import q0.k;
import x1.Z3;

/* loaded from: classes.dex */
public abstract class ICustomTabsCallback$Stub extends Binder implements b {
    /* JADX WARN: Type inference failed for: r0v2, types: [b.a, b.b, java.lang.Object] */
    public static b asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f2593c);
        if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
            return (b) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f2592l = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        String str = b.f2593c;
        if (r4 >= 1 && r4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (r4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (r4) {
            case 2:
                parcel.readInt();
                Bundle bundle = (Bundle) Z3.a(parcel, Bundle.CREATOR);
                G();
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                parcel.readString();
                Bundle bundle2 = (Bundle) Z3.a(parcel, Bundle.CREATOR);
                f0();
                break;
            case 4:
                Bundle bundle3 = (Bundle) Z3.a(parcel, Bundle.CREATOR);
                e();
                parcel2.writeNoException();
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                parcel.readString();
                Bundle bundle4 = (Bundle) Z3.a(parcel, Bundle.CREATOR);
                g();
                parcel2.writeNoException();
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                parcel.readInt();
                Uri uri = (Uri) Z3.a(parcel, Uri.CREATOR);
                parcel.readInt();
                Bundle bundle5 = (Bundle) Z3.a(parcel, Bundle.CREATOR);
                Z();
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                parcel.readString();
                Bundle bundle6 = (Bundle) Z3.a(parcel, Bundle.CREATOR);
                Bundle R3 = R();
                parcel2.writeNoException();
                if (R3 != null) {
                    parcel2.writeInt(1);
                    R3.writeToParcel(parcel2, 1);
                    break;
                } else {
                    parcel2.writeInt(0);
                    break;
                }
            case 8:
                parcel.readInt();
                parcel.readInt();
                Bundle bundle7 = (Bundle) Z3.a(parcel, Bundle.CREATOR);
                g0();
                break;
            case 9:
                Bundle bundle8 = (Bundle) Z3.a(parcel, Bundle.CREATOR);
                s0();
                break;
            case 10:
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                Bundle bundle9 = (Bundle) Z3.a(parcel, Bundle.CREATOR);
                y();
                break;
            case 11:
                Bundle bundle10 = (Bundle) Z3.a(parcel, Bundle.CREATOR);
                r();
                break;
            case 12:
                Bundle bundle11 = (Bundle) Z3.a(parcel, Bundle.CREATOR);
                S();
                break;
            default:
                return super.onTransact(r4, parcel, parcel2, r7);
        }
        return true;
    }
}
