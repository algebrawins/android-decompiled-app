package e3;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m extends OutputStream {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ n f3125J;

    public m(n nVar) {
        this.f3125J = nVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3125J.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        n nVar = this.f3125J;
        if (!nVar.f3128L) {
            nVar.flush();
        }
    }

    public final String toString() {
        return this.f3125J + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int r3) {
        n nVar = this.f3125J;
        if (!nVar.f3128L) {
            nVar.f3127K.s((byte) r3);
            nVar.a();
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int r4, int r5) {
        N2.g.e(bArr, "data");
        n nVar = this.f3125J;
        if (!nVar.f3128L) {
            nVar.f3127K.r(bArr, r4, r5);
            nVar.a();
            return;
        }
        throw new IOException("closed");
    }
}
