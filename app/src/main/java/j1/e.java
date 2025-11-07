package J1;

import H1.f;
import H1.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements H1.e, g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f800a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f801b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f802c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f803d;

    /* renamed from: e  reason: collision with root package name */
    public final a f804e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f805f;

    public e(Writer writer, HashMap hashMap, HashMap hashMap2, a aVar, boolean z3) {
        this.f801b = new JsonWriter(writer);
        this.f802c = hashMap;
        this.f803d = hashMap2;
        this.f804e = aVar;
        this.f805f = z3;
    }

    @Override // H1.g
    public final g a(String str) {
        g();
        this.f801b.value(str);
        return this;
    }

    @Override // H1.g
    public final g b(boolean z3) {
        g();
        this.f801b.value(z3);
        return this;
    }

    @Override // H1.e
    public final H1.e c(H1.c cVar, long j3) {
        String str = cVar.f739a;
        g();
        JsonWriter jsonWriter = this.f801b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j3);
        return this;
    }

    @Override // H1.e
    public final H1.e d(H1.c cVar, Object obj) {
        f(obj, cVar.f739a);
        return this;
    }

    public final e e(Object obj) {
        int r02 = 0;
        JsonWriter jsonWriter = this.f801b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                g();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int[] r8 = (int[]) obj;
                int length = r8.length;
                while (r02 < length) {
                    jsonWriter.value(r8[r02]);
                    r02++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (r02 < length2) {
                    long j3 = jArr[r02];
                    g();
                    jsonWriter.value(j3);
                    r02++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (r02 < length3) {
                    jsonWriter.value(dArr[r02]);
                    r02++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (r02 < length4) {
                    jsonWriter.value(zArr[r02]);
                    r02++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (r02 < length5) {
                    e(numberArr[r02]);
                    r02++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (r02 < length6) {
                    e(objArr[r02]);
                    r02++;
                }
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Collection) {
            jsonWriter.beginArray();
            for (Object obj2 : (Collection) obj) {
                e(obj2);
            }
            jsonWriter.endArray();
            return this;
        } else if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    f(entry.getValue(), (String) key);
                } catch (ClassCastException e4) {
                    throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e4);
                }
            }
            jsonWriter.endObject();
            return this;
        } else {
            H1.d dVar = (H1.d) this.f802c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.f803d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                g();
                jsonWriter.value(name);
                return this;
            } else {
                jsonWriter.beginObject();
                this.f804e.a(obj, this);
                throw null;
            }
        }
    }

    public final e f(Object obj, String str) {
        boolean z3 = this.f805f;
        JsonWriter jsonWriter = this.f801b;
        if (z3) {
            if (obj != null) {
                g();
                jsonWriter.name(str);
                e(obj);
            }
            return this;
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            e(obj);
        }
        return this;
    }

    public final void g() {
        if (this.f800a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
