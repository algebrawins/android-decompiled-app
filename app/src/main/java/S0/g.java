package s0;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class g extends C0449b {
    public g(byte[] bArr) {
        super(bArr);
        this.f4901J.mark(Integer.MAX_VALUE);
    }

    public final void b(long j3) {
        int r02 = this.f4902K;
        if (r02 > j3) {
            this.f4902K = 0;
            this.f4901J.reset();
        } else {
            j3 -= r02;
        }
        a((int) j3);
    }

    public g(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f4901J.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
