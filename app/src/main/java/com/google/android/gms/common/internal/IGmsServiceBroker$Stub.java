package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k1.C0335c;
import k1.InterfaceC0338f;
import k1.InterfaceC0339g;
import k1.w;
import k1.x;
import u1.AbstractC0473a;

/* loaded from: classes.dex */
public abstract class IGmsServiceBroker$Stub extends Binder implements InterfaceC0339g {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r5, Parcel parcel, Parcel parcel2, int r8) {
        IInterface abstractC0473a;
        if (r5 > 16777215) {
            return super.onTransact(r5, parcel, parcel2, r8);
        }
        parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        IBinder readStrongBinder = parcel.readStrongBinder();
        C0335c c0335c = null;
        if (readStrongBinder == null) {
            abstractC0473a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
            if (queryLocalInterface instanceof InterfaceC0338f) {
                abstractC0473a = (InterfaceC0338f) queryLocalInterface;
            } else {
                abstractC0473a = new AbstractC0473a(readStrongBinder, "com.google.android.gms.common.internal.IGmsCallbacks", 1);
            }
        }
        if (r5 == 46) {
            if (parcel.readInt() != 0) {
                c0335c = C0335c.CREATOR.createFromParcel(parcel);
            }
            N((zzd) abstractC0473a, c0335c);
            w.e(parcel2);
            parcel2.writeNoException();
            return true;
        } else if (r5 == 47) {
            if (parcel.readInt() != 0) {
                x.CREATOR.createFromParcel(parcel);
            }
            throw new UnsupportedOperationException();
        } else {
            parcel.readInt();
            if (r5 != 4) {
                parcel.readString();
                if (r5 != 1) {
                    if (r5 != 2 && r5 != 23 && r5 != 25 && r5 != 27) {
                        if (r5 != 30) {
                            if (r5 != 34) {
                                if (r5 != 41 && r5 != 43 && r5 != 37 && r5 != 38) {
                                    switch (r5) {
                                        case 9:
                                            parcel.readString();
                                            parcel.createStringArray();
                                            parcel.readString();
                                            parcel.readStrongBinder();
                                            parcel.readString();
                                            if (parcel.readInt() != 0) {
                                                Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                                break;
                                            }
                                            break;
                                        case 10:
                                            parcel.readString();
                                            parcel.createStringArray();
                                            break;
                                        case 19:
                                            parcel.readStrongBinder();
                                            if (parcel.readInt() != 0) {
                                                Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            } else {
                                parcel.readString();
                            }
                        }
                        parcel.createStringArray();
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                            Bundle bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                    }
                    if (parcel.readInt() != 0) {
                        Bundle bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                } else {
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                }
            }
            throw new UnsupportedOperationException();
        }
    }
}
