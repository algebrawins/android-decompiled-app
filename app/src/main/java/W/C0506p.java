package w;

import D.C0026f;
import android.hardware.camera2.CameraAccessException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import x1.AbstractC0636k0;

/* renamed from: w.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506p implements H.c {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ C0511v f5220J;

    public /* synthetic */ C0506p(C0511v c0511v) {
        this.f5220J = c0511v;
    }

    @Override // H.c
    public void b(Object obj) {
        Void r3 = (Void) obj;
        C0511v c0511v = this.f5220J;
        if (c0511v.f5257X.f171J == 2 && c0511v.f5246M == EnumC0508s.OPENED) {
            this.f5220J.C(EnumC0508s.CONFIGURED);
        }
    }

    @Override // H.c
    public void c0(Throwable th) {
        androidx.camera.core.impl.c0 c0Var = null;
        if (th instanceof androidx.camera.core.impl.C) {
            C0511v c0511v = this.f5220J;
            androidx.camera.core.impl.D d4 = ((androidx.camera.core.impl.C) th).f2104J;
            Iterator it = c0511v.f5243J.o().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.camera.core.impl.c0 c0Var2 = (androidx.camera.core.impl.c0) it.next();
                if (c0Var2.b().contains(d4)) {
                    c0Var = c0Var2;
                    break;
                }
            }
            if (c0Var != null) {
                C0511v c0511v2 = this.f5220J;
                c0511v2.getClass();
                G.e d5 = AbstractC0636k0.d();
                List list = c0Var.f2183e;
                if (!list.isEmpty()) {
                    c0511v2.q("Posting surface closed", new Throwable());
                    d5.execute(new D.N((androidx.camera.core.impl.a0) list.get(0), c0Var));
                }
            }
        } else if (th instanceof CancellationException) {
            this.f5220J.q("Unable to configure camera cancelled", null);
        } else {
            EnumC0508s enumC0508s = this.f5220J.f5246M;
            EnumC0508s enumC0508s2 = EnumC0508s.OPENED;
            if (enumC0508s == enumC0508s2) {
                this.f5220J.D(enumC0508s2, new C0026f(4, th), true);
            }
            if (th instanceof CameraAccessException) {
                C0511v c0511v3 = this.f5220J;
                c0511v3.q("Unable to configure camera due to " + th.getMessage(), null);
            } else if (th instanceof TimeoutException) {
                x1.X.b("Camera2CameraImpl", "Unable to configure camera " + this.f5220J.f5251R.f5272a + ", timeout!");
            }
        }
    }
}
