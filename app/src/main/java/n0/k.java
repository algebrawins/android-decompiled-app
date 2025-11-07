package N0;

import C2.q;
import K0.l;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class k implements L0.a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile k f974c;

    /* renamed from: d  reason: collision with root package name */
    public static final ReentrantLock f975d = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public final i f976a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f977b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f976a = iVar;
        if (iVar != null) {
            iVar.h(new A.a(17, this));
        }
    }

    @Override // L0.a
    public final void a(Context context, y0.d dVar, K0.i iVar) {
        Activity activity;
        Object obj;
        WindowManager.LayoutParams attributes;
        B2.i iVar2 = null;
        r1 = null;
        IBinder iBinder = null;
        l lVar = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        q qVar = q.f272J;
        if (activity != null) {
            ReentrantLock reentrantLock = f975d;
            reentrantLock.lock();
            try {
                i iVar3 = this.f976a;
                if (iVar3 == null) {
                    iVar.accept(new l(qVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f977b;
                boolean z3 = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((j) it.next()).f971a.equals(activity)) {
                            z3 = true;
                            break;
                        }
                    }
                }
                j jVar = new j(activity, dVar, iVar);
                copyOnWriteArrayList.add(jVar);
                if (!z3) {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        iVar3.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new h(iVar3, activity));
                    }
                } else {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (activity.equals(((j) obj).f971a)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    j jVar2 = (j) obj;
                    if (jVar2 != null) {
                        lVar = jVar2.f973c;
                    }
                    if (lVar != null) {
                        jVar.f973c = lVar;
                        jVar.f972b.accept(lVar);
                    }
                }
                reentrantLock.unlock();
                iVar2 = B2.i.f210a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (iVar2 == null) {
            iVar.accept(new l(qVar));
        }
    }

    @Override // L0.a
    public final void b(K0.i iVar) {
        synchronized (f975d) {
            try {
                if (this.f976a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f977b.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar.f972b == iVar) {
                        arrayList.add(jVar);
                    }
                }
                this.f977b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((j) it2.next()).f971a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f977b;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((j) it3.next()).f971a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    i iVar2 = this.f976a;
                    if (iVar2 != null) {
                        iVar2.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
