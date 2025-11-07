package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class O extends S implements N {

    /* renamed from: M  reason: collision with root package name */
    public static final EnumC0097z f2149M = EnumC0097z.OPTIONAL;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.O, androidx.camera.core.impl.S] */
    public static O b() {
        return new S(new TreeMap(S.f2151K));
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.camera.core.impl.O, androidx.camera.core.impl.S] */
    public static O c(A a4) {
        TreeMap treeMap = new TreeMap(S.f2151K);
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

    public final void f(C0076c c0076c, EnumC0097z enumC0097z, Object obj) {
        EnumC0097z enumC0097z2;
        EnumC0097z enumC0097z3;
        TreeMap treeMap = this.f2153J;
        Map map = (Map) treeMap.get(c0076c);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(c0076c, arrayMap);
            arrayMap.put(enumC0097z, obj);
            return;
        }
        EnumC0097z enumC0097z4 = (EnumC0097z) Collections.min(map.keySet());
        if (!Objects.equals(map.get(enumC0097z4), obj) && ((enumC0097z4 == (enumC0097z2 = EnumC0097z.ALWAYS_OVERRIDE) && enumC0097z == enumC0097z2) || (enumC0097z4 == (enumC0097z3 = EnumC0097z.REQUIRED) && enumC0097z == enumC0097z3))) {
            throw new IllegalArgumentException("Option values conflicts: " + c0076c.f2176a + ", existing value (" + enumC0097z4 + ")=" + map.get(enumC0097z4) + ", conflicting (" + enumC0097z + ")=" + obj);
        }
        map.put(enumC0097z, obj);
    }

    public final void g(C0076c c0076c, Object obj) {
        f(c0076c, f2149M, obj);
    }
}
