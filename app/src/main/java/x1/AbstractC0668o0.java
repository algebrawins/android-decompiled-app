package x1;

/* renamed from: x1.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0668o0 {
    public static int a(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
