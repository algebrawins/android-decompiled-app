package Q;

import D.C0036q;
import D.C0040v;
import D.r0;
import I.f;
import I.h;
import S.l;
import androidx.camera.core.impl.C0093v;
import androidx.camera.core.impl.M;
import h2.AbstractActivityC0292d;
import h2.J;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p.t0;
import w.C0489E;
import x1.AbstractC0612g0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final d f1045e = new d();

    /* renamed from: b  reason: collision with root package name */
    public l f1047b;

    /* renamed from: d  reason: collision with root package name */
    public C0040v f1049d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1046a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final E.c f1048c = new E.c();

    /* JADX WARN: Type inference failed for: r3v3, types: [D.q, java.lang.Object] */
    public final b a(AbstractActivityC0292d abstractActivityC0292d, C0036q c0036q, r0... r0VarArr) {
        int r22;
        b bVar;
        C0040v c0040v = this.f1049d;
        if (c0040v == null) {
            r22 = 0;
        } else {
            t0 t0Var = c0040v.f466f;
            if (t0Var != null) {
                r22 = ((B.a) t0Var.f4718a).f171J;
            } else {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
        }
        if (r22 != 2) {
            b(1);
            List emptyList = Collections.emptyList();
            AbstractC0612g0.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet(c0036q.f441a);
            for (r0 r0Var : r0VarArr) {
                C0036q p2 = r0Var.f447f.p();
                if (p2 != null) {
                    Iterator it = p2.f441a.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add((M) it.next());
                    }
                }
            }
            ?? obj = new Object();
            obj.f441a = linkedHashSet;
            LinkedHashSet b3 = obj.b(this.f1049d.f461a.q());
            if (!b3.isEmpty()) {
                f fVar = new f(b3);
                E.c cVar = this.f1048c;
                synchronized (cVar.f502K) {
                    bVar = (b) ((HashMap) cVar.f503L).get(new a(abstractActivityC0292d, fVar));
                }
                Collection<b> g = this.f1048c.g();
                for (r0 r0Var2 : r0VarArr) {
                    for (b bVar2 : g) {
                        if (bVar2.s(r0Var2) && bVar2 != bVar) {
                            throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", r0Var2));
                        }
                    }
                }
                if (bVar == null) {
                    E.c cVar2 = this.f1048c;
                    C0040v c0040v2 = this.f1049d;
                    t0 t0Var2 = c0040v2.f466f;
                    if (t0Var2 != null) {
                        B.a aVar = (B.a) t0Var2.f4718a;
                        J j3 = c0040v2.g;
                        if (j3 != null) {
                            C0489E c0489e = c0040v2.f467h;
                            if (c0489e != null) {
                                bVar = cVar2.c(abstractActivityC0292d, new h(b3, aVar, j3, c0489e));
                            } else {
                                throw new IllegalStateException("CameraX not initialized yet.");
                            }
                        } else {
                            throw new IllegalStateException("CameraX not initialized yet.");
                        }
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                }
                Iterator it2 = c0036q.f441a.iterator();
                while (it2.hasNext()) {
                    ((M) it2.next()).getClass();
                }
                bVar.g(null);
                if (r0VarArr.length != 0) {
                    E.c cVar3 = this.f1048c;
                    List asList = Arrays.asList(r0VarArr);
                    t0 t0Var3 = this.f1049d.f466f;
                    if (t0Var3 != null) {
                        cVar3.a(bVar, emptyList, asList, (B.a) t0Var3.f4718a);
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                }
                return bVar;
            }
            throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
        }
        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
    }

    public final void b(int r10) {
        int r7;
        boolean z3;
        C0040v c0040v = this.f1049d;
        if (c0040v == null) {
            return;
        }
        t0 t0Var = c0040v.f466f;
        if (t0Var != null) {
            B.a aVar = (B.a) t0Var.f4718a;
            if (r10 != aVar.f171J) {
                Iterator it = ((ArrayList) aVar.f172K).iterator();
                while (it.hasNext()) {
                    C0093v c0093v = (C0093v) it.next();
                    int r4 = aVar.f171J;
                    synchronized (c0093v.f2232b) {
                        boolean z4 = true;
                        if (r10 == 2) {
                            r7 = 2;
                        } else {
                            r7 = 1;
                        }
                        c0093v.f2233c = r7;
                        if (r4 != 2 && r10 == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (r4 != 2 || r10 == 2) {
                            z4 = false;
                        }
                        if (z3 || z4) {
                            c0093v.b();
                        }
                    }
                }
            }
            if (aVar.f171J == 2 && r10 != 2) {
                ((ArrayList) aVar.f173L).clear();
            }
            aVar.f171J = r10;
            return;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public final void c() {
        AbstractC0612g0.a();
        b(0);
        E.c cVar = this.f1048c;
        synchronized (cVar.f502K) {
            try {
                for (a aVar : ((HashMap) cVar.f503L).keySet()) {
                    b bVar = (b) ((HashMap) cVar.f503L).get(aVar);
                    bVar.u();
                    cVar.m(bVar.q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
