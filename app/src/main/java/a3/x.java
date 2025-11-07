package a3;

import V2.j0;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class x extends N2.h implements M2.p {

    /* renamed from: L  reason: collision with root package name */
    public static final x f1887L = new x(2, 0);

    /* renamed from: M  reason: collision with root package name */
    public static final x f1888M = new x(2, 1);

    /* renamed from: N  reason: collision with root package name */
    public static final x f1889N = new x(2, 2);

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f1890K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int r12, int r22) {
        super(r12);
        this.f1890K = r22;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        Integer num;
        int r22;
        switch (this.f1890K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                D2.g gVar = (D2.g) obj2;
                if (gVar instanceof j0) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        r22 = num.intValue();
                    } else {
                        r22 = 1;
                    }
                    if (r22 == 0) {
                        return gVar;
                    }
                    return Integer.valueOf(r22 + 1);
                }
                return obj;
            case 1:
                j0 j0Var = (j0) obj;
                D2.g gVar2 = (D2.g) obj2;
                if (j0Var == null) {
                    if (gVar2 instanceof j0) {
                        return (j0) gVar2;
                    }
                    return null;
                }
                return j0Var;
            default:
                D2.g gVar3 = (D2.g) obj2;
                return (z) obj;
        }
    }
}
