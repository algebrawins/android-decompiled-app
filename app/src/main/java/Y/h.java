package Y;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import x1.AbstractC0755z0;

/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: f  reason: collision with root package name */
    public final Class f1654f;
    public final Constructor g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f1655h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f1656i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f1657j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f1658k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f1659l;

    public h() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = n(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = o(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e4.getClass().getName()), e4);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1654f = cls;
        this.g = constructor;
        this.f1655h = method2;
        this.f1656i = method3;
        this.f1657j = method4;
        this.f1658k = method5;
        this.f1659l = method;
    }

    public static Method n(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // Y.f, x1.AbstractC0747y0
    public final Typeface a(Context context, X.f fVar, Resources resources, int r14) {
        X.g[] gVarArr;
        if (!l()) {
            return super.a(context, fVar, resources, r14);
        }
        Object m3 = m();
        if (m3 == null) {
            return null;
        }
        for (X.g gVar : fVar.f1550a) {
            if (!i(context, m3, gVar.f1551a, gVar.f1555e, gVar.f1552b, gVar.f1553c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f1554d))) {
                h(m3);
                return null;
            }
        }
        if (!k(m3)) {
            return null;
        }
        return j(m3);
    }

    @Override // Y.f, x1.AbstractC0747y0
    public final Typeface b(Context context, c0.g[] gVarArr, int r15) {
        Typeface j3;
        boolean z3;
        if (gVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            c0.g e4 = e(gVarArr, r15);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(e4.f2652a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(e4.f2654c).setItalic(e4.f2655d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (c0.g gVar : gVarArr) {
            if (gVar.f2656e == 0) {
                Uri uri = gVar.f2652a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, AbstractC0755z0.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object m3 = m();
        if (m3 == null) {
            return null;
        }
        boolean z4 = false;
        for (c0.g gVar2 : gVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(gVar2.f2652a);
            if (byteBuffer != null) {
                try {
                    z3 = ((Boolean) this.f1656i.invoke(m3, byteBuffer, Integer.valueOf(gVar2.f2653b), null, Integer.valueOf(gVar2.f2654c), Integer.valueOf(gVar2.f2655d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z3 = false;
                }
                if (!z3) {
                    h(m3);
                    return null;
                }
                z4 = true;
            }
        }
        if (!z4) {
            h(m3);
            return null;
        } else if (!k(m3) || (j3 = j(m3)) == null) {
            return null;
        } else {
            return Typeface.create(j3, r15);
        }
    }

    @Override // x1.AbstractC0747y0
    public final Typeface d(Context context, Resources resources, int r11, String str, int r13) {
        if (!l()) {
            return super.d(context, resources, r11, str, r13);
        }
        Object m3 = m();
        if (m3 == null) {
            return null;
        }
        if (!i(context, m3, str, 0, -1, -1, null)) {
            h(m3);
            return null;
        } else if (!k(m3)) {
            return null;
        } else {
            return j(m3);
        }
    }

    public final void h(Object obj) {
        try {
            this.f1658k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int r8, int r9, int r10, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1655h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(r8), Integer.valueOf(r9), Integer.valueOf(r10), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1654f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1659l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f1657j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        Method method = this.f1655h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public final Object m() {
        try {
            return this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method o(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
