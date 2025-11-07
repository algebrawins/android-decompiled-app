package Z1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.B;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0;

/* loaded from: classes.dex */
public final class p extends AbstractC0168a0 implements A0 {
    private static final p zza;
    private int zzd;
    private B zze;
    private i0 zzh;
    private i0 zzi;
    private i0 zzj;
    private i0 zzk;
    private String zzl;
    private byte zzm = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        p pVar = new p();
        zza = pVar;
        AbstractC0168a0.h(p.class, pVar);
    }

    public p() {
        I0 r12 = I0.f2800M;
        this.zzh = r12;
        this.zzi = r12;
        this.zzj = r12;
        this.zzk = r12;
        this.zzl = "";
    }

    public static p o() {
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
                            this.zzm = b3;
                            return null;
                        }
                        return zza;
                    }
                    return new W(zza);
                }
                return new p();
            }
            return new J0(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005\u001b\u0006\u001a\u0007Л\bဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C.class, "zzi", r.class, "zzj", "zzk", A.class, "zzl"});
        }
        return Byte.valueOf(this.zzm);
    }

    public final B n() {
        B b3 = this.zze;
        if (b3 == null) {
            return B.n();
        }
        return b3;
    }

    public final String p() {
        return this.zzf;
    }

    public final String q() {
        return this.zzg;
    }

    public final i0 r() {
        return this.zzk;
    }

    public final i0 s() {
        return this.zzi;
    }

    public final i0 t() {
        return this.zzh;
    }

    public final i0 u() {
        return this.zzj;
    }
}
