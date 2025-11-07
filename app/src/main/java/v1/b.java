package v1;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f5046a;

    static {
        int r02;
        if (Build.VERSION.SDK_INT >= 23) {
            r02 = 67108864;
        } else {
            r02 = 0;
        }
        f5046a = r02;
    }
}
