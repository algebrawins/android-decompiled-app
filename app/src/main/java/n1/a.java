package N1;

import F1.d;
import F1.t;
import H.e;
import P1.b;
import P1.c;
import Q1.g;
import Q1.h;
import Q1.m;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import q0.k;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements d {

    /* renamed from: K  reason: collision with root package name */
    public static final /* synthetic */ a f978K = new a(0);

    /* renamed from: L  reason: collision with root package name */
    public static final /* synthetic */ a f979L = new a(1);

    /* renamed from: M  reason: collision with root package name */
    public static final /* synthetic */ a f980M = new a(2);

    /* renamed from: N  reason: collision with root package name */
    public static final /* synthetic */ a f981N = new a(3);

    /* renamed from: O  reason: collision with root package name */
    public static final /* synthetic */ a f982O = new a(4);

    /* renamed from: P  reason: collision with root package name */
    public static final /* synthetic */ a f983P = new a(5);

    /* renamed from: Q  reason: collision with root package name */
    public static final /* synthetic */ a f984Q = new a(6);

    /* renamed from: R  reason: collision with root package name */
    public static final /* synthetic */ a f985R = new a(7);

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f986J;

    public /* synthetic */ a(int r12) {
        this.f986J = r12;
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, w1.p] */
    @Override // F1.d
    public final Object a(t tVar) {
        switch (this.f986J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                g gVar = (g) tVar.a(g.class);
                return new Object();
            case 1:
                return new h();
            case 2:
                return new c(tVar.c(b.class));
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new Q1.d(tVar.b(h.class));
            case 4:
                Q1.a aVar = new Q1.a();
                ReferenceQueue referenceQueue = aVar.f1058a;
                Set set = aVar.f1059b;
                set.add(new m(aVar, referenceQueue, set));
                Thread thread = new Thread(new e(8, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            case k.STRING_FIELD_NUMBER /* 5 */:
                Q1.a aVar2 = (Q1.a) tVar.a(Q1.a.class);
                return new Q1.b(0);
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                g gVar2 = (g) tVar.a(g.class);
                synchronized (C2.t.class) {
                    byte b3 = (byte) (((byte) 1) | 2);
                    if (b3 == 3) {
                        C2.t.d(new Object());
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
                return new Object();
            default:
                return new b(tVar.b(O1.a.class));
        }
    }
}
