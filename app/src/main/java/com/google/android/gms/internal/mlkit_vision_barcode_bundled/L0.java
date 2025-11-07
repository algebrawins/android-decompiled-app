package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class L0 implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public final ArrayDeque f2814J;

    /* renamed from: K  reason: collision with root package name */
    public K f2815K;

    public L0(L l3) {
        if (l3 instanceof M0) {
            M0 m02 = (M0) l3;
            ArrayDeque arrayDeque = new ArrayDeque(m02.f2826P);
            this.f2814J = arrayDeque;
            arrayDeque.push(m02);
            L l4 = m02.f2823M;
            while (l4 instanceof M0) {
                M0 m03 = (M0) l4;
                this.f2814J.push(m03);
                l4 = m03.f2823M;
            }
            this.f2815K = (K) l4;
            return;
        }
        this.f2814J = null;
        this.f2815K = (K) l3;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final K next() {
        K k3;
        K k4 = this.f2815K;
        if (k4 != null) {
            do {
                ArrayDeque arrayDeque = this.f2814J;
                k3 = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                L l3 = ((M0) arrayDeque.pop()).f2824N;
                while (l3 instanceof M0) {
                    M0 m02 = (M0) l3;
                    arrayDeque.push(m02);
                    l3 = m02.f2823M;
                }
                k3 = (K) l3;
            } while (k3.j() == 0);
            this.f2815K = k3;
            return k4;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2815K != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
