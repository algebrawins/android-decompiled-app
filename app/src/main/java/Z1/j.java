package Z1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;

/* loaded from: classes.dex */
public final class j extends AbstractC0168a0 implements A0 {
    private static final j zza;
    private int zzd;
    private int zzf;
    private boolean zzh;
    private byte zzi = 2;
    private String zze = "";
    private String zzg = "";

    static {
        j jVar = new j();
        zza = jVar;
        AbstractC0168a0.h(j.class, jVar);
    }

    public static j n() {
        return zza;
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
                            this.zzi = b3;
                            return null;
                        }
                        return zza;
                    }
                    return new W(zza);
                }
                return new j();
            }
            return new J0(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", h.f1767c, "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }

    public final String o() {
        return this.zzg;
    }

    public final String p() {
        return this.zze;
    }

    public final int q() {
        int r22;
        int r02 = this.zzf;
        if (r02 != 0) {
            r22 = 2;
            if (r02 != 1) {
                r22 = r02 != 2 ? r02 != 3 ? 0 : 4 : 3;
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
