package x1;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import s0.C0449b;
import s0.C0450c;

/* loaded from: classes.dex */
public abstract class R4 {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] b(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] r4 = (int[]) serializable;
            long[] jArr = new long[r4.length];
            for (int r12 = 0; r12 < r4.length; r12++) {
                jArr[r12] = r4[r12];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static void c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void d(C0449b c0449b, C0450c c0450c, int r7) {
        byte[] bArr = new byte[8192];
        while (r7 > 0) {
            int min = Math.min(r7, 8192);
            int read = c0449b.read(bArr, 0, min);
            if (read == min) {
                r7 -= read;
                c0450c.write(bArr, 0, read);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }
}
