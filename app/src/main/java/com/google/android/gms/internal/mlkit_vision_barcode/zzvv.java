package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import u1.AbstractC0473a;
import x1.d7;

/* loaded from: classes.dex */
public abstract class zzvv extends zzb implements d7 {
    /* JADX WARN: Type inference failed for: r1v1, types: [u1.a, x1.d7] */
    public static d7 zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof d7) {
            return (d7) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator", 2);
    }
}
