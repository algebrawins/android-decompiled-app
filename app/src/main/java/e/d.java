package E;

import A0.C0001b;
import android.view.KeyEvent;
import h2.D;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f507a;

    /* renamed from: b  reason: collision with root package name */
    public Object f508b;

    public void a(boolean z3) {
        if (!this.f507a) {
            this.f507a = true;
            D d4 = (D) this.f508b;
            int r22 = d4.f3291c - 1;
            d4.f3291c = r22;
            boolean z4 = z3 | d4.f3290b;
            d4.f3290b = z4;
            if (r22 == 0 && !z4) {
                ((C0001b) d4.f3293e).Q((KeyEvent) d4.f3292d);
                return;
            }
            return;
        }
        throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
    }

    public void b(boolean z3) {
        if (z3 == this.f507a) {
            return;
        }
        this.f507a = z3;
        if (!z3) {
            synchronized (((F1.a) this.f508b).f614J) {
            }
        }
    }
}
