package y1;

import java.util.AbstractMap;
import x1.AbstractC0665n5;

/* loaded from: classes.dex */
public final class Y4 extends V4 {

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Z4 f6332L;

    public Y4(Z4 z4) {
        this.f6332L = z4;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int r3) {
        Z4 z4 = this.f6332L;
        AbstractC0665n5.a(r3, z4.f6338N);
        int r32 = r3 + r3;
        Object[] objArr = z4.f6337M;
        Object obj = objArr[r32];
        obj.getClass();
        Object obj2 = objArr[r32 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6332L.f6338N;
    }
}
