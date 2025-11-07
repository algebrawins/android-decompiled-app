package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106e implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public int f2338J = 0;

    /* renamed from: K  reason: collision with root package name */
    public final int f2339K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ C0111h f2340L;

    public C0106e(C0111h c0111h) {
        this.f2340L = c0111h;
        this.f2339K = c0111h.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2338J < this.f2339K) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r02 = this.f2338J;
        if (r02 < this.f2339K) {
            this.f2338J = r02 + 1;
            return Byte.valueOf(this.f2340L.l(r02));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
