package Z1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0;

/* loaded from: classes.dex */
public final class m extends AbstractC0168a0 implements A0 {
    private static final m zza;
    private int zzd;
    private String zze = "";
    private i0 zzf = I0.f2800M;

    static {
        m mVar = new m();
        zza = mVar;
        AbstractC0168a0.h(m.class, mVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r5, AbstractC0168a0 abstractC0168a0) {
        int r52 = r5 - 1;
        if (r52 != 0) {
            if (r52 != 2) {
                if (r52 != 3) {
                    if (r52 != 4) {
                        if (r52 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new W(zza);
                }
                return new m();
            }
            return new J0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", b.class});
        }
        return (byte) 1;
    }
}
