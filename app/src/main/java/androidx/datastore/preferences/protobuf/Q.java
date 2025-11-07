package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: b  reason: collision with root package name */
    public static final C0127z f2305b = new C0127z(1);

    /* renamed from: a  reason: collision with root package name */
    public final Object f2306a;

    public Q(C0116n c0116n) {
        G.a(c0116n, "output");
        this.f2306a = c0116n;
        c0116n.f2396a = this;
    }

    public void a(int r22, boolean z3) {
        ((C0116n) this.f2306a).G(r22, z3);
    }

    public void b(int r22, C0111h c0111h) {
        ((C0116n) this.f2306a).H(r22, c0111h);
    }

    public void c(int r22, double d4) {
        C0116n c0116n = (C0116n) this.f2306a;
        c0116n.getClass();
        c0116n.L(Double.doubleToRawLongBits(d4), r22);
    }

    public void d(int r22, int r3) {
        ((C0116n) this.f2306a).N(r22, r3);
    }

    public void e(int r22, int r3) {
        ((C0116n) this.f2306a).J(r22, r3);
    }

    public void f(long j3, int r4) {
        ((C0116n) this.f2306a).L(j3, r4);
    }

    public void g(int r22, float f2) {
        C0116n c0116n = (C0116n) this.f2306a;
        c0116n.getClass();
        c0116n.J(r22, Float.floatToRawIntBits(f2));
    }

    public void h(int r3, Object obj, i0 i0Var) {
        C0116n c0116n = (C0116n) this.f2306a;
        c0116n.R(r3, 3);
        i0Var.d((AbstractC0098a) obj, c0116n.f2396a);
        c0116n.R(r3, 4);
    }

    public void i(int r22, int r3) {
        ((C0116n) this.f2306a).N(r22, r3);
    }

    public void j(long j3, int r4) {
        ((C0116n) this.f2306a).U(j3, r4);
    }

    public void k(int r3, Object obj, i0 i0Var) {
        C0116n c0116n = (C0116n) this.f2306a;
        AbstractC0098a abstractC0098a = (AbstractC0098a) obj;
        c0116n.R(r3, 2);
        c0116n.T(abstractC0098a.a(i0Var));
        i0Var.d(abstractC0098a, c0116n.f2396a);
    }

    public void l(int r22, int r3) {
        ((C0116n) this.f2306a).J(r22, r3);
    }

    public void m(long j3, int r4) {
        ((C0116n) this.f2306a).L(j3, r4);
    }

    public void n(int r22, int r3) {
        ((C0116n) this.f2306a).S(r22, (r3 >> 31) ^ (r3 << 1));
    }

    public void o(long j3, int r6) {
        ((C0116n) this.f2306a).U((j3 >> 63) ^ (j3 << 1), r6);
    }

    public void p(int r22, int r3) {
        ((C0116n) this.f2306a).S(r22, r3);
    }

    public void q(long j3, int r4) {
        ((C0116n) this.f2306a).U(j3, r4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.P, java.lang.Object] */
    public Q() {
        C0109f0 c0109f0 = C0109f0.f2342c;
        Object obj = f2305b;
        try {
            obj = (X) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        X[] xArr = {C0127z.f2431b, obj};
        ?? obj2 = new Object();
        obj2.f2304a = xArr;
        Charset charset = G.f2298a;
        this.f2306a = obj2;
    }
}
