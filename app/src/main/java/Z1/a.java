package Z1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0198l0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.G;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.I0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.L;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.O;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.U0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.W;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a extends AbstractC0168a0 implements A0 {
    private static final a zza;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private i0 zze = I0.f2800M;
    private String zzg = "";
    private L zzh = L.f2812K;

    static {
        a aVar = new a();
        zza = aVar;
        AbstractC0168a0.h(a.class, aVar);
    }

    public static a n(byte[] bArr, O o3) {
        a aVar = zza;
        int length = bArr.length;
        AbstractC0168a0 abstractC0168a0 = (AbstractC0168a0) aVar.m(4, null);
        try {
            N0 b3 = H0.f2796c.b(abstractC0168a0.getClass());
            b3.h(abstractC0168a0, bArr, 0, length, new G(o3));
            b3.a(abstractC0168a0);
            if (AbstractC0168a0.j(abstractC0168a0, true)) {
                return (a) abstractC0168a0;
            }
            throw new IOException(new U0().getMessage());
        } catch (U0 e4) {
            throw new IOException(e4.getMessage());
        } catch (C0198l0 e5) {
            throw e5;
        } catch (IOException e6) {
            if (e6.getCause() instanceof C0198l0) {
                throw ((C0198l0) e6.getCause());
            }
            throw new IOException(e6.getMessage(), e6);
        } catch (IndexOutOfBoundsException unused) {
            throw C0198l0.d();
        }
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
                            this.zzi = b3;
                            return null;
                        }
                        return zza;
                    }
                    return new W(zza);
                }
                return new a();
            }
            return new J0(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", l.class, "zzf", h.f1766b, "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }

    public final i0 o() {
        return this.zze;
    }
}
