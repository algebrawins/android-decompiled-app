package K0;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import x1.AbstractC0676p0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f827a;

    /* renamed from: b  reason: collision with root package name */
    public final A.c f828b;

    /* renamed from: c  reason: collision with root package name */
    public final A.a f829c;

    public e(ClassLoader classLoader, A.c cVar) {
        this.f827a = classLoader;
        this.f828b = cVar;
        this.f829c = new A.a(13, classLoader);
    }

    public final WindowLayoutComponent a() {
        A.a aVar = this.f829c;
        aVar.getClass();
        boolean z3 = false;
        try {
            N2.g.d(((ClassLoader) aVar.f1K).loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (AbstractC0676p0.b("WindowExtensionsProvider#getWindowExtensions is not valid", new G0.a(0, aVar)) && AbstractC0676p0.b("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && AbstractC0676p0.b("FoldingFeature class is not valid", new d(this, 0))) {
                int a4 = H0.f.a();
                if (a4 == 1) {
                    z3 = b();
                } else if (2 <= a4 && a4 <= Integer.MAX_VALUE && b()) {
                    if (AbstractC0676p0.b("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        z3 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z3) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return AbstractC0676p0.b("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
