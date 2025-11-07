package r2;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import x1.Q4;

/* loaded from: classes.dex */
public final class j implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final j f4891a = new Object();

    @Override // r2.l
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            t.f4898b.getClass();
            JSONTokener jSONTokener = new JSONTokener(t.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e4) {
            throw new IllegalArgumentException("Invalid JSON", e4);
        }
    }

    @Override // r2.l
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a4 = Q4.a(obj);
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
