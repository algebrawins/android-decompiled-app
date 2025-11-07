package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class o1 extends AbstractC0168a0 implements A0 {
    private static final o1 zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = 2;

    static {
        o1 o1Var = new o1();
        zza = o1Var;
        AbstractC0168a0.h(o1.class, o1Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r7, AbstractC0168a0 abstractC0168a0) {
        int r72 = r7 - 1;
        if (r72 != 0) {
            if (r72 != 2) {
                if (r72 != 3) {
                    if (r72 != 4) {
                        if (r72 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new H1(15, zza);
                }
                return new o1();
            }
            return new J0(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", C0176d.g, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
