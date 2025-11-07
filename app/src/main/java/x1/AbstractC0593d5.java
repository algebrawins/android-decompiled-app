package x1;

/* renamed from: x1.d5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0593d5 {
    public static void a(int r22, Object[] objArr) {
        for (int r02 = 0; r02 < r22; r02++) {
            if (objArr[r02] == null) {
                throw new NullPointerException(D.C.w("at index ", r02));
            }
        }
    }
}
