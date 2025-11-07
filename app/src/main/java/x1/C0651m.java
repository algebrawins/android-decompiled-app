package x1;

import java.util.List;
import java.util.ListIterator;

/* renamed from: x1.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651m extends i implements ListIterator {

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ C0659n f5950N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0651m(C0659n c0659n) {
        super(c0659n);
        this.f5950N = c0659n;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0659n c0659n = this.f5950N;
        boolean isEmpty = c0659n.isEmpty();
        a();
        ((ListIterator) this.f5915K).add(obj);
        c0659n.f5959O.getClass();
        if (isEmpty) {
            c0659n.e();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f5915K).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f5915K).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f5915K).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f5915K).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f5915K).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0651m(C0659n c0659n, int r3) {
        super(c0659n, ((List) c0659n.f5955K).listIterator(r3));
        this.f5950N = c0659n;
    }
}
