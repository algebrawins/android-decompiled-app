package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import k1.w;
import s1.InterfaceC0452a;
import s1.InterfaceC0453b;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public final class FragmentWrapper extends IFragmentWrapper$Stub {

    /* renamed from: l  reason: collision with root package name */
    public Fragment f2764l;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.dynamic.IFragmentWrapper$Stub, com.google.android.gms.dynamic.FragmentWrapper] */
    public static FragmentWrapper wrap(Fragment fragment) {
        if (fragment != null) {
            ?? iFragmentWrapper$Stub = new IFragmentWrapper$Stub();
            iFragmentWrapper$Stub.f2764l = fragment;
            return iFragmentWrapper$Stub;
        }
        return null;
    }

    @Override // s1.InterfaceC0452a
    public final void B(Intent intent, int r3) {
        this.f2764l.startActivityForResult(intent, r3);
    }

    @Override // s1.InterfaceC0452a
    public final InterfaceC0452a C() {
        return wrap(this.f2764l.getTargetFragment());
    }

    @Override // s1.InterfaceC0452a
    public final boolean E() {
        return this.f2764l.isRemoving();
    }

    @Override // s1.InterfaceC0452a
    public final boolean K() {
        return this.f2764l.getRetainInstance();
    }

    @Override // s1.InterfaceC0452a
    public final void L(boolean z3) {
        this.f2764l.setMenuVisibility(z3);
    }

    @Override // s1.InterfaceC0452a
    public final boolean M() {
        return this.f2764l.isAdded();
    }

    @Override // s1.InterfaceC0452a
    public final void O(boolean z3) {
        this.f2764l.setUserVisibleHint(z3);
    }

    @Override // s1.InterfaceC0452a
    public final boolean X() {
        return this.f2764l.isResumed();
    }

    @Override // s1.InterfaceC0452a
    public final int a() {
        return this.f2764l.getId();
    }

    @Override // s1.InterfaceC0452a
    public final int b() {
        return this.f2764l.getTargetRequestCode();
    }

    @Override // s1.InterfaceC0452a
    public final InterfaceC0452a c() {
        return wrap(this.f2764l.getParentFragment());
    }

    @Override // s1.InterfaceC0452a
    public final InterfaceC0453b d0() {
        return ObjectWrapper.wrap(this.f2764l.getActivity());
    }

    @Override // s1.InterfaceC0452a
    public final boolean e0() {
        return this.f2764l.isDetached();
    }

    @Override // s1.InterfaceC0452a
    public final InterfaceC0453b f() {
        return ObjectWrapper.wrap(this.f2764l.getResources());
    }

    @Override // s1.InterfaceC0452a
    public final Bundle h() {
        return this.f2764l.getArguments();
    }

    @Override // s1.InterfaceC0452a
    public final InterfaceC0453b j0() {
        return ObjectWrapper.wrap(this.f2764l.getView());
    }

    @Override // s1.InterfaceC0452a
    public final boolean k0() {
        return this.f2764l.isInLayout();
    }

    @Override // s1.InterfaceC0452a
    public final void l(boolean z3) {
        this.f2764l.setHasOptionsMenu(z3);
    }

    @Override // s1.InterfaceC0452a
    public final void o0(boolean z3) {
        this.f2764l.setRetainInstance(z3);
    }

    @Override // s1.InterfaceC0452a
    public final boolean r0() {
        return this.f2764l.isVisible();
    }

    @Override // s1.InterfaceC0452a
    public final void s(Intent intent) {
        this.f2764l.startActivity(intent);
    }

    @Override // s1.InterfaceC0452a
    public final String t() {
        return this.f2764l.getTag();
    }

    @Override // s1.InterfaceC0452a
    public final void t0(InterfaceC0453b interfaceC0453b) {
        View view = (View) ObjectWrapper.unwrap(interfaceC0453b);
        w.e(view);
        this.f2764l.unregisterForContextMenu(view);
    }

    @Override // s1.InterfaceC0452a
    public final boolean u0() {
        return this.f2764l.getUserVisibleHint();
    }

    @Override // s1.InterfaceC0452a
    public final void v(InterfaceC0453b interfaceC0453b) {
        View view = (View) ObjectWrapper.unwrap(interfaceC0453b);
        w.e(view);
        this.f2764l.registerForContextMenu(view);
    }

    @Override // s1.InterfaceC0452a
    public final boolean x() {
        return this.f2764l.isHidden();
    }
}
