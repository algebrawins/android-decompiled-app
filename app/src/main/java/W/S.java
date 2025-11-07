package w;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import java.util.Locale;
import z.C0942C;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: e  reason: collision with root package name */
    public static final Size f5077e = new Size(1920, 1080);

    /* renamed from: f  reason: collision with root package name */
    public static final Size f5078f = new Size(320, 240);
    public static final Size g = new Size(640, 480);

    /* renamed from: h  reason: collision with root package name */
    public static final Object f5079h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static volatile S f5080i;

    /* renamed from: a  reason: collision with root package name */
    public final DisplayManager f5081a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Size f5082b = null;

    /* renamed from: c  reason: collision with root package name */
    public final A.c f5083c = new A.c(2);

    /* renamed from: d  reason: collision with root package name */
    public final A.c f5084d = new A.c(0);

    public S(Context context) {
        this.f5081a = (DisplayManager) context.getSystemService("display");
    }

    public static S b(Context context) {
        if (f5080i == null) {
            synchronized (f5079h) {
                try {
                    if (f5080i == null) {
                        f5080i = new S(context);
                    }
                } finally {
                }
            }
        }
        return f5080i;
    }

    public static Display d(Display[] displayArr, boolean z3) {
        Display display = null;
        int r22 = -1;
        for (Display display2 : displayArr) {
            if (!z3 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int r6 = point.x * point.y;
                if (r6 > r22) {
                    display = display2;
                    r22 = r6;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size a4;
        Size size;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        Size size3 = M.a.f851a;
        if (size2.getHeight() * size2.getWidth() < M.a.a(f5078f)) {
            if (((C0942C) this.f5084d.f5K) != null) {
                size = (Size) C0942C.f6560a.get(Build.MODEL.toUpperCase(Locale.US));
            } else {
                size = null;
            }
            size2 = size;
            if (size2 == null) {
                size2 = g;
            }
        }
        if (size2.getHeight() > size2.getWidth()) {
            size2 = new Size(size2.getHeight(), size2.getWidth());
        }
        int height = size2.getHeight() * size2.getWidth();
        Size size4 = f5077e;
        if (height > size4.getHeight() * size4.getWidth()) {
            size2 = size4;
        }
        if (((z.m) this.f5083c.f5K) != null && (a4 = z.m.a(androidx.camera.core.impl.g0.PRIV)) != null) {
            if (a4.getHeight() * a4.getWidth() > size2.getHeight() * size2.getWidth()) {
                return a4;
            }
            return size2;
        }
        return size2;
    }

    public final Display c(boolean z3) {
        Display[] displays = this.f5081a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display d4 = d(displays, z3);
        if (d4 == null && z3) {
            d4 = d(displays, false);
        }
        if (d4 != null) {
            return d4;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size e() {
        if (this.f5082b != null) {
            return this.f5082b;
        }
        this.f5082b = a();
        return this.f5082b;
    }
}
