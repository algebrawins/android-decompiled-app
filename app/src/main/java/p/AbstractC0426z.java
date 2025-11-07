package p;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: p.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0426z {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f4741a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4742b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f4743c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public static final Class f4744d;

    static {
        try {
            f4744d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!a(drawable2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        } else if (drawable instanceof Z.h) {
            return a(((Z.i) ((Z.h) drawable)).f1751O);
        } else {
            if (drawable instanceof C0399A) {
                return a(((C0399A) drawable).f4494J);
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    public static void b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f4742b);
            } else {
                drawable.setState(f4741a);
            }
            drawable.setState(state);
        }
    }

    public static Rect c(Drawable drawable) {
        Field[] fields;
        char c4;
        Insets opticalInsets;
        int r12;
        int r13;
        int r14;
        int r11;
        if (Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            r12 = opticalInsets.left;
            rect.left = r12;
            r13 = opticalInsets.right;
            rect.right = r13;
            r14 = opticalInsets.top;
            rect.top = r14;
            r11 = opticalInsets.bottom;
            rect.bottom = r11;
            return rect;
        }
        Class cls = f4744d;
        if (cls != null) {
            try {
                if (drawable instanceof Z.h) {
                    drawable = ((Z.i) ((Z.h) drawable)).f1751O;
                }
                Object invoke = drawable.getClass().getMethod("getOpticalInsets", null).invoke(drawable, null);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : cls.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c4 = 3;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c4 = 1;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c4 = 0;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            default:
                                c4 = 65535;
                                break;
                        }
                        if (c4 != 0) {
                            if (c4 != 1) {
                                if (c4 != 2) {
                                    if (c4 == 3) {
                                        rect2.bottom = field.getInt(invoke);
                                    }
                                } else {
                                    rect2.right = field.getInt(invoke);
                                }
                            } else {
                                rect2.top = field.getInt(invoke);
                            }
                        } else {
                            rect2.left = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f4743c;
    }

    public static PorterDuff.Mode d(int r12, PorterDuff.Mode mode) {
        if (r12 != 3) {
            if (r12 != 5) {
                if (r12 != 9) {
                    switch (r12) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
