package x1;

/* loaded from: classes.dex */
public abstract class M6 {

    /* renamed from: a  reason: collision with root package name */
    public static w1.s f5674a;

    public static synchronized I6 a(D6 d6) {
        I6 r3;
        synchronized (M6.class) {
            try {
                if (f5674a == null) {
                    f5674a = new w1.s(1);
                }
                r3 = (I6) f5674a.g(d6);
            } catch (Throwable th) {
                throw th;
            }
        }
        return r3;
    }
}
