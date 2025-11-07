package x1;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: x1.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0676p0 {
    public static boolean a(Method method, N2.d dVar) {
        Class a4 = dVar.a();
        N2.g.c(a4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a4);
    }

    public static final boolean b(String str, M2.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.a()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }
}
