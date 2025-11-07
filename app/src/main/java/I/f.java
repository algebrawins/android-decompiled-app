package I;

import androidx.camera.core.impl.InterfaceC0091t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f750a = new ArrayList();

    public f(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            this.f750a.add(((InterfaceC0091t) it.next()).e().e());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f750a.equals(((f) obj).f750a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f750a.hashCode() * 53;
    }
}
