package D;

import android.media.ImageReader;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public final class b0 implements androidx.camera.core.impl.L, InterfaceC0044z {

    /* renamed from: J  reason: collision with root package name */
    public final Object f354J;

    /* renamed from: K  reason: collision with root package name */
    public final a0 f355K;

    /* renamed from: L  reason: collision with root package name */
    public int f356L;

    /* renamed from: M  reason: collision with root package name */
    public final A.k f357M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f358N;

    /* renamed from: O  reason: collision with root package name */
    public final B0.e f359O;

    /* renamed from: P  reason: collision with root package name */
    public androidx.camera.core.impl.K f360P;

    /* renamed from: Q  reason: collision with root package name */
    public Executor f361Q;

    /* renamed from: R  reason: collision with root package name */
    public final LongSparseArray f362R;

    /* renamed from: S  reason: collision with root package name */
    public final LongSparseArray f363S;

    /* renamed from: T  reason: collision with root package name */
    public int f364T;

    /* renamed from: U  reason: collision with root package name */
    public final ArrayList f365U;

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f366V;

    public b0(int r22, int r3, int r4, int r5) {
        B0.e eVar = new B0.e(ImageReader.newInstance(r22, r3, r4, r5));
        this.f354J = new Object();
        this.f355K = new a0(0, this);
        this.f356L = 0;
        this.f357M = new A.k(2, this);
        this.f358N = false;
        this.f362R = new LongSparseArray();
        this.f363S = new LongSparseArray();
        this.f366V = new ArrayList();
        this.f359O = eVar;
        this.f364T = 0;
        this.f365U = new ArrayList(k());
    }

    @Override // D.InterfaceC0044z
    public final void a(A a4) {
        synchronized (this.f354J) {
            b(a4);
        }
    }

    @Override // androidx.camera.core.impl.L
    public final X acquireLatestImage() {
        synchronized (this.f354J) {
            try {
                if (this.f365U.isEmpty()) {
                    return null;
                }
                if (this.f364T < this.f365U.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int r22 = 0; r22 < this.f365U.size() - 1; r22++) {
                        if (!this.f366V.contains(this.f365U.get(r22))) {
                            arrayList.add((X) this.f365U.get(r22));
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((X) it.next()).close();
                    }
                    int size = this.f365U.size();
                    ArrayList arrayList2 = this.f365U;
                    this.f364T = size;
                    X x3 = (X) arrayList2.get(size - 1);
                    this.f366V.add(x3);
                    return x3;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(A a4) {
        synchronized (this.f354J) {
            try {
                int indexOf = this.f365U.indexOf(a4);
                if (indexOf >= 0) {
                    this.f365U.remove(indexOf);
                    int r22 = this.f364T;
                    if (indexOf <= r22) {
                        this.f364T = r22 - 1;
                    }
                }
                this.f366V.remove(a4);
                if (this.f356L > 0) {
                    d(this.f359O);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(g0 g0Var) {
        androidx.camera.core.impl.K k3;
        Executor executor;
        synchronized (this.f354J) {
            try {
                if (this.f365U.size() < k()) {
                    g0Var.a(this);
                    this.f365U.add(g0Var);
                    k3 = this.f360P;
                    executor = this.f361Q;
                } else {
                    x1.X.a("TAG", "Maximum image number reached.");
                    g0Var.close();
                    k3 = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (k3 != null) {
            if (executor != null) {
                executor.execute(new RunnableC0023c(2, this, k3));
            } else {
                k3.a(this);
            }
        }
    }

    @Override // androidx.camera.core.impl.L, c0.InterfaceC0157a
    public final void close() {
        synchronized (this.f354J) {
            try {
                if (this.f358N) {
                    return;
                }
                Iterator it = new ArrayList(this.f365U).iterator();
                while (it.hasNext()) {
                    ((X) it.next()).close();
                }
                this.f365U.clear();
                this.f359O.close();
                this.f358N = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(androidx.camera.core.impl.L l3) {
        X x3;
        synchronized (this.f354J) {
            try {
                if (this.f358N) {
                    return;
                }
                int size = this.f363S.size() + this.f365U.size();
                if (size >= l3.k()) {
                    x1.X.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        x3 = l3.o();
                        if (x3 != null) {
                            this.f356L--;
                            size++;
                            this.f363S.put(x3.g().c(), x3);
                            e();
                        }
                    } catch (IllegalStateException e4) {
                        String f2 = x1.X.f("MetadataImageReader");
                        if (x1.X.e(f2, 3)) {
                            Log.d(f2, "Failed to acquire next image.", e4);
                        }
                        x3 = null;
                    }
                    if (x3 == null || this.f356L <= 0) {
                        break;
                    }
                } while (size < l3.k());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f354J) {
            try {
                for (int size = this.f362R.size() - 1; size >= 0; size--) {
                    U u3 = (U) this.f362R.valueAt(size);
                    long c4 = u3.c();
                    X x3 = (X) this.f363S.get(c4);
                    if (x3 != null) {
                        this.f363S.remove(c4);
                        this.f362R.removeAt(size);
                        c(new g0(x3, null, u3));
                    }
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f354J) {
            try {
                if (this.f363S.size() != 0 && this.f362R.size() != 0) {
                    long keyAt = this.f363S.keyAt(0);
                    Long valueOf = Long.valueOf(keyAt);
                    long keyAt2 = this.f362R.keyAt(0);
                    AbstractC0624h4.b(!Long.valueOf(keyAt2).equals(valueOf));
                    if (keyAt2 > keyAt) {
                        for (int size = this.f363S.size() - 1; size >= 0; size--) {
                            if (this.f363S.keyAt(size) < keyAt2) {
                                ((X) this.f363S.valueAt(size)).close();
                                this.f363S.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f362R.size() - 1; size2 >= 0; size2--) {
                            if (this.f362R.keyAt(size2) < keyAt) {
                                this.f362R.removeAt(size2);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.L
    public final int getHeight() {
        int height;
        synchronized (this.f354J) {
            height = this.f359O.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.L
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f354J) {
            surface = this.f359O.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.L
    public final int getWidth() {
        int width;
        synchronized (this.f354J) {
            width = this.f359O.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.L
    public final int k() {
        int k3;
        synchronized (this.f354J) {
            k3 = this.f359O.k();
        }
        return k3;
    }

    @Override // androidx.camera.core.impl.L
    public final int m() {
        int m3;
        synchronized (this.f354J) {
            m3 = this.f359O.m();
        }
        return m3;
    }

    @Override // androidx.camera.core.impl.L
    public final X o() {
        synchronized (this.f354J) {
            try {
                if (this.f365U.isEmpty()) {
                    return null;
                }
                if (this.f364T < this.f365U.size()) {
                    ArrayList arrayList = this.f365U;
                    int r22 = this.f364T;
                    this.f364T = r22 + 1;
                    X x3 = (X) arrayList.get(r22);
                    this.f366V.add(x3);
                    return x3;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.L
    public final void s() {
        synchronized (this.f354J) {
            this.f359O.s();
            this.f360P = null;
            this.f361Q = null;
            this.f356L = 0;
        }
    }

    @Override // androidx.camera.core.impl.L
    public final void t(androidx.camera.core.impl.K k3, Executor executor) {
        synchronized (this.f354J) {
            k3.getClass();
            this.f360P = k3;
            executor.getClass();
            this.f361Q = executor;
            this.f359O.t(this.f357M, executor);
        }
    }
}
