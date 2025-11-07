package x1;

/* renamed from: x1.j5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0633j5 {
    public static int a(Object obj, Object obj2, int r11, Object obj3, int[] r13, Object[] objArr, Object[] objArr2) {
        int r22;
        int r6;
        int a4 = AbstractC0641k5.a(obj);
        int r12 = a4 & r11;
        int b3 = b(r12, obj3);
        if (b3 != 0) {
            int r4 = ~r11;
            int r02 = a4 & r4;
            int r5 = -1;
            while (true) {
                r22 = b3 - 1;
                r6 = r13[r22];
                if ((r6 & r4) != r02 || !AbstractC0617g5.a(obj, objArr[r22]) || (objArr2 != null && !AbstractC0617g5.a(obj2, objArr2[r22]))) {
                    int r52 = r6 & r11;
                    if (r52 == 0) {
                        break;
                    }
                    r5 = r22;
                    b3 = r52;
                }
            }
            int r9 = r6 & r11;
            if (r5 == -1) {
                d(obj3, r12, r9);
            } else {
                r13[r5] = (r9 & r11) | (r13[r5] & r4);
            }
            return r22;
        }
        return -1;
    }

    public static int b(int r12, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[r12] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[r12];
        }
        return ((int[]) obj)[r12];
    }

    public static Object c(int r22) {
        if (r22 >= 2 && r22 <= 1073741824 && Integer.highestOneBit(r22) == r22) {
            if (r22 <= 256) {
                return new byte[r22];
            }
            if (r22 <= 65536) {
                return new short[r22];
            }
            return new int[r22];
        }
        throw new IllegalArgumentException(D.C.w("must be power of 2 between 2^1 and 2^30: ", r22));
    }

    public static void d(Object obj, int r22, int r3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[r22] = (byte) r3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[r22] = (short) r3;
        } else {
            ((int[]) obj)[r22] = r3;
        }
    }
}
