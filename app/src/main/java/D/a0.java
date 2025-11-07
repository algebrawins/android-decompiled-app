package D;

import androidx.camera.core.impl.InterfaceC0086n;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a0 extends androidx.camera.core.impl.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f349a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f350b;

    public /* synthetic */ a0(int r12, Object obj) {
        this.f349a = r12;
        this.f350b = obj;
    }

    @Override // androidx.camera.core.impl.i
    public final void b(InterfaceC0086n interfaceC0086n) {
        switch (this.f349a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                b0 b0Var = (b0) this.f350b;
                synchronized (b0Var.f354J) {
                    try {
                        if (!b0Var.f358N) {
                            b0Var.f362R.put(interfaceC0086n.c(), new I.b(interfaceC0086n));
                            b0Var.e();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                Iterator it = ((P.c) this.f350b).f1024J.iterator();
                while (it.hasNext()) {
                    androidx.camera.core.impl.c0 c0Var = ((r0) it.next()).f452l;
                    for (androidx.camera.core.impl.i iVar : c0Var.f2184f.f2250e) {
                        iVar.b(new A.f(8, interfaceC0086n, c0Var.f2184f.g));
                    }
                }
                return;
        }
    }
}
