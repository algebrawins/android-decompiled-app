package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class J extends K {

    /* renamed from: M  reason: collision with root package name */
    public final int f2803M;

    /* renamed from: N  reason: collision with root package name */
    public final int f2804N;

    public J(byte[] bArr, int r3, int r4) {
        super(bArr);
        L.t(r3, r3 + r4, bArr.length);
        this.f2803M = r3;
        this.f2804N = r4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K, com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final byte e(int r22) {
        L.y(r22, this.f2804N);
        return this.f2809L[this.f2803M + r22];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K, com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final byte h(int r22) {
        return this.f2809L[this.f2803M + r22];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K, com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final int j() {
        return this.f2804N;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K, com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final void k(int r22, int r3, int r4, byte[] bArr) {
        System.arraycopy(this.f2809L, this.f2803M + r22, bArr, r3, r4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K
    public final int z() {
        return this.f2803M;
    }
}
