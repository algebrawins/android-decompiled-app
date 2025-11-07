package x1;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class C0 {
    public static ByteBuffer a(X1.a aVar) {
        Bitmap.Config config;
        boolean z3;
        int r12 = aVar.f1587f;
        if (r12 != -1) {
            if (r12 != 17) {
                if (r12 != 35) {
                    if (r12 != 842094169) {
                        throw new M1.a("Unsupported image format", 13);
                    }
                    k1.w.e(null);
                    throw null;
                }
                Image.Plane[] a4 = aVar.a();
                k1.w.e(a4);
                int r10 = aVar.f1584c;
                int r02 = aVar.f1585d;
                int r11 = r10 * r02;
                int r4 = r11 / 4;
                byte[] bArr = new byte[r4 + r4 + r11];
                ByteBuffer buffer = a4[1].getBuffer();
                ByteBuffer buffer2 = a4[2].getBuffer();
                int position = buffer2.position();
                int limit = buffer.limit();
                buffer2.position(position + 1);
                buffer.limit(limit - 1);
                int r9 = (r11 + r11) / 4;
                if (buffer2.remaining() == r9 - 2 && buffer2.compareTo(buffer) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                buffer2.position(position);
                buffer.limit(limit);
                if (z3) {
                    a4[0].getBuffer().get(bArr, 0, r11);
                    ByteBuffer buffer3 = a4[1].getBuffer();
                    a4[2].getBuffer().get(bArr, r11, 1);
                    buffer3.get(bArr, r11 + 1, r9 - 1);
                } else {
                    b(a4[0], r10, r02, bArr, 0, 1);
                    b(a4[1], r10, r02, bArr, r11 + 1, 2);
                    b(a4[2], r10, r02, bArr, r11, 2);
                }
                return ByteBuffer.wrap(bArr);
            }
            k1.w.e(null);
            throw null;
        }
        Bitmap bitmap = aVar.f1582a;
        k1.w.e(bitmap);
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            }
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int r22 = width * height;
        int[] r122 = new int[r22];
        bitmap2.getPixels(r122, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + r22);
        int r6 = 0;
        int r7 = 0;
        for (int r5 = 0; r5 < height; r5++) {
            int r8 = 0;
            while (r8 < width) {
                int r92 = r122[r7];
                int r102 = r92 >> 16;
                int r112 = r92 >> 8;
                int r93 = r92 & 255;
                int r14 = r6 + 1;
                int r103 = r102 & 255;
                int r113 = r112 & 255;
                allocateDirect.put(r6, (byte) Math.min(255, ((((r93 * 25) + ((r113 * 129) + (r103 * 66))) + RecognitionOptions.ITF) >> 8) + 16));
                if (r5 % 2 == 0 && r7 % 2 == 0) {
                    int r62 = r103 * 112;
                    int r3 = ((((r62 - (r113 * 94)) - (r93 * 18)) + RecognitionOptions.ITF) >> 8) + RecognitionOptions.ITF;
                    int r63 = (((((r103 * (-38)) - (r113 * 74)) + (r93 * 112)) + RecognitionOptions.ITF) >> 8) + RecognitionOptions.ITF;
                    int r94 = r22 + 1;
                    allocateDirect.put(r22, (byte) Math.min(255, r3));
                    r22 += 2;
                    allocateDirect.put(r94, (byte) Math.min(255, r63));
                }
                r7++;
                r8++;
                r6 = r14;
            }
        }
        return allocateDirect;
    }

    public static final void b(Image.Plane plane, int r8, int r9, byte[] bArr, int r11, int r12) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int r82 = r8 / (r9 / rowStride);
        int r3 = 0;
        for (int r13 = 0; r13 < rowStride; r13++) {
            int r5 = r3;
            for (int r4 = 0; r4 < r82; r4++) {
                bArr[r11] = buffer.get(r5);
                r11 += r12;
                r5 += plane.getPixelStride();
            }
            r3 += plane.getRowStride();
        }
    }
}
