package w2;

import V2.C0062t;
import V2.InterfaceC0063u;
import V2.V;
import android.content.Context;
import android.util.Base64;
import d2.C0235c;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import n0.C0371d;
import q0.C0430a;
import q0.C0431b;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ S2.c[] f5356a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0431b f5357b;

    static {
        N2.k kVar = new N2.k(N2.a.f987J, K.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        N2.p.f1008a.getClass();
        f5356a = new S2.c[]{kVar};
        C0430a c0430a = C0430a.f4793K;
        D2.i iVar = V2.D.f1391b;
        V v3 = new V(null);
        iVar.getClass();
        if (v3 != D2.j.f492J) {
            iVar = (D2.i) v3.j(iVar, new D2.b(1));
        }
        if (iVar.f(C0062t.f1462K) == null) {
            iVar = iVar.k(new V(null));
        }
        f5357b = new C0431b(c0430a, new a3.e(iVar));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [O1.a, java.lang.Object] */
    public static final C0235c a(Context context) {
        C0235c c0235c;
        C0431b c0431b = f5357b;
        S2.c cVar = f5356a[0];
        c0431b.getClass();
        N2.g.e(context, "thisRef");
        N2.g.e(cVar, "property");
        C0235c c0235c2 = c0431b.f4797d;
        if (c0235c2 == null) {
            synchronized (c0431b.f4796c) {
                try {
                    if (c0431b.f4797d == null) {
                        Context applicationContext = context.getApplicationContext();
                        M2.l lVar = c0431b.f4794a;
                        N2.g.d(applicationContext, "applicationContext");
                        List list = (List) lVar.h(applicationContext);
                        InterfaceC0063u interfaceC0063u = c0431b.f4795b;
                        K0.j jVar = new K0.j(1, applicationContext, c0431b);
                        N2.g.e(list, "migrations");
                        c0431b.f4797d = new C0235c(24, new C0235c(24, new n0.N(new p0.e(e3.f.f3115a, new G0.a(4, jVar)), C2.j.b(new C0371d(list, null)), new Object(), interfaceC0063u)));
                    }
                    c0235c = c0431b.f4797d;
                    N2.g.b(c0235c);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0235c;
        }
        return c0235c2;
    }

    public static final boolean b(String str, Object obj, Set set) {
        N2.g.e(str, "key");
        if (set == null) {
            if (!(obj instanceof Boolean) && !(obj instanceof Long) && !(obj instanceof String) && !(obj instanceof Double)) {
                return false;
            }
            return true;
        }
        return set.contains(str);
    }

    public static final Object c(Object obj, O1.a aVar) {
        if (obj instanceof String) {
            String str = (String) obj;
            N2.g.e(str, "<this>");
            if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                if (!str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                    String substring = str.substring(40);
                    N2.g.d(substring, "substring(...)");
                    aVar.getClass();
                    N2.g.e(substring, "listString");
                    Object readObject = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(substring, 0))).readObject();
                    N2.g.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) readObject) {
                        if (obj2 instanceof String) {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList;
                }
                return obj;
            } else if (str.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                String substring2 = str.substring(40);
                N2.g.d(substring2, "substring(...)");
                return Double.valueOf(Double.parseDouble(substring2));
            } else {
                return obj;
            }
        }
        return obj;
    }
}
