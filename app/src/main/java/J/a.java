package J;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static Image b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static ImageWriter c(int r02, Surface surface) {
        return ImageWriter.newInstance(surface, r02);
    }

    public static void d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
