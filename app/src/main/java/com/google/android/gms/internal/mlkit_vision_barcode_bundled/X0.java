package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class X0 implements ListIterator {

    /* renamed from: J  reason: collision with root package name */
    public final ListIterator f2864J;

    public X0(Z0 z02, int r22) {
        this.f2864J = z02.f2870J.listIterator(r22);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2864J.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2864J.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f2864J.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2864J.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f2864J.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2864J.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
