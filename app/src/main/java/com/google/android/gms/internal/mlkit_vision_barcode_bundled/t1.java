package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class t1 extends AbstractC0168a0 implements A0 {
    private static final t1 zza;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzg = true;
    private String zzl = "";
    private String zzm = "";

    static {
        t1 t1Var = new t1();
        zza = t1Var;
        AbstractC0168a0.h(t1.class, t1Var);
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
                    return new H1(20, zza);
                }
                return new t1();
            }
            C0176d c0176d = C0176d.f2886o;
            return new J0(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bဈ\u0007\tဈ\b", new Object[]{"zzd", "zze", "zzf", C0176d.f2887p, "zzg", "zzh", C0176d.f2885n, "zzi", c0176d, "zzj", c0176d, "zzk", c0176d, "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
