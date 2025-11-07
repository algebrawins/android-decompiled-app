package P;

import A.k;
import A0.C0001b;
import C.g;
import D.B;
import D.C;
import D.C0030k;
import D.C0042x;
import D.N;
import D.RunnableC0023c;
import D.e0;
import D.h0;
import D.j0;
import D.n0;
import D.r0;
import G.e;
import N.f;
import N.m;
import N.o;
import a1.i;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.InterfaceC0091t;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.O;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.m0;
import androidx.camera.core.impl.r;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import v.C0479a;
import w.C0489E;
import x1.AbstractC0612g0;
import x1.AbstractC0624h4;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final class a extends r0 {

    /* renamed from: m  reason: collision with root package name */
    public final b f1016m;

    /* renamed from: n  reason: collision with root package name */
    public final c f1017n;

    /* renamed from: o  reason: collision with root package name */
    public C0001b f1018o;

    /* renamed from: p  reason: collision with root package name */
    public m f1019p;

    /* renamed from: q  reason: collision with root package name */
    public m f1020q;

    /* renamed from: r  reason: collision with root package name */
    public Z f1021r;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, I.c] */
    public a(InterfaceC0091t interfaceC0091t, HashSet hashSet, C0489E c0489e) {
        super(D(hashSet));
        this.f1016m = D(hashSet);
        this.f1017n = new c(interfaceC0091t, hashSet, c0489e, new Object());
    }

    public static b D(HashSet hashSet) {
        O b3 = O.b();
        new g(b3, 3);
        b3.g(H.f2135l, 34);
        b3.g(k0.f2217G, m0.STREAM_SHARING);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            if (r0Var.f447f.q(k0.f2217G)) {
                arrayList.add(r0Var.f447f.m());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        b3.g(b.f1022K, arrayList);
        b3.g(J.f2141q, 2);
        return new b(S.a(b3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void B() {
        m mVar = this.f1019p;
        if (mVar != null) {
            AbstractC0612g0.a();
            mVar.c();
            mVar.f947n = true;
            this.f1019p = null;
        }
        m mVar2 = this.f1020q;
        if (mVar2 != null) {
            AbstractC0612g0.a();
            mVar2.c();
            mVar2.f947n = true;
            this.f1020q = null;
        }
        C0001b c0001b = this.f1018o;
        if (c0001b != null) {
            f fVar = (f) c0001b.f85L;
            if (!fVar.f892e.getAndSet(true)) {
                fVar.b(new N(4, fVar), new Object());
            }
            AbstractC0636k0.d().execute(new N(8, c0001b));
            this.f1018o = null;
        }
    }

    public final c0 C(String str, k0 k0Var, C0079f c0079f) {
        C0030k c0030k;
        boolean z3;
        boolean z4;
        int r15;
        int r18;
        int r19;
        AbstractC0612g0.a();
        InterfaceC0091t b3 = b();
        b3.getClass();
        Matrix matrix = this.f450j;
        boolean d4 = b3.d();
        Size size = c0079f.f2192a;
        Rect rect = this.f449i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        int r6 = 0;
        m mVar = new m(3, 34, c0079f, matrix, d4, rect2, g(b3, false), -1, k(b3));
        this.f1019p = mVar;
        this.f1020q = mVar;
        this.f1018o = new C0001b(b3, new f(c0079f.f2193b));
        m mVar2 = this.f1020q;
        c cVar = this.f1017n;
        cVar.getClass();
        HashMap hashMap = new HashMap();
        Iterator it = cVar.f1024J.iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            boolean z5 = r0Var instanceof e0;
            if (z5) {
                r15 = cVar.f1028N.k().h(((J) ((e0) r0Var).f447f).j());
            } else {
                r15 = 0;
            }
            if (z5) {
                r18 = 1;
            } else if (r0Var instanceof D.S) {
                r18 = 4;
            } else {
                r18 = 2;
            }
            if (r0Var instanceof D.S) {
                r19 = RecognitionOptions.QR_CODE;
            } else {
                r19 = 34;
            }
            Rect rect3 = mVar2.f938d;
            RectF rectF = F.f.f603a;
            hashMap.put(r0Var, new N.c(UUID.randomUUID(), r18, r19, rect3, F.f.b(new Size(rect3.width(), rect3.height()), r15), r15, r0Var.k(cVar)));
        }
        C0001b c0001b = this.f1018o;
        m mVar3 = this.f1020q;
        ArrayList arrayList = new ArrayList(hashMap.values());
        if (mVar3 != null) {
            c0001b.getClass();
            AbstractC0612g0.a();
            c0001b.f86M = new HashMap();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                N.c cVar2 = (N.c) it2.next();
                o oVar = (o) c0001b.f86M;
                Rect rect4 = cVar2.f878d;
                Matrix matrix2 = new Matrix(mVar3.f936b);
                RectF rectF2 = new RectF(rect4);
                Size size2 = cVar2.f879e;
                RectF rectF3 = F.f.f603a;
                float f2 = r6;
                Iterator it3 = it2;
                RectF rectF4 = new RectF(f2, f2, size2.getWidth(), size2.getHeight());
                int r22 = cVar2.f880f;
                boolean z6 = cVar2.g;
                matrix2.postConcat(F.f.a(rectF2, rectF4, r22, z6));
                Size b4 = F.f.b(new Size(rect4.width(), rect4.height()), r22);
                float width = (b4.getWidth() + 1.0f) / (b4.getHeight() - 1.0f);
                float width2 = (b4.getWidth() - 1.0f) / (b4.getHeight() + 1.0f);
                float width3 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
                if (width >= (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f) && width3 >= width2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0624h4.b(z3);
                i a4 = mVar3.f940f.a();
                a4.f1832J = size2;
                C0079f h3 = a4.h();
                Rect rect5 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
                int r20 = mVar3.f941h - r22;
                if (mVar3.f939e != z6) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                r6 = 0;
                oVar.put(cVar2, new m(cVar2.f876b, cVar2.f877c, h3, matrix2, false, rect5, r20, -1, z4));
                it2 = it3;
            }
            n0 b5 = mVar3.b();
            e d5 = AbstractC0636k0.d();
            k kVar = new k(7, (o) c0001b.f86M);
            synchronized (b5.f423a) {
                try {
                    b5.f431j = kVar;
                    b5.f432k = d5;
                    c0030k = b5.f430i;
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    throw th;
                }
            }
            if (c0030k != null) {
                d5.execute(new h0(kVar, c0030k, 1));
            }
            f fVar = (f) c0001b.f85L;
            if (fVar.f892e.get()) {
                b5.f426d.b(new Exception("Surface request will not complete."));
            } else {
                fVar.b(new RunnableC0023c(5, fVar, b5), new j0(b5, 1));
            }
            for (Map.Entry entry : ((o) c0001b.f86M).entrySet()) {
                c0001b.u(mVar3, entry);
                m mVar4 = (m) entry.getValue();
                N.d dVar = new N.d(c0001b, mVar3, entry, 2);
                mVar4.getClass();
                AbstractC0612g0.a();
                mVar4.a();
                mVar4.f946m.add(dVar);
            }
            o oVar2 = (o) c0001b.f86M;
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                hashMap2.put((r0) entry2.getKey(), (m) oVar2.get(entry2.getValue()));
            }
            HashMap hashMap3 = cVar.f1025K;
            hashMap3.clear();
            hashMap3.putAll(hashMap2);
            for (Map.Entry entry3 : hashMap3.entrySet()) {
                r0 r0Var2 = (r0) entry3.getKey();
                m mVar5 = (m) entry3.getValue();
                r0Var2.y(mVar5.f938d);
                r0Var2.x(mVar5.f936b);
                r0Var2.g = r0Var2.v(mVar5.f940f);
                r0Var2.o();
            }
            Z d6 = Z.d(k0Var, c0079f.f2192a);
            m mVar6 = this.f1019p;
            mVar6.getClass();
            AbstractC0612g0.a();
            mVar6.a();
            AbstractC0624h4.f("Consumer can only be linked once.", !mVar6.f943j);
            mVar6.f943j = true;
            d6.b(mVar6.f945l, C0042x.f480d);
            d6.f2159b.b(cVar.f1029O);
            C0479a c0479a = c0079f.f2195d;
            if (c0479a != null) {
                d6.f2159b.c(c0479a);
            }
            d6.f2162e.add(new B(this, str, k0Var, c0079f, 3));
            this.f1021r = d6;
            return d6.c();
        }
        throw new NullPointerException("Null surfaceEdge");
    }

    @Override // D.r0
    public final k0 e(boolean z3, androidx.camera.core.impl.n0 n0Var) {
        b bVar = this.f1016m;
        bVar.getClass();
        A a4 = n0Var.a(C.d(bVar), 1);
        if (z3) {
            a4 = C.J(a4, bVar.f1023J);
        }
        if (a4 == null) {
            return null;
        }
        return ((g) i(a4)).b();
    }

    @Override // D.r0
    public final Set h() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // D.r0
    public final androidx.camera.core.impl.j0 i(A a4) {
        return new g(O.c(a4), 3);
    }

    @Override // D.r0
    public final void p() {
        c cVar = this.f1017n;
        Iterator it = cVar.f1024J.iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            r0Var.a(cVar, null, r0Var.e(true, cVar.f1027M));
        }
    }

    @Override // D.r0
    public final k0 r(r rVar, androidx.camera.core.impl.j0 j0Var) {
        InterfaceC0091t interfaceC0091t;
        androidx.camera.core.impl.N a4 = j0Var.a();
        c cVar = this.f1017n;
        cVar.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = cVar.f1024J.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            interfaceC0091t = cVar.f1028N;
            if (!hasNext) {
                break;
            }
            r0 r0Var = (r0) it.next();
            hashSet.add(r0Var.l(interfaceC0091t.e(), null, r0Var.e(true, cVar.f1027M)));
        }
        Collection arrayList = new ArrayList(interfaceC0091t.e().d(34));
        Rect f2 = interfaceC0091t.i().f();
        RectF rectF = F.f.f603a;
        new Size(f2.width(), f2.height());
        C0076c c0076c = J.f2147w;
        Iterator it2 = hashSet.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Collection collection = (List) ((k0) it2.next()).i0(J.f2147w, null);
            if (collection != null) {
                arrayList = collection;
                break;
            }
        }
        O o3 = (O) a4;
        o3.g(c0076c, arrayList);
        C0076c c0076c2 = k0.f2212B;
        Iterator it3 = hashSet.iterator();
        int r22 = 0;
        while (it3.hasNext()) {
            r22 = Math.max(r22, ((k0) it3.next()).v());
        }
        o3.g(c0076c2, Integer.valueOf(r22));
        return j0Var.b();
    }

    @Override // D.r0
    public final void s() {
        Iterator it = this.f1017n.f1024J.iterator();
        while (it.hasNext()) {
            ((r0) it.next()).s();
        }
    }

    @Override // D.r0
    public final void t() {
        Iterator it = this.f1017n.f1024J.iterator();
        while (it.hasNext()) {
            ((r0) it.next()).t();
        }
    }

    @Override // D.r0
    public final C0079f u(C0479a c0479a) {
        this.f1021r.a(c0479a);
        A(this.f1021r.c());
        i a4 = this.g.a();
        a4.f1835M = c0479a;
        return a4.h();
    }

    @Override // D.r0
    public final C0079f v(C0079f c0079f) {
        A(C(d(), this.f447f, c0079f));
        m();
        return c0079f;
    }

    @Override // D.r0
    public final void w() {
        B();
        c cVar = this.f1017n;
        Iterator it = cVar.f1024J.iterator();
        while (it.hasNext()) {
            ((r0) it.next()).z(cVar);
        }
    }
}
