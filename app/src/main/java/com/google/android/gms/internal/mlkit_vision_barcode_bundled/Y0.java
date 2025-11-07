package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class Y0 implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public final Iterator f2867J;

    public Y0(Z0 z02) {
        this.f2867J = z02.f2870J.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2867J.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f2867J.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
