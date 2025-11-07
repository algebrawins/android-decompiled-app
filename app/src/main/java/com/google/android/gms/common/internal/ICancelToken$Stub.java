package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import k1.InterfaceC0337e;
import u1.AbstractC0473a;

/* loaded from: classes.dex */
public abstract class ICancelToken$Stub extends zzb implements InterfaceC0337e {
    /* JADX WARN: Type inference failed for: r1v1, types: [u1.a, k1.e] */
    public static InterfaceC0337e asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
        if (queryLocalInterface instanceof InterfaceC0337e) {
            return (InterfaceC0337e) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.android.gms.common.internal.ICancelToken", 1);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean D(int r12, Parcel parcel, Parcel parcel2) {
        if (r12 == 2) {
            cancel();
            return true;
        }
        return false;
    }
}
