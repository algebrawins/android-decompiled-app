package R2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public final int f1159J;

    /* renamed from: K  reason: collision with root package name */
    public final int f1160K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f1161L;

    /* renamed from: M  reason: collision with root package name */
    public int f1162M;

    public b(int r3, int r4, int r5) {
        this.f1159J = r5;
        this.f1160K = r4;
        boolean z3 = false;
        if (r5 <= 0 ? r3 >= r4 : r3 <= r4) {
            z3 = true;
        }
        this.f1161L = z3;
        this.f1162M = z3 ? r3 : r4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1161L;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r02 = this.f1162M;
        if (r02 == this.f1160K) {
            if (this.f1161L) {
                this.f1161L = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f1162M = this.f1159J + r02;
        }
        return Integer.valueOf(r02);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
