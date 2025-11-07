package io.flutter.embedding.engine.renderer;

import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.E;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f3498a;

    /* renamed from: c  reason: collision with root package name */
    public Surface f3500c;

    /* renamed from: h  reason: collision with root package name */
    public final a f3504h;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicLong f3499b = new AtomicLong(0);

    /* renamed from: d  reason: collision with root package name */
    public boolean f3501d = false;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f3502e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f3503f = new HashSet();
    public final ArrayList g = new ArrayList();

    public n(FlutterJNI flutterJNI) {
        a aVar = new a(this);
        this.f3504h = aVar;
        this.f3498a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        E.f2433R.f2439O.a(new b(this));
    }

    public final void a(int r3) {
        Iterator it = this.f3503f.iterator();
        while (it.hasNext()) {
            u uVar = (u) ((WeakReference) it.next()).get();
            if (uVar != null) {
                uVar.onTrimMemory(r3);
            } else {
                it.remove();
            }
        }
    }

    public final void b(u uVar) {
        HashSet hashSet = this.f3503f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == uVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void c() {
        if (this.f3500c != null) {
            this.f3498a.onSurfaceDestroyed();
            if (this.f3501d) {
                this.f3504h.a();
            }
            this.f3501d = false;
            this.f3500c = null;
        }
    }
}
