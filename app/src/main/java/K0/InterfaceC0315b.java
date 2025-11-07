package k0;

import android.os.Build;

/* renamed from: k0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0315b {

    /* renamed from: H  reason: collision with root package name */
    public static final boolean f3964H;

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 27) {
            z3 = true;
        } else {
            z3 = false;
        }
        f3964H = z3;
    }
}
