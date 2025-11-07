package R;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h implements Set {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f1136J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Q1.e f1137K;

    public /* synthetic */ h(Q1.e eVar, int r22) {
        this.f1136J = r22;
        this.f1137K = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Q1.e eVar = this.f1137K;
                int e4 = eVar.e();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    eVar.h(entry.getKey(), entry.getValue());
                }
                if (e4 != eVar.e()) {
                    return true;
                }
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f1137K.b();
                return;
            default:
                this.f1137K.b();
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Q1.e eVar = this.f1137K;
                int f2 = eVar.f(key);
                if (f2 < 0) {
                    return false;
                }
                Object c4 = eVar.c(f2, 1);
                Object value = entry.getValue();
                if (c4 != value && (c4 == null || !c4.equals(value))) {
                    return false;
                }
                return true;
            default:
                if (this.f1137K.f(obj) >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                for (Object obj : collection) {
                    if (!contains(obj)) {
                        return false;
                    }
                }
                return true;
            default:
                Map d4 = this.f1137K.d();
                for (Object obj2 : collection) {
                    if (!d4.containsKey(obj2)) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return Q1.e.k(this, obj);
            default:
                return Q1.e.k(this, obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Q1.e eVar = this.f1137K;
                int r4 = 0;
                for (int e4 = eVar.e() - 1; e4 >= 0; e4--) {
                    Object c4 = eVar.c(e4, 0);
                    Object c5 = eVar.c(e4, 1);
                    if (c4 == null) {
                        hashCode = 0;
                    } else {
                        hashCode = c4.hashCode();
                    }
                    if (c5 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = c5.hashCode();
                    }
                    r4 += hashCode ^ hashCode2;
                }
                return r4;
            default:
                Q1.e eVar2 = this.f1137K;
                int r3 = 0;
                for (int e5 = eVar2.e() - 1; e5 >= 0; e5--) {
                    Object c6 = eVar2.c(e5, 0);
                    if (c6 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = c6.hashCode();
                    }
                    r3 += hashCode3;
                }
                return r3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (this.f1137K.e() == 0) {
                    return true;
                }
                return false;
            default:
                if (this.f1137K.e() == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new i(this.f1137K);
            default:
                return new g(this.f1137K, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw new UnsupportedOperationException();
            default:
                Q1.e eVar = this.f1137K;
                int f2 = eVar.f(obj);
                if (f2 >= 0) {
                    eVar.i(f2);
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw new UnsupportedOperationException();
            default:
                Map d4 = this.f1137K.d();
                int size = d4.size();
                for (Object obj : collection) {
                    d4.remove(obj);
                }
                if (size != d4.size()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw new UnsupportedOperationException();
            default:
                Map d4 = this.f1137K.d();
                int size = d4.size();
                Iterator it = d4.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                if (size != d4.size()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return this.f1137K.e();
            default:
                return this.f1137K.e();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw new UnsupportedOperationException();
            default:
                return this.f1137K.l(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f1136J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw new UnsupportedOperationException();
            default:
                Q1.e eVar = this.f1137K;
                int e4 = eVar.e();
                Object[] objArr = new Object[e4];
                for (int r4 = 0; r4 < e4; r4++) {
                    objArr[r4] = eVar.c(r4, 0);
                }
                return objArr;
        }
    }
}
