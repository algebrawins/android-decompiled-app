package D;

import androidx.camera.core.impl.InterfaceC0091t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import x1.AbstractC0624h4;

/* renamed from: D.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036q {

    /* renamed from: b  reason: collision with root package name */
    public static final C0036q f439b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0036q f440c;

    /* renamed from: a  reason: collision with root package name */
    public LinkedHashSet f441a;

    /* JADX WARN: Type inference failed for: r1v1, types: [D.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [D.q, java.lang.Object] */
    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new androidx.camera.core.impl.M(0));
        ?? obj = new Object();
        obj.f441a = linkedHashSet;
        f439b = obj;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new androidx.camera.core.impl.M(1));
        ?? obj2 = new Object();
        obj2.f441a = linkedHashSet2;
        f440c = obj2;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.f441a.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.M m3 = (androidx.camera.core.impl.M) it.next();
            List<androidx.camera.core.impl.r> unmodifiableList = Collections.unmodifiableList(arrayList2);
            m3.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (androidx.camera.core.impl.r rVar : unmodifiableList) {
                AbstractC0624h4.a("The camera info doesn't contain internal implementation.", rVar instanceof androidx.camera.core.impl.r);
                if (rVar.b() == m3.f2148a) {
                    arrayList3.add(rVar);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final LinkedHashSet b(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC0091t) it.next()).k());
        }
        ArrayList a4 = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC0091t interfaceC0091t = (InterfaceC0091t) it2.next();
            if (a4.contains(interfaceC0091t.k())) {
                linkedHashSet2.add(interfaceC0091t);
            }
        }
        return linkedHashSet2;
    }

    public final Integer c() {
        Iterator it = this.f441a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            androidx.camera.core.impl.M m3 = (androidx.camera.core.impl.M) it.next();
            if (m3 instanceof androidx.camera.core.impl.M) {
                Integer valueOf = Integer.valueOf(m3.f2148a);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }
}
