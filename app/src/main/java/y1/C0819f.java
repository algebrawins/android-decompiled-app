package y1;

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

/* renamed from: y1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819f implements H1.e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f6370f = Charset.forName("UTF-8");
    public static final H1.c g;

    /* renamed from: h  reason: collision with root package name */
    public static final H1.c f6371h;

    /* renamed from: i  reason: collision with root package name */
    public static final C0813e f6372i;

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f6373a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6374b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f6375c;

    /* renamed from: d  reason: collision with root package name */
    public final C0813e f6376d;

    /* renamed from: e  reason: collision with root package name */
    public final x1.W f6377e = new x1.W(this, 1);

    static {
        EnumC0801c enumC0801c = EnumC0801c.zza;
        C0789a c0789a = new C0789a(1, enumC0801c);
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC0807d.class, c0789a);
        g = new H1.c("key", D.C.C(hashMap));
        C0789a c0789a2 = new C0789a(2, enumC0801c);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(InterfaceC0807d.class, c0789a2);
        f6371h = new H1.c("value", D.C.C(hashMap2));
        f6372i = C0813e.f6364b;
    }

    public C0819f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, C0813e c0813e) {
        this.f6373a = byteArrayOutputStream;
        this.f6374b = hashMap;
        this.f6375c = hashMap2;
        this.f6376d = c0813e;
    }

    public static int f(H1.c cVar) {
        InterfaceC0807d interfaceC0807d = (InterfaceC0807d) ((Annotation) cVar.f740b.get(InterfaceC0807d.class));
        if (interfaceC0807d != null) {
            return ((C0789a) interfaceC0807d).f6339a;
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
            byte[] bytes = charSequence.toString().getBytes(f6370f);
            h(bytes.length);
            this.f6373a.write(bytes);
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                a(cVar, obj2, false);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                g(f6372i, cVar, entry, false);
            }
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z3 || doubleValue != 0.0d) {
                h((f(cVar) << 3) | 1);
                this.f6373a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            }
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z3 || floatValue != 0.0f) {
                h((f(cVar) << 3) | 5);
                this.f6373a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
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
            this.f6373a.write(bArr);
        } else {
            H1.d dVar = (H1.d) this.f6374b.get(obj.getClass());
            if (dVar != null) {
                g(dVar, cVar, obj, z3);
                return;
            }
            H1.f fVar = (H1.f) this.f6375c.get(obj.getClass());
            if (fVar != null) {
                x1.W w3 = this.f6377e;
                w3.f5789b = false;
                w3.f5791d = cVar;
                w3.f5790c = z3;
                fVar.a(obj, w3);
            } else if (obj instanceof InterfaceC0795b) {
                b(cVar, ((InterfaceC0795b) obj).a(), true);
            } else if (obj instanceof Enum) {
                b(cVar, ((Enum) obj).ordinal(), true);
            } else {
                g(this.f6376d, cVar, obj, z3);
            }
        }
    }

    public final void b(H1.c cVar, int r3, boolean z3) {
        if (z3 && r3 == 0) {
            return;
        }
        InterfaceC0807d interfaceC0807d = (InterfaceC0807d) ((Annotation) cVar.f740b.get(InterfaceC0807d.class));
        if (interfaceC0807d != null) {
            C0789a c0789a = (C0789a) interfaceC0807d;
            int ordinal = c0789a.f6340b.ordinal();
            int r22 = c0789a.f6339a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        h((r22 << 3) | 5);
                        this.f6373a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(r3).array());
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
        InterfaceC0807d interfaceC0807d = (InterfaceC0807d) ((Annotation) cVar.f740b.get(InterfaceC0807d.class));
        if (interfaceC0807d != null) {
            C0789a c0789a = (C0789a) interfaceC0807d;
            int ordinal = c0789a.f6340b.ordinal();
            int r3 = c0789a.f6339a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        h((r3 << 3) | 1);
                        this.f6373a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j3).array());
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
        x1.O o3 = new x1.O(1);
        o3.f5687K = 0L;
        try {
            OutputStream outputStream = this.f6373a;
            this.f6373a = o3;
            dVar.a(obj, this);
            this.f6373a = outputStream;
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
            OutputStream outputStream = this.f6373a;
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
            OutputStream outputStream = this.f6373a;
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
