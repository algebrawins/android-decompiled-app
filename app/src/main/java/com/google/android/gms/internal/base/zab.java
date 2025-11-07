package com.google.android.gms.internal.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class zab extends Binder implements IInterface {
    public zab(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r22, Parcel parcel, Parcel parcel2, int r5) {
        if (r22 > 16777215) {
            if (super.onTransact(r22, parcel, parcel2, r5)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return v0(r22, parcel, parcel2);
    }

    public boolean v0(int r12, Parcel parcel, Parcel parcel2) {
        throw null;
    }
}
