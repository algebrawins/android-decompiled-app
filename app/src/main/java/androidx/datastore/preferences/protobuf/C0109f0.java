package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109f0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C0109f0 f2342c = new C0109f0();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f2344b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Q f2343a = new Q();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.a0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.a0] */
    public final i0 a(Class cls) {
        r rVar;
        Z x3;
        r rVar2;
        Z z3;
        Class cls2;
        G.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2344b;
        i0 i0Var = (i0) concurrentHashMap.get(cls);
        if (i0Var == null) {
            Q q3 = this.f2343a;
            q3.getClass();
            Class cls3 = j0.f2371a;
            if (!D.class.isAssignableFrom(cls) && (cls2 = j0.f2371a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            h0 b3 = ((P) q3.f2306a).b(cls);
            if ((b3.f2357d & 2) == 2) {
                boolean isAssignableFrom = D.class.isAssignableFrom(cls);
                D d4 = b3.f2354a;
                if (isAssignableFrom) {
                    z3 = new C0099a0(j0.f2373c, AbstractC0120s.f2412a, d4);
                } else {
                    q0 q0Var = j0.f2372b;
                    r rVar3 = AbstractC0120s.f2413b;
                    if (rVar3 != null) {
                        z3 = new C0099a0(q0Var, rVar3, d4);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                x3 = z3;
            } else if (D.class.isAssignableFrom(cls)) {
                C0101b0 c0101b0 = AbstractC0103c0.f2337b;
                L l3 = M.f2302b;
                q0 q0Var2 = j0.f2373c;
                if (O.f2303a[b3.d().ordinal()] != 1) {
                    rVar2 = AbstractC0120s.f2412a;
                } else {
                    rVar2 = null;
                }
                V v3 = W.f2314b;
                int[] r22 = Z.f2316n;
                if (b3 instanceof h0) {
                    x3 = Z.x(b3, c0101b0, l3, q0Var2, rVar2, v3);
                } else {
                    b3.getClass();
                    throw new ClassCastException();
                }
            } else {
                C0101b0 c0101b02 = AbstractC0103c0.f2336a;
                L l4 = M.f2301a;
                q0 q0Var3 = j0.f2372b;
                if (O.f2303a[b3.d().ordinal()] != 1) {
                    rVar = AbstractC0120s.f2413b;
                    if (rVar == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    rVar = null;
                }
                V v4 = W.f2313a;
                int[] r4 = Z.f2316n;
                if (b3 instanceof h0) {
                    x3 = Z.x(b3, c0101b02, l4, q0Var3, rVar, v4);
                } else {
                    b3.getClass();
                    throw new ClassCastException();
                }
            }
            i0 i0Var2 = (i0) concurrentHashMap.putIfAbsent(cls, x3);
            if (i0Var2 != null) {
                return i0Var2;
            }
            return x3;
        }
        return i0Var;
    }
}
