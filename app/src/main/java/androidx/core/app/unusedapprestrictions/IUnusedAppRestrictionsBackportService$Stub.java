package androidx.core.app.unusedapprestrictions;

import V.d;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class IUnusedAppRestrictionsBackportService$Stub extends Binder implements d {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, V.c, V.d] */
    public static d asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(d.f1355b);
        if (queryLocalInterface != null && (queryLocalInterface instanceof d)) {
            return (d) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f1354l = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        String str = d.f1355b;
        if (r4 >= 1 && r4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (r4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (r4 != 1) {
            return super.onTransact(r4, parcel, parcel2, r7);
        } else {
            IUnusedAppRestrictionsBackportCallback$Stub.asInterface(parcel.readStrongBinder());
            T();
            return true;
        }
    }
}
