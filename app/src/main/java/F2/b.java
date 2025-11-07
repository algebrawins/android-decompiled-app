package F2;

import D2.i;
import V2.C0050f;
import a3.h;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b implements D2.d, c, Serializable {

    /* renamed from: J  reason: collision with root package name */
    public final D2.d f654J;

    /* renamed from: K  reason: collision with root package name */
    public final i f655K;

    /* renamed from: L  reason: collision with root package name */
    public transient D2.d f656L;

    public b(D2.d dVar, i iVar) {
        this.f654J = dVar;
        this.f655K = iVar;
    }

    @Override // F2.c
    public c c() {
        D2.d dVar = this.f654J;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // D2.d
    public i e() {
        i iVar = this.f655K;
        N2.g.b(iVar);
        return iVar;
    }

    public D2.d f(D2.d dVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // D2.d
    public final void i(Object obj) {
        D2.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            D2.d dVar2 = bVar.f654J;
            N2.g.b(dVar2);
            try {
                obj = bVar.k(obj);
                if (obj == E2.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = P1.a.a(th);
            }
            bVar.n();
            if (dVar2 instanceof b) {
                dVar = dVar2;
            } else {
                dVar2.i(obj);
                return;
            }
        }
    }

    public StackTraceElement j() {
        int r4;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int r42;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar == null) {
            return null;
        }
        int v3 = dVar.v();
        if (v3 <= 1) {
            int r22 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    r42 = num.intValue();
                } else {
                    r42 = 0;
                }
                r4 = r42 - 1;
            } catch (Exception unused) {
                r4 = -1;
            }
            if (r4 >= 0) {
                r22 = dVar.l()[r4];
            }
            e eVar = f.f661b;
            e eVar2 = f.f660a;
            if (eVar == null) {
                try {
                    e eVar3 = new e(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    f.f661b = eVar3;
                    eVar = eVar3;
                } catch (Exception unused2) {
                    f.f661b = eVar2;
                    eVar = eVar2;
                }
            }
            if (eVar != eVar2 && (method = eVar.f657a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = eVar.f658b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = eVar.f659c;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, null);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = obj;
                }
            }
            if (str2 == null) {
                str = dVar.c();
            } else {
                str = str2 + '/' + dVar.c();
            }
            return new StackTraceElement(str, dVar.m(), dVar.f(), r22);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v3 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object k(Object obj);

    public void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0050f c0050f;
        D2.d dVar = this.f656L;
        if (dVar != null && dVar != this) {
            D2.g f2 = e().f(D2.e.f491J);
            N2.g.b(f2);
            D2.f fVar = (D2.f) f2;
            h hVar = (h) dVar;
            do {
                atomicReferenceFieldUpdater = h.f1856Q;
            } while (atomicReferenceFieldUpdater.get(hVar) == a3.a.f1846d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof C0050f) {
                c0050f = (C0050f) obj;
            } else {
                c0050f = null;
            }
            if (c0050f != null) {
                c0050f.r();
            }
        }
        this.f656L = a.f653J;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object j3 = j();
        if (j3 == null) {
            j3 = getClass().getName();
        }
        sb.append(j3);
        return sb.toString();
    }

    public b(D2.d dVar) {
        this(dVar, dVar != null ? dVar.e() : null);
    }
}
