package s0;

import D.C;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: s0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0449b extends InputStream implements DataInput {

    /* renamed from: J  reason: collision with root package name */
    public final DataInputStream f4901J;

    /* renamed from: K  reason: collision with root package name */
    public int f4902K;

    /* renamed from: L  reason: collision with root package name */
    public ByteOrder f4903L;

    /* renamed from: M  reason: collision with root package name */
    public byte[] f4904M;

    /* renamed from: N  reason: collision with root package name */
    public final int f4905N;

    public C0449b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f4905N = bArr.length;
    }

    public final void a(int r7) {
        int r12 = 0;
        while (r12 < r7) {
            DataInputStream dataInputStream = this.f4901J;
            int r3 = r7 - r12;
            int skip = (int) dataInputStream.skip(r3);
            if (skip <= 0) {
                if (this.f4904M == null) {
                    this.f4904M = new byte[8192];
                }
                skip = dataInputStream.read(this.f4904M, 0, Math.min(8192, r3));
                if (skip == -1) {
                    throw new EOFException(C.v(r7, "Reached EOF while skipping ", " bytes."));
                }
            }
            r12 += skip;
        }
        this.f4902K += r12;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4901J.available();
    }

    @Override // java.io.InputStream
    public final void mark(int r22) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f4902K++;
        return this.f4901J.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f4902K++;
        return this.f4901J.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f4902K++;
        int read = this.f4901J.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f4902K += 2;
        return this.f4901J.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int r3, int r4) {
        this.f4902K += r4;
        this.f4901J.readFully(bArr, r3, r4);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f4902K += 4;
        DataInputStream dataInputStream = this.f4901J;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f4903L;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f4903L);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f4902K += 8;
        DataInputStream dataInputStream = this.f4901J;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f4903L;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f4903L);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f4902K += 2;
        DataInputStream dataInputStream = this.f4901J;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f4903L;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f4903L);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f4902K += 2;
        return this.f4901J.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f4902K++;
        return this.f4901J.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f4902K += 2;
        DataInputStream dataInputStream = this.f4901J;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f4903L;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f4903L);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int r22) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C0449b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int r3, int r4) {
        int read = this.f4901J.read(bArr, r3, r4);
        this.f4902K += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f4902K += bArr.length;
        this.f4901J.readFully(bArr);
    }

    public C0449b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f4901J = dataInputStream;
        dataInputStream.mark(0);
        this.f4902K = 0;
        this.f4903L = byteOrder;
        this.f4905N = inputStream instanceof C0449b ? ((C0449b) inputStream).f4905N : -1;
    }
}
