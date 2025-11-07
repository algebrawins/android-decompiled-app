package W1;

import A0.AbstractC0017t;
import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import h1.C0285e;
import x1.D6;
import x1.G;
import x1.I6;
import x1.M6;

/* loaded from: classes.dex */
public final class f extends AbstractC0017t {

    /* renamed from: K  reason: collision with root package name */
    public final Q1.g f1509K;

    public f(Q1.g gVar) {
        super(1);
        this.f1509K = gVar;
    }

    @Override // A0.AbstractC0017t
    public final Object a(Object obj) {
        String str;
        I6 a4;
        i jVar;
        S1.b bVar = (S1.b) obj;
        Q1.g gVar = this.f1509K;
        Context b3 = gVar.b();
        if (true != c.c()) {
            str = "play-services-mlkit-barcode-scanning";
        } else {
            str = "barcode-scanning";
        }
        synchronized (M6.class) {
            byte b4 = (byte) (((byte) 1) | 2);
            if (b4 == 3) {
                a4 = M6.a(new D6(str, 1));
            } else {
                StringBuilder sb = new StringBuilder();
                if ((1 & b4) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b4 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        }
        G g = j.f1523h;
        if (t1.e.a(b3, ModuleDescriptor.MODULE_ID) <= 0) {
            C0285e.f3262b.getClass();
            if (C0285e.a(b3) < 204500000) {
                jVar = new k(b3, bVar, a4);
                return new h(gVar, bVar, jVar, a4);
            }
        }
        jVar = new j(b3, bVar, a4);
        return new h(gVar, bVar, jVar, a4);
    }
}
