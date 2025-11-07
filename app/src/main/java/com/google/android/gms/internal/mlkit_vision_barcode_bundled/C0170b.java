package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170b extends AbstractC0168a0 implements A0 {
    private static final C0170b zza;
    private int zzd;
    private int zze = 4369;
    private String zzf = "";

    static {
        C0170b c0170b = new C0170b();
        zza = c0170b;
        AbstractC0168a0.h(C0170b.class, c0170b);
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
                    return new H1(2, zza);
                }
                return new C0170b();
            }
            return new J0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C0176d.f2894w, "zzf"});
        }
        return (byte) 1;
    }
}
