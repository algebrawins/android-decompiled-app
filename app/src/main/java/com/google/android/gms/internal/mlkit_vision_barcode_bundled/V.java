package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class V implements InterfaceC0228z0 {

    /* renamed from: b  reason: collision with root package name */
    public static final V f2854b = new V(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2855a;

    public /* synthetic */ V(int r12) {
        this.f2855a = r12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0228z0
    public final J0 a(Class cls) {
        switch (this.f2855a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (AbstractC0168a0.class.isAssignableFrom(cls)) {
                    try {
                        return (J0) AbstractC0168a0.e(cls.asSubclass(AbstractC0168a0.class)).m(3, null);
                    } catch (Exception e4) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0228z0
    public final boolean b(Class cls) {
        switch (this.f2855a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return AbstractC0168a0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
