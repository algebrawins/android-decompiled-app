package w;

import D.RunnableC0023c;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: w.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0502l implements S.j {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ C0511v f5201J;

    public /* synthetic */ C0502l(C0511v c0511v) {
        this.f5201J = c0511v;
    }

    @Override // S.j
    public Object a0(S.i iVar) {
        C0511v c0511v = this.f5201J;
        c0511v.getClass();
        try {
            c0511v.f5245L.execute(new RunnableC0023c(19, c0511v, iVar));
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            iVar.b(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }
}
