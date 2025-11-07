package M;

import android.util.Size;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Size f851a = new Size(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final Size f852b;

    /* renamed from: c  reason: collision with root package name */
    public static final Size f853c;

    /* renamed from: d  reason: collision with root package name */
    public static final Size f854d;

    /* renamed from: e  reason: collision with root package name */
    public static final Size f855e;

    /* renamed from: f  reason: collision with root package name */
    public static final Size f856f;

    static {
        new Size(320, 240);
        f852b = new Size(640, 480);
        f853c = new Size(720, 480);
        f854d = new Size(1280, 720);
        f855e = new Size(1920, 1080);
        f856f = new Size(1920, 1440);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
