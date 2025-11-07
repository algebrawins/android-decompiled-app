package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f2420a;

    public u0(Unsafe unsafe) {
        this.f2420a = unsafe;
    }

    public final int a(Class cls) {
        return this.f2420a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f2420a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j3, Object obj);

    public abstract double d(long j3, Object obj);

    public abstract float e(long j3, Object obj);

    public final int f(long j3, Object obj) {
        return this.f2420a.getInt(obj, j3);
    }

    public final long g(long j3, Object obj) {
        return this.f2420a.getLong(obj, j3);
    }

    public final Object h(long j3, Object obj) {
        return this.f2420a.getObject(obj, j3);
    }

    public final long i(Field field) {
        return this.f2420a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j3, boolean z3);

    public abstract void k(Object obj, long j3, byte b3);

    public abstract void l(Object obj, long j3, double d4);

    public abstract void m(Object obj, long j3, float f2);

    public final void n(int r22, long j3, Object obj) {
        this.f2420a.putInt(obj, j3, r22);
    }

    public final void o(Object obj, long j3, long j4) {
        this.f2420a.putLong(obj, j3, j4);
    }

    public final void p(long j3, Object obj, Object obj2) {
        this.f2420a.putObject(obj, j3, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f2420a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            v0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
