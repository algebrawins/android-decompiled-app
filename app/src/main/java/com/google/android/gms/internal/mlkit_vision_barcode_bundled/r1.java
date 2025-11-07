package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class r1 extends AbstractC0168a0 implements A0 {
    private static final r1 zza;
    private int zzd;
    private int zze;
    private p1 zzh;
    private int zzj;
    private int zzk;
    private i0 zzf = I0.f2800M;
    private int zzg = -1;
    private String zzi = "";
    private InterfaceC0186g0 zzl = C0171b0.f2871M;
    private String zzm = "";

    static {
        r1 r1Var = new r1();
        zza = r1Var;
        AbstractC0168a0.h(r1.class, r1Var);
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
                    return new H1(18, zza);
                }
                return new r1();
            }
            return new J0(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003င\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006᠌\u0004\u0007᠌\u0005\b'\tဈ\u0006", new Object[]{"zzd", "zze", C0176d.f2881j, "zzf", q1.class, "zzg", "zzh", "zzi", "zzj", C0176d.f2882k, "zzk", C0176d.f2883l, "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
