package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Z0 extends AbstractList implements RandomAccess, InterfaceC0207o0 {

    /* renamed from: J  reason: collision with root package name */
    public final C0204n0 f2870J;

    public Z0(C0204n0 c0204n0) {
        this.f2870J = c0204n0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0207o0
    public final InterfaceC0207o0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0207o0
    public final List f() {
        return Collections.unmodifiableList(this.f2870J.f2948K);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0207o0
    public final Object g(int r22) {
        return this.f2870J.f2948K.get(r22);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int r22) {
        return this.f2870J.get(r22);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new Y0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r22) {
        return new X0(this, r22);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2870J.f2948K.size();
    }
}
