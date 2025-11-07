package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class H1 extends W implements A0 {

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ int f2799L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H1(int r12, AbstractC0168a0 abstractC0168a0) {
        super(abstractC0168a0);
        this.f2799L = r12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W
    public /* bridge */ /* synthetic */ AbstractC0168a0 d() {
        switch (this.f2799L) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return h();
            default:
                return super.d();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W
    public /* bridge */ /* synthetic */ D e() {
        switch (this.f2799L) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return h();
            default:
                return super.e();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W
    public void g() {
        switch (this.f2799L) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                super.g();
                AbstractC0168a0 abstractC0168a0 = this.f2863K;
                if (((X) abstractC0168a0).zza != S.f2843c) {
                    X x3 = (X) abstractC0168a0;
                    x3.zza = x3.zza.clone();
                    return;
                }
                return;
            default:
                super.g();
                return;
        }
    }

    public X h() {
        if (!((X) this.f2863K).k()) {
            return (X) this.f2863K;
        }
        ((X) this.f2863K).zza.e();
        return (X) super.d();
    }
}
