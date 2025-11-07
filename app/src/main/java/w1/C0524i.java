package w1;

import java.util.Iterator;
import java.util.Map;

/* renamed from: w1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524i extends AbstractC0521f {

    /* renamed from: L  reason: collision with root package name */
    public final transient l f5296L;

    /* renamed from: M  reason: collision with root package name */
    public final transient Object[] f5297M;

    /* renamed from: N  reason: collision with root package name */
    public final transient int f5298N;

    public C0524i(l lVar, Object[] objArr, int r3) {
        this.f5296L = lVar;
        this.f5297M = objArr;
        this.f5298N = r3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5296L.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // w1.AbstractC0516a
    public final int e(Object[] objArr) {
        AbstractC0519d abstractC0519d = this.f5291K;
        if (abstractC0519d == null) {
            abstractC0519d = new C0523h(this);
            this.f5291K = abstractC0519d;
        }
        return abstractC0519d.e(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC0519d abstractC0519d = this.f5291K;
        if (abstractC0519d == null) {
            abstractC0519d = new C0523h(this);
            this.f5291K = abstractC0519d;
        }
        return abstractC0519d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5298N;
    }
}
