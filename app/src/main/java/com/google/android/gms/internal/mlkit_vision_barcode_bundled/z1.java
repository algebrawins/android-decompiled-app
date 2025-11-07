package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class z1 extends AbstractC0168a0 implements A0 {
    private static final z1 zza;
    private int zzd;
    private i0 zze = I0.f2800M;
    private A1 zzf;
    private C0196k1 zzg;

    static {
        z1 z1Var = new z1();
        zza = z1Var;
        AbstractC0168a0.h(z1.class, z1Var);
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
                    return new H1(25, zza);
                }
                return new z1();
            }
            return new J0(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", F1.class, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
