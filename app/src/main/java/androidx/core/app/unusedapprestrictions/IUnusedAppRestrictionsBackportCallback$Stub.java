package androidx.core.app.unusedapprestrictions;

import V.b;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class IUnusedAppRestrictionsBackportCallback$Stub extends Binder implements b {
    /* JADX WARN: Type inference failed for: r0v2, types: [V.a, java.lang.Object, V.b] */
    public static b asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f1353a);
        if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
            return (b) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f1352l = iBinder;
        return obj;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) {
        String str = b.f1353a;
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
            parcel.readInt();
            c0();
            return true;
        }
    }
}
