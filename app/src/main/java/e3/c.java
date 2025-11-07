package e3;

import java.io.Closeable;
import java.io.Flushable;
import java.util.concurrent.locks.ReentrantLock;
import x1.AbstractC0632j4;

/* loaded from: classes.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: J  reason: collision with root package name */
    public final h f3103J;

    /* renamed from: K  reason: collision with root package name */
    public long f3104K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f3105L;

    public c(h hVar, long j3) {
        N2.g.e(hVar, "fileHandle");
        this.f3103J = hVar;
        this.f3104K = j3;
    }

    public final void a(a aVar, long j3) {
        if (!this.f3105L) {
            h hVar = this.f3103J;
            long j4 = this.f3104K;
            hVar.getClass();
            AbstractC0632j4.b(aVar.f3098K, 0L, j3);
            long j5 = j4 + j3;
            while (j4 < j5) {
                q qVar = aVar.f3097J;
                N2.g.b(qVar);
                int min = (int) Math.min(j5 - j4, qVar.f3135c - qVar.f3134b);
                byte[] bArr = qVar.f3133a;
                int r8 = qVar.f3134b;
                synchronized (hVar) {
                    N2.g.e(bArr, "array");
                    hVar.f3121N.seek(j4);
                    hVar.f3121N.write(bArr, r8, min);
                }
                int r6 = qVar.f3134b + min;
                qVar.f3134b = r6;
                long j6 = min;
                j4 += j6;
                aVar.f3098K -= j6;
                if (r6 == qVar.f3135c) {
                    aVar.f3097J = qVar.a();
                    r.a(qVar);
                }
            }
            this.f3104K += j3;
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3105L) {
            return;
        }
        this.f3105L = true;
        h hVar = this.f3103J;
        ReentrantLock reentrantLock = hVar.f3120M;
        reentrantLock.lock();
        try {
            int r22 = hVar.f3119L - 1;
            hVar.f3119L = r22;
            if (r22 == 0) {
                if (hVar.f3118K) {
                    synchronized (hVar) {
                        hVar.f3121N.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (!this.f3105L) {
            h hVar = this.f3103J;
            synchronized (hVar) {
                hVar.f3121N.getFD().sync();
            }
            return;
        }
        throw new IllegalStateException("closed");
    }
}
