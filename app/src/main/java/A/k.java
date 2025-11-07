package A;

import D.C0030k;
import D.C0040v;
import D.RunnableC0023c;
import D.X;
import D.b0;
import D.g0;
import N.n;
import android.graphics.RectF;
import android.util.Log;
import androidx.camera.core.impl.K;
import androidx.camera.core.impl.L;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d2.C0239g;
import h2.AbstractActivityC0292d;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import r2.InterfaceC0446c;
import s.InterfaceC0447a;
import w.C0501k;
import w.p0;
import x1.AbstractC0596e0;
import x1.AbstractC0612g0;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements S.j, K, InterfaceC0447a, H.a, C1.c, C1.e, C1.d, InterfaceC0446c {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f21J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f22K;

    public /* synthetic */ k(int r12, Object obj) {
        this.f21J = r12;
        this.f22K = obj;
    }

    @Override // androidx.camera.core.impl.K
    public void a(L l3) {
        switch (this.f21J) {
            case 2:
                b0 b0Var = (b0) this.f22K;
                synchronized (b0Var.f354J) {
                    b0Var.f356L++;
                }
                b0Var.d(l3);
                return;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((f) this.f22K).getClass();
                try {
                    X acquireLatestImage = l3.acquireLatestImage();
                    if (acquireLatestImage != null) {
                        AbstractC0612g0.a();
                        x1.X.a("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + acquireLatestImage);
                        acquireLatestImage.close();
                    } else {
                        new Exception("Failed to acquire latest image", null);
                        AbstractC0612g0.a();
                    }
                    return;
                } catch (IllegalStateException e4) {
                    new Exception("Failed to acquire latest image", e4);
                    AbstractC0612g0.a();
                    return;
                }
            default:
                p0 p0Var = (p0) this.f22K;
                p0Var.getClass();
                try {
                    X acquireLatestImage2 = l3.acquireLatestImage();
                    if (acquireLatestImage2 != null) {
                        p0Var.f5222K.B(acquireLatestImage2);
                        return;
                    }
                    return;
                } catch (IllegalStateException e5) {
                    x1.X.b("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e5.getMessage());
                    return;
                }
        }
    }

    @Override // S.j
    public Object a0(S.i iVar) {
        switch (this.f21J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                m mVar = (m) this.f22K;
                mVar.f29e = iVar;
                return "WaitForRepeatingRequestStart[" + mVar + "]";
            case 1:
            case 2:
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                C0501k c0501k = (C0501k) this.f22K;
                c0501k.getClass();
                c0501k.f5178K.execute(new RunnableC0023c(15, c0501k, iVar));
                return "updateSessionConfigAsync";
            case 4:
                G.a a4 = AbstractC0636k0.a();
                E1.a aVar = (E1.a) this.f22K;
                H.f.e(false, aVar, iVar, a4);
                return "nonCancellationPropagating[" + aVar + "]";
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                N.l lVar = (N.l) this.f22K;
                lVar.f933p = iVar;
                return "SettableFuture hashCode: " + lVar.hashCode();
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((n) this.f22K).f958T = iVar;
                return "SurfaceOutputImpl close future complete";
        }
    }

    @Override // s.InterfaceC0447a, H.a
    public E1.a apply(Object obj) {
        Void r12 = (Void) obj;
        return ((C0040v) this.f22K).f469j;
    }

    @Override // C1.e, H.c
    public void b(Object obj) {
        switch (this.f21J) {
            case 12:
                ((C0239g) this.f22K).h(obj);
                return;
            default:
                ((C2.a) this.f22K).h(obj);
                return;
        }
    }

    public void c(C0030k c0030k) {
        for (Map.Entry entry : ((Map) this.f22K).entrySet()) {
            int r22 = c0030k.f413b - ((N.c) entry.getKey()).f880f;
            if (((N.c) entry.getKey()).g) {
                r22 = -r22;
            }
            RectF rectF = F.f.f603a;
            ((N.m) entry.getValue()).f(((r22 % 360) + 360) % 360, -1);
        }
    }

    @Override // C1.c
    public void e(C1.j jVar) {
        switch (this.f21J) {
            case 11:
                N2.g.e(jVar, "it");
                ((W1.a) this.f22K).close();
                return;
            default:
                N2.g.e(jVar, "it");
                ((g0) this.f22K).close();
                return;
        }
    }

    @Override // r2.InterfaceC0446c
    public void h(Object obj) {
        boolean z3 = false;
        if (obj != null) {
            try {
                z3 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e4) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e4);
            }
        }
        ((E.d) ((k) this.f22K).f22K).a(z3);
    }

    @Override // C1.d
    public void q(Exception exc) {
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = exc.toString();
        }
        ((d2.n) this.f22K).h(localizedMessage);
    }

    @Override // s.InterfaceC0447a, H.a
    public Object apply(Object obj) {
        Q.d dVar = Q.d.f1045e;
        dVar.f1049d = (C0040v) obj;
        AbstractC0596e0.a((AbstractActivityC0292d) this.f22K);
        return dVar;
    }
}
