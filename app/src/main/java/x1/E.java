package x1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class E implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public final Iterator f5533J;

    public E(Iterator it) {
        it.getClass();
        this.f5533J = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5533J.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f5533J.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5533J.remove();
    }
}
