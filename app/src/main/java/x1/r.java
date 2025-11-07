package x1;

import android.os.Parcel;
import s1.InterfaceC0453b;

/* loaded from: classes.dex */
public abstract class r {
    static {
        r.class.getClassLoader();
    }

    public static void a(Parcel parcel, InterfaceC0453b interfaceC0453b) {
        if (interfaceC0453b == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(interfaceC0453b.asBinder());
        }
    }
}
