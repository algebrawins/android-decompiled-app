package V2;

/* renamed from: V2.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0064v {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f1463a;

    static {
        int[] r02 = new int[EnumC0065w.values().length];
        try {
            r02[EnumC0065w.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            r02[EnumC0065w.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            r02[EnumC0065w.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            r02[EnumC0065w.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f1463a = r02;
    }
}
