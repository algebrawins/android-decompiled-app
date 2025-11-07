package x1;

/* loaded from: classes.dex */
public abstract class V4 {
    public static void a(int r6, int r7) {
        String a4;
        if (r6 >= 0 && r6 < r7) {
            return;
        }
        if (r6 >= 0) {
            if (r7 < 0) {
                throw new IllegalArgumentException(D.C.w("negative size: ", r7));
            }
            a4 = W4.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(r6), Integer.valueOf(r7));
        } else {
            a4 = W4.a("%s (%s) must not be negative", "index", Integer.valueOf(r6));
        }
        throw new IndexOutOfBoundsException(a4);
    }

    public static void b(int r22, int r3) {
        if (r22 >= 0 && r22 <= r3) {
            return;
        }
        throw new IndexOutOfBoundsException(d(r22, r3, "index"));
    }

    public static void c(int r22, int r3, int r4) {
        String d4;
        if (r22 >= 0 && r3 >= r22 && r3 <= r4) {
            return;
        }
        if (r22 >= 0 && r22 <= r4) {
            if (r3 >= 0 && r3 <= r4) {
                d4 = W4.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(r3), Integer.valueOf(r22));
            } else {
                d4 = d(r3, r4, "end index");
            }
        } else {
            d4 = d(r22, r4, "start index");
        }
        throw new IndexOutOfBoundsException(d4);
    }

    public static String d(int r4, int r5, String str) {
        if (r4 < 0) {
            return W4.a("%s (%s) must not be negative", str, Integer.valueOf(r4));
        }
        if (r5 >= 0) {
            return W4.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(r4), Integer.valueOf(r5));
        }
        throw new IllegalArgumentException(D.C.w("negative size: ", r5));
    }
}
