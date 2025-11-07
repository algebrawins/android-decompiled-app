package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;
import k1.v;
import u1.AbstractC0473a;

/* loaded from: classes.dex */
public abstract class zzae extends zzb implements v {
    /* JADX WARN: Type inference failed for: r1v1, types: [u1.a, k1.v] */
    public static v zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof v) {
            return (v) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
    }
}
