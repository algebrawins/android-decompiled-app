package D1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;

/* loaded from: classes.dex */
public final class a extends AbstractC0168a0 implements A0 {
    private static final a zza;
    private int zzd;
    private g zze;
    private j zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0, D1.a] */
    static {
        ?? abstractC0168a0 = new AbstractC0168a0();
        zza = abstractC0168a0;
        AbstractC0168a0.h(a.class, abstractC0168a0);
    }

    public static h n() {
        return (h) zza.d();
    }

    public static /* synthetic */ void o(a aVar, g gVar) {
        aVar.zze = gVar;
        aVar.zzd |= 1;
    }

    public static /* synthetic */ void p(a aVar, j jVar) {
        aVar.zzf = jVar;
        aVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r4, AbstractC0168a0 abstractC0168a0) {
        int r42 = r4 - 1;
        if (r42 != 0) {
            if (r42 != 2) {
                if (r42 != 3) {
                    if (r42 != 4) {
                        if (r42 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new W(zza);
                }
                return new AbstractC0168a0();
            }
            return new J0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
