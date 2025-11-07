package B0;

import D.C;
import N2.g;
import android.os.Bundle;
import androidx.lifecycle.EnumC0137k;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0134g;
import androidx.lifecycle.J;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f176J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f177K;

    public /* synthetic */ a(int r12, Object obj) {
        this.f176J = r12;
        this.f177K = obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [B0.f, java.lang.Object] */
    @Override // androidx.lifecycle.p
    public final void h(r rVar, EnumC0137k enumC0137k) {
        switch (this.f176J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (enumC0137k == EnumC0137k.ON_CREATE) {
                    rVar.b().b(this);
                    Bundle a4 = this.f177K.a().a("androidx.savedstate.Restarter");
                    if (a4 != null) {
                        ArrayList<String> stringArrayList = a4.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            if (!it.hasNext()) {
                                return;
                            }
                            String next = it.next();
                            try {
                                Class<? extends U> asSubclass = Class.forName(next, false, a.class.getClassLoader()).asSubclass(c.class);
                                g.d(asSubclass, "{\n                Class.…class.java)\n            }");
                                try {
                                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                    declaredConstructor.setAccessible(true);
                                    try {
                                        g.d(declaredConstructor.newInstance(null), "{\n                constr…wInstance()\n            }");
                                        throw new ClassCastException();
                                    } catch (Exception e4) {
                                        throw new RuntimeException(C.I("Failed to instantiate ", next), e4);
                                    }
                                } catch (NoSuchMethodException e5) {
                                    throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                                }
                            } catch (ClassNotFoundException e6) {
                                throw new RuntimeException("Class " + next + " wasn't found", e6);
                            }
                        }
                        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                new HashMap();
                InterfaceC0134g[] interfaceC0134gArr = (InterfaceC0134g[]) this.f177K;
                if (interfaceC0134gArr.length <= 0) {
                    if (interfaceC0134gArr.length <= 0) {
                        return;
                    }
                    InterfaceC0134g interfaceC0134g = interfaceC0134gArr[0];
                    throw null;
                }
                InterfaceC0134g interfaceC0134g2 = interfaceC0134gArr[0];
                throw null;
            default:
                if (enumC0137k == EnumC0137k.ON_CREATE) {
                    rVar.b().b(this);
                    I r4 = (I) this.f177K;
                    if (!r4.f2445b) {
                        Bundle a5 = r4.f2444a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                        Bundle bundle = new Bundle();
                        Bundle bundle2 = r4.f2446c;
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        if (a5 != null) {
                            bundle.putAll(a5);
                        }
                        r4.f2446c = bundle;
                        r4.f2445b = true;
                        J j3 = (J) r4.f2447d.a();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0137k).toString());
        }
    }
}
