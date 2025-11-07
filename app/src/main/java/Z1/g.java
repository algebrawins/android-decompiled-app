package Z1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;

/* loaded from: classes.dex */
public final class g extends AbstractC0168a0 implements A0 {
    private static final g zza;
    private int zzd;
    private byte zzg = 2;
    private String zze = "";
    private String zzf = "";

    static {
        g gVar = new g();
        zza = gVar;
        AbstractC0168a0.h(g.class, gVar);
    }

    public static g n() {
        return zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r5, AbstractC0168a0 abstractC0168a0) {
        byte b3 = 1;
        int r52 = r5 - 1;
        if (r52 != 0) {
            if (r52 != 2) {
                if (r52 != 3) {
                    if (r52 != 4) {
                        if (r52 != 5) {
                            if (abstractC0168a0 == null) {
                                b3 = 0;
                            }
                            this.zzg = b3;
                            return null;
                        }
                        return zza;
                    }
                    return new W(zza);
                }
                return new g();
            }
            return new J0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᔈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }

    public final String o() {
        return this.zze;
    }

    public final String p() {
        return this.zzf;
    }
}
