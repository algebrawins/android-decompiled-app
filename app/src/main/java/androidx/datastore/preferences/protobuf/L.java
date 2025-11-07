package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class L {
    public static void a(long j3, Object obj) {
        AbstractC0100b abstractC0100b = (AbstractC0100b) ((F) v0.f2425c.h(j3, obj));
        if (abstractC0100b.f2333J) {
            abstractC0100b.f2333J = false;
        }
    }

    public static F b(long j3, Object obj) {
        int r12;
        F f2 = (F) v0.f2425c.h(j3, obj);
        if (!((AbstractC0100b) f2).f2333J) {
            int size = f2.size();
            if (size == 0) {
                r12 = 10;
            } else {
                r12 = size * 2;
            }
            g0 i3 = ((g0) f2).i(r12);
            v0.o(j3, obj, i3);
            return i3;
        }
        return f2;
    }
}
