package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import k1.InterfaceC0336d;
import u1.AbstractC0473a;

/* loaded from: classes.dex */
public abstract class IAccountAccessor$Stub extends zzb implements InterfaceC0336d {
    /* JADX WARN: Type inference failed for: r1v1, types: [u1.a, k1.d] */
    public static InterfaceC0336d asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof InterfaceC0336d) {
            return (InterfaceC0336d) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean D(int r12, Parcel parcel, Parcel parcel2) {
        if (r12 != 2) {
            return false;
        }
        throw null;
    }
}
