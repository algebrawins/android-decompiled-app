package K0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import x1.AbstractC0676p0;

/* loaded from: classes.dex */
public final class d extends N2.h implements M2.a {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f825K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ e f826L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int r22) {
        super(0);
        this.f825K = r22;
        this.f826L = eVar;
    }

    @Override // M2.a
    public final Object a() {
        Class<?> cls = null;
        e eVar = this.f826L;
        boolean z3 = false;
        switch (this.f825K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Class<?> loadClass = eVar.f827a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                N2.g.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                N2.g.d(method, "getBoundsMethod");
                if (AbstractC0676p0.a(method, N2.p.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    N2.g.d(method2, "getTypeMethod");
                    Class cls2 = Integer.TYPE;
                    if (AbstractC0676p0.a(method2, N2.p.a(cls2)) && Modifier.isPublic(method2.getModifiers())) {
                        N2.g.d(method3, "getStateMethod");
                        if (AbstractC0676p0.a(method3, N2.p.a(cls2)) && Modifier.isPublic(method3.getModifiers())) {
                            z3 = true;
                        }
                    }
                }
                return Boolean.valueOf(z3);
            case 1:
                try {
                    cls = eVar.f828b.S();
                } catch (ClassNotFoundException unused) {
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = eVar.f827a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                N2.g.d(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = loadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, cls);
                Method method5 = loadClass2.getMethod("removeWindowLayoutInfoListener", cls);
                N2.g.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    N2.g.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            case 2:
                Class<?> loadClass3 = eVar.f827a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                N2.g.d(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = loadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = loadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                N2.g.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    N2.g.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z3 = true;
                    }
                }
                return Boolean.valueOf(z3);
            default:
                Class<?> loadClass4 = ((ClassLoader) eVar.f829c.f1K).loadClass("androidx.window.extensions.WindowExtensions");
                N2.g.d(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = loadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> loadClass5 = eVar.f827a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                N2.g.d(loadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                N2.g.d(method8, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(loadClass5)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
        }
    }
}
