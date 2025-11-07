package u1;

import android.os.Build;

/* renamed from: u1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0476d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f5030a;

    static {
        int r02;
        if (Build.VERSION.SDK_INT >= 31) {
            r02 = 33554432;
        } else {
            r02 = 0;
        }
        f5030a = r02;
    }
}
