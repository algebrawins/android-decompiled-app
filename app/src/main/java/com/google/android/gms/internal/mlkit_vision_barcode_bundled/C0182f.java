package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182f extends AbstractC0168a0 implements A0 {
    private static final C0182f zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        C0182f c0182f = new C0182f();
        zza = c0182f;
        AbstractC0168a0.h(C0182f.class, c0182f);
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
                    return new H1(4, zza);
                }
                return new C0182f();
            }
            return new J0(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
