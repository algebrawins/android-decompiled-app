package D1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.E;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0;

/* loaded from: classes.dex */
public final class e extends AbstractC0168a0 implements A0 {
    private static final e zza;
    private i0 zzd = I0.f2800M;

    static {
        e eVar = new e();
        zza = eVar;
        AbstractC0168a0.h(e.class, eVar);
    }

    public static d n() {
        return (d) zza.d();
    }

    public static void o(e eVar, c cVar) {
        int r12;
        i0 i0Var = eVar.zzd;
        if (!((E) i0Var).f2786J) {
            int size = i0Var.size();
            if (size == 0) {
                r12 = 10;
            } else {
                r12 = size + size;
            }
            eVar.zzd = i0Var.b(r12);
        }
        eVar.zzd.add(cVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0
    public final Object m(int r3, AbstractC0168a0 abstractC0168a0) {
        int r32 = r3 - 1;
        if (r32 != 0) {
            if (r32 != 2) {
                if (r32 != 3) {
                    if (r32 != 4) {
                        if (r32 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new W(zza);
                }
                return new e();
            }
            return new J0(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", c.class});
        }
        return (byte) 1;
    }
}
