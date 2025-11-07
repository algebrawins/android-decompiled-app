package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220v0 {

    /* renamed from: b  reason: collision with root package name */
    public static final V f2984b = new V(1);

    /* renamed from: a  reason: collision with root package name */
    public final Object f2985a;

    public C0220v0(int r5) {
        InterfaceC0228z0 interfaceC0228z0;
        switch (r5) {
            case 2:
                this.f2985a = new ArrayDeque();
                return;
            default:
                try {
                    interfaceC0228z0 = (InterfaceC0228z0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC0228z0 = f2984b;
                }
                C0218u0 c0218u0 = new C0218u0(V.f2854b, interfaceC0228z0);
                Charset charset = AbstractC0192j0.f2920a;
                this.f2985a = c0218u0;
                return;
        }
    }

    public void a(int r22, int r3) {
        ((M) this.f2985a).E(r22, (r3 >> 31) ^ (r3 + r3));
    }

    public void b(long j3, int r6) {
        ((M) this.f2985a).G((j3 >> 63) ^ (j3 + j3), r6);
    }

    public void c(int r22, int r3) {
        ((M) this.f2985a).E(r22, r3);
    }

    public void d(long j3, int r4) {
        ((M) this.f2985a).G(j3, r4);
    }

    public void e(int r22, boolean z3) {
        M m3 = (M) this.f2985a;
        m3.F(r22 << 3);
        m3.v(z3 ? (byte) 1 : (byte) 0);
    }

    public void f(L l3) {
        if (l3.m()) {
            int binarySearch = Arrays.binarySearch(M0.f2821Q, l3.j());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int z3 = M0.z(binarySearch + 1);
            ArrayDeque arrayDeque = (ArrayDeque) this.f2985a;
            if (!arrayDeque.isEmpty() && ((L) arrayDeque.peek()).j() < z3) {
                int z4 = M0.z(binarySearch);
                L l4 = (L) arrayDeque.pop();
                while (!arrayDeque.isEmpty() && ((L) arrayDeque.peek()).j() < z4) {
                    l4 = new M0((L) arrayDeque.pop(), l4);
                }
                M0 m02 = new M0(l4, l3);
                while (!arrayDeque.isEmpty()) {
                    int binarySearch2 = Arrays.binarySearch(M0.f2821Q, m02.f2822L);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (((L) arrayDeque.peek()).j() >= M0.z(binarySearch2 + 1)) {
                        break;
                    }
                    m02 = new M0((L) arrayDeque.pop(), m02);
                }
                arrayDeque.push(m02);
                return;
            }
            arrayDeque.push(l3);
        } else if (l3 instanceof M0) {
            M0 m03 = (M0) l3;
            f(m03.f2823M);
            f(m03.f2824N);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(l3.getClass())));
        }
    }

    public void g(int r22, L l3) {
        ((M) this.f2985a).x(r22, l3);
    }

    public void h(int r22, double d4) {
        ((M) this.f2985a).A(Double.doubleToRawLongBits(d4), r22);
    }

    public void i(int r22, int r3) {
        M m3 = (M) this.f2985a;
        m3.F(r22 << 3);
        if (r3 >= 0) {
            m3.F(r3);
        } else {
            m3.H(r3);
        }
    }

    public void j(int r22, int r3) {
        ((M) this.f2985a).y(r22, r3);
    }

    public void k(long j3, int r4) {
        ((M) this.f2985a).A(j3, r4);
    }

    public void l(int r22, float f2) {
        ((M) this.f2985a).y(r22, Float.floatToRawIntBits(f2));
    }

    public void m(int r3, Object obj, N0 n02) {
        M m3 = (M) this.f2985a;
        m3.D(r3, 3);
        n02.g((D) obj, m3.f2817c);
        m3.D(r3, 4);
    }

    public void n(int r22, int r3) {
        M m3 = (M) this.f2985a;
        m3.F(r22 << 3);
        if (r3 >= 0) {
            m3.F(r3);
        } else {
            m3.H(r3);
        }
    }

    public void o(long j3, int r4) {
        ((M) this.f2985a).G(j3, r4);
    }

    public void p(int r22, Object obj, N0 n02) {
        D d4 = (D) obj;
        M m3 = (M) this.f2985a;
        m3.F((r22 << 3) | 2);
        m3.F(d4.b(n02));
        n02.g(d4, m3.f2817c);
    }

    public void q(int r6, Object obj) {
        boolean z3 = obj instanceof L;
        M m3 = (M) this.f2985a;
        if (z3) {
            m3.F(11);
            m3.E(2, r6);
            m3.x(3, (L) obj);
            m3.F(12);
            return;
        }
        m3.F(11);
        m3.E(2, r6);
        m3.F(26);
        AbstractC0168a0 abstractC0168a0 = (AbstractC0168a0) ((D) obj);
        m3.F(abstractC0168a0.c());
        N0 b3 = H0.f2796c.b(abstractC0168a0.getClass());
        C0220v0 c0220v0 = m3.f2817c;
        if (c0220v0 == null) {
            c0220v0 = new C0220v0(m3);
        }
        b3.g(abstractC0168a0, c0220v0);
        m3.F(12);
    }

    public void r(int r22, int r3) {
        ((M) this.f2985a).y(r22, r3);
    }

    public void s(long j3, int r4) {
        ((M) this.f2985a).A(j3, r4);
    }

    public C0220v0(M m3) {
        Charset charset = AbstractC0192j0.f2920a;
        this.f2985a = m3;
        m3.f2817c = this;
    }
}
