package R;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1119a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Object[] f1120b = new Object[0];

    public static int a(int r3, int r4, int[] r5) {
        int r32 = r3 - 1;
        int r02 = 0;
        while (r02 <= r32) {
            int r12 = (r02 + r32) >>> 1;
            int r22 = r5[r12];
            if (r22 < r4) {
                r02 = r12 + 1;
            } else if (r22 > r4) {
                r32 = r12 - 1;
            } else {
                return r12;
            }
        }
        return ~r02;
    }

    public static int b(long[] jArr, int r6, long j3) {
        int r62 = r6 - 1;
        int r02 = 0;
        while (r02 <= r62) {
            int r12 = (r02 + r62) >>> 1;
            int r4 = (jArr[r12] > j3 ? 1 : (jArr[r12] == j3 ? 0 : -1));
            if (r4 < 0) {
                r02 = r12 + 1;
            } else if (r4 > 0) {
                r62 = r12 - 1;
            } else {
                return r12;
            }
        }
        return ~r02;
    }
}
