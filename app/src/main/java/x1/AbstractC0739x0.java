package x1;

/* renamed from: x1.x0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0739x0 {
    public static boolean a(Y.d[] dVarArr, Y.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int r12 = 0; r12 < dVarArr.length; r12++) {
            Y.d dVar = dVarArr[r12];
            char c4 = dVar.f1641a;
            Y.d dVar2 = dVarArr2[r12];
            if (c4 != dVar2.f1641a || dVar.f1642b.length != dVar2.f1642b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int r3) {
        if (r3 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(r3, length);
                float[] fArr2 = new float[r3];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[Catch: NumberFormatException -> 0x00ac, LOOP:3: B:25:0x006a->B:44:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Y.d[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.AbstractC0739x0.c(java.lang.String):Y.d[]");
    }

    public static Y.d[] d(Y.d[] dVarArr) {
        Y.d[] dVarArr2 = new Y.d[dVarArr.length];
        for (int r12 = 0; r12 < dVarArr.length; r12++) {
            dVarArr2[r12] = new Y.d(dVarArr[r12]);
        }
        return dVarArr2;
    }
}
