package c3;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2665a;

    static {
        int[] r02 = new int[c.values().length];
        try {
            r02[c.PARKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            r02[c.BLOCKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            r02[c.CPU_ACQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            r02[c.DORMANT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            r02[c.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f2665a = r02;
    }
}
