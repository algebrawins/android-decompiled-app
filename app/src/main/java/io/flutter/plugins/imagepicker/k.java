package io.flutter.plugins.imagepicker;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f3633a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f3634b;

    static {
        int[] r02 = new int[z.values().length];
        f3634b = r02;
        try {
            r02[z.GALLERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3634b[z.CAMERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] r22 = new int[x.values().length];
        f3633a = r22;
        try {
            r22[x.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3633a[x.REAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
