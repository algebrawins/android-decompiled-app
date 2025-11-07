package a3;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final W2.c f1877a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str;
        int r12 = w.f1886a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            N2.g.e(it, "<this>");
            Iterator it2 = T2.c.a(new T2.a(new T2.e(it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int a4 = ((W2.a) obj).a();
                    do {
                        Object next = it2.next();
                        int a5 = ((W2.a) next).a();
                        if (a4 < a5) {
                            obj = next;
                            a4 = a5;
                        }
                    } while (it2.hasNext());
                }
            }
            W2.a aVar = (W2.a) obj;
            if (aVar != null) {
                try {
                    aVar.getClass();
                    Looper mainLooper = Looper.getMainLooper();
                    if (mainLooper != null) {
                        f1877a = new W2.c(W2.d.a(mainLooper));
                        return;
                    }
                    throw new IllegalStateException("The main looper is not available");
                } catch (Throwable th) {
                    aVar.getClass();
                    throw th;
                }
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
