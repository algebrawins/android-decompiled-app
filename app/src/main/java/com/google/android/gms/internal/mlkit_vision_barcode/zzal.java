package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.IBinder;
import android.os.IInterface;
import u1.AbstractC0473a;
import x1.InterfaceC0595e;

/* loaded from: classes.dex */
public abstract class zzal extends zzb implements InterfaceC0595e {
    /* JADX WARN: Type inference failed for: r1v1, types: [x1.e, u1.a] */
    public static InterfaceC0595e zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        if (queryLocalInterface instanceof InterfaceC0595e) {
            return (InterfaceC0595e) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 2);
    }
}
