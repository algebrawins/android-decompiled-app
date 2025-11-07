package a3;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f1850a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f1850a = method;
    }
}
