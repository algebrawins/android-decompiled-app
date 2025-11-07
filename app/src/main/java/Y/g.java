package Y;

import R.k;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import x1.AbstractC0747y0;
import x1.AbstractC0755z0;

/* loaded from: classes.dex */
public final class g extends AbstractC0747y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f1650a;

    /* renamed from: b  reason: collision with root package name */
    public static final Constructor f1651b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f1652c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f1653d;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi24Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f1651b = constructor;
        f1650a = cls;
        f1652c = method2;
        f1653d = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int r5, int r6, boolean z3) {
        try {
            return ((Boolean) f1652c.invoke(obj, byteBuffer, Integer.valueOf(r5), null, Integer.valueOf(r6), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object newInstance = Array.newInstance(f1650a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1653d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[SYNTHETIC] */
    @Override // x1.AbstractC0747y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface a(android.content.Context r17, X.f r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = Y.g.f1651b     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto Lb
        L9:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return r1
        Le:
            r0 = r18
            X.g[] r3 = r0.f1550a
            int r4 = r3.length
            r0 = 0
            r5 = 0
        L15:
            if (r5 >= r4) goto L72
            r6 = r3[r5]
            int r0 = r6.f1556f
            java.io.File r7 = x1.AbstractC0755z0.d(r17)
            if (r7 != 0) goto L25
            r8 = r19
        L23:
            r0 = r1
            goto L5a
        L25:
            r8 = r19
            boolean r0 = x1.AbstractC0755z0.b(r7, r8, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L31
            r7.delete()
            goto L23
        L31:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            r9.<init>(r7)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L4a
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L4a
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4a
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L4a
            r9.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
            goto L57
        L4a:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L50
            goto L55
        L50:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L55:
            throw r10     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L6d
        L56:
            r0 = r1
        L57:
            r7.delete()
        L5a:
            if (r0 != 0) goto L5d
            return r1
        L5d:
            int r7 = r6.f1552b
            boolean r9 = r6.f1553c
            int r6 = r6.f1555e
            boolean r0 = f(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L6a
            return r1
        L6a:
            int r5 = r5 + 1
            goto L15
        L6d:
            r0 = move-exception
            r7.delete()
            throw r0
        L72:
            android.graphics.Typeface r0 = g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.g.a(android.content.Context, X.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // x1.AbstractC0747y0
    public final Typeface b(Context context, c0.g[] gVarArr, int r12) {
        Object obj;
        try {
            obj = f1651b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        k kVar = new k();
        for (c0.g gVar : gVarArr) {
            Uri uri = gVar.f2652a;
            ByteBuffer byteBuffer = (ByteBuffer) kVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = AbstractC0755z0.e(context, uri);
                kVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!f(obj, byteBuffer, gVar.f2653b, gVar.f2654c, gVar.f2655d)) {
                return null;
            }
        }
        Typeface g = g(obj);
        if (g == null) {
            return null;
        }
        return Typeface.create(g, r12);
    }
}
