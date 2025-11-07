package e3;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d implements t {

    /* renamed from: J  reason: collision with root package name */
    public final h f3106J;

    /* renamed from: K  reason: collision with root package name */
    public long f3107K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f3108L;

    public d(h hVar, long j3) {
        N2.g.e(hVar, "fileHandle");
        this.f3106J = hVar;
        this.f3107K = j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3108L) {
            return;
        }
        this.f3108L = true;
        h hVar = this.f3106J;
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

    @Override // e3.t
    public final long d(a aVar, long j3) {
        long j4;
        long j5;
        int r9;
        N2.g.e(aVar, "sink");
        if (!this.f3108L) {
            h hVar = this.f3106J;
            long j6 = this.f3107K;
            hVar.getClass();
            if (j3 >= 0) {
                long j7 = j3 + j6;
                long j8 = j6;
                while (true) {
                    if (j8 >= j7) {
                        break;
                    }
                    q o3 = aVar.o(1);
                    byte[] bArr = o3.f3133a;
                    int r13 = o3.f3135c;
                    int min = (int) Math.min(j7 - j8, 8192 - r13);
                    synchronized (hVar) {
                        N2.g.e(bArr, "array");
                        hVar.f3121N.seek(j8);
                        r9 = 0;
                        while (true) {
                            if (r9 >= min) {
                                break;
                            }
                            int read = hVar.f3121N.read(bArr, r13, min - r9);
                            if (read == -1) {
                                if (r9 == 0) {
                                    r9 = -1;
                                }
                            } else {
                                r9 += read;
                            }
                        }
                    }
                    if (r9 == -1) {
                        if (o3.f3134b == o3.f3135c) {
                            aVar.f3097J = o3.a();
                            r.a(o3);
                        }
                        if (j6 == j8) {
                            j5 = -1;
                            j4 = -1;
                        }
                    } else {
                        o3.f3135c += r9;
                        long j9 = r9;
                        j8 += j9;
                        aVar.f3098K += j9;
                    }
                }
                j4 = j8 - j6;
                j5 = -1;
                if (j4 != j5) {
                    this.f3107K += j4;
                }
                return j4;
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        throw new IllegalStateException("closed");
    }
}
