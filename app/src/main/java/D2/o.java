package d2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements B2.a {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ q f3045J;

    public /* synthetic */ o(q qVar) {
        this.f3045J = qVar;
    }

    public final void b(ArrayList arrayList, Object obj, Integer num, Integer num2) {
        Double d4;
        byte[] bArr = (byte[]) obj;
        q qVar = this.f3045J;
        if (bArr != null) {
            C0235c c0235c = (C0235c) qVar.f3049K;
            B2.c cVar = new B2.c("name", "barcode");
            B2.c cVar2 = new B2.c("data", arrayList);
            B2.c cVar3 = new B2.c("bytes", bArr);
            Double d5 = null;
            if (num != null) {
                d4 = Double.valueOf(num.intValue());
            } else {
                d4 = null;
            }
            B2.c cVar4 = new B2.c("width", d4);
            if (num2 != null) {
                d5 = Double.valueOf(num2.intValue());
            }
            c0235c.p(C2.t.b(cVar, cVar2, new B2.c("image", C2.t.b(cVar3, cVar4, new B2.c("height", d5)))));
            return;
        }
        ((C0235c) qVar.f3049K).p(C2.t.b(new B2.c("name", "barcode"), new B2.c("data", arrayList)));
    }
}
