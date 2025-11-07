package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class t0 extends u0 {
    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean c(long j3, Object obj) {
        return this.f2420a.getBoolean(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final double d(long j3, Object obj) {
        return this.f2420a.getDouble(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final float e(long j3, Object obj) {
        return this.f2420a.getFloat(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void j(Object obj, long j3, boolean z3) {
        this.f2420a.putBoolean(obj, j3, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void k(Object obj, long j3, byte b3) {
        this.f2420a.putByte(obj, j3, b3);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void l(Object obj, long j3, double d4) {
        this.f2420a.putDouble(obj, j3, d4);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void m(Object obj, long j3, float f2) {
        this.f2420a.putFloat(obj, j3, f2);
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f2420a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            v0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean r() {
        Unsafe unsafe = this.f2420a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (v0.g() != null) {
                    try {
                        Class<?> cls3 = this.f2420a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        v0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                v0.a(th2);
            }
        }
        return false;
    }
}
