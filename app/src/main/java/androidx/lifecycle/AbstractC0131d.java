package androidx.lifecycle;

/* renamed from: androidx.lifecycle.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0131d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2456a;

    static {
        int[] r02 = new int[EnumC0137k.values().length];
        try {
            r02[EnumC0137k.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            r02[EnumC0137k.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            r02[EnumC0137k.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            r02[EnumC0137k.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            r02[EnumC0137k.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            r02[EnumC0137k.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            r02[EnumC0137k.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f2456a = r02;
    }
}
