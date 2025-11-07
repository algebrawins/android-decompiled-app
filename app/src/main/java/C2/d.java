package C2;

import D.C;
import a.AbstractC0069a;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* renamed from: J  reason: collision with root package name */
    public final e f258J;

    /* renamed from: K  reason: collision with root package name */
    public final int f259K;

    /* renamed from: L  reason: collision with root package name */
    public final int f260L;

    public d(e eVar, int r3, int r4) {
        N2.g.e(eVar, "list");
        this.f258J = eVar;
        this.f259K = r3;
        AbstractC0069a.a(r3, r4, eVar.e());
        this.f260L = r4 - r3;
    }

    @Override // C2.e
    public final int e() {
        return this.f260L;
    }

    @Override // java.util.List
    public final Object get(int r5) {
        int r02 = this.f260L;
        if (r5 >= 0 && r5 < r02) {
            return this.f258J.get(this.f259K + r5);
        }
        throw new IndexOutOfBoundsException(C.x("index: ", r5, ", size: ", r02));
    }
}
