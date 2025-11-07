package C;

import S.i;
import com.google.android.libraries.barhopper.RecognitionOptions;
import w.C0501k;
import w.C0511v;
import w.EnumC0508s;
import w.RunnableC0496e;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f213J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ boolean f214K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f215L;

    public /* synthetic */ b(Object obj, boolean z3, int r3) {
        this.f213J = r3;
        this.f215L = obj;
        this.f214K = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f213J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                e eVar = (e) this.f215L;
                boolean z3 = eVar.f221a;
                boolean z4 = this.f214K;
                if (z3 != z4) {
                    eVar.f221a = z4;
                    if (z4) {
                        if (eVar.f222b) {
                            C0501k c0501k = eVar.f223c;
                            c0501k.getClass();
                            c0501k.f5178K.execute(new RunnableC0496e(c0501k, 0));
                            eVar.f222b = false;
                            return;
                        }
                        return;
                    }
                    i iVar = eVar.g;
                    if (iVar != null) {
                        iVar.b(new Exception("The camera control has became inactive."));
                        eVar.g = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                C0511v c0511v = (C0511v) this.f215L;
                boolean z5 = this.f214K;
                c0511v.f5265g0 = z5;
                if (z5 && c0511v.f5246M == EnumC0508s.PENDING_OPEN) {
                    c0511v.G(false);
                    return;
                }
                return;
        }
    }
}
