package androidx.camera.core;

import D.C;
import D.O;
import D.V;
import D.W;
import D.X;
import J.a;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.impl.L;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* renamed from: a  reason: collision with root package name */
    public static int f2101a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(X x3) {
        W w3;
        if (!d(x3)) {
            x1.X.b("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int width = x3.getWidth();
        int height = x3.getHeight();
        int p02 = x3.e()[0].p0();
        int p03 = x3.e()[1].p0();
        int p04 = x3.e()[2].p0();
        int o0 = x3.e()[0].o0();
        int o02 = x3.e()[1].o0();
        if (nativeShiftPixel(x3.e()[0].n0(), p02, x3.e()[1].n0(), p03, x3.e()[2].n0(), p04, o0, o02, width, height, o0, o02, o02) != 0) {
            w3 = W.ERROR_CONVERSION;
        } else {
            w3 = W.SUCCESS;
        }
        if (w3 == W.ERROR_CONVERSION) {
            x1.X.b("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static O b(X x3, L l3, ByteBuffer byteBuffer, int r25, boolean z3) {
        int r12;
        int r13;
        int r20;
        W w3;
        if (!d(x3)) {
            x1.X.b("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (r25 != 0 && r25 != 90 && r25 != 180 && r25 != 270) {
            x1.X.b("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        Surface surface = l3.getSurface();
        int width = x3.getWidth();
        int height = x3.getHeight();
        int p02 = x3.e()[0].p0();
        int p03 = x3.e()[1].p0();
        int p04 = x3.e()[2].p0();
        int o0 = x3.e()[0].o0();
        int o02 = x3.e()[1].o0();
        if (z3) {
            r12 = o0;
        } else {
            r12 = 0;
        }
        if (z3) {
            r13 = o02;
        } else {
            r13 = 0;
        }
        if (z3) {
            r20 = o02;
        } else {
            r20 = 0;
        }
        if (nativeConvertAndroid420ToABGR(x3.e()[0].n0(), p02, x3.e()[1].n0(), p03, x3.e()[2].n0(), p04, o0, o02, surface, byteBuffer, width, height, r12, r13, r20, r25) != 0) {
            w3 = W.ERROR_CONVERSION;
        } else {
            w3 = W.SUCCESS;
        }
        if (w3 == W.ERROR_CONVERSION) {
            x1.X.b("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            int r02 = f2101a;
            x1.X.a("ImageProcessingUtil", "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - currentTimeMillis) + "], image count: " + r02);
            f2101a = f2101a + 1;
        }
        X acquireLatestImage = l3.acquireLatestImage();
        if (acquireLatestImage == null) {
            x1.X.b("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        O o3 = new O(acquireLatestImage);
        o3.a(new V(acquireLatestImage, x3, 0));
        return o3;
    }

    public static void c(Bitmap bitmap, ByteBuffer byteBuffer, int r9) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, r9, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean d(X x3) {
        if (x3.c() == 35 && x3.e().length == 3) {
            return true;
        }
        return false;
    }

    public static O e(X x3, L l3, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int r33) {
        String str;
        W w3;
        W w4;
        if (!d(x3)) {
            x1.X.b("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        } else if (r33 != 0 && r33 != 90 && r33 != 180 && r33 != 270) {
            x1.X.b("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        } else {
            W w5 = W.ERROR_CONVERSION;
            int r02 = Build.VERSION.SDK_INT;
            if (r02 < 23 || r33 <= 0) {
                str = "ImageProcessingUtil";
                w3 = w5;
                w5 = w3;
            } else {
                int width = x3.getWidth();
                int height = x3.getHeight();
                int p02 = x3.e()[0].p0();
                int p03 = x3.e()[1].p0();
                int p04 = x3.e()[2].p0();
                int o0 = x3.e()[1].o0();
                if (r02 >= 23) {
                    Image b3 = a.b(imageWriter);
                    if (b3 == null) {
                        w4 = w5;
                        str = "ImageProcessingUtil";
                    } else {
                        w4 = w5;
                        str = "ImageProcessingUtil";
                        if (nativeRotateYUV(x3.e()[0].n0(), p02, x3.e()[1].n0(), p03, x3.e()[2].n0(), p04, o0, b3.getPlanes()[0].getBuffer(), b3.getPlanes()[0].getRowStride(), b3.getPlanes()[0].getPixelStride(), b3.getPlanes()[1].getBuffer(), b3.getPlanes()[1].getRowStride(), b3.getPlanes()[1].getPixelStride(), b3.getPlanes()[2].getBuffer(), b3.getPlanes()[2].getRowStride(), b3.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, r33) != 0) {
                            w5 = w4;
                        } else {
                            int r03 = Build.VERSION.SDK_INT;
                            if (r03 >= 23) {
                                a.d(imageWriter, b3);
                                w5 = W.SUCCESS;
                            } else {
                                throw new RuntimeException(C.v(r03, "Unable to call queueInputImage() on API ", ". Version 23 or higher required."));
                            }
                        }
                    }
                    w3 = w4;
                } else {
                    throw new RuntimeException(C.v(r02, "Unable to call dequeueInputImage() on API ", ". Version 23 or higher required."));
                }
            }
            if (w5 == w3) {
                x1.X.b(str, "rotate YUV failure");
                return null;
            }
            String str2 = str;
            X acquireLatestImage = l3.acquireLatestImage();
            if (acquireLatestImage == null) {
                x1.X.b(str2, "YUV rotation acquireLatestImage failure");
                return null;
            }
            O o3 = new O(acquireLatestImage);
            o3.a(new V(acquireLatestImage, x3, 1));
            return o3;
        }
    }

    public static void f(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            x1.X.b("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int r12, ByteBuffer byteBuffer2, int r3, ByteBuffer byteBuffer3, int r5, int r6, int r7, Surface surface, ByteBuffer byteBuffer4, int r10, int r11, int r122, int r13, int r14, int r15);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int r22, int r3, int r4, int r5, boolean z3);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int r12, ByteBuffer byteBuffer2, int r3, ByteBuffer byteBuffer3, int r5, int r6, ByteBuffer byteBuffer4, int r8, int r9, ByteBuffer byteBuffer5, int r11, int r122, ByteBuffer byteBuffer6, int r14, int r15, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int r19, int r20, int r21);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int r12, ByteBuffer byteBuffer2, int r3, ByteBuffer byteBuffer3, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r122);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
