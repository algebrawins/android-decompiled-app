package q2;

/* renamed from: q2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0435a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f4800a;

    static {
        int[] r02 = new int[b.values().length];
        f4800a = r02;
        try {
            r02[b.RESUMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4800a[b.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4800a[b.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4800a[b.PAUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f4800a[b.DETACHED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
