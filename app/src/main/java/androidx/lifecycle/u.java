package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f2473a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f2474b = new HashMap();

    public static void a(Constructor constructor, q qVar) {
        try {
            N2.g.d(constructor.newInstance(qVar), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor constructor;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        int r12 = 1;
        HashMap hashMap = f2473a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r4 != null) {
                    str = r4.getName();
                } else {
                    str = "";
                }
                N2.g.d(str, "fullPackage");
                if (str.length() != 0) {
                    N2.g.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(str.length() + 1);
                    N2.g.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                N2.g.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = U2.i.i(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() != 0) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(e4);
            }
            HashMap hashMap2 = f2474b;
            if (constructor != null) {
                hashMap2.put(cls, C2.j.b(constructor));
            } else {
                C0130c c0130c = C0130c.f2453c;
                HashMap hashMap3 = c0130c.f2455b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int r10 = 0;
                        while (true) {
                            if (r10 < length) {
                                if (((B) declaredMethods[r10].getAnnotation(B.class)) != null) {
                                    c0130c.a(cls, declaredMethods);
                                    z3 = true;
                                    break;
                                }
                                r10++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z3 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e5) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
                    }
                }
                if (!z3) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && q.class.isAssignableFrom(superclass)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        N2.g.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            N2.g.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    N2.g.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int r9 = 0;
                    while (true) {
                        if (r9 < length2) {
                            Class<?> cls2 = interfaces[r9];
                            if (cls2 != null && q.class.isAssignableFrom(cls2)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                N2.g.d(cls2, "intrface");
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                N2.g.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            r9++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            r12 = 2;
        }
        hashMap.put(cls, Integer.valueOf(r12));
        return r12;
    }
}
