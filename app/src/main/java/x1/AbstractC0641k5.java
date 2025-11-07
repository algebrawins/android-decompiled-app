package x1;

/* renamed from: x1.k5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0641k5 {
    public static int a(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }
}
