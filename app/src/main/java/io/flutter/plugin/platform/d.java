package io.flutter.plugin.platform;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f3562a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f3563b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int[] f3564c;

    static {
        int[] r02 = new int[q2.d.values().length];
        f3564c = r02;
        try {
            r02[q2.d.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3564c[q2.d.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] r22 = new int[q2.j.values().length];
        f3563b = r22;
        try {
            r22[q2.j.TOP_OVERLAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3563b[q2.j.BOTTOM_OVERLAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        int[] r23 = new int[q2.g.values().length];
        f3562a = r23;
        try {
            r23[q2.g.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f3562a[q2.g.LIGHT_IMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f3562a[q2.g.MEDIUM_IMPACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f3562a[q2.g.HEAVY_IMPACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f3562a[q2.g.SELECTION_CLICK.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
