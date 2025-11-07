package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class S implements A {

    /* renamed from: K  reason: collision with root package name */
    public static final Q f2151K;

    /* renamed from: L  reason: collision with root package name */
    public static final S f2152L;

    /* renamed from: J  reason: collision with root package name */
    public final TreeMap f2153J;

    static {
        Q q3 = new Q(0);
        f2151K = q3;
        f2152L = new S(new TreeMap(q3));
    }

    public S(TreeMap treeMap) {
        this.f2153J = treeMap;
    }

    public static S a(A a4) {
        if (S.class.equals(a4.getClass())) {
            return (S) a4;
        }
        TreeMap treeMap = new TreeMap(f2151K);
        for (C0076c c0076c : a4.o()) {
            Set<EnumC0097z> J3 = a4.J(c0076c);
            ArrayMap arrayMap = new ArrayMap();
            for (EnumC0097z enumC0097z : J3) {
                arrayMap.put(enumC0097z, a4.E(c0076c, enumC0097z));
            }
            treeMap.put(c0076c, arrayMap);
        }
        return new S(treeMap);
    }

    @Override // androidx.camera.core.impl.A
    public final Object E(C0076c c0076c, EnumC0097z enumC0097z) {
        Map map = (Map) this.f2153J.get(c0076c);
        if (map != null) {
            if (map.containsKey(enumC0097z)) {
                return map.get(enumC0097z);
            }
            throw new IllegalArgumentException("Option does not exist: " + c0076c + " with priority=" + enumC0097z);
        }
        throw new IllegalArgumentException("Option does not exist: " + c0076c);
    }

    @Override // androidx.camera.core.impl.A
    public final Set J(C0076c c0076c) {
        Map map = (Map) this.f2153J.get(c0076c);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.A
    public final void X(C.f fVar) {
        for (Map.Entry entry : this.f2153J.tailMap(new C0076c("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (((C0076c) entry.getKey()).f2176a.startsWith("camera2.captureRequest.option.")) {
                C0076c c0076c = (C0076c) entry.getKey();
                A a4 = (A) fVar.f230L;
                ((C.g) fVar.f229K).f232b.f(c0076c, a4.g0(c0076c), a4.e(c0076c));
            } else {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.A
    public final Object e(C0076c c0076c) {
        Map map = (Map) this.f2153J.get(c0076c);
        if (map != null) {
            return map.get((EnumC0097z) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + c0076c);
    }

    @Override // androidx.camera.core.impl.A
    public final EnumC0097z g0(C0076c c0076c) {
        Map map = (Map) this.f2153J.get(c0076c);
        if (map != null) {
            return (EnumC0097z) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + c0076c);
    }

    @Override // androidx.camera.core.impl.A
    public final Object i0(C0076c c0076c, Object obj) {
        try {
            return e(c0076c);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // androidx.camera.core.impl.A
    public final Set o() {
        return Collections.unmodifiableSet(this.f2153J.keySet());
    }

    @Override // androidx.camera.core.impl.A
    public final boolean q(C0076c c0076c) {
        return this.f2153J.containsKey(c0076c);
    }
}
