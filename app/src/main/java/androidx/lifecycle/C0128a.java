package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2449a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2450b;

    public C0128a(HashMap hashMap) {
        this.f2450b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0137k enumC0137k = (EnumC0137k) entry.getValue();
            List list = (List) this.f2449a.get(enumC0137k);
            if (list == null) {
                list = new ArrayList();
                this.f2449a.put(enumC0137k, list);
            }
            list.add((C0129b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, EnumC0137k enumC0137k, q qVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0129b c0129b = (C0129b) list.get(size);
                c0129b.getClass();
                try {
                    int r5 = c0129b.f2451a;
                    Method method = c0129b.f2452b;
                    if (r5 != 0) {
                        if (r5 != 1) {
                            if (r5 == 2) {
                                method.invoke(qVar, rVar, enumC0137k);
                            }
                        } else {
                            method.invoke(qVar, rVar);
                        }
                    } else {
                        method.invoke(qVar, null);
                    }
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Failed to call observer method", e5.getCause());
                }
            }
        }
    }
}
