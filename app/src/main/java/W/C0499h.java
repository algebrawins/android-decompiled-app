package w;

import D.RunnableC0023c;
import android.util.ArrayMap;
import androidx.camera.core.impl.InterfaceC0086n;
import h1.C0287g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: w.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499h extends androidx.camera.core.impl.i {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f5160a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayMap f5161b;

    @Override // androidx.camera.core.impl.i
    public final void a() {
        Iterator it = this.f5160a.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.i iVar = (androidx.camera.core.impl.i) it.next();
            try {
                ((Executor) this.f5161b.get(iVar)).execute(new D.N(17, iVar));
            } catch (RejectedExecutionException e4) {
                x1.X.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e4);
            }
        }
    }

    @Override // androidx.camera.core.impl.i
    public final void b(InterfaceC0086n interfaceC0086n) {
        Iterator it = this.f5160a.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.i iVar = (androidx.camera.core.impl.i) it.next();
            try {
                ((Executor) this.f5161b.get(iVar)).execute(new RunnableC0023c(16, iVar, interfaceC0086n));
            } catch (RejectedExecutionException e4) {
                x1.X.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e4);
            }
        }
    }

    @Override // androidx.camera.core.impl.i
    public final void c(C0287g c0287g) {
        Iterator it = this.f5160a.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.i iVar = (androidx.camera.core.impl.i) it.next();
            try {
                ((Executor) this.f5161b.get(iVar)).execute(new RunnableC0023c(17, iVar, c0287g));
            } catch (RejectedExecutionException e4) {
                x1.X.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e4);
            }
        }
    }
}
