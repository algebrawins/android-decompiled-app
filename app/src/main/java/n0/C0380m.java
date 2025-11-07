package n0;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.LinkedHashSet;

/* renamed from: n0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380m extends N2.h implements M2.a {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f4301K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ N f4302L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0380m(N n3, int r22) {
        super(0);
        this.f4301K = r22;
        this.f4302L = n3;
    }

    @Override // M2.a
    public final Object a() {
        switch (this.f4301K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((p0.h) this.f4302L.f4225S.a()).f4777c;
            default:
                p0.e eVar = this.f4302L.f4216J;
                String n3 = ((e3.l) eVar.f4761d.a()).f3124J.n();
                synchronized (p0.e.f4757f) {
                    LinkedHashSet linkedHashSet = p0.e.f4756e;
                    if (!linkedHashSet.contains(n3)) {
                        linkedHashSet.add(n3);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + n3 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new p0.h(eVar.f4758a, (e3.l) eVar.f4761d.a(), (X) eVar.f4759b.g((e3.l) eVar.f4761d.a(), eVar.f4758a), new p0.d(eVar, 1));
        }
    }
}
