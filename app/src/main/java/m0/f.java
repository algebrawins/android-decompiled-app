package M0;

import K0.i;
import K0.l;
import N2.g;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e0.InterfaceC0247a;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class f implements InterfaceC0247a, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final Context f867a;

    /* renamed from: c  reason: collision with root package name */
    public l f869c;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f868b = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f870d = new LinkedHashSet();

    public f(Context context) {
        this.f867a = context;
    }

    @Override // e0.InterfaceC0247a
    /* renamed from: a */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        g.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f868b;
        reentrantLock.lock();
        try {
            this.f869c = e.c(this.f867a, windowLayoutInfo);
            for (InterfaceC0247a interfaceC0247a : this.f870d) {
                interfaceC0247a.accept(this.f869c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(i iVar) {
        ReentrantLock reentrantLock = this.f868b;
        reentrantLock.lock();
        try {
            l lVar = this.f869c;
            if (lVar != null) {
                iVar.accept(lVar);
            }
            this.f870d.add(iVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f870d.isEmpty();
    }

    public final void d(i iVar) {
        ReentrantLock reentrantLock = this.f868b;
        reentrantLock.lock();
        try {
            this.f870d.remove(iVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
