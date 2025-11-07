package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0113k {

    /* renamed from: a  reason: collision with root package name */
    public int f2374a;

    /* renamed from: b  reason: collision with root package name */
    public C0115m f2375b;

    public abstract void a(int r12);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int r12);

    public abstract int e(int r12);

    public abstract boolean f();

    public abstract C0111h g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int r12);

    public final void y() {
        int u3;
        do {
            u3 = u();
            if (u3 == 0) {
                return;
            }
            int r12 = this.f2374a;
            if (r12 < 100) {
                this.f2374a = r12 + 1;
                this.f2374a--;
            } else {
                throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
        } while (x(u3));
    }
}
