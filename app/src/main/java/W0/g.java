package W0;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final A.f f1494a;

    /* renamed from: b  reason: collision with root package name */
    public final e f1495b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1496c;

    public g(Context context, e eVar) {
        A.f fVar = new A.f(context);
        this.f1496c = new HashMap();
        this.f1494a = fVar;
        this.f1495b = eVar;
    }

    public final synchronized h a(String str) {
        if (this.f1496c.containsKey(str)) {
            return (h) this.f1496c.get(str);
        }
        CctBackendFactory m3 = this.f1494a.m(str);
        if (m3 == null) {
            return null;
        }
        e eVar = this.f1495b;
        h create = m3.create(new b(eVar.f1489a, eVar.f1490b, eVar.f1491c, str));
        this.f1496c.put(str, create);
        return create;
    }
}
