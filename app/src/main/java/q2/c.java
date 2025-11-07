package q2;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f4801a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f4802b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int[] f4803c;

    static {
        int[] r02 = new int[i.values().length];
        f4803c = r02;
        try {
            r02[i.LEAN_BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f4803c[i.IMMERSIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f4803c[i.IMMERSIVE_STICKY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f4803c[i.EDGE_TO_EDGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] r4 = new int[j.values().length];
        f4802b = r4;
        try {
            r4[j.TOP_OVERLAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f4802b[j.BOTTOM_OVERLAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        int[] r42 = new int[f.values().length];
        f4801a = r42;
        try {
            r42[f.PORTRAIT_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f4801a[f.PORTRAIT_DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f4801a[f.LANDSCAPE_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f4801a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
