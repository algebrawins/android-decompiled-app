package x1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class O extends OutputStream {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5686J;

    /* renamed from: K  reason: collision with root package name */
    public long f5687K;

    @Override // java.io.OutputStream
    public final void write(int r5) {
        switch (this.f5686J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f5687K++;
                return;
            default:
                this.f5687K++;
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f5686J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f5687K += bArr.length;
                return;
            default:
                this.f5687K += bArr.length;
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int r4, int r5) {
        int length;
        int r42;
        int length2;
        int r43;
        switch (this.f5686J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (r4 >= 0 && r4 <= (length = bArr.length) && r5 >= 0 && (r42 = r4 + r5) <= length && r42 >= 0) {
                    this.f5687K += r5;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (r4 >= 0 && r4 <= (length2 = bArr.length) && r5 >= 0 && (r43 = r4 + r5) <= length2 && r43 >= 0) {
                    this.f5687K += r5;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
