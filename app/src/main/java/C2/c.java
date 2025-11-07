package C2;

import D.C;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c extends b implements ListIterator {

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ e f257M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int r5) {
        super(0, eVar);
        this.f257M = eVar;
        int e4 = eVar.e();
        if (r5 >= 0 && r5 <= e4) {
            this.f255K = r5;
            return;
        }
        throw new IndexOutOfBoundsException(C.x("index: ", r5, ", size: ", e4));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f255K > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f255K;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int r02 = this.f255K - 1;
            this.f255K = r02;
            return this.f257M.get(r02);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f255K - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
