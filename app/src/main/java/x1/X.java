package x1;

import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a  reason: collision with root package name */
    public static int f5798a = 3;

    public static void a(String str, String str2) {
        String f2 = f(str);
        if (e(f2, 3)) {
            Log.d(f2, str2);
        }
    }

    public static void b(String str, String str2) {
        String f2 = f(str);
        if (e(f2, 6)) {
            Log.e(f2, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        String f2 = f(str);
        if (e(f2, 6)) {
            Log.e(f2, str2, th);
        }
    }

    public static boolean d(String str) {
        return e(f(str), 3);
    }

    public static boolean e(String str, int r22) {
        if (f5798a > r22 && !Log.isLoggable(str, r22)) {
            return false;
        }
        return true;
    }

    public static String f(String str) {
        if (Build.VERSION.SDK_INT <= 25 && 23 < str.length()) {
            return str.substring(0, 23);
        }
        return str;
    }

    public static void g(String str, String str2) {
        String f2 = f(str);
        if (e(f2, 5)) {
            Log.w(f2, str2);
        }
    }

    public static void h(String str, String str2, Throwable th) {
        String f2 = f(str);
        if (e(f2, 5)) {
            Log.w(f2, str2, th);
        }
    }
}
