package w2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class v extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public J f5420M;

    /* renamed from: N  reason: collision with root package name */
    public Set f5421N;

    /* renamed from: O  reason: collision with root package name */
    public Map f5422O;

    /* renamed from: P  reason: collision with root package name */
    public Iterator f5423P;

    /* renamed from: Q  reason: collision with root package name */
    public r0.d f5424Q;

    /* renamed from: R  reason: collision with root package name */
    public /* synthetic */ Object f5425R;

    /* renamed from: S  reason: collision with root package name */
    public final /* synthetic */ J f5426S;

    /* renamed from: T  reason: collision with root package name */
    public int f5427T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(J j3, F2.b bVar) {
        super(bVar);
        this.f5426S = j3;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f5425R = obj;
        this.f5427T |= Integer.MIN_VALUE;
        return J.o(this.f5426S, null, this);
    }
}
