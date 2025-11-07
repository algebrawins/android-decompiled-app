package x1;

import java.util.Locale;

/* renamed from: x1.h4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0624h4 {
    public static void a(String str, boolean z3) {
        if (z3) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void b(boolean z3) {
        if (z3) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(float f2, String str) {
        if (!Float.isNaN(f2)) {
            if (!Float.isInfinite(f2)) {
                return;
            }
            throw new IllegalArgumentException(str.concat(" must not be infinite"));
        }
        throw new IllegalArgumentException(str.concat(" must not be NaN"));
    }

    public static void d(int r3, int r4, int r5, String str) {
        if (r3 >= r4) {
            if (r3 <= r5) {
                return;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + r4 + ", " + r5 + "] (too high)");
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + r4 + ", " + r5 + "] (too low)");
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static void f(String str, boolean z3) {
        if (z3) {
            return;
        }
        throw new IllegalStateException(str);
    }
}
