package x1;

import android.os.Parcel;
import s1.InterfaceC0453b;
import u1.AbstractC0473a;

/* renamed from: x1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579c extends AbstractC0473a {
    public final J6[] x0(InterfaceC0453b interfaceC0453b, C0603f c0603f) {
        Parcel Y3 = Y();
        r.a(Y3, interfaceC0453b);
        Y3.writeInt(1);
        c0603f.writeToParcel(Y3, 0);
        Parcel v02 = v0(Y3, 1);
        J6[] j6Arr = (J6[]) v02.createTypedArray(J6.CREATOR);
        v02.recycle();
        return j6Arr;
    }
}
