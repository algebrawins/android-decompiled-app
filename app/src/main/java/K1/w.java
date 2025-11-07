package k1;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f4082a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f4083b;

    /* renamed from: c  reason: collision with root package name */
    public static int f4084c;

    public static void a(String str, boolean z3) {
        if (z3) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void b(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name + " thread, but got " + str + ".");
        }
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void d(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void e(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static void f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void g(String str, boolean z3) {
        if (z3) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
