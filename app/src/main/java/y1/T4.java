package y1;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import x1.AbstractC0665n5;

/* loaded from: classes.dex */
public final class T4 extends w1.m implements ListIterator {

    /* renamed from: K  reason: collision with root package name */
    public final int f6306K;

    /* renamed from: L  reason: collision with root package name */
    public int f6307L;

    /* renamed from: M  reason: collision with root package name */
    public final V4 f6308M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(V4 v4, int r4) {
        super(2);
        int size = v4.size();
        if (r4 >= 0 && r4 <= size) {
            this.f6306K = size;
            this.f6307L = r4;
            this.f6308M = v4;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0665n5.c(r4, size, "index"));
    }

    public final Object a(int r22) {
        return this.f6308M.get(r22);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f6307L < this.f6306K) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f6307L > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int r02 = this.f6307L;
            this.f6307L = r02 + 1;
            return a(r02);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6307L;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int r02 = this.f6307L - 1;
            this.f6307L = r02;
            return a(r02);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6307L - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
