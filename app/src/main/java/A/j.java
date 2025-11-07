package A;

import android.hardware.camera2.CameraDevice;
import h2.J;
import java.util.List;
import k0.C0322i;
import w.d0;
import w.e0;
import x1.AbstractC0624h4;
import y.v;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements H.a, S.j {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ List f17J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ v f18K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f19L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ Object f20M;

    public /* synthetic */ j(k kVar, CameraDevice cameraDevice, v vVar, List list) {
        this.f19L = kVar;
        this.f20M = cameraDevice;
        this.f18K = vVar;
        this.f17J = list;
    }

    @Override // S.j
    public Object a0(S.i iVar) {
        boolean z3;
        String str;
        d0 d0Var = (d0) this.f19L;
        List list = this.f17J;
        C0322i c0322i = (C0322i) this.f20M;
        v vVar = this.f18K;
        synchronized (d0Var.f5134a) {
            d0Var.l(list);
            if (d0Var.f5141i == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0624h4.f("The openCaptureSessionCompleter can only set once!", z3);
            d0Var.f5141i = iVar;
            ((J) c0322i.f3983K).s(vVar);
            str = "openCaptureSession[session=" + d0Var + "]";
        }
        return str;
    }

    @Override // H.a
    public E1.a apply(Object obj) {
        List list = (List) obj;
        return e0.u((e0) ((k) this.f19L).f22K, (CameraDevice) this.f20M, this.f18K, this.f17J);
    }

    public /* synthetic */ j(d0 d0Var, List list, C0322i c0322i, v vVar) {
        this.f19L = d0Var;
        this.f17J = list;
        this.f20M = c0322i;
        this.f18K = vVar;
    }
}
