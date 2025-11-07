package Y;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import x1.AbstractC0747y0;
import x1.AbstractC0755z0;

/* loaded from: classes.dex */
public class f extends AbstractC0747y0 {

    /* renamed from: a  reason: collision with root package name */
    public static Class f1645a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Constructor f1646b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Method f1647c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f1648d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f1649e = false;

    public static boolean f(Object obj, String str, int r5, boolean z3) {
        g();
        try {
            return ((Boolean) f1647c.invoke(obj, str, Integer.valueOf(r5), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void g() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1649e) {
            return;
        }
        f1649e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f1646b = constructor;
        f1645a = cls;
        f1647c = method2;
        f1648d = method;
    }

    @Override // x1.AbstractC0747y0
    public Typeface a(Context context, X.f fVar, Resources resources, int r13) {
        X.g[] gVarArr;
        g();
        try {
            Object newInstance = f1646b.newInstance(null);
            for (X.g gVar : fVar.f1550a) {
                File d4 = AbstractC0755z0.d(context);
                if (d4 == null) {
                    return null;
                }
                try {
                    if (!AbstractC0755z0.b(d4, resources, gVar.f1556f)) {
                        return null;
                    }
                    if (!f(newInstance, d4.getPath(), gVar.f1552b, gVar.f1553c)) {
                        return null;
                    }
                    d4.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d4.delete();
                }
            }
            g();
            try {
                Object newInstance2 = Array.newInstance(f1645a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f1648d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // x1.AbstractC0747y0
    public Typeface b(Context context, c0.g[] gVarArr, int r6) {
        File file;
        String readlink;
        if (gVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(e(gVarArr, r6).f2652a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface c4 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c4;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c42 = c(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return c42;
        } catch (IOException unused2) {
            return null;
        }
    }
}
