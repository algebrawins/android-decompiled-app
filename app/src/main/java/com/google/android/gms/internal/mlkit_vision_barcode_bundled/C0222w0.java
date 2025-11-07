package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222w0 extends LinkedHashMap {

    /* renamed from: K  reason: collision with root package name */
    public static final C0222w0 f2987K;

    /* renamed from: J  reason: collision with root package name */
    public boolean f2988J = true;

    static {
        C0222w0 c0222w0 = new C0222w0();
        f2987K = c0222w0;
        c0222w0.f2988J = false;
    }

    public static C0222w0 a() {
        return f2987K;
    }

    public static int e(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = AbstractC0192j0.f2920a;
            int length = bArr.length;
            for (byte b3 : bArr) {
                length = (length * 31) + b3;
            }
            if (length == 0) {
                return 1;
            }
            return length;
        } else if (!(obj instanceof InterfaceC0174c0)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, com.google.android.gms.internal.mlkit_vision_barcode_bundled.w0] */
    public final C0222w0 b() {
        if (isEmpty()) {
            return new C0222w0();
        }
        ?? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.f2988J = true;
        return linkedHashMap;
    }

    public final void c() {
        this.f2988J = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        super.clear();
    }

    public final boolean d() {
        return this.f2988J;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f2988J) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int r12 = 0;
        for (Map.Entry entry : entrySet()) {
            r12 += e(entry.getValue()) ^ e(entry.getKey());
        }
        return r12;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        f();
        Charset charset = AbstractC0192j0.f2920a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        f();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0192j0.f2920a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        return super.remove(obj);
    }
}
