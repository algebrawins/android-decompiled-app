package Y;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i extends h {
    @Override // Y.h
    public final Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1654f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1659l.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // Y.h
    public final Method o(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
