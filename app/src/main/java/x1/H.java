package x1;

import java.util.AbstractMap;

/* loaded from: classes.dex */
public final class H extends C {

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ I f5570L;

    public H(I r12) {
        this.f5570L = r12;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int r3) {
        I r02 = this.f5570L;
        AbstractC0625h5.a(r3, r02.f5582N);
        int r32 = r3 + r3;
        Object[] objArr = r02.f5581M;
        Object obj = objArr[r32];
        obj.getClass();
        Object obj2 = objArr[r32 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5570L.f5582N;
    }
}
