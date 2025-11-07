package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199l1 extends AbstractC0168a0 implements A0 {
    private static final C0199l1 zza;
    private int zzd;
    private int zze = -1;

    static {
        C0199l1 c0199l1 = new C0199l1();
        zza = c0199l1;
        AbstractC0168a0.h(C0199l1.class, c0199l1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r3, AbstractC0168a0 abstractC0168a0) {
        int r32 = r3 - 1;
        if (r32 != 0) {
            if (r32 != 2) {
                if (r32 != 3) {
                    if (r32 != 4) {
                        if (r32 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new H1(12, zza);
                }
                return new C0199l1();
            }
            return new J0(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
