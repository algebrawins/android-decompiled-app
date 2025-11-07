package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0168a0 extends D {
    private static final Map zza = new ConcurrentHashMap();
    protected V0 zzc;
    private int zzd;

    public AbstractC0168a0() {
        this.zzb = 0;
        this.zzd = -1;
        this.zzc = V0.f2856f;
    }

    public static AbstractC0168a0 e(Class cls) {
        Map map = zza;
        AbstractC0168a0 abstractC0168a0 = (AbstractC0168a0) map.get(cls);
        if (abstractC0168a0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0168a0 = (AbstractC0168a0) map.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (abstractC0168a0 == null) {
            abstractC0168a0 = (AbstractC0168a0) ((AbstractC0168a0) AbstractC0181e1.h(cls)).m(6, null);
            if (abstractC0168a0 != null) {
                map.put(cls, abstractC0168a0);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC0168a0;
    }

    public static Object f(Method method, D d4, Object... objArr) {
        try {
            return method.invoke(d4, objArr);
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

    public static void h(Class cls, AbstractC0168a0 abstractC0168a0) {
        abstractC0168a0.g();
        zza.put(cls, abstractC0168a0);
    }

    public static final boolean j(AbstractC0168a0 abstractC0168a0, boolean z3) {
        AbstractC0168a0 abstractC0168a02 = null;
        byte byteValue = ((Byte) abstractC0168a0.m(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f2 = H0.f2796c.b(abstractC0168a0.getClass()).f(abstractC0168a0);
        if (z3) {
            if (true == f2) {
                abstractC0168a02 = abstractC0168a0;
            }
            abstractC0168a0.m(2, abstractC0168a02);
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.A0
    public final boolean a() {
        return j(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.D
    public final int b(N0 n02) {
        if (k()) {
            int b3 = n02.b(this);
            if (b3 >= 0) {
                return b3;
            }
            throw new IllegalStateException(D.C.w("serialized size must be non-negative, was ", b3));
        }
        int r02 = this.zzd & Integer.MAX_VALUE;
        if (r02 != Integer.MAX_VALUE) {
            return r02;
        }
        int b4 = n02.b(this);
        if (b4 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | b4;
            return b4;
        }
        throw new IllegalStateException(D.C.w("serialized size must be non-negative, was ", b4));
    }

    public final int c() {
        int r02;
        if (k()) {
            r02 = l(null);
            if (r02 < 0) {
                throw new IllegalStateException(D.C.w("serialized size must be non-negative, was ", r02));
            }
        } else {
            r02 = this.zzd & Integer.MAX_VALUE;
            if (r02 == Integer.MAX_VALUE) {
                r02 = l(null);
                if (r02 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | r02;
                } else {
                    throw new IllegalStateException(D.C.w("serialized size must be non-negative, was ", r02));
                }
            }
        }
        return r02;
    }

    public final W d() {
        return (W) m(5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return H0.f2796c.b(getClass()).i(this, (AbstractC0168a0) obj);
    }

    public final void g() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (!k()) {
            int r02 = this.zzb;
            if (r02 == 0) {
                int e4 = H0.f2796c.b(getClass()).e(this);
                this.zzb = e4;
                return e4;
            }
            return r02;
        }
        return H0.f2796c.b(getClass()).e(this);
    }

    public final void i() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean k() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int l(N0 n02) {
        if (n02 == null) {
            return H0.f2796c.b(getClass()).b(this);
        }
        return n02.b(this);
    }

    public abstract Object m(int r12, AbstractC0168a0 abstractC0168a0);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = B0.f2767a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        B0.c(this, sb, 0);
        return sb.toString();
    }
}
