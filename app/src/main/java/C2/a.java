package C2;

import D.s0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.List;
import x1.AbstractC0616g4;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements M2.l {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f252J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f253K;

    public /* synthetic */ a(int r12, Object obj) {
        this.f252J = r12;
        this.f253K = obj;
    }

    @Override // M2.l
    public final Object h(Object obj) {
        switch (this.f252J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (obj == ((e) this.f253K)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                Integer num = (Integer) obj;
                N2.g.b(num);
                ((d2.n) this.f253K).h(num);
                return B2.i.f210a;
            case 2:
                ((d2.n) this.f253K).h(Double.valueOf(((s0) obj).c()));
                return B2.i.f210a;
            default:
                List list = (List) obj;
                N2.g.b(list);
                List<U1.i> list2 = list;
                ArrayList arrayList = new ArrayList(k.g(list2));
                for (U1.i iVar : list2) {
                    N2.g.b(iVar);
                    arrayList.add(AbstractC0616g4.b(iVar));
                }
                boolean isEmpty = arrayList.isEmpty();
                d2.n nVar = (d2.n) this.f253K;
                if (isEmpty) {
                    nVar.h(null);
                } else {
                    nVar.h(arrayList);
                }
                return B2.i.f210a;
        }
    }
}
