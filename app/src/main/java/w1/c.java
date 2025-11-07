package W1;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k0.C0322i;
import x1.A6;
import x1.AbstractC0738x;
import x1.B6;
import x1.C0754z;
import x1.G;
import x1.I6;
import x1.N4;
import x1.O4;
import x1.X4;
import x1.Y4;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray f1500a;

    /* renamed from: b  reason: collision with root package name */
    public static final SparseArray f1501b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference f1502c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f1503d;

    static {
        SparseArray sparseArray = new SparseArray();
        f1500a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f1501b = sparseArray2;
        f1502c = new AtomicReference();
        sparseArray.put(-1, X4.zza);
        sparseArray.put(1, X4.zzb);
        sparseArray.put(2, X4.zzc);
        sparseArray.put(4, X4.zzd);
        sparseArray.put(8, X4.zze);
        sparseArray.put(16, X4.zzf);
        sparseArray.put(32, X4.zzg);
        sparseArray.put(64, X4.zzh);
        sparseArray.put(RecognitionOptions.ITF, X4.zzi);
        sparseArray.put(RecognitionOptions.QR_CODE, X4.zzj);
        sparseArray.put(RecognitionOptions.UPC_A, X4.zzk);
        sparseArray.put(RecognitionOptions.UPC_E, X4.zzl);
        sparseArray.put(RecognitionOptions.PDF417, X4.zzm);
        sparseArray.put(RecognitionOptions.AZTEC, X4.zzn);
        sparseArray2.put(0, Y4.zza);
        sparseArray2.put(1, Y4.zzb);
        sparseArray2.put(2, Y4.zzc);
        sparseArray2.put(3, Y4.zzd);
        sparseArray2.put(4, Y4.zze);
        sparseArray2.put(5, Y4.zzf);
        sparseArray2.put(6, Y4.zzg);
        sparseArray2.put(7, Y4.zzh);
        sparseArray2.put(8, Y4.zzi);
        sparseArray2.put(9, Y4.zzj);
        sparseArray2.put(10, Y4.zzk);
        sparseArray2.put(11, Y4.zzl);
        sparseArray2.put(12, Y4.zzm);
        HashMap hashMap = new HashMap();
        f1503d = hashMap;
        hashMap.put(1, A6.zzb);
        hashMap.put(2, A6.zzc);
        hashMap.put(4, A6.zzd);
        hashMap.put(8, A6.zze);
        hashMap.put(16, A6.zzf);
        hashMap.put(32, A6.zzg);
        hashMap.put(64, A6.zzh);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.ITF), A6.zzi);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.QR_CODE), A6.zzj);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.UPC_A), A6.zzk);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.UPC_E), A6.zzl);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.PDF417), A6.zzm);
        hashMap.put(Integer.valueOf((int) RecognitionOptions.AZTEC), A6.zzn);
    }

    public static B6 a(S1.b bVar) {
        int r4 = bVar.f1197a;
        C0754z c0754z = new C0754z();
        HashMap hashMap = f1503d;
        if (r4 == 0) {
            Collection<Object> values = hashMap.values();
            if (values instanceof Collection) {
                c0754z.b(values.size() + c0754z.f6143b);
                if (values instanceof AbstractC0738x) {
                    c0754z.f6143b = ((AbstractC0738x) values).e(c0754z.f6143b, c0754z.f6142a);
                }
            }
            for (Object obj : values) {
                c0754z.a(obj);
            }
        } else {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & r4) != 0) {
                    c0754z.a((A6) entry.getValue());
                }
            }
        }
        C0322i c0322i = new C0322i(26);
        c0322i.f3983K = c0754z.c();
        return new B6(c0322i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x1.H6, W1.b, java.lang.Object] */
    public static void b(I6 r12, N4 n4) {
        ?? obj = new Object();
        obj.f1499a = n4;
        r12.b(obj, O4.zzm);
    }

    public static boolean c() {
        boolean z3;
        AtomicReference atomicReference = f1502c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context b3 = Q1.g.c().b();
        G g = j.f1523h;
        if (t1.e.a(b3, ModuleDescriptor.MODULE_ID) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        atomicReference.set(Boolean.valueOf(z3));
        return z3;
    }
}
