package k1;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import s1.InterfaceC0453b;
import u1.AbstractC0473a;

/* loaded from: classes.dex */
public final class K extends AbstractC0473a implements L {
    @Override // k1.L
    public final int b() {
        Parcel Q3 = Q(Y(), 2);
        int readInt = Q3.readInt();
        Q3.recycle();
        return readInt;
    }

    @Override // k1.L
    public final InterfaceC0453b h() {
        Parcel Q3 = Q(Y(), 1);
        InterfaceC0453b asInterface = IObjectWrapper$Stub.asInterface(Q3.readStrongBinder());
        Q3.recycle();
        return asInterface;
    }
}
