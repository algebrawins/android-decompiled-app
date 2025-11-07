package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0123v {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f2421a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f2422b;

    static {
        int[] r02 = new int[J.values().length];
        f2422b = r02;
        try {
            r02[J.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f2422b[J.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f2422b[J.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] r3 = new int[EnumC0124w.values().length];
        f2421a = r3;
        try {
            r3[EnumC0124w.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f2421a[EnumC0124w.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f2421a[EnumC0124w.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
