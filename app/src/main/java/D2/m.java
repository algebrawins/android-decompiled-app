package d2;

import D.e0;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import android.view.WindowManager;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.X;
import h2.AbstractActivityC0292d;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: s  reason: collision with root package name */
    public static final C0242j f3025s = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final AbstractActivityC0292d f3026a;

    /* renamed from: b  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.n f3027b;

    /* renamed from: c  reason: collision with root package name */
    public final o f3028c;

    /* renamed from: d  reason: collision with root package name */
    public final n f3029d;

    /* renamed from: e  reason: collision with root package name */
    public final M2.l f3030e;

    /* renamed from: f  reason: collision with root package name */
    public Q.d f3031f;
    public Q.b g;

    /* renamed from: h  reason: collision with root package name */
    public e0 f3032h;

    /* renamed from: i  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f3033i;

    /* renamed from: j  reason: collision with root package name */
    public S1.a f3034j;

    /* renamed from: k  reason: collision with root package name */
    public List f3035k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3036l;

    /* renamed from: m  reason: collision with root package name */
    public l f3037m;

    /* renamed from: n  reason: collision with root package name */
    public List f3038n;

    /* renamed from: o  reason: collision with root package name */
    public e2.c f3039o;

    /* renamed from: p  reason: collision with root package name */
    public long f3040p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3041q;

    /* renamed from: r  reason: collision with root package name */
    public final C0240h f3042r;

    public m(AbstractActivityC0292d abstractActivityC0292d, io.flutter.embedding.engine.renderer.n nVar, o oVar, n nVar2) {
        C0241i c0241i = new C0241i(1, f3025s, C0242j.class, "defaultBarcodeScannerFactory", "defaultBarcodeScannerFactory(Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;)Lcom/google/mlkit/vision/barcode/BarcodeScanner;", 0, 0);
        N2.g.e(abstractActivityC0292d, "activity");
        N2.g.e(nVar, "textureRegistry");
        this.f3026a = abstractActivityC0292d;
        this.f3027b = nVar;
        this.f3028c = oVar;
        this.f3029d = nVar2;
        this.f3030e = c0241i;
        this.f3039o = e2.c.NO_DUPLICATES;
        this.f3040p = 250L;
        this.f3042r = new C0240h(this);
    }

    public final Size a(Size size) {
        int rotation;
        Display display;
        int r02 = Build.VERSION.SDK_INT;
        AbstractActivityC0292d abstractActivityC0292d = this.f3026a;
        if (r02 >= 30) {
            display = abstractActivityC0292d.getDisplay();
            N2.g.b(display);
            rotation = display.getRotation();
        } else {
            Object systemService = abstractActivityC0292d.getApplicationContext().getSystemService("window");
            N2.g.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
        }
        int width = size.getWidth();
        int height = size.getHeight();
        if (rotation != 0 && rotation != 2) {
            return new Size(height, width);
        }
        return new Size(width, height);
    }

    public final void b(double d4) {
        if (d4 <= 1.0d && d4 >= 0.0d) {
            Q.b bVar = this.g;
            if (bVar != null) {
                W w3 = bVar.f1041L.f767X;
                if (w3 != null) {
                    w3.j((float) d4);
                    return;
                }
                return;
            }
            throw new Exception();
        }
        throw new Exception();
    }

    public final void c() {
        X x3;
        if (this.g == null && this.f3032h == null) {
            throw new Exception();
        }
        l lVar = this.f3037m;
        AbstractActivityC0292d abstractActivityC0292d = this.f3026a;
        if (lVar != null) {
            Object systemService = abstractActivityC0292d.getApplicationContext().getSystemService("display");
            N2.g.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            ((DisplayManager) systemService).unregisterDisplayListener(this.f3037m);
            this.f3037m = null;
        }
        N2.g.c(abstractActivityC0292d, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        Q.b bVar = this.g;
        if (bVar != null && (x3 = bVar.f1041L.f768Y) != null) {
            androidx.camera.core.impl.r rVar = x3.f2157b;
            rVar.f().j(abstractActivityC0292d);
            rVar.g().j(abstractActivityC0292d);
            x3.f2156a.i().j(abstractActivityC0292d);
        }
        Q.d dVar = this.f3031f;
        if (dVar != null) {
            dVar.c();
        }
        this.f3031f = null;
        this.g = null;
        this.f3032h = null;
        io.flutter.embedding.engine.renderer.k kVar = this.f3033i;
        if (kVar != null) {
            kVar.release();
        }
        this.f3033i = null;
        S1.a aVar = this.f3034j;
        if (aVar != null) {
            ((W1.a) aVar).close();
        }
        this.f3034j = null;
        this.f3035k = null;
    }
}
