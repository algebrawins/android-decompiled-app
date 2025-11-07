package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class y1 extends AbstractC0168a0 implements A0 {
    private static final y1 zza;
    private int zzd;
    private String zze = "";
    private B1 zzf;

    static {
        y1 y1Var = new y1();
        zza = y1Var;
        AbstractC0168a0.h(y1.class, y1Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r4, AbstractC0168a0 abstractC0168a0) {
        int r42 = r4 - 1;
        if (r42 != 0) {
            if (r42 != 2) {
                if (r42 != 3) {
                    if (r42 != 4) {
                        if (r42 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new H1(24, zza);
                }
                return new y1();
            }
            return new J0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
