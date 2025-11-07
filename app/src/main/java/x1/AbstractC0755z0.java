package x1;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: x1.z0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0755z0 {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean b(File file, Resources resources, int r22) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(r22);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean c4 = c(file, inputStream);
            a(inputStream);
            return c4;
        } catch (Throwable th2) {
            th = th2;
            a(inputStream);
            throw th;
        }
    }

    public static boolean c(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[RecognitionOptions.UPC_E];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            a(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    public static File d(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int r22 = 0; r22 < 100; r22++) {
            File file = new File(cacheDir, str + r22);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static MappedByteBuffer e(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }
}
