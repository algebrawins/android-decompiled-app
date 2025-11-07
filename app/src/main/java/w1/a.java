package W1;

import Q1.n;
import h1.C0283c;
import java.util.concurrent.Executor;
import x1.I6;
import x1.M4;
import x1.O4;
import x1.Z4;

/* loaded from: classes.dex */
public final class a extends Y1.c implements S1.a {

    /* renamed from: P  reason: collision with root package name */
    public static final S1.b f1497P = new S1.b(0);

    /* renamed from: O  reason: collision with root package name */
    public final boolean f1498O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, V0.a] */
    public a(S1.b bVar, h hVar, Executor executor, I6 r10) {
        super(hVar, executor);
        M4 m4;
        bVar.getClass();
        boolean c4 = c.c();
        this.f1498O = c4;
        E.c cVar = new E.c(8);
        cVar.f503L = c.a(bVar);
        Z4 z4 = new Z4(cVar);
        ?? obj = new Object();
        if (c4) {
            m4 = M4.zzc;
        } else {
            m4 = M4.zzb;
        }
        obj.f1358L = m4;
        obj.f1359M = z4;
        n.zza.execute(new o.e(r10, new U1.h(obj, 1), O4.zzk, r10.c(), 1));
    }

    @Override // i1.j
    public final C0283c[] a() {
        return this.f1498O ? Q1.i.f1077a : new C0283c[]{Q1.i.f1078b};
    }

    public final C1.j b(X1.a aVar) {
        C1.j jVar;
        synchronized (this) {
            if (this.f1666J.get()) {
                M1.a aVar2 = new M1.a("This detector is already closed!", 14);
                jVar = new C1.j();
                jVar.g(aVar2);
            } else if (aVar.f1584c >= 32 && aVar.f1585d >= 32) {
                jVar = this.f1667K.a(this.f1669M, new Y1.f(this, aVar), (A.a) this.f1668L.f5K);
            } else {
                M1.a aVar3 = new M1.a("InputImage width and height should be at least 32!", 3);
                jVar = new C1.j();
                jVar.g(aVar3);
            }
        }
        A.c cVar = new A.c(this, aVar.f1584c, aVar.f1585d);
        jVar.getClass();
        G.g gVar = C1.h.f240a;
        C1.j jVar2 = new C1.j();
        jVar.f247b.g(new C1.i(gVar, cVar, jVar2));
        jVar.l();
        return jVar2;
    }

    @Override // Y1.c, java.io.Closeable, java.lang.AutoCloseable, S1.a
    public final synchronized void close() {
        super.close();
    }
}
