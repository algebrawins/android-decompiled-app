package M0;

import C2.q;
import K0.i;
import N2.p;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class c implements L0.a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f857a;

    /* renamed from: b  reason: collision with root package name */
    public final A.c f858b;

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantLock f859c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f860d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f861e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f862f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, A.c cVar) {
        this.f857a = windowLayoutComponent;
        this.f858b = cVar;
    }

    @Override // L0.a
    public final void a(Context context, y0.d dVar, i iVar) {
        B2.i iVar2;
        ReentrantLock reentrantLock = this.f859c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f860d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f861e;
            if (fVar != null) {
                fVar.b(iVar);
                linkedHashMap2.put(iVar, context);
                iVar2 = B2.i.f210a;
            } else {
                iVar2 = null;
            }
            if (iVar2 == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(iVar, context);
                fVar2.b(iVar);
                if (context instanceof Activity) {
                    this.f862f.put(fVar2, this.f858b.y(this.f857a, p.a(WindowLayoutInfo.class), (Activity) context, new b(fVar2)));
                } else {
                    fVar2.accept(new WindowLayoutInfo(q.f272J));
                    reentrantLock.unlock();
                    return;
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // L0.a
    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f859c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f861e;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f860d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.f870d.isEmpty()) {
                linkedHashMap2.remove(context);
                H0.e eVar = (H0.e) this.f862f.remove(fVar);
                if (eVar != null) {
                    eVar.f721a.invoke(eVar.f722b, eVar.f723c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
