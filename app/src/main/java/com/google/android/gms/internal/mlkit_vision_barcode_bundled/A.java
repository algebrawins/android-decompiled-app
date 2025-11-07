package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class A extends AbstractC0168a0 implements A0 {
    private static final A zza;
    private int zzd;
    private int zze;
    private C0211q0 zzg;
    private byte zzh = 2;
    private i0 zzf = I0.f2800M;

    static {
        A a4 = new A();
        zza = a4;
        AbstractC0168a0.h(A.class, a4);
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
                            this.zzh = b3;
                            return null;
                        }
                        return zza;
                    }
                    return new H1(5, zza);
                }
                return new A();
            }
            return new J0(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", C0176d.f2875c, "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }

    public final i0 n() {
        return this.zzf;
    }

    public final int o() {
        int r22;
        int r02 = this.zze;
        if (r02 != 0) {
            r22 = 2;
            if (r02 != 1) {
                r22 = r02 != 2 ? 0 : 3;
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
