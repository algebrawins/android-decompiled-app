package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class p1 extends AbstractC0168a0 implements A0 {
    private static final p1 zza;
    private int zzd;
    private int zze;
    private int zzf;
    private i0 zzg = I0.f2800M;
    private int zzh;

    static {
        p1 p1Var = new p1();
        zza = p1Var;
        AbstractC0168a0.h(p1.class, p1Var);
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
                    return new H1(16, zza);
                }
                return new p1();
            }
            return new J0(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u001a\u0004င\u0002", new Object[]{"zzd", "zze", C0176d.f2880i, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
