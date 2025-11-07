package N2;

import M2.s;
import M2.t;
import M2.u;
import M2.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import x1.AbstractC0660n0;

/* loaded from: classes.dex */
public final class d implements S2.b, c {

    /* renamed from: b  reason: collision with root package name */
    public static final Map f994b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f995c;

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashMap f996d;

    /* renamed from: a  reason: collision with root package name */
    public final Class f997a;

    static {
        List c4 = C2.j.c(M2.a.class, M2.l.class, M2.p.class, M2.q.class, d2.o.class, M2.r.class, s.class, t.class, u.class, v.class, M2.b.class, M2.c.class, M2.d.class, M2.e.class, M2.f.class, M2.g.class, M2.h.class, M2.i.class, M2.j.class, M2.k.class, M2.m.class, M2.n.class, M2.o.class);
        ArrayList arrayList = new ArrayList(C2.k.g(c4));
        int r4 = 0;
        for (Object obj : c4) {
            int r6 = r4 + 1;
            if (r4 >= 0) {
                arrayList.add(new B2.c((Class) obj, Integer.valueOf(r4)));
                r4 = r6;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        Map map = C2.r.f273J;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(C2.t.a(arrayList.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    B2.c cVar = (B2.c) it.next();
                    map.put(cVar.f200J, cVar.f201K);
                }
            } else {
                B2.c cVar2 = (B2.c) arrayList.get(0);
                g.e(cVar2, "pair");
                map = Collections.singletonMap(cVar2.f200J, cVar2.f201K);
                g.d(map, "singletonMap(...)");
            }
        }
        f994b = map;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        g.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            g.b(str);
            sb.append(U2.i.k(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f994b.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f995c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2.t.a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            g.b(str2);
            linkedHashMap.put(key, U2.i.k(str2, str2));
        }
        f996d = linkedHashMap;
    }

    public d(Class cls) {
        g.e(cls, "jClass");
        this.f997a = cls;
    }

    @Override // N2.c
    public final Class a() {
        return this.f997a;
    }

    public final String b() {
        String str;
        Class cls = this.f997a;
        g.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return U2.i.j(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return U2.i.j(simpleName, enclosingConstructor.getName() + '$');
            }
            int f2 = U2.i.f(simpleName, '$', false, 6);
            if (f2 == -1) {
                return simpleName;
            }
            String substring = simpleName.substring(f2 + 1, simpleName.length());
            g.d(substring, "substring(...)");
            return substring;
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = f996d;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(cls.getName());
        if (str3 == null) {
            return cls.getSimpleName();
        }
        return str3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d) && AbstractC0660n0.a(this).equals(AbstractC0660n0.a((S2.b) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0660n0.a(this).hashCode();
    }

    public final String toString() {
        return this.f997a + " (Kotlin reflection is not available)";
    }
}
