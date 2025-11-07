package y2;

import android.os.Trace;
import x1.Y;

/* renamed from: y2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0938a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() >= 124) {
            return str.substring(0, 124) + "...";
        }
        return str;
    }

    public static void b(String str) {
        Trace.beginSection(Y.b(a(str)));
    }
}
