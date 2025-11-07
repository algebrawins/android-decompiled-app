package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import h1.k;
import k1.L;
import s1.InterfaceC0453b;
import u1.AbstractC0473a;
import v1.AbstractC0483a;

/* loaded from: classes.dex */
public abstract class zzy extends zzb implements L {
    /* JADX WARN: Type inference failed for: r1v1, types: [k1.L, u1.a] */
    public static L zzg(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof L) {
            return (L) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.android.gms.common.internal.ICertData", 1);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean D(int r22, Parcel parcel, Parcel parcel2) {
        if (r22 != 1) {
            if (r22 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(((k) this).f3273l);
        } else {
            InterfaceC0453b h3 = ((k) this).h();
            parcel2.writeNoException();
            AbstractC0483a.c(parcel2, h3);
        }
        return true;
    }
}
