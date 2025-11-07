package androidx.camera.core.impl;

import D.RunnableC0023c;
import android.util.Log;
import android.util.Size;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicInteger;
import x1.AbstractC0636k0;
import x1.AbstractC0699s0;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: k  reason: collision with root package name */
    public static final Size f2105k = new Size(0, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f2106l = x1.X.d("DeferrableSurface");

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicInteger f2107m = new AtomicInteger(0);

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicInteger f2108n = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f2109a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public int f2110b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2111c = false;

    /* renamed from: d  reason: collision with root package name */
    public S.i f2112d;

    /* renamed from: e  reason: collision with root package name */
    public final S.l f2113e;

    /* renamed from: f  reason: collision with root package name */
    public S.i f2114f;
    public final S.l g;

    /* renamed from: h  reason: collision with root package name */
    public final Size f2115h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2116i;

    /* renamed from: j  reason: collision with root package name */
    public Class f2117j;

    public D(Size size, int r4) {
        this.f2115h = size;
        this.f2116i = r4;
        S.l a4 = AbstractC0699s0.a(new S.j(this) { // from class: androidx.camera.core.impl.B

            /* renamed from: K  reason: collision with root package name */
            public final /* synthetic */ D f2103K;

            {
                this.f2103K = this;
            }

            private final Object a(S.i iVar) {
                D d4 = this.f2103K;
                synchronized (d4.f2109a) {
                    d4.f2112d = iVar;
                }
                return "DeferrableSurface-termination(" + d4 + ")";
            }

            @Override // S.j
            public final Object a0(S.i iVar) {
                switch (r2) {
                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        return a(iVar);
                    default:
                        D d4 = this.f2103K;
                        synchronized (d4.f2109a) {
                            d4.f2114f = iVar;
                        }
                        return "DeferrableSurface-close(" + d4 + ")";
                }
            }
        });
        this.f2113e = a4;
        this.g = AbstractC0699s0.a(new S.j(this) { // from class: androidx.camera.core.impl.B

            /* renamed from: K  reason: collision with root package name */
            public final /* synthetic */ D f2103K;

            {
                this.f2103K = this;
            }

            private final Object a(S.i iVar) {
                D d4 = this.f2103K;
                synchronized (d4.f2109a) {
                    d4.f2112d = iVar;
                }
                return "DeferrableSurface-termination(" + d4 + ")";
            }

            @Override // S.j
            public final Object a0(S.i iVar) {
                switch (r2) {
                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        return a(iVar);
                    default:
                        D d4 = this.f2103K;
                        synchronized (d4.f2109a) {
                            d4.f2114f = iVar;
                        }
                        return "DeferrableSurface-close(" + d4 + ")";
                }
            }
        });
        if (x1.X.d("DeferrableSurface")) {
            e(f2108n.incrementAndGet(), f2107m.get(), "Surface created");
            a4.f1193K.a(new RunnableC0023c(8, this, Log.getStackTraceString(new Exception())), AbstractC0636k0.a());
        }
    }

    public final void a() {
        S.i iVar;
        synchronized (this.f2109a) {
            try {
                if (!this.f2111c) {
                    this.f2111c = true;
                    this.f2114f.a(null);
                    if (this.f2110b == 0) {
                        iVar = this.f2112d;
                        this.f2112d = null;
                    } else {
                        iVar = null;
                    }
                    if (x1.X.d("DeferrableSurface")) {
                        x1.X.a("DeferrableSurface", "surface closed,  useCount=" + this.f2110b + " closed=true " + this);
                    }
                } else {
                    iVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVar != null) {
            iVar.a(null);
        }
    }

    public final void b() {
        S.i iVar;
        synchronized (this.f2109a) {
            try {
                int r22 = this.f2110b;
                if (r22 != 0) {
                    int r23 = r22 - 1;
                    this.f2110b = r23;
                    if (r23 == 0 && this.f2111c) {
                        iVar = this.f2112d;
                        this.f2112d = null;
                    } else {
                        iVar = null;
                    }
                    if (x1.X.d("DeferrableSurface")) {
                        x1.X.a("DeferrableSurface", "use count-1,  useCount=" + this.f2110b + " closed=" + this.f2111c + " " + this);
                        if (this.f2110b == 0) {
                            e(f2108n.get(), f2107m.decrementAndGet(), "Surface no longer in use");
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVar != null) {
            iVar.a(null);
        }
    }

    public final E1.a c() {
        synchronized (this.f2109a) {
            try {
                if (this.f2111c) {
                    return new H.h(1, new C("DeferrableSurface already closed.", this));
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f2109a) {
            try {
                int r22 = this.f2110b;
                if (r22 == 0 && this.f2111c) {
                    throw new C("Cannot begin use on a closed surface.", this);
                }
                this.f2110b = r22 + 1;
                if (x1.X.d("DeferrableSurface")) {
                    if (this.f2110b == 1) {
                        e(f2108n.get(), f2107m.incrementAndGet(), "New surface in use");
                    }
                    x1.X.a("DeferrableSurface", "use count+1, useCount=" + this.f2110b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int r3, int r4, String str) {
        if (!f2106l && x1.X.d("DeferrableSurface")) {
            x1.X.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        x1.X.a("DeferrableSurface", str + "[total_surfaces=" + r3 + ", used_surfaces=" + r4 + "](" + this + "}");
    }

    public abstract E1.a f();
}
