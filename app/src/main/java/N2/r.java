package N2;

import D.C;

/* loaded from: classes.dex */
public abstract class r {
    public static void a(int r12, Object obj) {
        if (obj != null && !b(r12, obj)) {
            String w3 = C.w("kotlin.jvm.functions.Function", r12);
            String name = obj.getClass().getName();
            ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + w3);
            g.f(classCastException, r.class.getName());
            throw classCastException;
        }
    }

    public static boolean b(int r3, Object obj) {
        int r4;
        if (!(obj instanceof B2.a)) {
            return false;
        }
        if (obj instanceof e) {
            r4 = ((e) obj).d();
        } else if (obj instanceof M2.a) {
            r4 = 0;
        } else if (obj instanceof M2.l) {
            r4 = 1;
        } else if (obj instanceof M2.p) {
            r4 = 2;
        } else if (obj instanceof M2.q) {
            r4 = 3;
        } else if (obj instanceof d2.o) {
            r4 = 4;
        } else {
            r4 = -1;
        }
        if (r4 != r3) {
            return false;
        }
        return true;
    }
}
