package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211q0 extends AbstractC0168a0 implements A0 {
    public static final Z zza;
    private static final C0211q0 zzd;
    private int zze;
    private i0 zzg;
    private i0 zzh;
    private i0 zzi;
    private I1 zzj;
    private C0211q0 zzk;
    private N1 zzl;
    private byte zzm = 2;
    private String zzf = "";

    static {
        C0211q0 c0211q0 = new C0211q0();
        zzd = c0211q0;
        AbstractC0168a0.h(C0211q0.class, c0211q0);
        zza = new Z(I1.o(), c0211q0, c0211q0, new Y(12208774, EnumC0190h1.zzk));
    }

    public C0211q0() {
        I0 r02 = I0.f2800M;
        this.zzg = r02;
        this.zzh = r02;
        this.zzi = r02;
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
                        return zzd;
                    }
                    return new H1(8, zzd);
                }
                return new C0211q0();
            }
            return new J0(zzd, "\u0001\u0007\u0000\u0001\u0002Ǵ\u0007\u0000\u0003\u0004\u0002Л\u0005Л\u0006\u001b\bᐉ\u0001\nဈ\u0000\u000bᐉ\u0002Ǵဉ\u0003", new Object[]{"zze", "zzg", u1.class, "zzi", u1.class, "zzh", J1.class, "zzj", "zzf", "zzk", "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }
}
