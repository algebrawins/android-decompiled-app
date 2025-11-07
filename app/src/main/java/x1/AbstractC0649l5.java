package x1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: x1.l5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0649l5 {
    public static int a(Set set) {
        int r22;
        int r12 = 0;
        for (Object obj : set) {
            if (obj != null) {
                r22 = obj.hashCode();
            } else {
                r22 = 0;
            }
            r12 += r22;
        }
        return r12;
    }

    public static boolean b(M m3, Collection collection) {
        collection.getClass();
        if (collection instanceof F) {
            collection = ((F) collection).a();
        }
        boolean z3 = false;
        if ((collection instanceof Set) && collection.size() > m3.size()) {
            Iterator<E> it = m3.iterator();
            collection.getClass();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z3 = true;
                }
            }
            return z3;
        }
        for (Object obj : collection) {
            z3 |= m3.remove(obj);
        }
        return z3;
    }
}
