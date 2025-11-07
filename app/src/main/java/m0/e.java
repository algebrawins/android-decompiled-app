package M0;

import K0.l;
import K0.m;
import K0.q;
import N2.g;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import f0.D;
import f0.E;
import f0.F;
import f0.G;
import f0.N;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {
    public static K0.c a(m mVar, FoldingFeature foldingFeature) {
        K0.b bVar;
        K0.b bVar2;
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            bVar = K0.b.f819Q;
        } else {
            bVar = K0.b.f818P;
        }
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state != 2) {
                return null;
            }
            bVar2 = K0.b.f817O;
        } else {
            bVar2 = K0.b.f816N;
        }
        Rect bounds = foldingFeature.getBounds();
        g.d(bounds, "oemFeature.bounds");
        H0.b bVar3 = new H0.b(bounds);
        Rect c4 = mVar.f845a.c();
        if (bVar3.a() == 0 && bVar3.b() == 0) {
            return null;
        }
        if (bVar3.b() != c4.width() && bVar3.a() != c4.height()) {
            return null;
        }
        if (bVar3.b() < c4.width() && bVar3.a() < c4.height()) {
            return null;
        }
        if (bVar3.b() == c4.width() && bVar3.a() == c4.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        g.d(bounds2, "oemFeature.bounds");
        return new K0.c(new H0.b(bounds2), bVar, bVar2);
    }

    public static l b(m mVar, WindowLayoutInfo windowLayoutInfo) {
        K0.c cVar;
        g.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        g.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                g.d(foldingFeature, "feature");
                cVar = a(mVar, foldingFeature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new l(arrayList);
    }

    public static l c(Context context, WindowLayoutInfo windowLayoutInfo) {
        G d4;
        m mVar;
        Object systemService;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        g.e(windowLayoutInfo, "info");
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 30) {
            int r3 = q.f849b;
            if (r02 >= 30) {
                systemService = context.getSystemService(WindowManager.class);
                WindowManager windowManager = (WindowManager) systemService;
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                N a4 = N.a(windowInsets, null);
                currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
                bounds = currentWindowMetrics2.getBounds();
                g.d(bounds, "wm.currentWindowMetrics.bounds");
                mVar = new m(bounds, a4);
            } else {
                Context context2 = context;
                while (context2 instanceof ContextWrapper) {
                    boolean z3 = context2 instanceof Activity;
                    if (!z3 && !(context2 instanceof InputMethodService)) {
                        ContextWrapper contextWrapper = (ContextWrapper) context2;
                        if (contextWrapper.getBaseContext() != null) {
                            context2 = contextWrapper.getBaseContext();
                            g.d(context2, "iterator.baseContext");
                        }
                    }
                    if (z3) {
                        mVar = q.a((Activity) context);
                    } else if (context2 instanceof InputMethodService) {
                        Object systemService2 = context.getSystemService("window");
                        g.c(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
                        Display defaultDisplay = ((WindowManager) systemService2).getDefaultDisplay();
                        g.d(defaultDisplay, "wm.defaultDisplay");
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        Rect rect = new Rect(0, 0, point.x, point.y);
                        int r32 = Build.VERSION.SDK_INT;
                        if (r32 >= 30) {
                            d4 = new F();
                        } else if (r32 >= 29) {
                            d4 = new E();
                        } else {
                            d4 = new D();
                        }
                        N b3 = d4.b();
                        g.d(b3, "Builder().build()");
                        mVar = new m(rect, b3);
                    } else {
                        throw new IllegalArgumentException(context + " is not a UiContext");
                    }
                }
                throw new IllegalArgumentException("Context " + context + " is not a UiContext");
            }
            return b(mVar, windowLayoutInfo);
        } else if (r02 >= 29 && (context instanceof Activity)) {
            int r03 = q.f849b;
            return b(q.a((Activity) context), windowLayoutInfo);
        } else {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
    }
}
