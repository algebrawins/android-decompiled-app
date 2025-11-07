package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;
import s1.InterfaceC0453b;
import u1.AbstractC0473a;

/* loaded from: classes.dex */
public abstract class IObjectWrapper$Stub extends zzb implements InterfaceC0453b {
    /* JADX WARN: Type inference failed for: r1v1, types: [s1.b, u1.a] */
    public static InterfaceC0453b asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof InterfaceC0453b) {
            return (InterfaceC0453b) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }
}
