package x1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: x1.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562A extends w1.m implements ListIterator {

    /* renamed from: K  reason: collision with root package name */
    public final int f5491K;

    /* renamed from: L  reason: collision with root package name */
    public int f5492L;

    /* renamed from: M  reason: collision with root package name */
    public final C f5493M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0562A(C c4, int r4) {
        super(1);
        int size = c4.size();
        if (r4 >= 0 && r4 <= size) {
            this.f5491K = size;
            this.f5492L = r4;
            this.f5493M = c4;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0625h5.d(r4, size, "index"));
    }

    public final Object a(int r22) {
        return this.f5493M.get(r22);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f5492L < this.f5491K) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f5492L > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int r02 = this.f5492L;
            this.f5492L = r02 + 1;
            return a(r02);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5492L;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int r02 = this.f5492L - 1;
            this.f5492L = r02;
            return a(r02);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5492L - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
