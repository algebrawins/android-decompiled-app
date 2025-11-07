package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class zzb extends Binder implements IInterface {
    public zzb(String str) {
        attachInterface(this, str);
    }

    public boolean D(int r12, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int r22, Parcel parcel, Parcel parcel2, int r5) {
        if (r22 > 16777215) {
            if (super.onTransact(r22, parcel, parcel2, r5)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return D(r22, parcel, parcel2);
    }
}
