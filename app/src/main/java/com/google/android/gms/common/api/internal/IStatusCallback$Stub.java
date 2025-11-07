package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import j1.InterfaceC0305d;
import u1.AbstractC0473a;
import u1.AbstractC0474b;

/* loaded from: classes.dex */
public abstract class IStatusCallback$Stub extends zab implements InterfaceC0305d {
    /* JADX WARN: Type inference failed for: r1v1, types: [u1.a, j1.d] */
    public static InterfaceC0305d asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        if (queryLocalInterface instanceof InterfaceC0305d) {
            return (InterfaceC0305d) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback", 0);
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean v0(int r12, Parcel parcel, Parcel parcel2) {
        if (r12 == 1) {
            AbstractC0474b.b(parcel);
            m((Status) AbstractC0474b.a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
