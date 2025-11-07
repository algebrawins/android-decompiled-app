package D1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.E;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0183f0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.U;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends AbstractC0168a0 implements A0 {
    private static final c zza;
    private int zzd;
    private InterfaceC0183f0 zze;
    private InterfaceC0183f0 zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        c cVar = new c();
        zza = cVar;
        AbstractC0168a0.h(c.class, cVar);
    }

    public c() {
        U u3 = U.f2851M;
        this.zze = u3;
        this.zzf = u3;
    }

    public static b n() {
        return (b) zza.d();
    }

    public static /* synthetic */ void o(c cVar, int r22) {
        cVar.zzd |= 2;
        cVar.zzh = r22;
    }

    public static void p(c cVar, float f2) {
        int r12;
        InterfaceC0183f0 interfaceC0183f0 = cVar.zze;
        if (!((E) interfaceC0183f0).f2786J) {
            int size = interfaceC0183f0.size();
            if (size == 0) {
                r12 = 10;
            } else {
                r12 = size + size;
            }
            U u3 = (U) interfaceC0183f0;
            if (r12 >= u3.f2853L) {
                cVar.zze = new U(Arrays.copyOf(u3.f2852K, r12), u3.f2853L, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        ((U) cVar.zze).i(f2);
    }

    public static void q(c cVar, float f2) {
        int r12;
        InterfaceC0183f0 interfaceC0183f0 = cVar.zzf;
        if (!((E) interfaceC0183f0).f2786J) {
            int size = interfaceC0183f0.size();
            if (size == 0) {
                r12 = 10;
            } else {
                r12 = size + size;
            }
            U u3 = (U) interfaceC0183f0;
            if (r12 >= u3.f2853L) {
                cVar.zzf = new U(Arrays.copyOf(u3.f2852K, r12), u3.f2853L, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        ((U) cVar.zzf).i(f2);
    }

    public static /* synthetic */ void r(c cVar, int r22) {
        cVar.zzd |= 1;
        cVar.zzg = r22;
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
                return new c();
            }
            return new J0(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
