package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205n1 extends AbstractC0168a0 implements A0 {
    private static final C0205n1 zza;
    private int zzd;
    private String zze = "";
    private int zzf = 1;
    private boolean zzg;
    private int zzh;

    static {
        C0205n1 c0205n1 = new C0205n1();
        zza = c0205n1;
        AbstractC0168a0.h(C0205n1.class, c0205n1);
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
                    return new H1(14, zza);
                }
                return new C0205n1();
            }
            return new J0(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", C0176d.f2878f, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
