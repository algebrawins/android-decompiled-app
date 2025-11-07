package H0;

import N2.p;
import N2.r;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import x1.AbstractC0660n0;

/* loaded from: classes.dex */
public final class d implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final N2.d f719a;

    /* renamed from: b  reason: collision with root package name */
    public final M0.b f720b;

    public d(N2.d dVar, M0.b bVar) {
        this.f719a = dVar;
        this.f720b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean z3;
        boolean z4;
        Class cls;
        boolean isInstance;
        String str;
        N2.g.e(obj, "obj");
        N2.g.e(method, "method");
        boolean a4 = N2.g.a(method.getName(), "accept");
        M0.b bVar = this.f720b;
        String str2 = 0;
        boolean z5 = true;
        if (a4 && objArr != 0 && objArr.length == 1) {
            Object obj2 = objArr[0];
            Class cls2 = this.f719a.f997a;
            N2.g.e(cls2, "jClass");
            Map map = N2.d.f994b;
            N2.g.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls2);
            if (num != null) {
                isInstance = r.b(num.intValue(), obj2);
            } else {
                if (cls2.isPrimitive()) {
                    cls = AbstractC0660n0.a(p.a(cls2));
                } else {
                    cls = cls2;
                }
                isInstance = cls.isInstance(obj2);
            }
            if (!isInstance) {
                StringBuilder sb = new StringBuilder("Value cannot be cast to ");
                if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
                    boolean isArray = cls2.isArray();
                    HashMap hashMap = N2.d.f995c;
                    if (isArray) {
                        Class<?> componentType = cls2.getComponentType();
                        if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                            str2 = str.concat("Array");
                        }
                        if (str2 == null) {
                            str2 = "kotlin.Array";
                        }
                    } else {
                        str2 = (String) hashMap.get(cls2.getName());
                        if (str2 == null) {
                            str2 = cls2.getCanonicalName();
                        }
                    }
                }
                sb.append(str2);
                throw new ClassCastException(sb.toString());
            }
            N2.g.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            bVar.h(obj2);
            return B2.i.f210a;
        }
        if (N2.g.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != 0 && objArr.length == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (objArr != null) {
                str2 = objArr[0];
            }
            if (obj != str2) {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
        if (N2.g.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return Integer.valueOf(bVar.hashCode());
        }
        if ((N2.g.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) ? false : false) {
            return bVar.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
