package io.flutter.embedding.engine.renderer;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.r;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements DefaultLifecycleObserver {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ n f3460J;

    public b(n nVar) {
        this.f3460J = nVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void f(r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(r rVar) {
        Iterator it = this.f3460J.g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer.access$200((FlutterRenderer$ImageReaderSurfaceProducer) it.next());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(r rVar) {
    }
}
