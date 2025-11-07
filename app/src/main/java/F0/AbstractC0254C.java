package f0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: f0.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0254C {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f3149a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f3150b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f3151c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3152d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f3149a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f3150b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f3151c = declaredField3;
            declaredField3.setAccessible(true);
            f3152d = true;
        } catch (ReflectiveOperationException e4) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
        }
    }
}
