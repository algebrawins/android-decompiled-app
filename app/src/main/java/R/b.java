package R;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends k implements Map {

    /* renamed from: Q  reason: collision with root package name */
    public a f1108Q;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f1108Q == null) {
            this.f1108Q = new a(0, this);
        }
        a aVar = this.f1108Q;
        if (((h) aVar.f1066a) == null) {
            aVar.f1066a = new h(aVar, 0);
        }
        return (h) aVar.f1066a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f1108Q == null) {
            this.f1108Q = new a(0, this);
        }
        a aVar = this.f1108Q;
        if (((h) aVar.f1067b) == null) {
            aVar.f1067b = new h(aVar, 1);
        }
        return (h) aVar.f1067b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f1149L;
        int r02 = this.f1149L;
        int[] r22 = this.f1147J;
        if (r22.length < size) {
            Object[] objArr = this.f1148K;
            a(size);
            if (this.f1149L > 0) {
                System.arraycopy(r22, 0, this.f1147J, 0, r02);
                System.arraycopy(objArr, 0, this.f1148K, 0, r02 << 1);
            }
            k.b(r22, objArr, r02);
        }
        if (this.f1149L == r02) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f1108Q == null) {
            this.f1108Q = new a(0, this);
        }
        a aVar = this.f1108Q;
        if (((j) aVar.f1068c) == null) {
            aVar.f1068c = new j(aVar);
        }
        return (j) aVar.f1068c;
    }
}
