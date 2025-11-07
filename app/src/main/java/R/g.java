package R;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public final int f1131J;

    /* renamed from: K  reason: collision with root package name */
    public int f1132K;

    /* renamed from: L  reason: collision with root package name */
    public int f1133L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f1134M = false;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ Q1.e f1135N;

    public g(Q1.e eVar, int r3) {
        this.f1135N = eVar;
        this.f1131J = r3;
        this.f1132K = eVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1133L < this.f1132K) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object c4 = this.f1135N.c(this.f1133L, this.f1131J);
            this.f1133L++;
            this.f1134M = true;
            return c4;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f1134M) {
            int r02 = this.f1133L - 1;
            this.f1133L = r02;
            this.f1132K--;
            this.f1134M = false;
            this.f1135N.i(r02);
            return;
        }
        throw new IllegalStateException();
    }
}
