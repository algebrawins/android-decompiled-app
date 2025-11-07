package e3;

import java.io.Closeable;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public final class n implements Closeable, Flushable, WritableByteChannel {

    /* renamed from: J  reason: collision with root package name */
    public final c f3126J;

    /* renamed from: K  reason: collision with root package name */
    public final a f3127K = new Object();

    /* renamed from: L  reason: collision with root package name */
    public boolean f3128L;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, e3.a] */
    public n(c cVar) {
        this.f3126J = cVar;
    }

    public final void a() {
        int r6;
        if (!this.f3128L) {
            a aVar = this.f3127K;
            long j3 = aVar.f3098K;
            if (j3 == 0) {
                j3 = 0;
            } else {
                q qVar = aVar.f3097J;
                N2.g.b(qVar);
                q qVar2 = qVar.g;
                N2.g.b(qVar2);
                if (qVar2.f3135c < 8192 && qVar2.f3137e) {
                    j3 -= r6 - qVar2.f3134b;
                }
            }
            if (j3 > 0) {
                this.f3126J.a(aVar, j3);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        c cVar = this.f3126J;
        if (!this.f3128L) {
            try {
                a aVar = this.f3127K;
                long j3 = aVar.f3098K;
                if (j3 > 0) {
                    cVar.a(aVar, j3);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                cVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f3128L = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (!this.f3128L) {
            a aVar = this.f3127K;
            long j3 = aVar.f3098K;
            c cVar = this.f3126J;
            if (j3 > 0) {
                cVar.a(aVar, j3);
            }
            cVar.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3128L;
    }

    public final String toString() {
        return "buffer(" + this.f3126J + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        N2.g.e(byteBuffer, "source");
        if (!this.f3128L) {
            int write = this.f3127K.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
