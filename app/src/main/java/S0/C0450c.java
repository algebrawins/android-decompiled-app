package s0;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: s0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450c extends FilterOutputStream {

    /* renamed from: J  reason: collision with root package name */
    public final OutputStream f4906J;

    /* renamed from: K  reason: collision with root package name */
    public ByteOrder f4907K;

    public C0450c(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f4906J = outputStream;
        this.f4907K = byteOrder;
    }

    public final void a(int r22) {
        this.f4906J.write(r22);
    }

    public final void b(int r4) {
        ByteOrder byteOrder = this.f4907K;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f4906J;
        if (byteOrder == byteOrder2) {
            outputStream.write(r4 & 255);
            outputStream.write((r4 >>> 8) & 255);
            outputStream.write((r4 >>> 16) & 255);
            outputStream.write((r4 >>> 24) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((r4 >>> 24) & 255);
            outputStream.write((r4 >>> 16) & 255);
            outputStream.write((r4 >>> 8) & 255);
            outputStream.write(r4 & 255);
        }
    }

    public final void f(short s3) {
        ByteOrder byteOrder = this.f4907K;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f4906J;
        if (byteOrder == byteOrder2) {
            outputStream.write(s3 & 255);
            outputStream.write((s3 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s3 >>> 8) & 255);
            outputStream.write(s3 & 255);
        }
    }

    public final void h(long j3) {
        if (j3 <= 4294967295L) {
            b((int) j3);
            return;
        }
        throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
    }

    public final void j(int r22) {
        if (r22 <= 65535) {
            f((short) r22);
            return;
        }
        throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f4906J.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int r3, int r4) {
        this.f4906J.write(bArr, r3, r4);
    }
}
