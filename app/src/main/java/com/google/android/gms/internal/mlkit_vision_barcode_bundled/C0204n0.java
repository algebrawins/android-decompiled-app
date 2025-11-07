package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204n0 extends E implements RandomAccess, InterfaceC0207o0 {

    /* renamed from: K  reason: collision with root package name */
    public final List f2948K;

    static {
        new C0204n0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0204n0(int r22) {
        super(true);
        ArrayList arrayList = new ArrayList(r22);
        this.f2948K = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int r22, Object obj) {
        e();
        this.f2948K.add(r22, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.List
    public final boolean addAll(int r22, Collection collection) {
        e();
        if (collection instanceof InterfaceC0207o0) {
            collection = ((InterfaceC0207o0) collection).f();
        }
        boolean addAll = this.f2948K.addAll(r22, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0
    public final i0 b(int r3) {
        List list = this.f2948K;
        if (r3 >= list.size()) {
            ArrayList arrayList = new ArrayList(r3);
            arrayList.addAll(list);
            return new C0204n0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0207o0
    public final InterfaceC0207o0 c() {
        if (this.f2786J) {
            return new Z0(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        this.f2948K.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0207o0
    public final List f() {
        return Collections.unmodifiableList(this.f2948K);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0207o0
    public final Object g(int r22) {
        return this.f2948K.get(r22);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i */
    public final String get(int r6) {
        List list = this.f2948K;
        Object obj = list.get(r6);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof L) {
            L l3 = (L) obj;
            String x3 = l3.x(AbstractC0192j0.f2920a);
            if (l3.s()) {
                list.set(r6, x3);
            }
            return x3;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, AbstractC0192j0.f2920a);
        C0173c c0173c = AbstractC0187g1.f2904a;
        int length = bArr.length;
        AbstractC0187g1.f2904a.getClass();
        if (C0173c.a(0, 0, length, bArr) == 0) {
            list.set(r6, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.List
    public final Object remove(int r3) {
        e();
        Object remove = this.f2948K.remove(r3);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof L) {
            return ((L) remove).x(AbstractC0192j0.f2920a);
        }
        return new String((byte[]) remove, AbstractC0192j0.f2920a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r22, Object obj) {
        e();
        Object obj2 = this.f2948K.set(r22, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof L) {
            return ((L) obj2).x(AbstractC0192j0.f2920a);
        }
        return new String((byte[]) obj2, AbstractC0192j0.f2920a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2948K.size();
    }

    public C0204n0(ArrayList arrayList) {
        super(true);
        this.f2948K = arrayList;
    }

    public C0204n0() {
        super(false);
        this.f2948K = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f2948K.size(), collection);
    }
}
