package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class E extends AbstractList implements i0 {

    /* renamed from: J  reason: collision with root package name */
    public boolean f2786J;

    public E(boolean z3) {
        this.f2786J = z3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        e();
        return super.add(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r12, Collection collection) {
        e();
        return super.addAll(r12, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        super.clear();
    }

    public final void e() {
        if (this.f2786J) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
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

    public final boolean h() {
        return this.f2786J;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int r22 = 1;
        for (int r12 = 0; r12 < size; r12++) {
            r22 = (r22 * 31) + get(r12).hashCode();
        }
        return r22;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        e();
        return super.addAll(collection);
    }
}
