package h2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: h2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0299l extends View implements io.flutter.embedding.engine.renderer.p {

    /* renamed from: J  reason: collision with root package name */
    public ImageReader f3334J;

    /* renamed from: K  reason: collision with root package name */
    public Image f3335K;

    /* renamed from: L  reason: collision with root package name */
    public Bitmap f3336L;

    /* renamed from: M  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.n f3337M;

    /* renamed from: N  reason: collision with root package name */
    public final EnumC0298k f3338N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f3339O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0299l(Context context, int r22, int r3, EnumC0298k enumC0298k) {
        super(context, null);
        ImageReader f2 = f(r22, r3);
        this.f3339O = false;
        this.f3334J = f2;
        this.f3338N = enumC0298k;
        setAlpha(0.0f);
    }

    public static ImageReader f(int r4, int r5) {
        ImageReader newInstance;
        if (r4 <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + r4 + ", set width=1");
            r4 = 1;
        }
        if (r5 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + r5 + ", set height=1");
            r5 = 1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            newInstance = ImageReader.newInstance(r4, r5, 1, 3, 768L);
            return newInstance;
        }
        return ImageReader.newInstance(r4, r5, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public final void a(io.flutter.embedding.engine.renderer.n nVar) {
        if (AbstractC0297j.f3333a[this.f3338N.ordinal()] == 1) {
            Surface surface = this.f3334J.getSurface();
            nVar.f3500c = surface;
            nVar.f3498a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f3337M = nVar;
        this.f3339O = true;
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public final void c() {
        if (!this.f3339O) {
            return;
        }
        setAlpha(0.0f);
        e();
        this.f3336L = null;
        Image image = this.f3335K;
        if (image != null) {
            image.close();
            this.f3335K = null;
        }
        invalidate();
        this.f3339O = false;
    }

    public final boolean e() {
        if (!this.f3339O) {
            return false;
        }
        Image acquireLatestImage = this.f3334J.acquireLatestImage();
        if (acquireLatestImage != null) {
            Image image = this.f3335K;
            if (image != null) {
                image.close();
                this.f3335K = null;
            }
            this.f3335K = acquireLatestImage;
            invalidate();
        }
        if (acquireLatestImage == null) {
            return false;
        }
        return true;
    }

    public final void g(int r22, int r3) {
        if (this.f3337M == null) {
            return;
        }
        if (r22 == this.f3334J.getWidth() && r3 == this.f3334J.getHeight()) {
            return;
        }
        Image image = this.f3335K;
        if (image != null) {
            image.close();
            this.f3335K = null;
        }
        this.f3334J.close();
        this.f3334J = f(r22, r3);
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public io.flutter.embedding.engine.renderer.n getAttachedRenderer() {
        return this.f3337M;
    }

    public ImageReader getImageReader() {
        return this.f3334J;
    }

    public Surface getSurface() {
        return this.f3334J.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        super.onDraw(canvas);
        Image image = this.f3335K;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                hardwareBuffer = image.getHardwareBuffer();
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
                this.f3336L = wrapHardwareBuffer;
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f3335K.getHeight();
                    Bitmap bitmap = this.f3336L;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f3336L.getHeight() != height) {
                        this.f3336L = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f3336L.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f3336L;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int r12, int r22, int r3, int r4) {
        if ((r12 != this.f3334J.getWidth() || r22 != this.f3334J.getHeight()) && this.f3338N == EnumC0298k.background && this.f3339O) {
            g(r12, r22);
            io.flutter.embedding.engine.renderer.n nVar = this.f3337M;
            Surface surface = this.f3334J.getSurface();
            nVar.f3500c = surface;
            nVar.f3498a.onSurfaceWindowChanged(surface);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public final void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public final void d() {
    }
}
