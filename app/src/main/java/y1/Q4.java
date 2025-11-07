package y1;

/* loaded from: classes.dex */
public abstract class Q4 {

    /* renamed from: a  reason: collision with root package name */
    public static w1.s f6291a;

    public static synchronized O4 a(L4 l4) {
        O4 o4;
        synchronized (Q4.class) {
            try {
                if (f6291a == null) {
                    f6291a = new w1.s(2);
                }
                o4 = (O4) f6291a.g(l4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return o4;
    }
}
