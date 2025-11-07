package K0;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f0.D;
import f0.E;
import f0.F;
import f0.G;
import f0.N;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q implements o {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f849b = 0;

    static {
        new ArrayList(new C2.f(new Integer[]{1, 2, 4, 8, 16, 32, 64, Integer.valueOf((int) RecognitionOptions.ITF)}, true));
    }

    public static m a(Activity activity) {
        Rect rect;
        int r3;
        boolean isInMultiWindowMode;
        int r32;
        G d4;
        N b3;
        Object systemService;
        WindowMetrics currentWindowMetrics;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 30) {
            systemService = activity.getSystemService(WindowManager.class);
            currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
            rect = currentWindowMetrics.getBounds();
            N2.g.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (r02 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                N2.g.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException e4) {
                Log.w("q", e4);
                rect = b(activity);
            } catch (NoSuchFieldException e5) {
                Log.w("q", e5);
                rect = b(activity);
            } catch (NoSuchMethodException e6) {
                Log.w("q", e6);
                rect = b(activity);
            } catch (InvocationTargetException e7) {
                Log.w("q", e7);
                rect = b(activity);
            }
        } else if (r02 >= 28) {
            rect = b(activity);
        } else if (r02 >= 24) {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            isInMultiWindowMode = activity.isInMultiWindowMode();
            if (!isInMultiWindowMode) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                if (identifier > 0) {
                    r32 = resources.getDimensionPixelSize(identifier);
                } else {
                    r32 = 0;
                }
                int r5 = rect.bottom + r32;
                if (r5 == point.y) {
                    rect.bottom = r5;
                } else {
                    int r52 = rect.right + r32;
                    if (r52 == point.x) {
                        rect.right = r52;
                    }
                }
            }
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            N2.g.d(defaultDisplay2, "defaultDisplay");
            Point point2 = new Point();
            defaultDisplay2.getRealSize(point2);
            Rect rect2 = new Rect();
            int r53 = point2.x;
            if (r53 != 0 && (r3 = point2.y) != 0) {
                rect2.right = r53;
                rect2.bottom = r3;
            } else {
                defaultDisplay2.getRectSize(rect2);
            }
            rect = rect2;
        }
        int r33 = Build.VERSION.SDK_INT;
        if (r33 >= 30) {
            if (r33 >= 30) {
                b3 = O0.d.f1015a.a(activity);
            } else {
                throw new Exception("Incompatible SDK version");
            }
        } else {
            if (r33 >= 30) {
                d4 = new F();
            } else if (r33 >= 29) {
                d4 = new E();
            } else {
                d4 = new D();
            }
            b3 = d4.b();
            N2.g.d(b3, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new m(new H0.b(rect), b3);
    }

    public static Rect b(Activity activity) {
        boolean isInMultiWindowMode;
        boolean isInMultiWindowMode2;
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        int r7;
        boolean isInMultiWindowMode3;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            isInMultiWindowMode3 = activity.isInMultiWindowMode();
            if (isInMultiWindowMode3) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                N2.g.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                N2.g.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e4) {
            Log.w("q", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e5) {
            Log.w("q", e5);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e6) {
            Log.w("q", e6);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e7) {
            Log.w("q", e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        N2.g.d(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        isInMultiWindowMode = activity.isInMultiWindowMode();
        if (!isInMultiWindowMode) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                r7 = resources.getDimensionPixelSize(identifier);
            } else {
                r7 = 0;
            }
            int r8 = rect.bottom + r7;
            if (r8 == point.y) {
                rect.bottom = r8;
            } else {
                int r82 = rect.right + r7;
                if (r82 == point.x) {
                    rect.right = r82;
                } else if (rect.left == r7) {
                    rect.left = 0;
                }
            }
        }
        if (rect.width() < point.x || rect.height() < point.y) {
            isInMultiWindowMode2 = activity.isInMultiWindowMode();
            if (!isInMultiWindowMode2) {
                try {
                    Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                    constructor.setAccessible(true);
                    Object newInstance = constructor.newInstance(null);
                    Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(defaultDisplay, newInstance);
                    Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(newInstance);
                    if (p.v(obj2)) {
                        displayCutout = p.l(obj2);
                    }
                } catch (ClassNotFoundException e8) {
                    Log.w("q", e8);
                } catch (IllegalAccessException e9) {
                    Log.w("q", e9);
                } catch (InstantiationException e10) {
                    Log.w("q", e10);
                } catch (NoSuchFieldException e11) {
                    Log.w("q", e11);
                } catch (NoSuchMethodException e12) {
                    Log.w("q", e12);
                } catch (InvocationTargetException e13) {
                    Log.w("q", e13);
                }
                if (displayCutout != null) {
                    int r11 = rect.left;
                    safeInsetLeft = displayCutout.getSafeInsetLeft();
                    if (r11 == safeInsetLeft) {
                        rect.left = 0;
                    }
                    int r112 = point.x - rect.right;
                    safeInsetRight = displayCutout.getSafeInsetRight();
                    if (r112 == safeInsetRight) {
                        int r113 = rect.right;
                        safeInsetRight2 = displayCutout.getSafeInsetRight();
                        rect.right = safeInsetRight2 + r113;
                    }
                    int r114 = rect.top;
                    safeInsetTop = displayCutout.getSafeInsetTop();
                    if (r114 == safeInsetTop) {
                        rect.top = 0;
                    }
                    int r115 = point.y - rect.bottom;
                    safeInsetBottom = displayCutout.getSafeInsetBottom();
                    if (r115 == safeInsetBottom) {
                        int r116 = rect.bottom;
                        safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                        rect.bottom = safeInsetBottom2 + r116;
                    }
                }
            }
        }
        return rect;
    }
}
