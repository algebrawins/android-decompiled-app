package e3;

import D.C;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import x1.AbstractC0632j4;

/* loaded from: classes.dex */
public final class a implements t, ReadableByteChannel, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {

    /* renamed from: J  reason: collision with root package name */
    public q f3097J;

    /* renamed from: K  reason: collision with root package name */
    public long f3098K;

    public final byte a(long j3) {
        AbstractC0632j4.b(this.f3098K, j3, 1L);
        q qVar = this.f3097J;
        if (qVar != null) {
            long j4 = this.f3098K;
            if (j4 - j3 < j3) {
                while (j4 > j3) {
                    qVar = qVar.g;
                    N2.g.b(qVar);
                    j4 -= qVar.f3135c - qVar.f3134b;
                }
                return qVar.f3133a[(int) ((qVar.f3134b + j3) - j4)];
            }
            long j5 = 0;
            while (true) {
                int r3 = qVar.f3135c;
                int r4 = qVar.f3134b;
                long j6 = (r3 - r4) + j5;
                if (j6 <= j3) {
                    qVar = qVar.f3138f;
                    N2.g.b(qVar);
                    j5 = j6;
                } else {
                    return qVar.f3133a[(int) ((r4 + j3) - j5)];
                }
            }
        } else {
            N2.g.b(null);
            throw null;
        }
    }

    public final long b(b bVar) {
        int r5;
        int r14;
        N2.g.e(bVar, "targetBytes");
        q qVar = this.f3097J;
        if (qVar == null) {
            return -1L;
        }
        long j3 = this.f3098K;
        byte[] bArr = bVar.f3100J;
        long j4 = 0;
        if (j3 < 0) {
            while (j3 > 0) {
                qVar = qVar.g;
                N2.g.b(qVar);
                j3 -= qVar.f3135c - qVar.f3134b;
            }
            if (bArr.length == 2) {
                byte b3 = bArr[0];
                byte b4 = bArr[1];
                while (j3 < this.f3098K) {
                    r5 = (int) ((qVar.f3134b + j4) - j3);
                    int r6 = qVar.f3135c;
                    while (r5 < r6) {
                        byte b5 = qVar.f3133a[r5];
                        if (b5 != b3 && b5 != b4) {
                            r5++;
                        }
                        r14 = qVar.f3134b;
                    }
                    j4 = j3 + (qVar.f3135c - qVar.f3134b);
                    qVar = qVar.f3138f;
                    N2.g.b(qVar);
                    j3 = j4;
                }
                return -1L;
            }
            while (j3 < this.f3098K) {
                r5 = (int) ((qVar.f3134b + j4) - j3);
                int r62 = qVar.f3135c;
                while (r5 < r62) {
                    byte b6 = qVar.f3133a[r5];
                    for (byte b7 : bArr) {
                        if (b6 == b7) {
                            r14 = qVar.f3134b;
                        }
                    }
                    r5++;
                }
                j4 = j3 + (qVar.f3135c - qVar.f3134b);
                qVar = qVar.f3138f;
                N2.g.b(qVar);
                j3 = j4;
            }
            return -1L;
        }
        j3 = 0;
        while (true) {
            long j5 = (qVar.f3135c - qVar.f3134b) + j3;
            if (j5 > 0) {
                break;
            }
            qVar = qVar.f3138f;
            N2.g.b(qVar);
            j3 = j5;
        }
        if (bArr.length == 2) {
            byte b8 = bArr[0];
            byte b9 = bArr[1];
            while (j3 < this.f3098K) {
                r5 = (int) ((qVar.f3134b + j4) - j3);
                int r63 = qVar.f3135c;
                while (r5 < r63) {
                    byte b10 = qVar.f3133a[r5];
                    if (b10 != b8 && b10 != b9) {
                        r5++;
                    }
                    r14 = qVar.f3134b;
                }
                j4 = j3 + (qVar.f3135c - qVar.f3134b);
                qVar = qVar.f3138f;
                N2.g.b(qVar);
                j3 = j4;
            }
            return -1L;
        }
        while (j3 < this.f3098K) {
            r5 = (int) ((qVar.f3134b + j4) - j3);
            int r64 = qVar.f3135c;
            while (r5 < r64) {
                byte b11 = qVar.f3133a[r5];
                for (byte b12 : bArr) {
                    if (b11 == b12) {
                        r14 = qVar.f3134b;
                    }
                }
                r5++;
            }
            j4 = j3 + (qVar.f3135c - qVar.f3134b);
            qVar = qVar.f3138f;
            N2.g.b(qVar);
            j3 = j4;
        }
        return -1L;
        return (r5 - r14) + j3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e3.a] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.f3098K != 0) {
            q qVar = this.f3097J;
            N2.g.b(qVar);
            q c4 = qVar.c();
            obj.f3097J = c4;
            c4.g = c4;
            c4.f3138f = c4;
            for (q qVar2 = qVar.f3138f; qVar2 != qVar; qVar2 = qVar2.f3138f) {
                q qVar3 = c4.g;
                N2.g.b(qVar3);
                N2.g.b(qVar2);
                qVar3.b(qVar2.c());
            }
            obj.f3098K = this.f3098K;
        }
        return obj;
    }

    @Override // e3.t
    public final long d(a aVar, long j3) {
        N2.g.e(aVar, "sink");
        if (j3 >= 0) {
            long j4 = this.f3098K;
            if (j4 == 0) {
                return -1L;
            }
            if (j3 > j4) {
                j3 = j4;
            }
            aVar.p(this, j3);
            return j3;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                long j3 = this.f3098K;
                a aVar = (a) obj;
                if (j3 == aVar.f3098K) {
                    if (j3 != 0) {
                        q qVar = this.f3097J;
                        N2.g.b(qVar);
                        q qVar2 = aVar.f3097J;
                        N2.g.b(qVar2);
                        int r5 = qVar.f3134b;
                        int r6 = qVar2.f3134b;
                        long j4 = 0;
                        while (j4 < this.f3098K) {
                            long min = Math.min(qVar.f3135c - r5, qVar2.f3135c - r6);
                            long j5 = 0;
                            while (j5 < min) {
                                int r15 = r5 + 1;
                                byte b3 = qVar.f3133a[r5];
                                int r52 = r6 + 1;
                                if (b3 == qVar2.f3133a[r6]) {
                                    j5++;
                                    r6 = r52;
                                    r5 = r15;
                                }
                            }
                            if (r5 == qVar.f3135c) {
                                q qVar3 = qVar.f3138f;
                                N2.g.b(qVar3);
                                r5 = qVar3.f3134b;
                                qVar = qVar3;
                            }
                            if (r6 == qVar2.f3135c) {
                                qVar2 = qVar2.f3138f;
                                N2.g.b(qVar2);
                                r6 = qVar2.f3134b;
                            }
                            j4 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(b bVar) {
        N2.g.e(bVar, "bytes");
        byte[] bArr = bVar.f3100J;
        int length = bArr.length;
        if (length < 0 || this.f3098K < length || bArr.length < length) {
            return false;
        }
        for (int r22 = 0; r22 < length; r22++) {
            if (a(r22) != bArr[r22]) {
                return false;
            }
        }
        return true;
    }

    public final byte h() {
        if (this.f3098K != 0) {
            q qVar = this.f3097J;
            N2.g.b(qVar);
            int r12 = qVar.f3134b;
            int r22 = qVar.f3135c;
            int r3 = r12 + 1;
            byte b3 = qVar.f3133a[r12];
            this.f3098K--;
            if (r3 == r22) {
                this.f3097J = qVar.a();
                r.a(qVar);
            } else {
                qVar.f3134b = r3;
            }
            return b3;
        }
        throw new EOFException();
    }

    public final int hashCode() {
        q qVar = this.f3097J;
        if (qVar == null) {
            return 0;
        }
        int r12 = 1;
        do {
            int r3 = qVar.f3135c;
            for (int r22 = qVar.f3134b; r22 < r3; r22++) {
                r12 = (r12 * 31) + qVar.f3133a[r22];
            }
            qVar = qVar.f3138f;
            N2.g.b(qVar);
        } while (qVar != this.f3097J);
        return r12;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] j(long j3) {
        if (j3 >= 0 && j3 <= 2147483647L) {
            if (this.f3098K >= j3) {
                int r5 = (int) j3;
                byte[] bArr = new byte[r5];
                int r02 = 0;
                while (r02 < r5) {
                    int read = read(bArr, r02, r5 - r02);
                    if (read != -1) {
                        r02 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j3).toString());
    }

    public final b k(long j3) {
        if (j3 >= 0 && j3 <= 2147483647L) {
            if (this.f3098K >= j3) {
                if (j3 >= 4096) {
                    b n3 = n((int) j3);
                    m(j3);
                    return n3;
                }
                return new b(j(j3));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j3).toString());
    }

    public final int l() {
        if (this.f3098K >= 4) {
            q qVar = this.f3097J;
            N2.g.b(qVar);
            int r12 = qVar.f3134b;
            int r4 = qVar.f3135c;
            if (r4 - r12 < 4) {
                return ((h() & 255) << 24) | ((h() & 255) << 16) | ((h() & 255) << 8) | (h() & 255);
            }
            byte[] bArr = qVar.f3133a;
            int r5 = ((bArr[r12 + 1] & 255) << 16) | ((bArr[r12] & 255) << 24);
            int r7 = r12 + 3;
            int r13 = r12 + 4;
            int r52 = r5 | ((bArr[r12 + 2] & 255) << 8) | (bArr[r7] & 255);
            this.f3098K -= 4;
            if (r13 == r4) {
                this.f3097J = qVar.a();
                r.a(qVar);
            } else {
                qVar.f3134b = r13;
            }
            return r52;
        }
        throw new EOFException();
    }

    public final void m(long j3) {
        while (j3 > 0) {
            q qVar = this.f3097J;
            if (qVar != null) {
                int min = (int) Math.min(j3, qVar.f3135c - qVar.f3134b);
                long j4 = min;
                this.f3098K -= j4;
                j3 -= j4;
                int r12 = qVar.f3134b + min;
                qVar.f3134b = r12;
                if (r12 == qVar.f3135c) {
                    this.f3097J = qVar.a();
                    r.a(qVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final b n(int r9) {
        if (r9 == 0) {
            return b.f3099M;
        }
        AbstractC0632j4.b(this.f3098K, 0L, r9);
        q qVar = this.f3097J;
        int r12 = 0;
        int r22 = 0;
        int r3 = 0;
        while (r22 < r9) {
            N2.g.b(qVar);
            int r4 = qVar.f3135c;
            int r5 = qVar.f3134b;
            if (r4 != r5) {
                r22 += r4 - r5;
                r3++;
                qVar = qVar.f3138f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[r3];
        int[] r23 = new int[r3 * 2];
        q qVar2 = this.f3097J;
        int r42 = 0;
        while (r12 < r9) {
            N2.g.b(qVar2);
            bArr[r42] = qVar2.f3133a;
            r12 += qVar2.f3135c - qVar2.f3134b;
            r23[r42] = Math.min(r12, r9);
            r23[r42 + r3] = qVar2.f3134b;
            qVar2.f3136d = true;
            r42++;
            qVar2 = qVar2.f3138f;
        }
        return new s(bArr, r23);
    }

    public final q o(int r4) {
        if (r4 >= 1 && r4 <= 8192) {
            q qVar = this.f3097J;
            if (qVar == null) {
                q b3 = r.b();
                this.f3097J = b3;
                b3.g = b3;
                b3.f3138f = b3;
                return b3;
            }
            q qVar2 = qVar.g;
            N2.g.b(qVar2);
            if (qVar2.f3135c + r4 <= 8192 && qVar2.f3137e) {
                return qVar2;
            }
            q b4 = r.b();
            qVar2.b(b4);
            return b4;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    public final void p(a aVar, long j3) {
        q qVar;
        q qVar2;
        q b3;
        int r12;
        N2.g.e(aVar, "source");
        if (aVar != this) {
            AbstractC0632j4.b(aVar.f3098K, 0L, j3);
            while (j3 > 0) {
                q qVar3 = aVar.f3097J;
                N2.g.b(qVar3);
                int r02 = qVar3.f3135c;
                N2.g.b(aVar.f3097J);
                int r22 = 0;
                if (j3 < r02 - qVar.f3134b) {
                    q qVar4 = this.f3097J;
                    if (qVar4 != null) {
                        qVar2 = qVar4.g;
                    } else {
                        qVar2 = null;
                    }
                    if (qVar2 != null && qVar2.f3137e) {
                        long j4 = qVar2.f3135c + j3;
                        if (qVar2.f3136d) {
                            r12 = 0;
                        } else {
                            r12 = qVar2.f3134b;
                        }
                        if (j4 - r12 <= 8192) {
                            q qVar5 = aVar.f3097J;
                            N2.g.b(qVar5);
                            qVar5.d(qVar2, (int) j3);
                            aVar.f3098K -= j3;
                            this.f3098K += j3;
                            return;
                        }
                    }
                    q qVar6 = aVar.f3097J;
                    N2.g.b(qVar6);
                    int r13 = (int) j3;
                    if (r13 > 0 && r13 <= qVar6.f3135c - qVar6.f3134b) {
                        if (r13 >= 1024) {
                            b3 = qVar6.c();
                        } else {
                            b3 = r.b();
                            int r4 = qVar6.f3134b;
                            C2.h.a(0, r4, r4 + r13, qVar6.f3133a, b3.f3133a);
                        }
                        b3.f3135c = b3.f3134b + r13;
                        qVar6.f3134b += r13;
                        q qVar7 = qVar6.g;
                        N2.g.b(qVar7);
                        qVar7.b(b3);
                        aVar.f3097J = b3;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                q qVar8 = aVar.f3097J;
                N2.g.b(qVar8);
                long j5 = qVar8.f3135c - qVar8.f3134b;
                aVar.f3097J = qVar8.a();
                q qVar9 = this.f3097J;
                if (qVar9 == null) {
                    this.f3097J = qVar8;
                    qVar8.g = qVar8;
                    qVar8.f3138f = qVar8;
                } else {
                    q qVar10 = qVar9.g;
                    N2.g.b(qVar10);
                    qVar10.b(qVar8);
                    q qVar11 = qVar8.g;
                    if (qVar11 != qVar8) {
                        N2.g.b(qVar11);
                        if (qVar11.f3137e) {
                            int r14 = qVar8.f3135c - qVar8.f3134b;
                            q qVar12 = qVar8.g;
                            N2.g.b(qVar12);
                            int r5 = 8192 - qVar12.f3135c;
                            q qVar13 = qVar8.g;
                            N2.g.b(qVar13);
                            if (!qVar13.f3136d) {
                                q qVar14 = qVar8.g;
                                N2.g.b(qVar14);
                                r22 = qVar14.f3134b;
                            }
                            if (r14 <= r5 + r22) {
                                q qVar15 = qVar8.g;
                                N2.g.b(qVar15);
                                qVar8.d(qVar15, r14);
                                qVar8.a();
                                r.a(qVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                aVar.f3098K -= j5;
                this.f3098K += j5;
                j3 -= j5;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final void q(b bVar) {
        N2.g.e(bVar, "byteString");
        bVar.o(this, bVar.b());
    }

    public final void r(byte[] bArr, int r11, int r12) {
        N2.g.e(bArr, "source");
        long j3 = r12;
        AbstractC0632j4.b(bArr.length, r11, j3);
        int r122 = r12 + r11;
        while (r11 < r122) {
            q o3 = o(1);
            int min = Math.min(r122 - r11, 8192 - o3.f3135c);
            int r3 = r11 + min;
            C2.h.a(o3.f3135c, r11, r3, bArr, o3.f3133a);
            o3.f3135c += min;
            r11 = r3;
        }
        this.f3098K += j3;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        N2.g.e(byteBuffer, "sink");
        q qVar = this.f3097J;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f3135c - qVar.f3134b);
        byteBuffer.put(qVar.f3133a, qVar.f3134b, min);
        int r7 = qVar.f3134b + min;
        qVar.f3134b = r7;
        this.f3098K -= min;
        if (r7 == qVar.f3135c) {
            this.f3097J = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final void s(int r5) {
        q o3 = o(1);
        int r12 = o3.f3135c;
        o3.f3135c = r12 + 1;
        o3.f3133a[r12] = (byte) r5;
        this.f3098K++;
    }

    public final void t(String str) {
        char charAt;
        char c4;
        N2.g.e(str, "string");
        int length = str.length();
        if (length >= 0) {
            if (length <= str.length()) {
                int r22 = 0;
                while (r22 < length) {
                    char charAt2 = str.charAt(r22);
                    if (charAt2 < 128) {
                        q o3 = o(1);
                        int r6 = o3.f3135c - r22;
                        int min = Math.min(length, 8192 - r6);
                        int r8 = r22 + 1;
                        byte[] bArr = o3.f3133a;
                        bArr[r22 + r6] = (byte) charAt2;
                        while (true) {
                            r22 = r8;
                            if (r22 >= min || (charAt = str.charAt(r22)) >= 128) {
                                break;
                            }
                            r8 = r22 + 1;
                            bArr[r22 + r6] = (byte) charAt;
                        }
                        int r3 = o3.f3135c;
                        int r62 = (r6 + r22) - r3;
                        o3.f3135c = r3 + r62;
                        this.f3098K += r62;
                    } else {
                        if (charAt2 < 2048) {
                            q o4 = o(2);
                            int r7 = o4.f3135c;
                            byte[] bArr2 = o4.f3133a;
                            bArr2[r7] = (byte) ((charAt2 >> 6) | 192);
                            bArr2[r7 + 1] = (byte) ((charAt2 & '?') | RecognitionOptions.ITF);
                            o4.f3135c = r7 + 2;
                            this.f3098K += 2;
                        } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                            int r5 = r22 + 1;
                            if (r5 < length) {
                                c4 = str.charAt(r5);
                            } else {
                                c4 = 0;
                            }
                            if (charAt2 <= 56319 && 56320 <= c4 && c4 < 57344) {
                                int r32 = (((charAt2 & 1023) << 10) | (c4 & 1023)) + 65536;
                                q o5 = o(4);
                                int r82 = o5.f3135c;
                                byte[] bArr3 = o5.f3133a;
                                bArr3[r82] = (byte) ((r32 >> 18) | 240);
                                bArr3[r82 + 1] = (byte) (((r32 >> 12) & 63) | RecognitionOptions.ITF);
                                bArr3[r82 + 2] = (byte) (((r32 >> 6) & 63) | RecognitionOptions.ITF);
                                bArr3[r82 + 3] = (byte) ((r32 & 63) | RecognitionOptions.ITF);
                                o5.f3135c = r82 + 4;
                                this.f3098K += 4;
                                r22 += 2;
                            } else {
                                s(63);
                                r22 = r5;
                            }
                        } else {
                            q o6 = o(3);
                            int r83 = o6.f3135c;
                            byte[] bArr4 = o6.f3133a;
                            bArr4[r83] = (byte) ((charAt2 >> '\f') | 224);
                            bArr4[r83 + 1] = (byte) ((63 & (charAt2 >> 6)) | RecognitionOptions.ITF);
                            bArr4[r83 + 2] = (byte) ((charAt2 & '?') | RecognitionOptions.ITF);
                            o6.f3135c = r83 + 3;
                            this.f3098K += 3;
                        }
                        r22++;
                    }
                }
                return;
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + length + " > " + str.length()).toString());
        }
        throw new IllegalArgumentException(C.v(length, "endIndex < beginIndex: ", " < 0").toString());
    }

    public final String toString() {
        long j3 = this.f3098K;
        if (j3 <= 2147483647L) {
            return n((int) j3).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f3098K).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        N2.g.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int r12 = remaining;
        while (r12 > 0) {
            q o3 = o(1);
            int min = Math.min(r12, 8192 - o3.f3135c);
            byteBuffer.get(o3.f3133a, o3.f3135c, min);
            r12 -= min;
            o3.f3135c += min;
        }
        this.f3098K += remaining;
        return remaining;
    }

    public final int read(byte[] bArr, int r9, int r10) {
        N2.g.e(bArr, "sink");
        AbstractC0632j4.b(bArr.length, r9, r10);
        q qVar = this.f3097J;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(r10, qVar.f3135c - qVar.f3134b);
        int r12 = qVar.f3134b;
        C2.h.a(r9, r12, r12 + min, qVar.f3133a, bArr);
        int r8 = qVar.f3134b + min;
        qVar.f3134b = r8;
        this.f3098K -= min;
        if (r8 == qVar.f3135c) {
            this.f3097J = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
