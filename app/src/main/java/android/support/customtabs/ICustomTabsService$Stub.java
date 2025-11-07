package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.d;
import q0.k;
import x1.AbstractC0568a4;

/* loaded from: classes.dex */
public abstract class ICustomTabsService$Stub extends Binder implements d {
    /* JADX WARN: Type inference failed for: r0v2, types: [b.c, b.d, java.lang.Object] */
    public static d asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(d.f2595d);
        if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
            return (d) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f2594l = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        String str = d.f2595d;
        if (r4 >= 1 && r4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (r4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (r4) {
            case 2:
                parcel.readLong();
                boolean a0 = a0();
                parcel2.writeNoException();
                parcel2.writeInt(a0 ? 1 : 0);
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
                boolean H3 = H();
                parcel2.writeNoException();
                parcel2.writeInt(H3 ? 1 : 0);
                break;
            case 4:
                ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
                Uri uri = (Uri) AbstractC0568a4.a(parcel, Uri.CREATOR);
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) AbstractC0568a4.a(parcel, creator);
                parcel.createTypedArrayList(creator);
                boolean F3 = F();
                parcel2.writeNoException();
                parcel2.writeInt(F3 ? 1 : 0);
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC0568a4.a(parcel, Bundle.CREATOR);
                Bundle i3 = i();
                parcel2.writeNoException();
                if (i3 != null) {
                    parcel2.writeInt(1);
                    i3.writeToParcel(parcel2, 1);
                    break;
                } else {
                    parcel2.writeInt(0);
                    break;
                }
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle3 = (Bundle) AbstractC0568a4.a(parcel, Bundle.CREATOR);
                boolean h02 = h0();
                parcel2.writeNoException();
                parcel2.writeInt(h02 ? 1 : 0);
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
                Uri uri2 = (Uri) AbstractC0568a4.a(parcel, Uri.CREATOR);
                boolean b02 = b0();
                parcel2.writeNoException();
                parcel2.writeInt(b02 ? 1 : 0);
                break;
            case 8:
                ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC0568a4.a(parcel, Bundle.CREATOR);
                int i02 = i0();
                parcel2.writeNoException();
                parcel2.writeInt(i02);
                break;
            case 9:
                ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
                parcel.readInt();
                Uri uri3 = (Uri) AbstractC0568a4.a(parcel, Uri.CREATOR);
                Bundle bundle5 = (Bundle) AbstractC0568a4.a(parcel, Bundle.CREATOR);
                boolean V3 = V();
                parcel2.writeNoException();
                parcel2.writeInt(V3 ? 1 : 0);
                break;
            case 10:
                ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle6 = (Bundle) AbstractC0568a4.a(parcel, Bundle.CREATOR);
                boolean p2 = p();
                parcel2.writeNoException();
                parcel2.writeInt(p2 ? 1 : 0);
                break;
            case 11:
                ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
                Uri uri4 = (Uri) AbstractC0568a4.a(parcel, Uri.CREATOR);
                Bundle bundle7 = (Bundle) AbstractC0568a4.a(parcel, Bundle.CREATOR);
                boolean k3 = k();
                parcel2.writeNoException();
                parcel2.writeInt(k3 ? 1 : 0);
                break;
            case 12:
                ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
                Uri uri5 = (Uri) AbstractC0568a4.a(parcel, Uri.CREATOR);
                parcel.readInt();
                Bundle bundle8 = (Bundle) AbstractC0568a4.a(parcel, Bundle.CREATOR);
                boolean m02 = m0();
                parcel2.writeNoException();
                parcel2.writeInt(m02 ? 1 : 0);
                break;
            case 13:
                ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle9 = (Bundle) AbstractC0568a4.a(parcel, Bundle.CREATOR);
                boolean q02 = q0();
                parcel2.writeNoException();
                parcel2.writeInt(q02 ? 1 : 0);
                break;
            case 14:
                ICustomTabsCallback$Stub.asInterface(parcel.readStrongBinder());
                parcel.readStrongBinder();
                Bundle bundle10 = (Bundle) AbstractC0568a4.a(parcel, Bundle.CREATOR);
                boolean z3 = z();
                parcel2.writeNoException();
                parcel2.writeInt(z3 ? 1 : 0);
                break;
            default:
                return super.onTransact(r4, parcel, parcel2, r7);
        }
        return true;
    }
}
