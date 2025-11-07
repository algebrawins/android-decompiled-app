package w2;

import A0.C0001b;
import V2.AbstractC0066x;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n2.InterfaceC0394a;

/* loaded from: classes.dex */
public final class J implements InterfaceC0394a, InterfaceC0536f {

    /* renamed from: J  reason: collision with root package name */
    public Context f5353J;

    /* renamed from: K  reason: collision with root package name */
    public C0001b f5354K;

    /* renamed from: L  reason: collision with root package name */
    public final O1.a f5355L = new Object();

    public static final Object b(J j3, String str, String str2, F2.g gVar) {
        j3.getClass();
        r0.d dVar = new r0.d(str);
        Context context = j3.f5353J;
        if (context != null) {
            Object d4 = K.a(context).d(new r0.f(new C0539j(dVar, str2, null), null), gVar);
            if (d4 != E2.a.COROUTINE_SUSPENDED) {
                return B2.i.f210a;
            }
            return d4;
        }
        N2.g.g("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c8 -> B:36:0x00cb). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o(w2.J r11, java.util.List r12, F2.b r13) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.J.o(w2.J, java.util.List, F2.b):java.lang.Object");
    }

    @Override // w2.InterfaceC0536f
    public final void a(String str, String str2, C0537g c0537g) {
        AbstractC0066x.j(new F(this, str, str2, null));
    }

    @Override // w2.InterfaceC0536f
    public final void c(String str, double d4, C0537g c0537g) {
        AbstractC0066x.j(new E(str, this, d4, null));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [N2.o, java.lang.Object] */
    @Override // w2.InterfaceC0536f
    public final Boolean d(String str, C0537g c0537g) {
        ?? obj = new Object();
        AbstractC0066x.j(new C0544o(str, this, obj, null));
        return (Boolean) obj.f1007J;
    }

    @Override // w2.InterfaceC0536f
    public final void e(String str, boolean z3, C0537g c0537g) {
        AbstractC0066x.j(new C0528B(str, this, z3, null));
    }

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
        N2.g.e(c0001b, "binding");
        r2.f fVar = (r2.f) c0001b.f84K;
        N2.g.d(fVar, "getBinaryMessenger(...)");
        InterfaceC0536f.f5370I.getClass();
        C0535e.b(fVar, null, "data_store");
        C0001b c0001b2 = this.f5354K;
        if (c0001b2 != null) {
            C0535e.b((r2.f) c0001b2.f85L, null, "shared_preferences");
        }
        this.f5354K = null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [N2.o, java.lang.Object] */
    @Override // w2.InterfaceC0536f
    public final String g(String str, C0537g c0537g) {
        ?? obj = new Object();
        AbstractC0066x.j(new x(str, this, obj, null));
        return (String) obj.f1007J;
    }

    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
        N2.g.e(c0001b, "binding");
        r2.f fVar = (r2.f) c0001b.f84K;
        N2.g.d(fVar, "getBinaryMessenger(...)");
        Context context = (Context) c0001b.f85L;
        N2.g.d(context, "getApplicationContext(...)");
        this.f5353J = context;
        try {
            InterfaceC0536f.f5370I.getClass();
            C0535e.b(fVar, this, "data_store");
            this.f5354K = new C0001b(fVar, context, this.f5355L);
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e4);
        }
        new C0531a().h(c0001b);
    }

    @Override // w2.InterfaceC0536f
    public final List i(List list, C0537g c0537g) {
        return C2.i.l(((Map) AbstractC0066x.j(new u(this, list, null))).keySet());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [N2.o, java.lang.Object] */
    @Override // w2.InterfaceC0536f
    public final Long j(String str, C0537g c0537g) {
        ?? obj = new Object();
        AbstractC0066x.j(new t(str, this, obj, null));
        return (Long) obj.f1007J;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [N2.o, java.lang.Object] */
    @Override // w2.InterfaceC0536f
    public final Double k(String str, C0537g c0537g) {
        ?? obj = new Object();
        AbstractC0066x.j(new r(str, this, obj, null));
        return (Double) obj.f1007J;
    }

    @Override // w2.InterfaceC0536f
    public final O l(String str, C0537g c0537g) {
        O o3;
        String g = g(str, c0537g);
        if (g == null) {
            return null;
        }
        if (g.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new O(g, M.JSON_ENCODED);
        }
        if (g.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            o3 = new O(null, M.PLATFORM_ENCODED);
        } else {
            o3 = new O(null, M.UNEXPECTED_STRING);
        }
        return o3;
    }

    @Override // w2.InterfaceC0536f
    public final void m(String str, String str2, C0537g c0537g) {
        AbstractC0066x.j(new I(this, str, str2, null));
    }

    @Override // w2.InterfaceC0536f
    public final Map n(List list, C0537g c0537g) {
        return (Map) AbstractC0066x.j(new C0540k(this, list, null));
    }

    @Override // w2.InterfaceC0536f
    public final void p(String str, List list, C0537g c0537g) {
        AbstractC0066x.j(new C0529C(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f5355L.a(list)), null));
    }

    @Override // w2.InterfaceC0536f
    public final void q(String str, long j3, C0537g c0537g) {
        AbstractC0066x.j(new H(str, this, j3, null));
    }

    @Override // w2.InterfaceC0536f
    public final void r(List list, C0537g c0537g) {
        AbstractC0066x.j(new i(this, list, null));
    }

    @Override // w2.InterfaceC0536f
    public final ArrayList s(String str, C0537g c0537g) {
        List list;
        String g = g(str, c0537g);
        ArrayList arrayList = null;
        if (g != null && !g.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && g.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) K.c(g, this.f5355L)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
