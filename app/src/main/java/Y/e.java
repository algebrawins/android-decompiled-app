package Y;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import x1.AbstractC0747y0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final AbstractC0747y0 f1643a;

    /* renamed from: b  reason: collision with root package name */
    public static final R.f f1644b;

    static {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 29) {
            f1643a = new AbstractC0747y0();
        } else if (r02 >= 28) {
            f1643a = new h();
        } else if (r02 >= 26) {
            f1643a = new h();
        } else {
            if (r02 >= 24) {
                Method method = g.f1652c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f1643a = new AbstractC0747y0();
                }
            }
            f1643a = new AbstractC0747y0();
        }
        f1644b = new R.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r6.equals(r10) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r13, X.e r14, android.content.res.Resources r15, int r16, java.lang.String r17, int r18, int r19, p.C0419s r20) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.e.a(android.content.Context, X.e, android.content.res.Resources, int, java.lang.String, int, int, p.s):android.graphics.Typeface");
    }

    public static String b(Resources resources, int r22, String str, int r4, int r5) {
        return resources.getResourcePackageName(r22) + '-' + str + '-' + r4 + '-' + r22 + '-' + r5;
    }
}
