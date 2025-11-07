package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class A1 extends AbstractC0168a0 implements A0 {
    private static final A1 zza;
    private int zzd;
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        A1 a12 = new A1();
        zza = a12;
        AbstractC0168a0.h(A1.class, a12);
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
                    return new H1(26, zza);
                }
                return new A1();
            }
            return new J0(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
