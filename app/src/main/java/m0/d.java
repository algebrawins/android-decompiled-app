package M0;

import K0.i;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d implements L0.a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f863a;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f864b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f865c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f866d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f863a = windowLayoutComponent;
    }

    @Override // L0.a
    public final void a(Context context, y0.d dVar, i iVar) {
        B2.i iVar2;
        ReentrantLock reentrantLock = this.f864b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f865c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f866d;
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
                this.f863a.addWindowLayoutInfoListener(context, fVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // L0.a
    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f864b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f866d;
        try {
            Context context = (Context) linkedHashMap.get(iVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f865c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(iVar);
            linkedHashMap.remove(iVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f863a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
