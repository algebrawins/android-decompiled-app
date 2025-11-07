package P1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static c f1032b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1033a;

    public c(Set set) {
        this.f1033a = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            HashMap hashMap = this.f1033a;
            bVar.getClass();
            hashMap.put(a.class, bVar.f1031a);
        }
    }

    public c(int r12) {
        switch (r12) {
            case 2:
                this.f1033a = new HashMap();
                return;
            default:
                this.f1033a = new HashMap();
                return;
        }
    }
}
