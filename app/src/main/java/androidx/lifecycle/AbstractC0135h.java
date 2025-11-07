package androidx.lifecycle;

/* renamed from: androidx.lifecycle.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0135h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2460a;

    static {
        int[] r02 = new int[l.values().length];
        try {
            r02[l.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            r02[l.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            r02[l.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            r02[l.DESTROYED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            r02[l.INITIALIZED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f2460a = r02;
    }
}
