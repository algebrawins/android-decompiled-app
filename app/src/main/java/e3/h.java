package e3;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: J  reason: collision with root package name */
    public final boolean f3117J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f3118K;

    /* renamed from: L  reason: collision with root package name */
    public int f3119L;

    /* renamed from: M  reason: collision with root package name */
    public final ReentrantLock f3120M = new ReentrantLock();

    /* renamed from: N  reason: collision with root package name */
    public final RandomAccessFile f3121N;

    public h(boolean z3, RandomAccessFile randomAccessFile) {
        this.f3117J = z3;
        this.f3121N = randomAccessFile;
    }

    public static c b(h hVar) {
        if (hVar.f3117J) {
            ReentrantLock reentrantLock = hVar.f3120M;
            reentrantLock.lock();
            try {
                if (!hVar.f3118K) {
                    hVar.f3119L++;
                    reentrantLock.unlock();
                    return new c(hVar, 0L);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    public final void a() {
        if (this.f3117J) {
            ReentrantLock reentrantLock = this.f3120M;
            reentrantLock.lock();
            try {
                if (!this.f3118K) {
                    synchronized (this) {
                        this.f3121N.getFD().sync();
                    }
                    return;
                }
                throw new IllegalStateException("closed");
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f3120M;
        reentrantLock.lock();
        try {
            if (this.f3118K) {
                return;
            }
            this.f3118K = true;
            if (this.f3119L != 0) {
                return;
            }
            synchronized (this) {
                this.f3121N.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long f() {
        long length;
        ReentrantLock reentrantLock = this.f3120M;
        reentrantLock.lock();
        try {
            if (!this.f3118K) {
                synchronized (this) {
                    length = this.f3121N.length();
                }
                return length;
            }
            throw new IllegalStateException("closed");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final d h(long j3) {
        ReentrantLock reentrantLock = this.f3120M;
        reentrantLock.lock();
        try {
            if (!this.f3118K) {
                this.f3119L++;
                reentrantLock.unlock();
                return new d(this, j3);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
