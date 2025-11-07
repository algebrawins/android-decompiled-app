package D1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.L;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;

/* loaded from: classes.dex */
public final class j extends AbstractC0168a0 implements A0 {
    private static final j zza;
    private int zzd;
    private String zze = "";
    private L zzf;
    private String zzg;
    private L zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;

    static {
        j jVar = new j();
        zza = jVar;
        AbstractC0168a0.h(j.class, jVar);
    }

    public j() {
        K k3 = L.f2812K;
        this.zzf = k3;
        this.zzg = "";
        this.zzh = k3;
        this.zzi = 0.25f;
        this.zzj = 0.25f;
        this.zzk = 0.5f;
        this.zzl = 0.85f;
        this.zzm = 1;
    }

    public static i n() {
        return (i) zza.d();
    }

    public static /* synthetic */ void o(j jVar, L l3) {
        l3.getClass();
        jVar.zzd |= 2;
        jVar.zzf = l3;
    }

    public static /* synthetic */ void p(j jVar, L l3) {
        l3.getClass();
        jVar.zzd |= 8;
        jVar.zzh = l3;
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
                return new j();
            }
            return new J0(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tင\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }
}
