package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130c {

    /* renamed from: c  reason: collision with root package name */
    public static final C0130c f2453c = new C0130c();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2454a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2455b = new HashMap();

    public static void b(HashMap hashMap, C0129b c0129b, EnumC0137k enumC0137k, Class cls) {
        EnumC0137k enumC0137k2 = (EnumC0137k) hashMap.get(c0129b);
        if (enumC0137k2 != null && enumC0137k != enumC0137k2) {
            Method method = c0129b.f2452b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0137k2 + ", new value " + enumC0137k);
        } else if (enumC0137k2 == null) {
            hashMap.put(c0129b, enumC0137k);
        }
    }

    public final C0128a a(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int r8;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f2454a;
        if (superclass != null) {
            C0128a c0128a = (C0128a) hashMap2.get(superclass);
            if (c0128a == null) {
                c0128a = a(superclass, null);
            }
            hashMap.putAll(c0128a.f2450b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0128a c0128a2 = (C0128a) hashMap2.get(cls2);
            if (c0128a2 == null) {
                c0128a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0128a2.f2450b.entrySet()) {
                b(hashMap, (C0129b) entry.getKey(), (EnumC0137k) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e4) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            B b3 = (B) method.getAnnotation(B.class);
            if (b3 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (r.class.isAssignableFrom(parameterTypes[0])) {
                        r8 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    r8 = 0;
                }
                EnumC0137k value = b3.value();
                if (parameterTypes.length > 1) {
                    if (EnumC0137k.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == EnumC0137k.ON_ANY) {
                            r8 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0129b(r8, method), value, cls);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0128a c0128a3 = new C0128a(hashMap);
        hashMap2.put(cls, c0128a3);
        this.f2455b.put(cls, Boolean.valueOf(z3));
        return c0128a3;
    }
}
