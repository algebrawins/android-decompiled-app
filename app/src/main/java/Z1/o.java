package Z1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;

/* loaded from: classes.dex */
public final class o extends AbstractC0168a0 implements A0 {
    private static final o zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private n zzj;
    private n zzk;

    static {
        o oVar = new o();
        zza = oVar;
        AbstractC0168a0.h(o.class, oVar);
    }

    public static o p() {
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
                return new o();
            }
            return new J0(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final n n() {
        n nVar = this.zzk;
        if (nVar == null) {
            return n.t();
        }
        return nVar;
    }

    public final n o() {
        n nVar = this.zzj;
        if (nVar == null) {
            return n.t();
        }
        return nVar;
    }

    public final String q() {
        return this.zzf;
    }

    public final String r() {
        return this.zzg;
    }

    public final String s() {
        return this.zzh;
    }

    public final String t() {
        return this.zzi;
    }

    public final String u() {
        return this.zze;
    }
}
