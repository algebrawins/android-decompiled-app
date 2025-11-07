package O0;

import N2.g;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import f0.N;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f1015a = new Object();

    public final N a(Context context) {
        Object systemService;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        g.e(context, "context");
        systemService = context.getSystemService(WindowManager.class);
        currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        g.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return N.a(windowInsets, null);
    }
}
