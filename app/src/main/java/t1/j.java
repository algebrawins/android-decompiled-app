package t1;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import s1.InterfaceC0453b;
import u1.AbstractC0473a;
import v1.AbstractC0483a;

/* loaded from: classes.dex */
public final class j extends AbstractC0473a {
    public final InterfaceC0453b x0(InterfaceC0453b interfaceC0453b, String str, int r4, InterfaceC0453b interfaceC0453b2) {
        Parcel Y3 = Y();
        AbstractC0483a.c(Y3, interfaceC0453b);
        Y3.writeString(str);
        Y3.writeInt(r4);
        AbstractC0483a.c(Y3, interfaceC0453b2);
        Parcel Q3 = Q(Y3, 2);
        InterfaceC0453b asInterface = IObjectWrapper$Stub.asInterface(Q3.readStrongBinder());
        Q3.recycle();
        return asInterface;
    }

    public final InterfaceC0453b y0(InterfaceC0453b interfaceC0453b, String str, int r4, InterfaceC0453b interfaceC0453b2) {
        Parcel Y3 = Y();
        AbstractC0483a.c(Y3, interfaceC0453b);
        Y3.writeString(str);
        Y3.writeInt(r4);
        AbstractC0483a.c(Y3, interfaceC0453b2);
        Parcel Q3 = Q(Y3, 3);
        InterfaceC0453b asInterface = IObjectWrapper$Stub.asInterface(Q3.readStrongBinder());
        Q3.recycle();
        return asInterface;
    }
}
