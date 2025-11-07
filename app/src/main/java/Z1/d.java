package Z1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;

/* loaded from: classes.dex */
public final class d extends AbstractC0168a0 implements A0 {
    private static final d zza;
    private int zzd;
    private double zze;
    private double zzf;
    private byte zzg = 2;

    static {
        d dVar = new d();
        zza = dVar;
        AbstractC0168a0.h(d.class, dVar);
    }

    public static d p() {
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
                return new d();
            }
            return new J0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }

    public final double n() {
        return this.zze;
    }

    public final double o() {
        return this.zzf;
    }
}
