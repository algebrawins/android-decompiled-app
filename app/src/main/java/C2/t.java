package C2;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static w1.s f275a;

    public static int a(int r12) {
        if (r12 >= 0) {
            if (r12 < 3) {
                return r12 + 1;
            }
            if (r12 < 1073741824) {
                return (int) ((r12 / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return r12;
    }

    public static Map b(B2.c... cVarArr) {
        if (cVarArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(a(cVarArr.length));
            c(linkedHashMap, cVarArr);
            return linkedHashMap;
        }
        return r.f273J;
    }

    public static final void c(LinkedHashMap linkedHashMap, B2.c[] cVarArr) {
        for (B2.c cVar : cVarArr) {
            linkedHashMap.put(cVar.f200J, cVar.f201K);
        }
    }

    public static synchronized w1.r d(w1.p pVar) {
        w1.r rVar;
        synchronized (t.class) {
            try {
                if (f275a == null) {
                    f275a = new w1.s(0);
                }
                rVar = (w1.r) f275a.g(pVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }
}
