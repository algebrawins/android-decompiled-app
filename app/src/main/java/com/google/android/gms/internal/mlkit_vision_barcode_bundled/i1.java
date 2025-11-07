package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class I1 extends X {
    private static final I1 zzd;
    private byte zze;

    static {
        I1 r02 = new I1();
        zzd = r02;
        AbstractC0168a0.h(I1.class, r02);
    }

    public I1() {
        this.zza = S.f2843c;
        this.zze = (byte) 2;
    }

    public static I1 o() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r3, AbstractC0168a0 abstractC0168a0) {
        byte b3;
        int r32 = r3 - 1;
        if (r32 != 0) {
            if (r32 != 2) {
                if (r32 != 3) {
                    if (r32 != 4) {
                        if (r32 != 5) {
                            if (abstractC0168a0 == null) {
                                b3 = 0;
                            } else {
                                b3 = 1;
                            }
                            this.zze = b3;
                            return null;
                        }
                        return zzd;
                    }
                    return new H1(0, zzd);
                }
                return new I1();
            }
            return new J0(zzd, "\u0003\u0000", null);
        }
        return Byte.valueOf(this.zze);
    }
}
