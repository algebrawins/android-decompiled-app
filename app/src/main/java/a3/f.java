package a3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Collection f1854a;

    static {
        try {
            Iterator it = Arrays.asList(new W2.b()).iterator();
            N2.g.e(it, "<this>");
            f1854a = T2.c.a(new T2.a(new T2.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
