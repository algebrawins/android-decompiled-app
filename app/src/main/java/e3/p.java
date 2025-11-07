package e3;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class p implements t, ReadableByteChannel {

    /* renamed from: J  reason: collision with root package name */
    public final t f3130J;

    /* renamed from: K  reason: collision with root package name */
    public final a f3131K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f3132L;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, e3.a] */
    public p(t tVar) {
        N2.g.e(tVar, "source");
        this.f3130J = tVar;
        this.f3131K = new Object();
    }

    public final int a() {
        j(4L);
        int l3 = this.f3131K.l();
        return ((l3 & 255) << 24) | (((-16777216) & l3) >>> 24) | ((16711680 & l3) >>> 8) | ((65280 & l3) << 8);
    }

    public final long b() {
        long j3;
        j(8L);
        a aVar = this.f3131K;
        if (aVar.f3098K >= 8) {
            q qVar = aVar.f3097J;
            N2.g.b(qVar);
            int r3 = qVar.f3134b;
            int r6 = qVar.f3135c;
            if (r6 - r3 < 8) {
                j3 = ((aVar.l() & 4294967295L) << 32) | (4294967295L & aVar.l());
            } else {
                byte[] bArr = qVar.f3133a;
                long j4 = ((bArr[r3] & 255) << 56) | ((bArr[r3 + 1] & 255) << 48) | ((bArr[r3 + 2] & 255) << 40);
                int r7 = r3 + 7;
                int r32 = r3 + 8;
                long j5 = j4 | ((bArr[r3 + 3] & 255) << 32) | ((bArr[r3 + 4] & 255) << 24) | ((bArr[r3 + 5] & 255) << 16) | ((bArr[r3 + 6] & 255) << 8) | (bArr[r7] & 255);
                aVar.f3098K -= 8;
                if (r32 == r6) {
                    aVar.f3097J = qVar.a();
                    r.a(qVar);
                } else {
                    qVar.f3134b = r32;
                }
                j3 = j5;
            }
            return ((j3 & 255) << 56) | (((-72057594037927936L) & j3) >>> 56) | ((71776119061217280L & j3) >>> 40) | ((280375465082880L & j3) >>> 24) | ((1095216660480L & j3) >>> 8) | ((4278190080L & j3) << 8) | ((16711680 & j3) << 24) | ((65280 & j3) << 40);
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f3132L) {
            this.f3132L = true;
            this.f3130J.close();
            a aVar = this.f3131K;
            aVar.m(aVar.f3098K);
        }
    }

    @Override // e3.t
    public final long d(a aVar, long j3) {
        N2.g.e(aVar, "sink");
        if (j3 >= 0) {
            if (!this.f3132L) {
                a aVar2 = this.f3131K;
                if (aVar2.f3098K == 0 && this.f3130J.d(aVar2, 8192L) == -1) {
                    return -1L;
                }
                return aVar2.d(aVar, Math.min(j3, aVar2.f3098K));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
    }

    public final short f() {
        short s3;
        j(2L);
        a aVar = this.f3131K;
        if (aVar.f3098K >= 2) {
            q qVar = aVar.f3097J;
            N2.g.b(qVar);
            int r22 = qVar.f3134b;
            int r5 = qVar.f3135c;
            if (r5 - r22 < 2) {
                s3 = (short) ((aVar.h() & 255) | ((aVar.h() & 255) << 8));
            } else {
                int r6 = r22 + 1;
                byte[] bArr = qVar.f3133a;
                int r23 = r22 + 2;
                int r62 = (bArr[r6] & 255) | ((bArr[r22] & 255) << 8);
                aVar.f3098K -= 2;
                if (r23 == r5) {
                    aVar.f3097J = qVar.a();
                    r.a(qVar);
                } else {
                    qVar.f3134b = r23;
                }
                s3 = (short) r62;
            }
            return (short) (((s3 & 255) << 8) | ((65280 & s3) >>> 8));
        }
        throw new EOFException();
    }

    public final String h(long j3) {
        j(j3);
        a aVar = this.f3131K;
        aVar.getClass();
        Charset charset = U2.a.f1346a;
        N2.g.e(charset, "charset");
        int r4 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (r4 >= 0 && j3 <= 2147483647L) {
            if (aVar.f3098K >= j3) {
                if (r4 == 0) {
                    return "";
                }
                q qVar = aVar.f3097J;
                N2.g.b(qVar);
                int r3 = qVar.f3134b;
                if (r3 + j3 > qVar.f3135c) {
                    return new String(aVar.j(j3), charset);
                }
                int r5 = (int) j3;
                String str = new String(qVar.f3133a, r3, r5, charset);
                int r12 = qVar.f3134b + r5;
                qVar.f3134b = r12;
                aVar.f3098K -= j3;
                if (r12 == qVar.f3135c) {
                    aVar.f3097J = qVar.a();
                    r.a(qVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j3).toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f3132L;
    }

    public final void j(long j3) {
        a aVar;
        if (j3 >= 0) {
            if (!this.f3132L) {
                do {
                    aVar = this.f3131K;
                    if (aVar.f3098K >= j3) {
                        return;
                    }
                } while (this.f3130J.d(aVar, 8192L) != -1);
                throw new EOFException();
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
    }

    public final void k(long j3) {
        if (!this.f3132L) {
            while (j3 > 0) {
                a aVar = this.f3131K;
                if (aVar.f3098K == 0 && this.f3130J.d(aVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j3, aVar.f3098K);
                aVar.m(min);
                j3 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        N2.g.e(byteBuffer, "sink");
        a aVar = this.f3131K;
        if (aVar.f3098K == 0 && this.f3130J.d(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f3130J + ')';
    }
}
