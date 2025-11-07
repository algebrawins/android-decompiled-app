package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class D1 extends AbstractC0168a0 implements A0 {
    private static final D1 zza;
    private int zzd;
    private String zze = "";

    static {
        D1 d12 = new D1();
        zza = d12;
        AbstractC0168a0.h(D1.class, d12);
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
                    return new H1(29, zza);
                }
                return new D1();
            }
            return new J0(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
