package com.google.mlkit.vision.barcode.bundled.internal;

import T1.a;
import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0217u;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0219v;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzbn;
import s1.InterfaceC0453b;

@DynamiteApi
/* loaded from: classes.dex */
public class ThickBarcodeScannerCreator extends zzbn {
    public ThickBarcodeScannerCreator() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0223x
    public InterfaceC0219v newBarcodeScanner(InterfaceC0453b interfaceC0453b, C0217u c0217u) {
        return new a((Context) ObjectWrapper.unwrap(interfaceC0453b), c0217u);
    }
}
