package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115m {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0113k f2386a;

    /* renamed from: b  reason: collision with root package name */
    public int f2387b;

    /* renamed from: c  reason: collision with root package name */
    public int f2388c;

    /* renamed from: d  reason: collision with root package name */
    public int f2389d = 0;

    public C0115m(AbstractC0113k abstractC0113k) {
        Charset charset = G.f2298a;
        this.f2386a = abstractC0113k;
        abstractC0113k.f2375b = this;
    }

    public static void y(int r12) {
        if ((r12 & 3) == 0) {
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public static void z(int r12) {
        if ((r12 & 7) == 0) {
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public final int a() {
        int r02 = this.f2389d;
        if (r02 != 0) {
            this.f2387b = r02;
            this.f2389d = 0;
        } else {
            this.f2387b = this.f2386a.u();
        }
        int r03 = this.f2387b;
        if (r03 != 0 && r03 != this.f2388c) {
            return r03 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public final void b(Object obj, i0 i0Var, C0119q c0119q) {
        int r02 = this.f2388c;
        this.f2388c = ((this.f2387b >>> 3) << 3) | 4;
        try {
            i0Var.b(obj, this, c0119q);
            if (this.f2387b == this.f2388c) {
                return;
            }
            throw new IOException("Failed to parse the message.");
        } finally {
            this.f2388c = r02;
        }
    }

    public final void c(Object obj, i0 i0Var, C0119q c0119q) {
        AbstractC0113k abstractC0113k = this.f2386a;
        int v3 = abstractC0113k.v();
        if (abstractC0113k.f2374a < 100) {
            int e4 = abstractC0113k.e(v3);
            abstractC0113k.f2374a++;
            i0Var.b(obj, this, c0119q);
            abstractC0113k.a(0);
            abstractC0113k.f2374a--;
            abstractC0113k.d(e4);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public final void d(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 0) {
            if (r02 == 2) {
                int b3 = abstractC0113k.b() + abstractC0113k.v();
                do {
                    f2.add(Boolean.valueOf(abstractC0113k.f()));
                } while (abstractC0113k.b() < b3);
                v(b3);
                return;
            }
            throw I.b();
        }
        do {
            f2.add(Boolean.valueOf(abstractC0113k.f()));
            if (abstractC0113k.c()) {
                return;
            }
            u3 = abstractC0113k.u();
        } while (u3 == this.f2387b);
        this.f2389d = u3;
    }

    public final C0111h e() {
        w(2);
        return this.f2386a.g();
    }

    public final void f(F f2) {
        int u3;
        if ((this.f2387b & 7) == 2) {
            do {
                f2.add(e());
                AbstractC0113k abstractC0113k = this.f2386a;
                if (abstractC0113k.c()) {
                    return;
                }
                u3 = abstractC0113k.u();
            } while (u3 == this.f2387b);
            this.f2389d = u3;
            return;
        }
        throw I.b();
    }

    public final void g(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 1) {
            if (r02 == 2) {
                int v3 = abstractC0113k.v();
                z(v3);
                int b3 = abstractC0113k.b() + v3;
                do {
                    f2.add(Double.valueOf(abstractC0113k.h()));
                } while (abstractC0113k.b() < b3);
                return;
            }
            throw I.b();
        }
        do {
            f2.add(Double.valueOf(abstractC0113k.h()));
            if (abstractC0113k.c()) {
                return;
            }
            u3 = abstractC0113k.u();
        } while (u3 == this.f2387b);
        this.f2389d = u3;
    }

    public final void h(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 0) {
            if (r02 == 2) {
                int b3 = abstractC0113k.b() + abstractC0113k.v();
                do {
                    f2.add(Integer.valueOf(abstractC0113k.i()));
                } while (abstractC0113k.b() < b3);
                v(b3);
                return;
            }
            throw I.b();
        }
        do {
            f2.add(Integer.valueOf(abstractC0113k.i()));
            if (abstractC0113k.c()) {
                return;
            }
            u3 = abstractC0113k.u();
        } while (u3 == this.f2387b);
        this.f2389d = u3;
    }

    public final Object i(D0 d02, Class cls, C0119q c0119q) {
        int r6 = AbstractC0114l.f2382a[d02.ordinal()];
        AbstractC0113k abstractC0113k = this.f2386a;
        switch (r6) {
            case 1:
                w(0);
                return Boolean.valueOf(abstractC0113k.f());
            case 2:
                return e();
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                w(1);
                return Double.valueOf(abstractC0113k.h());
            case 4:
                w(0);
                return Integer.valueOf(abstractC0113k.i());
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                w(5);
                return Integer.valueOf(abstractC0113k.j());
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                w(1);
                return Long.valueOf(abstractC0113k.k());
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                w(5);
                return Float.valueOf(abstractC0113k.l());
            case 8:
                w(0);
                return Integer.valueOf(abstractC0113k.m());
            case 9:
                w(0);
                return Long.valueOf(abstractC0113k.n());
            case 10:
                w(2);
                i0 a4 = C0109f0.f2342c.a(cls);
                D g = a4.g();
                c(g, a4, c0119q);
                a4.h(g);
                return g;
            case 11:
                w(5);
                return Integer.valueOf(abstractC0113k.o());
            case 12:
                w(1);
                return Long.valueOf(abstractC0113k.p());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0113k.q());
            case 14:
                w(0);
                return Long.valueOf(abstractC0113k.r());
            case 15:
                w(2);
                return abstractC0113k.t();
            case 16:
                w(0);
                return Integer.valueOf(abstractC0113k.v());
            case 17:
                w(0);
                return Long.valueOf(abstractC0113k.w());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void j(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 2) {
            if (r02 == 5) {
                do {
                    f2.add(Integer.valueOf(abstractC0113k.j()));
                    if (abstractC0113k.c()) {
                        return;
                    }
                    u3 = abstractC0113k.u();
                } while (u3 == this.f2387b);
                this.f2389d = u3;
                return;
            }
            throw I.b();
        }
        int v3 = abstractC0113k.v();
        y(v3);
        int b3 = abstractC0113k.b() + v3;
        do {
            f2.add(Integer.valueOf(abstractC0113k.j()));
        } while (abstractC0113k.b() < b3);
    }

    public final void k(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 1) {
            if (r02 == 2) {
                int v3 = abstractC0113k.v();
                z(v3);
                int b3 = abstractC0113k.b() + v3;
                do {
                    f2.add(Long.valueOf(abstractC0113k.k()));
                } while (abstractC0113k.b() < b3);
                return;
            }
            throw I.b();
        }
        do {
            f2.add(Long.valueOf(abstractC0113k.k()));
            if (abstractC0113k.c()) {
                return;
            }
            u3 = abstractC0113k.u();
        } while (u3 == this.f2387b);
        this.f2389d = u3;
    }

    public final void l(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 2) {
            if (r02 == 5) {
                do {
                    f2.add(Float.valueOf(abstractC0113k.l()));
                    if (abstractC0113k.c()) {
                        return;
                    }
                    u3 = abstractC0113k.u();
                } while (u3 == this.f2387b);
                this.f2389d = u3;
                return;
            }
            throw I.b();
        }
        int v3 = abstractC0113k.v();
        y(v3);
        int b3 = abstractC0113k.b() + v3;
        do {
            f2.add(Float.valueOf(abstractC0113k.l()));
        } while (abstractC0113k.b() < b3);
    }

    public final void m(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 0) {
            if (r02 == 2) {
                int b3 = abstractC0113k.b() + abstractC0113k.v();
                do {
                    f2.add(Integer.valueOf(abstractC0113k.m()));
                } while (abstractC0113k.b() < b3);
                v(b3);
                return;
            }
            throw I.b();
        }
        do {
            f2.add(Integer.valueOf(abstractC0113k.m()));
            if (abstractC0113k.c()) {
                return;
            }
            u3 = abstractC0113k.u();
        } while (u3 == this.f2387b);
        this.f2389d = u3;
    }

    public final void n(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 0) {
            if (r02 == 2) {
                int b3 = abstractC0113k.b() + abstractC0113k.v();
                do {
                    f2.add(Long.valueOf(abstractC0113k.n()));
                } while (abstractC0113k.b() < b3);
                v(b3);
                return;
            }
            throw I.b();
        }
        do {
            f2.add(Long.valueOf(abstractC0113k.n()));
            if (abstractC0113k.c()) {
                return;
            }
            u3 = abstractC0113k.u();
        } while (u3 == this.f2387b);
        this.f2389d = u3;
    }

    public final void o(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 2) {
            if (r02 == 5) {
                do {
                    f2.add(Integer.valueOf(abstractC0113k.o()));
                    if (abstractC0113k.c()) {
                        return;
                    }
                    u3 = abstractC0113k.u();
                } while (u3 == this.f2387b);
                this.f2389d = u3;
                return;
            }
            throw I.b();
        }
        int v3 = abstractC0113k.v();
        y(v3);
        int b3 = abstractC0113k.b() + v3;
        do {
            f2.add(Integer.valueOf(abstractC0113k.o()));
        } while (abstractC0113k.b() < b3);
    }

    public final void p(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 1) {
            if (r02 == 2) {
                int v3 = abstractC0113k.v();
                z(v3);
                int b3 = abstractC0113k.b() + v3;
                do {
                    f2.add(Long.valueOf(abstractC0113k.p()));
                } while (abstractC0113k.b() < b3);
                return;
            }
            throw I.b();
        }
        do {
            f2.add(Long.valueOf(abstractC0113k.p()));
            if (abstractC0113k.c()) {
                return;
            }
            u3 = abstractC0113k.u();
        } while (u3 == this.f2387b);
        this.f2389d = u3;
    }

    public final void q(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 0) {
            if (r02 == 2) {
                int b3 = abstractC0113k.b() + abstractC0113k.v();
                do {
                    f2.add(Integer.valueOf(abstractC0113k.q()));
                } while (abstractC0113k.b() < b3);
                v(b3);
                return;
            }
            throw I.b();
        }
        do {
            f2.add(Integer.valueOf(abstractC0113k.q()));
            if (abstractC0113k.c()) {
                return;
            }
            u3 = abstractC0113k.u();
        } while (u3 == this.f2387b);
        this.f2389d = u3;
    }

    public final void r(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 0) {
            if (r02 == 2) {
                int b3 = abstractC0113k.b() + abstractC0113k.v();
                do {
                    f2.add(Long.valueOf(abstractC0113k.r()));
                } while (abstractC0113k.b() < b3);
                v(b3);
                return;
            }
            throw I.b();
        }
        do {
            f2.add(Long.valueOf(abstractC0113k.r()));
            if (abstractC0113k.c()) {
                return;
            }
            u3 = abstractC0113k.u();
        } while (u3 == this.f2387b);
        this.f2389d = u3;
    }

    public final void s(F f2, boolean z3) {
        String s3;
        int u3;
        if ((this.f2387b & 7) == 2) {
            do {
                AbstractC0113k abstractC0113k = this.f2386a;
                if (z3) {
                    w(2);
                    s3 = abstractC0113k.t();
                } else {
                    w(2);
                    s3 = abstractC0113k.s();
                }
                f2.add(s3);
                if (abstractC0113k.c()) {
                    return;
                }
                u3 = abstractC0113k.u();
            } while (u3 == this.f2387b);
            this.f2389d = u3;
            return;
        }
        throw I.b();
    }

    public final void t(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 0) {
            if (r02 == 2) {
                int b3 = abstractC0113k.b() + abstractC0113k.v();
                do {
                    f2.add(Integer.valueOf(abstractC0113k.v()));
                } while (abstractC0113k.b() < b3);
                v(b3);
                return;
            }
            throw I.b();
        }
        do {
            f2.add(Integer.valueOf(abstractC0113k.v()));
            if (abstractC0113k.c()) {
                return;
            }
            u3 = abstractC0113k.u();
        } while (u3 == this.f2387b);
        this.f2389d = u3;
    }

    public final void u(F f2) {
        int u3;
        int r02 = this.f2387b & 7;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (r02 != 0) {
            if (r02 == 2) {
                int b3 = abstractC0113k.b() + abstractC0113k.v();
                do {
                    f2.add(Long.valueOf(abstractC0113k.w()));
                } while (abstractC0113k.b() < b3);
                v(b3);
                return;
            }
            throw I.b();
        }
        do {
            f2.add(Long.valueOf(abstractC0113k.w()));
            if (abstractC0113k.c()) {
                return;
            }
            u3 = abstractC0113k.u();
        } while (u3 == this.f2387b);
        this.f2389d = u3;
    }

    public final void v(int r22) {
        if (this.f2386a.b() == r22) {
            return;
        }
        throw I.e();
    }

    public final void w(int r22) {
        if ((this.f2387b & 7) == r22) {
            return;
        }
        throw I.b();
    }

    public final boolean x() {
        int r12;
        AbstractC0113k abstractC0113k = this.f2386a;
        if (!abstractC0113k.c() && (r12 = this.f2387b) != this.f2388c) {
            return abstractC0113k.x(r12);
        }
        return false;
    }
}
