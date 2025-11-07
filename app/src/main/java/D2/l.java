package d2;

import D.E;
import D.H;
import android.hardware.display.DisplayManager;
import android.util.Size;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.O;
import androidx.camera.core.impl.S;

/* loaded from: classes.dex */
public final class l implements DisplayManager.DisplayListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f3021a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Size f3022b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ E f3023c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ m f3024d;

    public l(boolean z3, Size size, E e4, m mVar) {
        this.f3021a = z3;
        this.f3022b = size;
        this.f3023c = e4;
        this.f3024d = mVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int r5) {
        E e4 = this.f3023c;
        boolean z3 = this.f3021a;
        O o3 = e4.f285b;
        Size size = this.f3022b;
        if (z3) {
            o3.g(J.f2146v, new O.b(O.a.f1009a, new O.c(size), null));
            F f2 = new F(S.a(o3));
            I.e(f2);
            new H(f2);
            return;
        }
        o3.g(J.f2142r, this.f3024d.a(size));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int r12) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int r12) {
    }
}
