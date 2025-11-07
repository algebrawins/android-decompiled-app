package Z1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;

/* loaded from: classes.dex */
public final class r extends AbstractC0168a0 implements A0 {
    private static final r zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        r rVar = new r();
        zza = rVar;
        AbstractC0168a0.h(r.class, rVar);
    }

    public static r n() {
        return zza;
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
                    return new W(zza);
                }
                return new r();
            }
            return new J0(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", h.f1770f, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final String o() {
        return this.zzf;
    }

    public final String p() {
        return this.zzh;
    }

    public final String q() {
        return this.zzg;
    }

    public final int r() {
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
