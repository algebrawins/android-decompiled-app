package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import k1.w;
import s1.InterfaceC0452a;
import s1.InterfaceC0453b;
import t0.e;
import u0.AbstractC0467c;
import u0.AbstractC0472h;
import u0.C0466b;

/* loaded from: classes.dex */
public final class SupportFragmentWrapper extends IFragmentWrapper$Stub {

    /* renamed from: l  reason: collision with root package name */
    public e f2766l;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.dynamic.IFragmentWrapper$Stub, com.google.android.gms.dynamic.SupportFragmentWrapper] */
    public static SupportFragmentWrapper wrap(e eVar) {
        if (eVar != null) {
            ?? iFragmentWrapper$Stub = new IFragmentWrapper$Stub();
            iFragmentWrapper$Stub.f2766l = eVar;
            return iFragmentWrapper$Stub;
        }
        return null;
    }

    @Override // s1.InterfaceC0452a
    public final void B(Intent intent, int r4) {
        e eVar = this.f2766l;
        eVar.getClass();
        throw new IllegalStateException("Fragment " + eVar + " not attached to Activity");
    }

    @Override // s1.InterfaceC0452a
    public final InterfaceC0452a C() {
        e eVar = this.f2766l;
        eVar.getClass();
        C0466b c0466b = AbstractC0467c.f5021a;
        AbstractC0467c.b(new AbstractC0472h(eVar, "Attempting to get target fragment from fragment " + eVar));
        AbstractC0467c.a(eVar).getClass();
        return wrap(null);
    }

    @Override // s1.InterfaceC0452a
    public final boolean E() {
        this.f2766l.getClass();
        return false;
    }

    @Override // s1.InterfaceC0452a
    public final boolean K() {
        e eVar = this.f2766l;
        eVar.getClass();
        C0466b c0466b = AbstractC0467c.f5021a;
        AbstractC0467c.b(new AbstractC0472h(eVar, "Attempting to get retain instance for fragment " + eVar));
        AbstractC0467c.a(eVar).getClass();
        return eVar.f4987N;
    }

    @Override // s1.InterfaceC0452a
    public final void L(boolean z3) {
        e eVar = this.f2766l;
        if (eVar.f4989P != z3) {
            eVar.f4989P = z3;
        }
    }

    @Override // s1.InterfaceC0452a
    public final boolean M() {
        this.f2766l.getClass();
        return false;
    }

    @Override // s1.InterfaceC0452a
    public final void O(boolean z3) {
        e eVar = this.f2766l;
        eVar.getClass();
        C0466b c0466b = AbstractC0467c.f5021a;
        AbstractC0467c.b(new AbstractC0472h(eVar, "Attempting to set user visible hint to " + z3 + " for fragment " + eVar));
        AbstractC0467c.a(eVar).getClass();
        eVar.f4990Q = z3;
    }

    @Override // s1.InterfaceC0452a
    public final boolean X() {
        if (this.f2766l.f4983J >= 7) {
            return true;
        }
        return false;
    }

    @Override // s1.InterfaceC0452a
    public final int a() {
        this.f2766l.getClass();
        return 0;
    }

    @Override // s1.InterfaceC0452a
    public final int b() {
        e eVar = this.f2766l;
        eVar.getClass();
        C0466b c0466b = AbstractC0467c.f5021a;
        AbstractC0467c.b(new AbstractC0472h(eVar, "Attempting to get target request code from fragment " + eVar));
        AbstractC0467c.a(eVar).getClass();
        return 0;
    }

    @Override // s1.InterfaceC0452a
    public final InterfaceC0452a c() {
        this.f2766l.getClass();
        return wrap(null);
    }

    @Override // s1.InterfaceC0452a
    public final InterfaceC0453b d0() {
        this.f2766l.getClass();
        return ObjectWrapper.wrap(null);
    }

    @Override // s1.InterfaceC0452a
    public final boolean e0() {
        this.f2766l.getClass();
        return false;
    }

    @Override // s1.InterfaceC0452a
    public final InterfaceC0453b f() {
        this.f2766l.e();
        throw null;
    }

    @Override // s1.InterfaceC0452a
    public final Bundle h() {
        this.f2766l.getClass();
        return null;
    }

    @Override // s1.InterfaceC0452a
    public final InterfaceC0453b j0() {
        this.f2766l.getClass();
        return ObjectWrapper.wrap(null);
    }

    @Override // s1.InterfaceC0452a
    public final boolean k0() {
        this.f2766l.getClass();
        return false;
    }

    @Override // s1.InterfaceC0452a
    public final void l(boolean z3) {
        e eVar = this.f2766l;
        if (eVar.f4988O != z3) {
            eVar.f4988O = z3;
        }
    }

    @Override // s1.InterfaceC0452a
    public final void o0(boolean z3) {
        e eVar = this.f2766l;
        eVar.getClass();
        C0466b c0466b = AbstractC0467c.f5021a;
        AbstractC0467c.b(new AbstractC0472h(eVar, "Attempting to set retain instance for fragment " + eVar));
        AbstractC0467c.a(eVar).getClass();
        eVar.f4987N = z3;
    }

    @Override // s1.InterfaceC0452a
    public final boolean r0() {
        this.f2766l.getClass();
        return false;
    }

    @Override // s1.InterfaceC0452a
    public final void s(Intent intent) {
        e eVar = this.f2766l;
        eVar.getClass();
        throw new IllegalStateException("Fragment " + eVar + " not attached to Activity");
    }

    @Override // s1.InterfaceC0452a
    public final String t() {
        this.f2766l.getClass();
        return null;
    }

    @Override // s1.InterfaceC0452a
    public final void t0(InterfaceC0453b interfaceC0453b) {
        View view = (View) ObjectWrapper.unwrap(interfaceC0453b);
        w.e(view);
        this.f2766l.getClass();
        view.setOnCreateContextMenuListener(null);
    }

    @Override // s1.InterfaceC0452a
    public final boolean u0() {
        return this.f2766l.f4990Q;
    }

    @Override // s1.InterfaceC0452a
    public final void v(InterfaceC0453b interfaceC0453b) {
        View view = (View) ObjectWrapper.unwrap(interfaceC0453b);
        w.e(view);
        e eVar = this.f2766l;
        eVar.getClass();
        view.setOnCreateContextMenuListener(eVar);
    }

    @Override // s1.InterfaceC0452a
    public final boolean x() {
        this.f2766l.getClass();
        return false;
    }
}
