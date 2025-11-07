package D1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0193j1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0183f0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.L;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.U;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;

/* loaded from: classes.dex */
public final class g extends AbstractC0168a0 implements A0 {
    private static final g zza;
    private int zzd;
    private e zzj;
    private C0193j1 zzm;
    private String zze = "";
    private L zzf = L.f2812K;
    private int zzg = 10;
    private float zzh = 0.5f;
    private float zzi = 0.05f;
    private InterfaceC0183f0 zzk = U.f2851M;
    private int zzl = 1;
    private int zzn = 320;
    private int zzo = 4;
    private int zzp = 2;

    static {
        g gVar = new g();
        zza = gVar;
        AbstractC0168a0.h(g.class, gVar);
    }

    public static f n() {
        return (f) zza.d();
    }

    public static /* synthetic */ void o(g gVar, e eVar) {
        gVar.zzj = eVar;
        gVar.zzd |= 32;
    }

    public static /* synthetic */ void p(g gVar, L l3) {
        l3.getClass();
        gVar.zzd |= 2;
        gVar.zzf = l3;
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
                return new g();
            }
            return new J0(zza, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007\u0013\bင\u0006\tဉ\u0007\nင\b\u000bင\t\fင\n", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        return (byte) 1;
    }
}
