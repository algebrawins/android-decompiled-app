package x1;

/* renamed from: x1.w0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0731w0 {
    public static void a(int r5) {
        if (2 <= r5 && r5 < 37) {
            return;
        }
        throw new IllegalArgumentException("radix " + r5 + " was not in valid range " + new R2.a(2, 36, 1));
    }
}
