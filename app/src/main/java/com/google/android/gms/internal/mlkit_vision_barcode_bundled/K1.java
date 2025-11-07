package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class K1 extends AbstractC0168a0 implements A0 {
    private static final K1 zza;
    private int zzd;
    private I1 zzj;
    private byte zzk = 2;
    private InterfaceC0186g0 zze = C0171b0.f2871M;
    private InterfaceC0183f0 zzf = U.f2851M;
    private boolean zzg = true;
    private String zzh = "";
    private String zzi = "";

    static {
        K1 k12 = new K1();
        zza = k12;
        AbstractC0168a0.h(K1.class, k12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r7, AbstractC0168a0 abstractC0168a0) {
        byte b3 = 1;
        int r72 = r7 - 1;
        if (r72 != 0) {
            if (r72 != 2) {
                if (r72 != 3) {
                    if (r72 != 4) {
                        if (r72 != 5) {
                            if (abstractC0168a0 == null) {
                                b3 = 0;
                            }
                            this.zzk = b3;
                            return null;
                        }
                        return zza;
                    }
                    return new W(zza);
                }
                return new K1();
            }
            return new J0(zza, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
