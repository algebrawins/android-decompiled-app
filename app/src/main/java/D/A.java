package D;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class A implements X {

    /* renamed from: K  reason: collision with root package name */
    public final X f277K;

    /* renamed from: J  reason: collision with root package name */
    public final Object f276J = new Object();

    /* renamed from: L  reason: collision with root package name */
    public final HashSet f278L = new HashSet();

    public A(X x3) {
        this.f277K = x3;
    }

    public final void a(InterfaceC0044z interfaceC0044z) {
        synchronized (this.f276J) {
            this.f278L.add(interfaceC0044z);
        }
    }

    @Override // D.X
    public final int c() {
        return this.f277K.c();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.f277K.close();
        synchronized (this.f276J) {
            hashSet = new HashSet(this.f278L);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC0044z) it.next()).a(this);
        }
    }

    @Override // D.X
    public final A.a[] e() {
        return this.f277K.e();
    }

    @Override // D.X
    public U g() {
        return this.f277K.g();
    }

    @Override // D.X
    public int getHeight() {
        return this.f277K.getHeight();
    }

    @Override // D.X
    public int getWidth() {
        return this.f277K.getWidth();
    }

    @Override // D.X
    public final Image i() {
        return this.f277K.i();
    }
}
