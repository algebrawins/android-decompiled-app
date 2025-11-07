package R;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* renamed from: J  reason: collision with root package name */
    public int f1138J;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ Q1.e f1141M;

    /* renamed from: L  reason: collision with root package name */
    public boolean f1140L = false;

    /* renamed from: K  reason: collision with root package name */
    public int f1139K = -1;

    public i(Q1.e eVar) {
        this.f1141M = eVar;
        this.f1138J = eVar.e() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f1140L) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int r22 = this.f1139K;
            Q1.e eVar = this.f1141M;
            Object c4 = eVar.c(r22, 0);
            if (key != c4 && (key == null || !key.equals(c4))) {
                return false;
            }
            Object value = entry.getValue();
            Object c5 = eVar.c(this.f1139K, 1);
            if (value != c5 && (value == null || !value.equals(c5))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f1140L) {
            return this.f1141M.c(this.f1139K, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f1140L) {
            return this.f1141M.c(this.f1139K, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1139K < this.f1138J) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f1140L) {
            int r02 = this.f1139K;
            Q1.e eVar = this.f1141M;
            int r22 = 0;
            Object c4 = eVar.c(r02, 0);
            Object c5 = eVar.c(this.f1139K, 1);
            if (c4 == null) {
                hashCode = 0;
            } else {
                hashCode = c4.hashCode();
            }
            if (c5 != null) {
                r22 = c5.hashCode();
            }
            return hashCode ^ r22;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f1139K++;
            this.f1140L = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f1140L) {
            this.f1141M.i(this.f1139K);
            this.f1139K--;
            this.f1138J--;
            this.f1140L = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f1140L) {
            return this.f1141M.j(this.f1139K, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
