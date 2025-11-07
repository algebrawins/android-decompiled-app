package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218u0 implements InterfaceC0228z0 {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0228z0[] f2983a;

    public C0218u0(InterfaceC0228z0... interfaceC0228z0Arr) {
        this.f2983a = interfaceC0228z0Arr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0228z0
    public final J0 a(Class cls) {
        for (int r02 = 0; r02 < 2; r02++) {
            InterfaceC0228z0 interfaceC0228z0 = this.f2983a[r02];
            if (interfaceC0228z0.b(cls)) {
                return interfaceC0228z0.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0228z0
    public final boolean b(Class cls) {
        for (int r12 = 0; r12 < 2; r12++) {
            if (this.f2983a[r12].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
