package y1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class Z4 extends W4 {

    /* renamed from: L  reason: collision with root package name */
    public final transient x1.L f6336L;

    /* renamed from: M  reason: collision with root package name */
    public final transient Object[] f6337M;

    /* renamed from: N  reason: collision with root package name */
    public final transient int f6338N = 1;

    public Z4(x1.L l3, Object[] objArr) {
        this.f6336L = l3;
        this.f6337M = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f6336L.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // y1.AbstractC0866n4
    public final int e(Object[] objArr) {
        V4 v4 = this.f6322K;
        if (v4 == null) {
            v4 = new Y4(this);
            this.f6322K = v4;
        }
        return v4.e(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        V4 v4 = this.f6322K;
        if (v4 == null) {
            v4 = new Y4(this);
            this.f6322K = v4;
        }
        return v4.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6338N;
    }
}
