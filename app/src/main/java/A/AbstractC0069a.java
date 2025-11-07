package a;

import D.C;

/* renamed from: a.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0069a {
    public static void a(int r3, int r4, int r5) {
        if (r3 >= 0 && r4 <= r5) {
            if (r3 <= r4) {
                return;
            }
            throw new IllegalArgumentException(C.x("fromIndex: ", r3, " > toIndex: ", r4));
        }
        throw new IndexOutOfBoundsException("fromIndex: " + r3 + ", toIndex: " + r4 + ", size: " + r5);
    }
}
