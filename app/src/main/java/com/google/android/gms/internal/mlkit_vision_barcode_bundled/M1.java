package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class M1 extends AbstractC0168a0 implements A0 {
    public static final Z zza;
    private static final M1 zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private I1 zzh;
    private byte zzi = 2;

    static {
        M1 m12 = new M1();
        zzd = m12;
        AbstractC0168a0.h(M1.class, m12);
        zza = new Z(I1.o(), m12, m12, new Y(13258261, EnumC0190h1.zzk));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r6, AbstractC0168a0 abstractC0168a0) {
        byte b3 = 1;
        int r62 = r6 - 1;
        if (r62 != 0) {
            if (r62 != 2) {
                if (r62 != 3) {
                    if (r62 != 4) {
                        if (r62 != 5) {
                            if (abstractC0168a0 == null) {
                                b3 = 0;
                            }
                            this.zzi = b3;
                            return null;
                        }
                        return zzd;
                    }
                    return new W(zzd);
                }
                return new M1();
            }
            return new J0(zzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔅ\u0000\u0002ᔅ\u0001\u0003ᐉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
