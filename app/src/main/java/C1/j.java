package C1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import k1.w;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f246a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final B0.e f247b = new B0.e();

    /* renamed from: c  reason: collision with root package name */
    public boolean f248c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f249d;

    /* renamed from: e  reason: collision with root package name */
    public Object f250e;

    /* renamed from: f  reason: collision with root package name */
    public Exception f251f;

    public final void a(Executor executor, d dVar) {
        this.f247b.g(new i(executor, dVar));
        l();
    }

    public final void b(Executor executor, e eVar) {
        this.f247b.g(new i(executor, eVar));
        l();
    }

    public final Exception c() {
        Exception exc;
        synchronized (this.f246a) {
            exc = this.f251f;
        }
        return exc;
    }

    public final Object d() {
        Object obj;
        synchronized (this.f246a) {
            try {
                w.g("Task is not yet complete", this.f248c);
                if (!this.f249d) {
                    Exception exc = this.f251f;
                    if (exc == null) {
                        obj = this.f250e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean e() {
        boolean z3;
        synchronized (this.f246a) {
            z3 = this.f248c;
        }
        return z3;
    }

    public final boolean f() {
        boolean z3;
        synchronized (this.f246a) {
            try {
                z3 = false;
                if (this.f248c && !this.f249d && this.f251f == null) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    public final void g(Exception exc) {
        w.f(exc, "Exception must not be null");
        synchronized (this.f246a) {
            k();
            this.f248c = true;
            this.f251f = exc;
        }
        this.f247b.h(this);
    }

    public final void h(Object obj) {
        synchronized (this.f246a) {
            k();
            this.f248c = true;
            this.f250e = obj;
        }
        this.f247b.h(this);
    }

    public final void i() {
        synchronized (this.f246a) {
            try {
                if (this.f248c) {
                    return;
                }
                this.f248c = true;
                this.f249d = true;
                this.f247b.h(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(Object obj) {
        synchronized (this.f246a) {
            try {
                if (this.f248c) {
                    return false;
                }
                this.f248c = true;
                this.f250e = obj;
                this.f247b.h(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        String str;
        if (this.f248c) {
            int r02 = a.f238J;
            if (e()) {
                Exception c4 = c();
                if (c4 == null) {
                    if (!f()) {
                        if (this.f249d) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(d()));
                    }
                } else {
                    str = "failure";
                }
                throw new IllegalStateException("Complete with: ".concat(str), c4);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void l() {
        synchronized (this.f246a) {
            try {
                if (!this.f248c) {
                    return;
                }
                this.f247b.h(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
