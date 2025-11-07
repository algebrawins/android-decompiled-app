package P;

import A0.AbstractC0017t;
import D.S;
import D.a0;
import D.r0;
import N.i;
import N.m;
import androidx.camera.core.impl.AbstractC0088p;
import androidx.camera.core.impl.C;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.InterfaceC0087o;
import androidx.camera.core.impl.InterfaceC0089q;
import androidx.camera.core.impl.InterfaceC0091t;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import w.C0489E;
import x1.AbstractC0612g0;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public final class c implements InterfaceC0091t {

    /* renamed from: J  reason: collision with root package name */
    public final HashSet f1024J;

    /* renamed from: M  reason: collision with root package name */
    public final C0489E f1027M;

    /* renamed from: N  reason: collision with root package name */
    public final InterfaceC0091t f1028N;

    /* renamed from: P  reason: collision with root package name */
    public final d f1030P;

    /* renamed from: K  reason: collision with root package name */
    public final HashMap f1025K = new HashMap();

    /* renamed from: L  reason: collision with root package name */
    public final HashMap f1026L = new HashMap();

    /* renamed from: O  reason: collision with root package name */
    public final a0 f1029O = new a0(1, this);

    /* JADX WARN: Type inference failed for: r4v1, types: [P.d, A0.t] */
    public c(InterfaceC0091t interfaceC0091t, HashSet hashSet, C0489E c0489e, I.c cVar) {
        this.f1028N = interfaceC0091t;
        this.f1027M = c0489e;
        this.f1024J = hashSet;
        this.f1030P = new AbstractC0017t(interfaceC0091t.i());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f1026L.put((r0) it.next(), Boolean.FALSE);
        }
    }

    public static void f(m mVar, D d4, c0 c0Var) {
        mVar.d();
        try {
            AbstractC0612g0.a();
            mVar.a();
            mVar.f945l.g(d4, new i(mVar, 1));
        } catch (C unused) {
            for (androidx.camera.core.impl.a0 a0Var : c0Var.f2183e) {
                a0Var.a();
            }
        }
    }

    public static D h(r0 r0Var) {
        List unmodifiableList;
        boolean z3;
        if (r0Var instanceof S) {
            unmodifiableList = r0Var.f452l.b();
        } else {
            unmodifiableList = Collections.unmodifiableList(r0Var.f452l.f2184f.f2246a);
        }
        if (unmodifiableList.size() <= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f(null, z3);
        if (unmodifiableList.size() != 1) {
            return null;
        }
        return (D) unmodifiableList.get(0);
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void a(r0 r0Var) {
        D h3;
        AbstractC0612g0.a();
        m mVar = (m) this.f1025K.get(r0Var);
        Objects.requireNonNull(mVar);
        mVar.d();
        Boolean bool = (Boolean) this.f1026L.get(r0Var);
        Objects.requireNonNull(bool);
        if (bool.booleanValue() && (h3 = h(r0Var)) != null) {
            f(mVar, h3, r0Var.f452l);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void b(r0 r0Var) {
        AbstractC0612g0.a();
        HashMap hashMap = this.f1026L;
        Boolean bool = (Boolean) hashMap.get(r0Var);
        Objects.requireNonNull(bool);
        if (!bool.booleanValue()) {
            return;
        }
        hashMap.put(r0Var, Boolean.FALSE);
        m mVar = (m) this.f1025K.get(r0Var);
        Objects.requireNonNull(mVar);
        AbstractC0612g0.a();
        mVar.a();
        mVar.c();
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final /* synthetic */ void c(boolean z3) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final boolean d() {
        return false;
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final r e() {
        return this.f1028N.e();
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final /* synthetic */ void g(InterfaceC0087o interfaceC0087o) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final InterfaceC0089q i() {
        return this.f1030P;
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final InterfaceC0087o j() {
        return AbstractC0088p.f2225a;
    }

    @Override // D.InterfaceC0031l
    public final r k() {
        return e();
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void l(r0 r0Var) {
        AbstractC0612g0.a();
        HashMap hashMap = this.f1026L;
        Boolean bool = (Boolean) hashMap.get(r0Var);
        Objects.requireNonNull(bool);
        if (bool.booleanValue()) {
            return;
        }
        hashMap.put(r0Var, Boolean.TRUE);
        D h3 = h(r0Var);
        if (h3 != null) {
            m mVar = (m) this.f1025K.get(r0Var);
            Objects.requireNonNull(mVar);
            f(mVar, h3, r0Var.f452l);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final boolean m() {
        if (k().b() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void n(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void o(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
