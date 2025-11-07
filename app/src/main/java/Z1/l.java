package Z1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0171b0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.E;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0186g0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.K;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.L;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import x1.E0;
import x1.T3;

/* loaded from: classes.dex */
public final class l extends AbstractC0168a0 implements A0 {
    private static final l zza;
    private int zzd;
    private int zze;
    private L zzf;
    private String zzg;
    private int zzh;
    private p zzi;
    private r zzj;
    private C zzk;
    private g zzl;
    private j zzm;
    private i zzn;
    private d zzo;
    private o zzp;
    private q zzq;
    private m zzr;
    private i0 zzs;
    private InterfaceC0186g0 zzt;
    private String zzu;
    private i0 zzv;
    private boolean zzw;
    private double zzx;
    private L zzy;
    private byte zzz = 2;

    static {
        l lVar = new l();
        zza = lVar;
        AbstractC0168a0.h(l.class, lVar);
    }

    public l() {
        K k3 = L.f2812K;
        this.zzf = k3;
        this.zzg = "";
        I0 r22 = I0.f2800M;
        this.zzs = r22;
        this.zzt = C0171b0.f2871M;
        this.zzu = "";
        this.zzv = r22;
        this.zzw = true;
        this.zzy = k3;
    }

    public static void B(l lVar, int r3, f fVar) {
        int r12;
        i0 i0Var = lVar.zzs;
        if (!((E) i0Var).f2786J) {
            int size = i0Var.size();
            if (size == 0) {
                r12 = 10;
            } else {
                r12 = size + size;
            }
            lVar.zzs = i0Var.b(r12);
        }
        lVar.zzs.set(r3, fVar);
    }

    public final i0 A() {
        return this.zzs;
    }

    public final boolean C() {
        if ((this.zzd & RecognitionOptions.PDF417) != 0) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if ((this.zzd & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        if ((this.zzd & RecognitionOptions.AZTEC) != 0) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        if ((this.zzd & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if ((this.zzd & RecognitionOptions.UPC_E) != 0) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        if ((this.zzd & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        if ((this.zzd & RecognitionOptions.ITF) != 0) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        if ((this.zzd & RecognitionOptions.UPC_A) != 0) {
            return true;
        }
        return false;
    }

    public final boolean K() {
        if ((this.zzd & RecognitionOptions.QR_CODE) != 0) {
            return true;
        }
        return false;
    }

    public final int L() {
        int a4 = E0.a(this.zze);
        if (a4 == 0) {
            return 1;
        }
        return a4;
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
                            this.zzz = b3;
                            return null;
                        }
                        return zza;
                    }
                    return new W(zza);
                }
                return new l();
            }
            return new J0(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bЛ\fဈ\u000e\rЛ\u000eည\u0011\u000fᐉ\n\u0010ဉ\u000b\u0011ဉ\f\u0012\u0016\u0013ဉ\r\u0014ဇ\u000f\u0015က\u0010", new Object[]{"zzd", "zze", h.f1768d, "zzf", "zzg", "zzh", h.f1769e, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzs", f.class, "zzu", "zzv", f.class, "zzy", "zzo", "zzp", "zzq", "zzt", "zzr", "zzw", "zzx"});
        }
        return Byte.valueOf(this.zzz);
    }

    public final int n() {
        int a4 = T3.a(this.zzh);
        if (a4 == 0) {
            return 1;
        }
        return a4;
    }

    public final int o() {
        return this.zzs.size();
    }

    public final C p() {
        C c4 = this.zzk;
        if (c4 == null) {
            return C.n();
        }
        return c4;
    }

    public final o q() {
        o oVar = this.zzp;
        if (oVar == null) {
            return o.p();
        }
        return oVar;
    }

    public final p r() {
        p pVar = this.zzi;
        if (pVar == null) {
            return p.o();
        }
        return pVar;
    }

    public final q s() {
        q qVar = this.zzq;
        if (qVar == null) {
            return q.n();
        }
        return qVar;
    }

    public final r t() {
        r rVar = this.zzj;
        if (rVar == null) {
            return r.n();
        }
        return rVar;
    }

    public final d u() {
        d dVar = this.zzo;
        if (dVar == null) {
            return d.p();
        }
        return dVar;
    }

    public final g v() {
        g gVar = this.zzl;
        if (gVar == null) {
            return g.n();
        }
        return gVar;
    }

    public final i w() {
        i iVar = this.zzn;
        if (iVar == null) {
            return i.n();
        }
        return iVar;
    }

    public final j x() {
        j jVar = this.zzm;
        if (jVar == null) {
            return j.n();
        }
        return jVar;
    }

    public final L y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
