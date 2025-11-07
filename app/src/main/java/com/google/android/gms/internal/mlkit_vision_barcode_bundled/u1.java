package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class u1 extends AbstractC0168a0 implements A0 {
    private static final u1 zza;
    private int zzd;
    private i0 zzf;
    private int zzg;
    private M1 zzh;
    private K1 zzi;
    private I1 zzj;
    private int zzk;
    private i0 zzl;
    private byte zzm = 2;
    private int zze = 17;

    static {
        u1 u1Var = new u1();
        zza = u1Var;
        AbstractC0168a0.h(u1.class, u1Var);
    }

    public u1() {
        I0 r02 = I0.f2800M;
        this.zzf = r02;
        this.zzl = r02;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r8, AbstractC0168a0 abstractC0168a0) {
        byte b3 = 1;
        int r82 = r8 - 1;
        if (r82 != 0) {
            if (r82 != 2) {
                if (r82 != 3) {
                    if (r82 != 4) {
                        if (r82 != 5) {
                            if (abstractC0168a0 == null) {
                                b3 = 0;
                            }
                            this.zzm = b3;
                            return null;
                        }
                        return zza;
                    }
                    return new H1(9, zza);
                }
                return new u1();
            }
            return new J0(zza, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0004\u0001᠌\u0000\u0003Л\u0004င\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007င\u0005\b\u001b\u000fᐉ\u0004", new Object[]{"zzd", "zze", C0176d.f2877e, "zzf", C0179e.class, "zzg", "zzh", "zzi", "zzk", "zzl", C0182f.class, "zzj"});
        }
        return Byte.valueOf(this.zzm);
    }
}
