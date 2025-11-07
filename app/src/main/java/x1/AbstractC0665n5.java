package x1;

/* renamed from: x1.n5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0665n5 {
    public static void a(int r6, int r7) {
        String a4;
        if (r6 >= 0 && r6 < r7) {
            return;
        }
        if (r6 >= 0) {
            if (r7 < 0) {
                throw new IllegalArgumentException(D.C.w("negative size: ", r7));
            }
            a4 = AbstractC0673o5.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(r6), Integer.valueOf(r7));
        } else {
            a4 = AbstractC0673o5.a("%s (%s) must not be negative", "index", Integer.valueOf(r6));
        }
        throw new IndexOutOfBoundsException(a4);
    }

    public static void b(int r22, int r3, int r4) {
        String c4;
        if (r22 >= 0 && r3 >= r22 && r3 <= r4) {
            return;
        }
        if (r22 >= 0 && r22 <= r4) {
            if (r3 >= 0 && r3 <= r4) {
                c4 = AbstractC0673o5.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(r3), Integer.valueOf(r22));
            } else {
                c4 = c(r3, r4, "end index");
            }
        } else {
            c4 = c(r22, r4, "start index");
        }
        throw new IndexOutOfBoundsException(c4);
    }

    public static String c(int r4, int r5, String str) {
        if (r4 < 0) {
            return AbstractC0673o5.a("%s (%s) must not be negative", str, Integer.valueOf(r4));
        }
        if (r5 >= 0) {
            return AbstractC0673o5.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(r4), Integer.valueOf(r5));
        }
        throw new IllegalArgumentException(D.C.w("negative size: ", r5));
    }
}
