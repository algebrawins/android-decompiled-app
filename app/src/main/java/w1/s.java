package w1;

import A0.AbstractC0017t;
import android.content.Context;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import x1.D6;
import x1.F6;
import x1.I6;
import y1.L4;
import y1.N4;
import y1.O4;

/* loaded from: classes.dex */
public final class s extends AbstractC0017t {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f5317K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int r12) {
        super(1);
        this.f5317K = r12;
    }

    @Override // A0.AbstractC0017t
    public final Object a(Object obj) {
        switch (this.f5317K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Q1.g c4 = Q1.g.c();
                Context b3 = Q1.g.c().b();
                ArrayList arrayList = new ArrayList();
                ((p) obj).getClass();
                Object obj2 = new Object();
                T0.a aVar = T0.a.f1205e;
                V0.i.b(b3);
                V0.i.a().c(aVar);
                T0.a.f1204d.contains(new S0.b("json"));
                arrayList.add(obj2);
                return new r(c4.b(), (Q1.j) c4.a(Q1.j.class));
            case 1:
                D6 d6 = (D6) obj;
                Q1.g c5 = Q1.g.c();
                return new I6(c5.b(), (Q1.j) c5.a(Q1.j.class), new F6(Q1.g.c().b(), d6), d6.f5531a);
            default:
                Q1.g c6 = Q1.g.c();
                return new O4(c6.b(), (Q1.j) c6.a(Q1.j.class), new N4(Q1.g.c().b(), (L4) obj));
        }
    }
}
