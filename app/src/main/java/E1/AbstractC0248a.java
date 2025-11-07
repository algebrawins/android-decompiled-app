package e1;

import D.C;
import S0.c;
import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: e1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0248a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray f3090a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f3091b;

    static {
        HashMap hashMap = new HashMap();
        f3091b = hashMap;
        hashMap.put(c.DEFAULT, 0);
        hashMap.put(c.VERY_LOW, 1);
        hashMap.put(c.HIGHEST, 2);
        for (c cVar : hashMap.keySet()) {
            f3090a.append(((Integer) f3091b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f3091b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int r22) {
        c cVar = (c) f3090a.get(r22);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(C.w("Unknown Priority for value ", r22));
    }
}
