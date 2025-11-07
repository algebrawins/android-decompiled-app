package H0;

import N2.p;
import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f724a = p.a(f.class).b();

    public static int a() {
        String str = f724a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (c.a() != k.LOG) {
                return 0;
            }
            Log.d(str, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (c.a() != k.LOG) {
                return 0;
            }
            Log.d(str, "Stub Extension");
            return 0;
        }
    }
}
