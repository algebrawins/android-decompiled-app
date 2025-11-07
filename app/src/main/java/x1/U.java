package x1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class U implements H1.e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f5763f = Charset.forName("UTF-8");
    public static final H1.c g;

    /* renamed from: h  reason: collision with root package name */
    public static final H1.c f5764h;

    /* renamed from: i  reason: collision with root package name */
    public static final T f5765i;

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f5766a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5767b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f5768c;

    /* renamed from: d  reason: collision with root package name */
    public final T f5769d;

    /* renamed from: e  reason: collision with root package name */
    public final W f5770e = new W(this, 0);

    static {
        Q q3 = Q.zza;
        N n3 = new N(1, q3);
        HashMap hashMap = new HashMap();
        hashMap.put(S.class, n3);
        g = new H1.c("key", D.C.C(hashMap));
        N n4 = new N(2, q3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(S.class, n4);
        f5764h = new H1.c("value", D.C.C(hashMap2));
        f5765i = T.f5753b;
    }

    public U(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, T t3) {
        this.f5766a = byteArrayOutputStream;
        this.f5767b = hashMap;
        this.f5768c = hashMap2;
        this.f5769d = t3;
    }

    public static int f(H1.c cVar) {
        S s3 = (S) ((Annotation) cVar.f740b.get(S.class));
        if (s3 != null) {
            return ((N) s3).f5675a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void a(H1.c cVar, Object obj, boolean z3) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z3 && charSequence.length() == 0) {
                return;
            }
            h((f(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f5763f);
            h(bytes.length);
            this.f5766a.write(bytes);
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                a(cVar, obj2, false);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                g(f5765i, cVar, entry, false);
            }
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z3 || doubleValue != 0.0d) {
                h((f(cVar) << 3) | 1);
                this.f5766a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            }
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z3 || floatValue != 0.0f) {
                h((f(cVar) << 3) | 5);
                this.f5766a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            }
        } else if (obj instanceof Number) {
            e(cVar, ((Number) obj).longValue(), z3);
        } else if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z3);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z3 && bArr.length == 0) {
                return;
            }
            h((f(cVar) << 3) | 2);
            h(bArr.length);
            this.f5766a.write(bArr);
        } else {
            H1.d dVar = (H1.d) this.f5767b.get(obj.getClass());
            if (dVar != null) {
                g(dVar, cVar, obj, z3);
                return;
            }
            H1.f fVar = (H1.f) this.f5768c.get(obj.getClass());
            if (fVar != null) {
                W w3 = this.f5770e;
                w3.f5789b = false;
                w3.f5791d = cVar;
                w3.f5790c = z3;
                fVar.a(obj, w3);
            } else if (obj instanceof P) {
                b(cVar, ((P) obj).a(), true);
            } else if (obj instanceof Enum) {
                b(cVar, ((Enum) obj).ordinal(), true);
            } else {
                g(this.f5769d, cVar, obj, z3);
            }
        }
    }

    public final void b(H1.c cVar, int r3, boolean z3) {
        if (z3 && r3 == 0) {
            return;
        }
        S s3 = (S) ((Annotation) cVar.f740b.get(S.class));
        if (s3 != null) {
            N n3 = (N) s3;
            int ordinal = n3.f5676b.ordinal();
            int r22 = n3.f5675a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        h((r22 << 3) | 5);
                        this.f5766a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(r3).array());
                        return;
                    }
                    return;
                }
                h(r22 << 3);
                h((r3 + r3) ^ (r3 >> 31));
                return;
            }
            h(r22 << 3);
            h(r3);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // H1.e
    public final /* synthetic */ H1.e c(H1.c cVar, long j3) {
        e(cVar, j3, true);
        return this;
    }

    @Override // H1.e
    public final H1.e d(H1.c cVar, Object obj) {
        a(cVar, obj, true);
        return this;
    }

    public final void e(H1.c cVar, long j3, boolean z3) {
        if (z3 && j3 == 0) {
            return;
        }
        S s3 = (S) ((Annotation) cVar.f740b.get(S.class));
        if (s3 != null) {
            N n3 = (N) s3;
            int ordinal = n3.f5676b.ordinal();
            int r3 = n3.f5675a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        h((r3 << 3) | 1);
                        this.f5766a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j3).array());
                        return;
                    }
                    return;
                }
                h(r3 << 3);
                i((j3 >> 63) ^ (j3 + j3));
                return;
            }
            h(r3 << 3);
            i(j3);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void g(H1.d dVar, H1.c cVar, Object obj, boolean z3) {
        O o3 = new O(0);
        o3.f5687K = 0L;
        try {
            OutputStream outputStream = this.f5766a;
            this.f5766a = o3;
            dVar.a(obj, this);
            this.f5766a = outputStream;
            long j3 = o3.f5687K;
            o3.close();
            if (z3 && j3 == 0) {
                return;
            }
            h((f(cVar) << 3) | 2);
            i(j3);
            dVar.a(obj, this);
        } catch (Throwable th) {
            try {
                o3.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public final void h(int r6) {
        while (true) {
            int r4 = ((r6 & (-128)) > 0L ? 1 : ((r6 & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f5766a;
            if (r4 != 0) {
                outputStream.write((r6 & 127) | RecognitionOptions.ITF);
                r6 >>>= 7;
            } else {
                outputStream.write(r6 & 127);
                return;
            }
        }
    }

    public final void i(long j3) {
        while (true) {
            int r4 = (((-128) & j3) > 0L ? 1 : (((-128) & j3) == 0L ? 0 : -1));
            OutputStream outputStream = this.f5766a;
            if (r4 != 0) {
                outputStream.write((((int) j3) & 127) | RecognitionOptions.ITF);
                j3 >>>= 7;
            } else {
                outputStream.write(((int) j3) & 127);
                return;
            }
        }
    }
}
