package T2;

import C2.j;
import C2.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c extends d {
    public static List a(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return q.f272J;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return j.b(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
