package W1;

import java.util.concurrent.Executor;
import x1.D6;
import x1.I6;
import x1.M6;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final f f1507a;

    /* renamed from: b  reason: collision with root package name */
    public final Q1.d f1508b;

    public e(f fVar, Q1.d dVar, Q1.g gVar) {
        this.f1507a = fVar;
        this.f1508b = dVar;
    }

    public final a a(S1.b bVar) {
        String str;
        I6 a4;
        h hVar = (h) this.f1507a.g(bVar);
        bVar.getClass();
        Executor executor = (Executor) this.f1508b.f1065a.get();
        if (true != c.c()) {
            str = "play-services-mlkit-barcode-scanning";
        } else {
            str = "barcode-scanning";
        }
        synchronized (M6.class) {
            byte b3 = (byte) (((byte) 1) | 2);
            if (b3 == 3) {
                a4 = M6.a(new D6(str, 1));
            } else {
                StringBuilder sb = new StringBuilder();
                if ((b3 & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b3 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        }
        return new a(bVar, hVar, executor, a4);
    }
}
