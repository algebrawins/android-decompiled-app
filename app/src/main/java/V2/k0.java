package V2;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f1441a = new ThreadLocal();

    public static J a() {
        ThreadLocal threadLocal = f1441a;
        J j3 = (J) threadLocal.get();
        if (j3 == null) {
            C0048d c0048d = new C0048d(Thread.currentThread());
            threadLocal.set(c0048d);
            return c0048d;
        }
        return j3;
    }
}
