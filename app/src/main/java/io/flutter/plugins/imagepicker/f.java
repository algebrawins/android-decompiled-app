package io.flutter.plugins.imagepicker;

import D.C;
import android.graphics.Bitmap;
import android.util.Log;
import h1.C0287g;
import h2.AbstractActivityC0292d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractActivityC0292d f3617a;

    public f(AbstractActivityC0292d abstractActivityC0292d, C0287g c0287g) {
        this.f3617a = abstractActivityC0292d;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de A[Catch: IOException -> 0x011d, TRY_LEAVE, TryCatch #1 {IOException -> 0x011d, blocks: (B:14:0x0037, B:22:0x0051, B:25:0x0062, B:28:0x0077, B:33:0x0084, B:43:0x00a8, B:55:0x00d5, B:58:0x00de, B:63:0x0118, B:62:0x0105, B:48:0x00c2, B:49:0x00c8, B:51:0x00cc, B:53:0x00d0, B:39:0x0095, B:41:0x009d, B:42:0x00a3, B:59:0x00f6), top: B:71:0x0037, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r21, java.lang.Double r22, java.lang.Double r23, int r24) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.f.a(java.lang.String, java.lang.Double, java.lang.Double, int):java.lang.String");
    }

    public File b(Bitmap bitmap, Double d4, Double d5, int r6, String str) {
        Bitmap.CompressFormat compressFormat;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, d4.intValue(), d5.intValue(), false);
        String I3 = C.I("/scaled_", str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasAlpha = createScaledBitmap.hasAlpha();
        if (hasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        if (hasAlpha) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        createScaledBitmap.compress(compressFormat, r6, byteArrayOutputStream);
        File file = new File(this.f3617a.getCacheDir(), I3);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        return file;
    }

    public f(AbstractActivityC0292d abstractActivityC0292d) {
        this.f3617a = abstractActivityC0292d;
    }
}
