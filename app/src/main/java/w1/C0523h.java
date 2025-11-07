package w1;

import java.util.AbstractMap;
import x1.V4;

/* renamed from: w1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523h extends AbstractC0519d {

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ C0524i f5295L;

    public C0523h(C0524i c0524i) {
        this.f5295L = c0524i;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int r3) {
        C0524i c0524i = this.f5295L;
        V4.a(r3, c0524i.f5298N);
        int r32 = r3 + r3;
        Object[] objArr = c0524i.f5297M;
        Object obj = objArr[r32];
        obj.getClass();
        Object obj2 = objArr[r32 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5295L.f5298N;
    }
}
