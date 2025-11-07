package A0;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f61a;

    public Q(ArrayList arrayList) {
        this.f61a = new ArrayList(arrayList);
    }

    public boolean a(Class cls) {
        Iterator it = this.f61a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((androidx.camera.core.impl.U) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public androidx.camera.core.impl.U b(Class cls) {
        Iterator it = this.f61a.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.U u3 = (androidx.camera.core.impl.U) it.next();
            if (u3.getClass() == cls) {
                return u3;
            }
        }
        return null;
    }
}
