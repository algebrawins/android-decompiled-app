package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class w1 extends AbstractC0168a0 implements A0 {
    private static final w1 zza;
    private int zzd;
    private int zze;
    private int zzf = 100;
    private int zzg;

    static {
        w1 w1Var = new w1();
        zza = w1Var;
        AbstractC0168a0.h(w1.class, w1Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r6, AbstractC0168a0 abstractC0168a0) {
        int r62 = r6 - 1;
        if (r62 != 0) {
            if (r62 != 2) {
                if (r62 != 3) {
                    if (r62 != 4) {
                        if (r62 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new H1(22, zza);
                }
                return new w1();
            }
            return new J0(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", C0176d.f2890s, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
