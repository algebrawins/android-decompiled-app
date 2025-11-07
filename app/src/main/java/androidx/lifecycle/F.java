package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public abstract class F {
    public static void a(Activity activity, EnumC0137k enumC0137k) {
        N2.g.e(activity, "activity");
        N2.g.e(enumC0137k, "event");
        if (activity instanceof r) {
            t b3 = ((r) activity).b();
            if (b3 instanceof t) {
                b3.e(enumC0137k);
            }
        }
    }
}
