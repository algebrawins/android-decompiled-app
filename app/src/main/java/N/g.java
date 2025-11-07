package N;

import com.google.android.libraries.barhopper.RecognitionOptions;
import e0.InterfaceC0247a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements InterfaceC0247a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f898a;

    /* renamed from: b  reason: collision with root package name */
    public Object f899b;

    public /* synthetic */ g() {
        this.f898a = 0;
    }

    @Override // e0.InterfaceC0247a
    public final void accept(Object obj) {
        switch (this.f898a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                N2.g.c((InterfaceC0247a) this.f899b, "Listener is not set.");
                ((InterfaceC0247a) this.f899b).accept(obj);
                return;
            case 1:
                c0.d dVar = (c0.d) obj;
                if (dVar == null) {
                    dVar = new c0.d(-3);
                }
                ((A.f) this.f899b).x(dVar);
                return;
            default:
                c0.d dVar2 = (c0.d) obj;
                synchronized (c0.e.f2648c) {
                    try {
                        R.k kVar = c0.e.f2649d;
                        ArrayList arrayList = (ArrayList) kVar.getOrDefault((String) this.f899b, null);
                        if (arrayList != null) {
                            kVar.remove((String) this.f899b);
                            for (int r02 = 0; r02 < arrayList.size(); r02++) {
                                ((InterfaceC0247a) arrayList.get(r02)).accept(dVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ g(int r12, Object obj) {
        this.f898a = r12;
        this.f899b = obj;
    }
}
