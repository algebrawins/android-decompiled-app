package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.security.AccessController;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0181e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f2897a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f2898b;

    /* renamed from: c  reason: collision with root package name */
    public static final AbstractC0178d1 f2899c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f2900d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f2901e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f2902f;
    public static final boolean g;

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(17:(1:64)(1:(1:66))|4|(7:42|43|44|45|46|(4:50|51|(1:53)|56)|(14:49|7|(14:35|36|37|38|10|11|12|(3:25|26|(6:30|(1:18)|19|(1:21)|22|23))|14|(2:16|18)|19|(0)|22|23)|9|10|11|12|(0)|14|(0)|19|(0)|22|23))|6|7|(0)|9|10|11|12|(0)|14|(0)|19|(0)|22|23)|3|4|(0)|6|7|(0)|9|10|11|12|(0)|14|(0)|19|(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r0.getType() == java.lang.Long.TYPE) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016b, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0181e1.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f2901e) {
            f2899c.f2896a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j3, byte b3) {
        AbstractC0178d1 abstractC0178d1 = f2899c;
        long j4 = (-4) & j3;
        int r12 = abstractC0178d1.f2896a.getInt(obj, j4);
        int r6 = ((~((int) j3)) & 3) << 3;
        abstractC0178d1.f2896a.putInt(obj, j4, ((255 & b3) << r6) | (r12 & (~(255 << r6))));
    }

    public static void c(Object obj, long j3, byte b3) {
        AbstractC0178d1 abstractC0178d1 = f2899c;
        long j4 = (-4) & j3;
        int r6 = (((int) j3) & 3) << 3;
        abstractC0178d1.f2896a.putInt(obj, j4, ((255 & b3) << r6) | (abstractC0178d1.f2896a.getInt(obj, j4) & (~(255 << r6))));
    }

    public static double d(long j3, Object obj) {
        return f2899c.a(j3, obj);
    }

    public static float e(long j3, Object obj) {
        return f2899c.b(j3, obj);
    }

    public static int f(long j3, Object obj) {
        return f2899c.f2896a.getInt(obj, j3);
    }

    public static long g(long j3, Object obj) {
        return f2899c.f2896a.getLong(obj, j3);
    }

    public static Object h(Class cls) {
        try {
            return f2897a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static Object i(long j3, Object obj) {
        return f2899c.f2896a.getObject(obj, j3);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0169a1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j3, boolean z3) {
        f2899c.c(obj, j3, z3);
    }

    public static void l(Object obj, long j3, double d4) {
        f2899c.e(obj, j3, d4);
    }

    public static void m(Object obj, long j3, float f2) {
        f2899c.f(obj, j3, f2);
    }

    public static void n(int r12, long j3, Object obj) {
        f2899c.f2896a.putInt(obj, j3, r12);
    }

    public static void o(Object obj, long j3, long j4) {
        f2899c.f2896a.putLong(obj, j3, j4);
    }

    public static void p(long j3, Object obj, Object obj2) {
        f2899c.f2896a.putObject(obj, j3, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean q(long j3, Object obj) {
        if (((byte) ((f2899c.f2896a.getInt(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean r(long j3, Object obj) {
        if (((byte) ((f2899c.f2896a.getInt(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean s(Class cls) {
        int r6 = F.f2787a;
        try {
            Class cls2 = f2898b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean t(long j3, Object obj) {
        return f2899c.g(j3, obj);
    }

    public static int u(Class cls) {
        if (f2901e) {
            return f2899c.f2896a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
