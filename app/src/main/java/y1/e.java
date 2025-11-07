package Y1;

import F1.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements C1.d, F1.d {

    /* renamed from: J  reason: collision with root package name */
    public static final /* synthetic */ e f1670J = new Object();

    /* renamed from: K  reason: collision with root package name */
    public static final /* synthetic */ e f1671K = new Object();

    @Override // F1.d
    public Object a(t tVar) {
        Set c4 = tVar.c(d.class);
        Object obj = new Object();
        new HashMap();
        new HashMap();
        Iterator it = c4.iterator();
        if (!it.hasNext()) {
            return obj;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // C1.d
    public void q(Exception exc) {
        c.f1665N.a("MobileVisionBase", "Error preloading model resource", exc);
    }
}
