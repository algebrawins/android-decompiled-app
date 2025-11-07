package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179e extends AbstractC0168a0 implements A0 {
    public static final Z zza;
    private static final InterfaceC0189h0 zzd = new Object();
    private static final C0179e zze;
    private int zzf;
    private N1 zzl;
    private I1 zzm;
    private byte zzn = 2;
    private String zzg = "";
    private String zzh = "";
    private InterfaceC0186g0 zzi = C0171b0.f2871M;
    private String zzj = "";
    private String zzk = "";

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.h0] */
    static {
        C0179e c0179e = new C0179e();
        zze = c0179e;
        AbstractC0168a0.h(C0179e.class, c0179e);
        zza = new Z(I1.o(), c0179e, c0179e, new Y(308676116, EnumC0190h1.zzk));
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
                            this.zzn = b3;
                            return null;
                        }
                        return zze;
                    }
                    return new H1(3, zze);
                }
                return new C0179e();
            }
            return new J0(zze, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", C0176d.f2874b, "zzj", "zzk", "zzm", "zzl"});
        }
        return Byte.valueOf(this.zzn);
    }
}
