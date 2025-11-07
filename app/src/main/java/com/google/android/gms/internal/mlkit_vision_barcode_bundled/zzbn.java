package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import s1.InterfaceC0453b;

/* loaded from: classes.dex */
public abstract class zzbn extends zzb implements InterfaceC0223x {
    public static InterfaceC0223x asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof InterfaceC0223x) {
            return (InterfaceC0223x) queryLocalInterface;
        }
        return new C0221w(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean D(int r5, Parcel parcel, Parcel parcel2) {
        C0217u createFromParcel;
        if (r5 == 1) {
            InterfaceC0453b asInterface = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
            Parcelable.Creator<C0217u> creator = C0217u.CREATOR;
            int r22 = AbstractC0227z.f2995a;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(parcel);
            }
            C0217u c0217u = createFromParcel;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                InterfaceC0219v newBarcodeScanner = newBarcodeScanner(asInterface, c0217u);
                parcel2.writeNoException();
                if (newBarcodeScanner == null) {
                    parcel2.writeStrongBinder(null);
                } else {
                    parcel2.writeStrongBinder(newBarcodeScanner.asBinder());
                }
                return true;
            }
            throw new BadParcelableException(D.C.w("Parcel data not fully consumed, unread size: ", dataAvail));
        }
        return false;
    }
}
