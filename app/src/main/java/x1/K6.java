package x1;

import A0.C0001b;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class K6 implements L1.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5646a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5647b;

    public /* synthetic */ K6(int r12, Object obj) {
        this.f5646a = r12;
        this.f5647b = obj;
    }

    @Override // L1.a
    public final Object get() {
        switch (this.f5646a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((C0001b) this.f5647b).G(new S0.b("json"), N6.f5684e);
            case 1:
                return ((C0001b) this.f5647b).G(new S0.b("proto"), N6.f5683d);
            case 2:
                return ((C0001b) this.f5647b).G(new S0.b("json"), y1.S4.f6301e);
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C0001b) this.f5647b).G(new S0.b("proto"), y1.S4.f6300d);
            default:
                String str = (String) this.f5647b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (F1.e.class.isAssignableFrom(cls)) {
                        return (F1.e) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException("Could not instantiate " + str + ".", e4);
                } catch (InstantiationException e5) {
                    throw new RuntimeException("Could not instantiate " + str + ".", e5);
                } catch (NoSuchMethodException e6) {
                    throw new RuntimeException(D.C.I("Could not instantiate ", str), e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException(D.C.I("Could not instantiate ", str), e7);
                }
        }
    }
}
