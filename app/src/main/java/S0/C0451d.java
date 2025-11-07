package s0;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: s0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451d {

    /* renamed from: a  reason: collision with root package name */
    public final int f4908a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4909b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4910c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f4911d;

    public C0451d(byte[] bArr, int r8, int r9) {
        this(-1L, bArr, r8, r9);
    }

    public static C0451d a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(h.f4943Z);
        return new C0451d(bytes, 2, bytes.length);
    }

    public static C0451d b(long j3, ByteOrder byteOrder) {
        return c(new long[]{j3}, byteOrder);
    }

    public static C0451d c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[h.f4934Q[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j3 : jArr) {
            wrap.putInt((int) j3);
        }
        return new C0451d(wrap.array(), 4, jArr.length);
    }

    public static C0451d d(f[] fVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[h.f4934Q[5] * fVarArr.length]);
        wrap.order(byteOrder);
        for (f fVar : fVarArr) {
            wrap.putInt((int) fVar.f4916a);
            wrap.putInt((int) fVar.f4917b);
        }
        return new C0451d(wrap.array(), 5, fVarArr.length);
    }

    public static C0451d e(int r02, ByteOrder byteOrder) {
        return f(new int[]{r02}, byteOrder);
    }

    public static C0451d f(int[] r4, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[h.f4934Q[3] * r4.length]);
        wrap.order(byteOrder);
        for (int r3 : r4) {
            wrap.putShort((short) r3);
        }
        return new C0451d(wrap.array(), 3, r4.length);
    }

    public final double g(ByteOrder byteOrder) {
        Serializable j3 = j(byteOrder);
        if (j3 != null) {
            if (j3 instanceof String) {
                return Double.parseDouble((String) j3);
            }
            if (j3 instanceof long[]) {
                long[] jArr = (long[]) j3;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j3 instanceof int[]) {
                int[] r5 = (int[]) j3;
                if (r5.length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j3 instanceof double[]) {
                double[] dArr = (double[]) j3;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j3 instanceof f[]) {
                f[] fVarArr = (f[]) j3;
                if (fVarArr.length == 1) {
                    f fVar = fVarArr[0];
                    return fVar.f4916a / fVar.f4917b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int h(ByteOrder byteOrder) {
        Serializable j3 = j(byteOrder);
        if (j3 != null) {
            if (j3 instanceof String) {
                return Integer.parseInt((String) j3);
            }
            if (j3 instanceof long[]) {
                long[] jArr = (long[]) j3;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (j3 instanceof int[]) {
                int[] r5 = (int[]) j3;
                if (r5.length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String i(ByteOrder byteOrder) {
        Serializable j3 = j(byteOrder);
        if (j3 == null) {
            return null;
        }
        if (j3 instanceof String) {
            return (String) j3;
        }
        StringBuilder sb = new StringBuilder();
        int r4 = 0;
        if (j3 instanceof long[]) {
            long[] jArr = (long[]) j3;
            while (r4 < jArr.length) {
                sb.append(jArr[r4]);
                r4++;
                if (r4 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (j3 instanceof int[]) {
            int[] r8 = (int[]) j3;
            while (r4 < r8.length) {
                sb.append(r8[r4]);
                r4++;
                if (r4 != r8.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (j3 instanceof double[]) {
            double[] dArr = (double[]) j3;
            while (r4 < dArr.length) {
                sb.append(dArr[r4]);
                r4++;
                if (r4 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(j3 instanceof f[])) {
            return null;
        } else {
            f[] fVarArr = (f[]) j3;
            while (r4 < fVarArr.length) {
                sb.append(fVarArr[r4].f4916a);
                sb.append('/');
                sb.append(fVarArr[r4].f4917b);
                r4++;
                if (r4 != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0129, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [s0.f[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [s0.f[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable j(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C0451d.j(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        return "(" + h.f4933P[this.f4908a] + ", data length:" + this.f4911d.length + ")";
    }

    public C0451d(long j3, byte[] bArr, int r4, int r5) {
        this.f4908a = r4;
        this.f4909b = r5;
        this.f4910c = j3;
        this.f4911d = bArr;
    }
}
