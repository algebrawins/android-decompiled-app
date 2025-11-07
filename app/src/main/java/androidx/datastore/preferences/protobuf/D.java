package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class D extends AbstractC0098a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, D> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected p0 unknownFields;

    public D() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = p0.f2404f;
    }

    public static D f(Class cls) {
        D d4 = defaultInstanceMap.get(cls);
        if (d4 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                d4 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (d4 == null) {
            d4 = (D) ((D) v0.d(cls)).e(C.GET_DEFAULT_INSTANCE);
            if (d4 != null) {
                defaultInstanceMap.put(cls, d4);
            } else {
                throw new IllegalStateException();
            }
        }
        return d4;
    }

    public static Object g(Method method, AbstractC0098a abstractC0098a, Object... objArr) {
        try {
            return method.invoke(abstractC0098a, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final boolean h(D d4, boolean z3) {
        byte byteValue = ((Byte) d4.e(C.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C0109f0 c0109f0 = C0109f0.f2342c;
        c0109f0.getClass();
        boolean a4 = c0109f0.a(d4.getClass()).a(d4);
        if (z3) {
            d4.e(C.SET_MEMOIZED_IS_INITIALIZED);
        }
        return a4;
    }

    public static void l(Class cls, D d4) {
        d4.j();
        defaultInstanceMap.put(cls, d4);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0098a
    public final int a(i0 i0Var) {
        int f2;
        int f4;
        if (i()) {
            if (i0Var == null) {
                C0109f0 c0109f0 = C0109f0.f2342c;
                c0109f0.getClass();
                f4 = c0109f0.a(getClass()).f(this);
            } else {
                f4 = i0Var.f(this);
            }
            if (f4 >= 0) {
                return f4;
            }
            throw new IllegalStateException(D.C.w("serialized size must be non-negative, was ", f4));
        }
        int r02 = this.memoizedSerializedSize;
        if ((r02 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return r02 & Integer.MAX_VALUE;
        }
        if (i0Var == null) {
            C0109f0 c0109f02 = C0109f0.f2342c;
            c0109f02.getClass();
            f2 = c0109f02.a(getClass()).f(this);
        } else {
            f2 = i0Var.f(this);
        }
        m(f2);
        return f2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0098a
    public final void b(C0116n c0116n) {
        C0109f0 c0109f0 = C0109f0.f2342c;
        c0109f0.getClass();
        i0 a4 = c0109f0.a(getClass());
        Q q3 = c0116n.f2396a;
        if (q3 == null) {
            q3 = new Q(c0116n);
        }
        a4.d(this, q3);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(C c4);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0109f0 c0109f0 = C0109f0.f2342c;
        c0109f0.getClass();
        return c0109f0.a(getClass()).i(this, (D) obj);
    }

    public final int hashCode() {
        if (i()) {
            C0109f0 c0109f0 = C0109f0.f2342c;
            c0109f0.getClass();
            return c0109f0.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            C0109f0 c0109f02 = C0109f0.f2342c;
            c0109f02.getClass();
            this.memoizedHashCode = c0109f02.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final D k() {
        return (D) e(C.NEW_MUTABLE_INSTANCE);
    }

    public final void m(int r3) {
        if (r3 >= 0) {
            this.memoizedSerializedSize = (r3 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(D.C.w("serialized size must be non-negative, was ", r3));
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = Y.f2315a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        Y.c(this, sb, 0);
        return sb.toString();
    }
}
