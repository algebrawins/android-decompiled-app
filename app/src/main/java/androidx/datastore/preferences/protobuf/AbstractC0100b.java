package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0100b extends AbstractList implements F {

    /* renamed from: J  reason: collision with root package name */
    public boolean f2333J;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        super.clear();
    }

    public final void e() {
        if (this.f2333J) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int r3 = 0; r3 < size; r3++) {
            if (!get(r3).equals(list.get(r3))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int r12 = 1;
        for (int r22 = 0; r22 < size; r22++) {
            r12 = (r12 * 31) + get(r22).hashCode();
        }
        return r12;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int r12);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        e();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        e();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r12, Collection collection) {
        e();
        return super.addAll(r12, collection);
    }
}
