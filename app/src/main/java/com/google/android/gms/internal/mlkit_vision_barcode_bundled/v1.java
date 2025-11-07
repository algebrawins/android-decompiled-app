package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class v1 extends AbstractC0168a0 implements A0 {
    private static final v1 zza;
    private int zzd;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zze = -1;
    private L zzh = L.f2812K;
    private String zzi = "";
    private boolean zzk = true;
    private boolean zzl = true;

    static {
        v1 v1Var = new v1();
        zza = v1Var;
        AbstractC0168a0.h(v1.class, v1Var);
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
                    return new H1(21, zza);
                }
                return new v1();
            }
            C0176d c0176d = C0176d.f2889r;
            return new J0(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ည\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\t᠌\b\n᠌\t\u000bဇ\n", new Object[]{"zzd", "zze", "zzf", "zzg", C0176d.f2888q, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", c0176d, "zzn", c0176d, "zzo"});
        }
        return (byte) 1;
    }
}
