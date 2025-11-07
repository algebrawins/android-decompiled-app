package e3;

import java.io.IOException;
import java.io.InputStream;
import x1.AbstractC0632j4;

/* loaded from: classes.dex */
public final class o extends InputStream {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ p f3129J;

    public o(p pVar) {
        this.f3129J = pVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        p pVar = this.f3129J;
        if (!pVar.f3132L) {
            return (int) Math.min(pVar.f3131K.f3098K, Integer.MAX_VALUE);
        }
        throw new IOException("closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3129J.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        p pVar = this.f3129J;
        if (!pVar.f3132L) {
            a aVar = pVar.f3131K;
            if (aVar.f3098K == 0 && pVar.f3130J.d(aVar, 8192L) == -1) {
                return -1;
            }
            return aVar.h() & 255;
        }
        throw new IOException("closed");
    }

    public final String toString() {
        return this.f3129J + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int r10, int r11) {
        N2.g.e(bArr, "data");
        p pVar = this.f3129J;
        if (!pVar.f3132L) {
            AbstractC0632j4.b(bArr.length, r10, r11);
            a aVar = pVar.f3131K;
            if (aVar.f3098K == 0 && pVar.f3130J.d(aVar, 8192L) == -1) {
                return -1;
            }
            return aVar.read(bArr, r10, r11);
        }
        throw new IOException("closed");
    }
}
