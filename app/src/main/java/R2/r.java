package r2;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class r implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final r f4893a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f4894b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f4895c;

    /* JADX WARN: Type inference failed for: r0v0, types: [r2.r, java.lang.Object] */
    static {
        boolean z3;
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z3 = true;
        } else {
            z3 = false;
        }
        f4894b = z3;
        f4895c = Charset.forName("UTF8");
    }

    public static final void c(ByteBuffer byteBuffer, int r3) {
        int position = byteBuffer.position() % r3;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + r3) - position);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int r02 = byteBuffer.get() & 255;
            if (r02 < 254) {
                return r02;
            }
            if (r02 == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static final void g(q qVar, int r5) {
        int size = qVar.size() % r5;
        if (size != 0) {
            for (int r22 = 0; r22 < r5 - size; r22++) {
                qVar.write(0);
            }
        }
    }

    public static final void h(q qVar, int r22) {
        if (f4894b) {
            qVar.write(r22);
            qVar.write(r22 >>> 8);
            qVar.write(r22 >>> 16);
            qVar.write(r22 >>> 24);
            return;
        }
        qVar.write(r22 >>> 24);
        qVar.write(r22 >>> 16);
        qVar.write(r22 >>> 8);
        qVar.write(r22);
    }

    public static final void i(q qVar, long j3) {
        if (f4894b) {
            qVar.write((byte) j3);
            qVar.write((byte) (j3 >>> 8));
            qVar.write((byte) (j3 >>> 16));
            qVar.write((byte) (j3 >>> 24));
            qVar.write((byte) (j3 >>> 32));
            qVar.write((byte) (j3 >>> 40));
            qVar.write((byte) (j3 >>> 48));
            qVar.write((byte) (j3 >>> 56));
            return;
        }
        qVar.write((byte) (j3 >>> 56));
        qVar.write((byte) (j3 >>> 48));
        qVar.write((byte) (j3 >>> 40));
        qVar.write((byte) (j3 >>> 32));
        qVar.write((byte) (j3 >>> 24));
        qVar.write((byte) (j3 >>> 16));
        qVar.write((byte) (j3 >>> 8));
        qVar.write((byte) j3);
    }

    public static final void j(q qVar, int r3) {
        if (r3 < 254) {
            qVar.write(r3);
        } else if (r3 <= 65535) {
            qVar.write(254);
            if (f4894b) {
                qVar.write(r3);
                qVar.write(r3 >>> 8);
                return;
            }
            qVar.write(r3 >>> 8);
            qVar.write(r3);
        } else {
            qVar.write(255);
            h(qVar, r3);
        }
    }

    @Override // r2.l
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object e4 = e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return e4;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream, r2.q] */
    @Override // r2.l
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        k(byteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b3, ByteBuffer byteBuffer) {
        Object bigInteger;
        Charset charset = f4895c;
        int r12 = 0;
        switch (b3) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                bigInteger = new BigInteger(new String(bArr, charset), 16);
                break;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                bigInteger = new String(bArr2, charset);
                break;
            case 8:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int d4 = d(byteBuffer);
                int[] r02 = new int[d4];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(r02);
                byteBuffer.position((d4 * 4) + byteBuffer.position());
                return r02;
            case 10:
                int d5 = d(byteBuffer);
                long[] jArr = new long[d5];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((d5 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int d6 = d(byteBuffer);
                double[] dArr = new double[d6];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((d6 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int d7 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(d7);
                while (r12 < d7) {
                    arrayList.add(e(byteBuffer));
                    r12++;
                }
                return arrayList;
            case 13:
                int d8 = d(byteBuffer);
                HashMap hashMap = new HashMap();
                while (r12 < d8) {
                    hashMap.put(e(byteBuffer), e(byteBuffer));
                    r12++;
                }
                return hashMap;
            case 14:
                int d9 = d(byteBuffer);
                float[] fArr = new float[d9];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((d9 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    public void k(q qVar, Object obj) {
        int r7;
        int r02 = 0;
        if (obj != null && !obj.equals(null)) {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    r7 = 1;
                } else {
                    r7 = 2;
                }
                qVar.write(r7);
                return;
            }
            boolean z3 = obj instanceof Number;
            Charset charset = f4895c;
            if (z3) {
                if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
                    if (obj instanceof Long) {
                        qVar.write(4);
                        i(qVar, ((Long) obj).longValue());
                        return;
                    } else if (!(obj instanceof Float) && !(obj instanceof Double)) {
                        if (obj instanceof BigInteger) {
                            qVar.write(5);
                            byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                            j(qVar, bytes.length);
                            qVar.write(bytes, 0, bytes.length);
                            return;
                        }
                        throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                    } else {
                        qVar.write(6);
                        g(qVar, 8);
                        i(qVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                        return;
                    }
                }
                qVar.write(3);
                h(qVar, ((Number) obj).intValue());
                return;
            } else if (obj instanceof CharSequence) {
                qVar.write(7);
                byte[] bytes2 = obj.toString().getBytes(charset);
                j(qVar, bytes2.length);
                qVar.write(bytes2, 0, bytes2.length);
                return;
            } else if (obj instanceof byte[]) {
                qVar.write(8);
                byte[] bArr = (byte[]) obj;
                j(qVar, bArr.length);
                qVar.write(bArr, 0, bArr.length);
                return;
            } else if (obj instanceof int[]) {
                qVar.write(9);
                int[] r72 = (int[]) obj;
                j(qVar, r72.length);
                g(qVar, 4);
                int length = r72.length;
                while (r02 < length) {
                    h(qVar, r72[r02]);
                    r02++;
                }
                return;
            } else if (obj instanceof long[]) {
                qVar.write(10);
                long[] jArr = (long[]) obj;
                j(qVar, jArr.length);
                g(qVar, 8);
                int length2 = jArr.length;
                while (r02 < length2) {
                    i(qVar, jArr[r02]);
                    r02++;
                }
                return;
            } else if (obj instanceof double[]) {
                qVar.write(11);
                double[] dArr = (double[]) obj;
                j(qVar, dArr.length);
                g(qVar, 8);
                int length3 = dArr.length;
                while (r02 < length3) {
                    i(qVar, Double.doubleToLongBits(dArr[r02]));
                    r02++;
                }
                return;
            } else if (obj instanceof List) {
                qVar.write(12);
                List<Object> list = (List) obj;
                j(qVar, list.size());
                for (Object obj2 : list) {
                    k(qVar, obj2);
                }
                return;
            } else if (obj instanceof Map) {
                qVar.write(13);
                Map map = (Map) obj;
                j(qVar, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    k(qVar, entry.getKey());
                    k(qVar, entry.getValue());
                }
                return;
            } else if (obj instanceof float[]) {
                qVar.write(14);
                float[] fArr = (float[]) obj;
                j(qVar, fArr.length);
                g(qVar, 4);
                int length4 = fArr.length;
                while (r02 < length4) {
                    h(qVar, Float.floatToIntBits(fArr[r02]));
                    r02++;
                }
                return;
            } else {
                throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
            }
        }
        qVar.write(0);
    }
}
