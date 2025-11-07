package H2;

import N2.g;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f741a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        g.b(methods);
        int length = methods.length;
        int r4 = 0;
        while (true) {
            method = null;
            if (r4 >= length) {
                break;
            }
            Method method2 = methods[r4];
            if (g.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                g.d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 1) {
                    method = parameterTypes[0];
                }
                if (g.a(method, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            r4++;
        }
        f741a = method;
        int length2 = methods.length;
        for (int r3 = 0; r3 < length2 && !g.a(methods[r3].getName(), "getSuppressed"); r3++) {
        }
    }
}
