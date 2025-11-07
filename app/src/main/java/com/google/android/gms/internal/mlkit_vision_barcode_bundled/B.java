package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class B extends AbstractC0168a0 implements A0 {
    private static final B zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        B b3 = new B();
        zza = b3;
        AbstractC0168a0.h(B.class, b3);
    }

    public static B n() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r8, AbstractC0168a0 abstractC0168a0) {
        int r82 = r8 - 1;
        if (r82 != 0) {
            if (r82 != 2) {
                if (r82 != 3) {
                    if (r82 != 4) {
                        if (r82 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new H1(6, zza);
                }
                return new B();
            }
            return new J0(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final String o() {
        return this.zzh;
    }

    public final String p() {
        return this.zze;
    }

    public final String q() {
        return this.zzj;
    }

    public final String r() {
        return this.zzi;
    }

    public final String s() {
        return this.zzg;
    }

    public final String t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzk;
    }
}
