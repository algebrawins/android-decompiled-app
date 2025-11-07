package com.google.android.libraries.barhopper;

import Z1.a;
import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0198l0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0220v0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.M;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.O;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class BarhopperV3 implements Closeable {
    private static final long NULL_NATIVE_CONTEXT = 0;
    private static final String TAG = "BarhopperV3";
    private long nativeContext;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j3);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j3, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j3, int r3, int r4, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j3, int r3, int r4, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j3, int r3, int r4, int r5, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j3, int r3, int r4, int r5, byte[] bArr, RecognitionOptions recognitionOptions);

    private static a toProto(byte[] bArr) {
        bArr.getClass();
        try {
            return a.n(bArr, O.f2829b);
        } catch (C0198l0 e4) {
            throw new IllegalStateException("Received unexpected BarhopperResponse buffer: {0}", e4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j3 = this.nativeContext;
        if (j3 != NULL_NATIVE_CONTEXT) {
            closeNative(j3);
            this.nativeContext = NULL_NATIVE_CONTEXT;
        }
    }

    public void create() {
        if (this.nativeContext != NULL_NATIVE_CONTEXT) {
            Log.w(TAG, "Native context already exists.");
            return;
        }
        long createNative = createNative();
        this.nativeContext = createNative;
        if (createNative == NULL_NATIVE_CONTEXT) {
            throw new IllegalStateException("Failed to create native context.");
        }
    }

    public a recognize(int r9, int r10, int r11, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j3 = this.nativeContext;
        if (j3 != NULL_NATIVE_CONTEXT) {
            return toProto(recognizeStridedBufferNative(j3, r9, r10, r11, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public void create(D1.a aVar) {
        if (this.nativeContext == NULL_NATIVE_CONTEXT) {
            try {
                int c4 = aVar.c();
                byte[] bArr = new byte[c4];
                M m3 = new M(bArr, c4);
                N0 b3 = H0.f2796c.b(D1.a.class);
                C0220v0 c0220v0 = m3.f2817c;
                if (c0220v0 == null) {
                    c0220v0 = new C0220v0(m3);
                }
                b3.g(aVar, c0220v0);
                if (c4 - m3.f2820f == 0) {
                    long createNativeWithClientOptions = createNativeWithClientOptions(bArr);
                    this.nativeContext = createNativeWithClientOptions;
                    if (createNativeWithClientOptions == NULL_NATIVE_CONTEXT) {
                        throw new IllegalArgumentException("Failed to create native context with client options.");
                    }
                    return;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } catch (IOException e4) {
                String name = aVar.getClass().getName();
                throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e4);
            }
        }
        Log.w(TAG, "Native context already exists.");
    }

    public a recognize(int r9, int r10, int r11, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j3 = this.nativeContext;
        if (j3 != NULL_NATIVE_CONTEXT) {
            return toProto(recognizeStridedNative(j3, r9, r10, r11, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public a recognize(int r8, int r9, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j3 = this.nativeContext;
        if (j3 != NULL_NATIVE_CONTEXT) {
            return toProto(recognizeBufferNative(j3, r8, r9, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public a recognize(int r8, int r9, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j3 = this.nativeContext;
        if (j3 != NULL_NATIVE_CONTEXT) {
            return toProto(recognizeNative(j3, r8, r9, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public a recognize(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.nativeContext != NULL_NATIVE_CONTEXT) {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                Log.d(TAG, "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
                bitmap = bitmap.copy(config2, bitmap.isMutable());
            }
            return toProto(recognizeBitmapNative(this.nativeContext, bitmap, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }
}
