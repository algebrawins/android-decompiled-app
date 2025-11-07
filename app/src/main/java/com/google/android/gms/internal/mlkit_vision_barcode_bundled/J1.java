package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class J1 extends AbstractC0168a0 implements A0 {
    private static final J1 zza;
    private int zzd;
    private i0 zze = I0.f2800M;
    private String zzf = "";

    static {
        J1 j12 = new J1();
        zza = j12;
        AbstractC0168a0.h(J1.class, j12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r4, AbstractC0168a0 abstractC0168a0) {
        int r42 = r4 - 1;
        if (r42 != 0) {
            if (r42 != 2) {
                if (r42 != 3) {
                    if (r42 != 4) {
                        if (r42 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new W(zza);
                }
                return new J1();
            }
            return new J0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
