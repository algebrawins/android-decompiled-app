package s0;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: s0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448a extends MediaDataSource {

    /* renamed from: J  reason: collision with root package name */
    public long f4899J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ g f4900K;

    public C0448a(g gVar) {
        this.f4900K = gVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int r10, int r11) {
        if (r11 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j4 = this.f4899J;
            if (j4 != j3) {
                if (j4 >= 0 && j3 >= j4 + this.f4900K.f4901J.available()) {
                    return -1;
                }
                this.f4900K.b(j3);
                this.f4899J = j3;
            }
            if (r11 > this.f4900K.f4901J.available()) {
                r11 = this.f4900K.f4901J.available();
            }
            int read = this.f4900K.read(bArr, r10, r11);
            if (read >= 0) {
                this.f4899J += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f4899J = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
