package r2;

import h2.J;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import x1.Q4;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final k f4892a = new Object();

    @Override // r2.n
    public ByteBuffer a(Object obj) {
        JSONArray put = new JSONArray().put(Q4.a(obj));
        if (put == null) {
            return null;
        }
        Object a4 = Q4.a(put);
        if (a4 instanceof String) {
            t tVar = t.f4898b;
            String quote = JSONObject.quote((String) a4);
            tVar.getClass();
            return t.d(quote);
        }
        t tVar2 = t.f4898b;
        String obj2 = a4.toString();
        tVar2.getClass();
        return t.d(obj2);
    }

    @Override // r2.n
    public J b(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    t.f4898b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(t.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e4) {
                    throw new IllegalArgumentException("Invalid JSON", e4);
                }
            } catch (JSONException e5) {
                throw new IllegalArgumentException("Invalid JSON", e5);
            }
        }
        if (nextValue instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) nextValue;
            Object obj2 = jSONObject.get("method");
            Object opt = jSONObject.opt("args");
            if (opt != JSONObject.NULL) {
                obj = opt;
            }
            if (obj2 instanceof String) {
                return new J((String) obj2, obj, 17, false);
            }
        }
        throw new IllegalArgumentException("Invalid method call: " + nextValue);
    }

    @Override // r2.n
    public Object c(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        if (byteBuffer == null) {
            nextValue = null;
        } else {
            try {
                try {
                    t.f4898b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(t.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e4) {
                    throw new IllegalArgumentException("Invalid JSON", e4);
                }
            } catch (JSONException e5) {
                throw new IllegalArgumentException("Invalid JSON", e5);
            }
        }
        if (nextValue instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) nextValue;
            if (jSONArray.length() == 1) {
                Object opt = jSONArray.opt(0);
                if (opt == JSONObject.NULL) {
                    return null;
                }
                return opt;
            } else if (jSONArray.length() == 3) {
                Object obj2 = jSONArray.get(0);
                Object opt2 = jSONArray.opt(1);
                Object obj3 = JSONObject.NULL;
                if (opt2 == obj3) {
                    opt2 = null;
                }
                Object opt3 = jSONArray.opt(2);
                if (opt3 != obj3) {
                    obj = opt3;
                }
                if ((obj2 instanceof String) && (opt2 == null || (opt2 instanceof String))) {
                    throw new i((String) obj2, (String) opt2, obj);
                }
            }
        }
        throw new IllegalArgumentException("Invalid envelope: " + nextValue);
    }

    @Override // r2.n
    public ByteBuffer d(J j3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) j3.f3303K);
            jSONObject.put("args", Q4.a(j3.f3304L));
            Object a4 = Q4.a(jSONObject);
            if (a4 instanceof String) {
                t tVar = t.f4898b;
                String quote = JSONObject.quote((String) a4);
                tVar.getClass();
                return t.d(quote);
            }
            t tVar2 = t.f4898b;
            String obj = a4.toString();
            tVar2.getClass();
            return t.d(obj);
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // r2.n
    public ByteBuffer e(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(Q4.a(str)).put(JSONObject.NULL).put(Q4.a(str2));
        if (put == null) {
            return null;
        }
        Object a4 = Q4.a(put);
        if (a4 instanceof String) {
            t tVar = t.f4898b;
            String quote = JSONObject.quote((String) a4);
            tVar.getClass();
            return t.d(quote);
        }
        t tVar2 = t.f4898b;
        String obj = a4.toString();
        tVar2.getClass();
        return t.d(obj);
    }

    @Override // r2.n
    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(Q4.a(str2)).put(Q4.a(obj));
        if (put == null) {
            return null;
        }
        Object a4 = Q4.a(put);
        if (a4 instanceof String) {
            t tVar = t.f4898b;
            String quote = JSONObject.quote((String) a4);
            tVar.getClass();
            return t.d(quote);
        }
        t tVar2 = t.f4898b;
        String obj2 = a4.toString();
        tVar2.getClass();
        return t.d(obj2);
    }
}
