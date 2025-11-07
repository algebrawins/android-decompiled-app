package Z1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;

/* loaded from: classes.dex */
public final class n extends AbstractC0168a0 implements A0 {
    private static final n zza;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0, Z1.n] */
    static {
        ?? abstractC0168a0 = new AbstractC0168a0();
        zza = abstractC0168a0;
        AbstractC0168a0.h(n.class, abstractC0168a0);
    }

    public static n t() {
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
                return new AbstractC0168a0();
            }
            return new J0(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zzg;
    }

    public final int o() {
        return this.zzh;
    }

    public final int p() {
        return this.zzi;
    }

    public final int q() {
        return this.zzf;
    }

    public final int r() {
        return this.zzj;
    }

    public final int s() {
        return this.zze;
    }

    public final boolean u() {
        return this.zzk;
    }
}
