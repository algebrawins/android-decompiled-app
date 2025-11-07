package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class C extends AbstractC0168a0 implements A0 {
    private static final C zza;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C c4 = new C();
        zza = c4;
        AbstractC0168a0.h(C.class, c4);
    }

    public static C n() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r5, AbstractC0168a0 abstractC0168a0) {
        int r52 = r5 - 1;
        if (r52 != 0) {
            if (r52 != 2) {
                if (r52 != 3) {
                    if (r52 != 4) {
                        if (r52 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new H1(7, zza);
                }
                return new C();
            }
            return new J0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C0176d.f2876d, "zzf"});
        }
        return (byte) 1;
    }

    public final String o() {
        return this.zzf;
    }

    public final int p() {
        int r22;
        int r02 = this.zze;
        if (r02 != 0) {
            r22 = 2;
            if (r02 != 1) {
                if (r02 != 2) {
                    r22 = 4;
                    if (r02 != 3) {
                        r22 = r02 != 4 ? 0 : 5;
                    }
                } else {
                    r22 = 3;
                }
            }
        } else {
            r22 = 1;
        }
        if (r22 == 0) {
            return 1;
        }
        return r22;
    }
}
