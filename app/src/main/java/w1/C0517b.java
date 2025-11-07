package w1;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import x1.V4;

/* renamed from: w1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517b extends m implements ListIterator {

    /* renamed from: K  reason: collision with root package name */
    public final int f5281K;

    /* renamed from: L  reason: collision with root package name */
    public int f5282L;

    /* renamed from: M  reason: collision with root package name */
    public final AbstractC0519d f5283M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0517b(AbstractC0519d abstractC0519d, int r4) {
        super(0);
        int size = abstractC0519d.size();
        V4.b(r4, size);
        this.f5281K = size;
        this.f5282L = r4;
        this.f5283M = abstractC0519d;
    }

    public final Object a(int r22) {
        return this.f5283M.get(r22);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f5282L < this.f5281K) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f5282L > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int r02 = this.f5282L;
            this.f5282L = r02 + 1;
            return a(r02);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5282L;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int r02 = this.f5282L - 1;
            this.f5282L = r02;
            return a(r02);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5282L - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
