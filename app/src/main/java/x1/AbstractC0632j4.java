package x1;

/* renamed from: x1.j4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0632j4 {
    public static final boolean a(int r4, int r5, int r6, byte[] bArr, byte[] bArr2) {
        N2.g.e(bArr, "a");
        N2.g.e(bArr2, "b");
        for (int r12 = 0; r12 < r6; r12++) {
            if (bArr[r12 + r4] != bArr2[r12 + r5]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j3, long j4, long j5) {
        if ((j4 | j5) >= 0 && j4 <= j3 && j3 - j4 >= j5) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j3 + " offset=" + j4 + " byteCount=" + j5);
    }
}
