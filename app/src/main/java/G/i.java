package G;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static volatile e f680a;

    public static void a(Throwable th, Throwable th2) {
        N2.g.e(th, "<this>");
        N2.g.e(th2, "exception");
        if (th != th2) {
            Integer num = I2.a.f789a;
            if (num != null && num.intValue() < 19) {
                Method method = H2.a.f741a;
                if (method != null) {
                    method.invoke(th, th2);
                    return;
                }
                return;
            }
            th.addSuppressed(th2);
        }
    }
}
