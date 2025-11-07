package x1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s1.InterfaceC0453b;
import u1.AbstractC0473a;

/* renamed from: x1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587d extends AbstractC0473a implements InterfaceC0595e {
    /* JADX WARN: Multi-variable type inference failed */
    public final C0579c x0(InterfaceC0453b interfaceC0453b, C0571b c0571b) {
        C0579c abstractC0473a;
        Parcel Y3 = Y();
        r.a(Y3, interfaceC0453b);
        Y3.writeInt(1);
        c0571b.writeToParcel(Y3, 0);
        Parcel v02 = v0(Y3, 1);
        IBinder readStrongBinder = v02.readStrongBinder();
        if (readStrongBinder == null) {
            abstractC0473a = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (queryLocalInterface instanceof C0579c) {
                abstractC0473a = (C0579c) queryLocalInterface;
            } else {
                abstractC0473a = new AbstractC0473a(readStrongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", 2);
            }
        }
        v02.recycle();
        return abstractC0473a;
    }
}
