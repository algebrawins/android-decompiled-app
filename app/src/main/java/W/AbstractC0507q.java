package w;

/* renamed from: w.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0507q {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f5230a;

    static {
        int[] r02 = new int[EnumC0508s.values().length];
        f5230a = r02;
        try {
            r02[EnumC0508s.INITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5230a[EnumC0508s.PENDING_OPEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5230a[EnumC0508s.CLOSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5230a[EnumC0508s.OPENED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5230a[EnumC0508s.CONFIGURED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f5230a[EnumC0508s.OPENING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f5230a[EnumC0508s.REOPENING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f5230a[EnumC0508s.RELEASING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f5230a[EnumC0508s.RELEASED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
