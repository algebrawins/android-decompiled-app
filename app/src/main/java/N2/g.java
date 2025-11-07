package N2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f1000a = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        f(nullPointerException, g.class.getName());
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        f(nullPointerException, g.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        f(nullPointerException, g.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = g.class.getName();
            int r3 = 0;
            while (!stackTrace[r3].getClassName().equals(name)) {
                r3++;
            }
            while (stackTrace[r3].getClassName().equals(name)) {
                r3++;
            }
            StackTraceElement stackTraceElement = stackTrace[r3];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
            f(nullPointerException, g.class.getName());
            throw nullPointerException;
        }
    }

    public static void f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int r22 = -1;
        for (int r3 = 0; r3 < length; r3++) {
            if (str.equals(stackTrace[r3].getClassName())) {
                r22 = r3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, r22 + 1, length));
    }

    public static void g(String str) {
        RuntimeException runtimeException = new RuntimeException("lateinit property " + str + " has not been initialized");
        f(runtimeException, g.class.getName());
        throw runtimeException;
    }

    public static final Object[] h(Collection collection) {
        int size = collection.size();
        Object[] objArr = f1000a;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int r02 = 0;
                while (true) {
                    int r22 = r02 + 1;
                    objArr2[r02] = it.next();
                    if (r22 >= objArr2.length) {
                        if (it.hasNext()) {
                            int r03 = ((r22 * 3) + 1) >>> 1;
                            if (r03 <= r22) {
                                r03 = 2147483645;
                                if (r22 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, r03);
                        } else {
                            return objArr2;
                        }
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr2, r22);
                        d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    r02 = r22;
                }
            } else {
                return objArr;
            }
        } else {
            return objArr;
        }
    }

    public static final Object[] i(Collection collection, Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int size = collection.size();
        int r22 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int r3 = r22 + 1;
            objArr2[r22] = it.next();
            if (r3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int r23 = ((r3 * 3) + 1) >>> 1;
                if (r23 <= r3) {
                    r23 = 2147483645;
                    if (r3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, r23);
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[r3] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, r3);
                d(copyOf, "copyOf(...)");
                return copyOf;
            }
            r22 = r3;
        }
    }
}
