package B;

import A0.C0002c;
import F1.b;
import F1.d;
import F1.k;
import V0.c;
import a1.g;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.view.Window;
import androidx.camera.core.impl.r;
import b1.InterfaceC0147c;
import b1.h;
import c1.InterfaceC0160b;
import f0.O;
import f0.S;
import h2.AbstractActivityC0292d;
import h2.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p.t0;
import w.C0514y;
import x.C0551f;
import x.w;
import x1.AbstractC0624h4;
import x1.AbstractC0628j0;
import x1.AbstractC0656m4;
import x1.X;

/* loaded from: classes.dex */
public final class a implements InterfaceC0160b {

    /* renamed from: J  reason: collision with root package name */
    public int f171J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f172K;

    /* renamed from: L  reason: collision with root package name */
    public final Object f173L;

    /* renamed from: M  reason: collision with root package name */
    public Object f174M;

    /* renamed from: N  reason: collision with root package name */
    public Object f175N;

    public a(g gVar, W0.a aVar, Iterable iterable, c cVar, int r5) {
        this.f172K = gVar;
        this.f173L = aVar;
        this.f174M = iterable;
        this.f175N = cVar;
        this.f171J = r5;
    }

    @Override // c1.InterfaceC0160b
    public Object Y() {
        SQLiteDatabase a4;
        Boolean bool;
        W0.a aVar = (W0.a) this.f173L;
        W0.c cVar = W0.c.TRANSIENT_ERROR;
        Iterable iterable = (Iterable) this.f174M;
        c cVar2 = (c) this.f175N;
        W0.c cVar3 = aVar.f1483a;
        g gVar = (g) this.f172K;
        if (cVar3 == cVar) {
            h hVar = (h) gVar.f1824c;
            hVar.getClass();
            if (iterable.iterator().hasNext()) {
                String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + h.j(iterable);
                a4 = hVar.a();
                a4.beginTransaction();
                try {
                    a4.compileStatement(str).execute();
                    a4.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    a4.setTransactionSuccessful();
                } finally {
                }
            }
            gVar.f1825d.a(cVar2, this.f171J + 1, false);
            return null;
        }
        h hVar2 = (h) gVar.f1824c;
        hVar2.getClass();
        if (iterable.iterator().hasNext()) {
            hVar2.a().compileStatement("DELETE FROM events WHERE _id in " + h.j(iterable)).execute();
        }
        W0.c cVar4 = W0.c.OK;
        InterfaceC0147c interfaceC0147c = gVar.f1824c;
        if (cVar3 == cVar4) {
            long c4 = gVar.g.c() + aVar.f1484b;
            h hVar3 = (h) interfaceC0147c;
            hVar3.getClass();
            hVar3.f(new C0002c(c4, cVar2));
        }
        h hVar4 = (h) interfaceC0147c;
        a4 = hVar4.a();
        a4.beginTransaction();
        try {
            Long b3 = h.b(a4, cVar2);
            if (b3 == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor rawQuery = hVar4.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b3.toString()});
                Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                rawQuery.close();
                bool = valueOf;
            }
            a4.setTransactionSuccessful();
            a4.endTransaction();
            if (bool.booleanValue()) {
                gVar.f1825d.a(cVar2, 1, true);
                return null;
            }
            return null;
        } finally {
        }
    }

    public void a(k kVar) {
        if (!((HashSet) this.f172K).contains(kVar.f636a)) {
            ((HashSet) this.f173L).add(kVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public b b() {
        if (((d) this.f174M) != null) {
            return new b(new HashSet((HashSet) this.f172K), new HashSet((HashSet) this.f173L), this.f171J, (d) this.f174M, (HashSet) this.f175N);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public String c(String str) {
        HashMap hashMap = (HashMap) this.f174M;
        if (!hashMap.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) hashMap.get(str)) {
            Iterator it = ((ArrayList) this.f173L).iterator();
            while (it.hasNext()) {
                r k3 = ((r) it.next()).k();
                AbstractC0624h4.a("CameraInfo doesn't contain Camera2 implementation.", k3 instanceof C0514y);
                if (str2.equals(((C0514y) ((C0514y) k3).f5274c.f1K).f5272a)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public void d(t0 t0Var) {
        AbstractC0656m4 o3;
        Window window = ((AbstractActivityC0292d) this.f172K).getWindow();
        window.getDecorView();
        int r12 = Build.VERSION.SDK_INT;
        if (r12 >= 30) {
            o3 = new S(window);
        } else if (r12 >= 26) {
            o3 = new O(window);
        } else if (r12 >= 23) {
            o3 = new O(window);
        } else {
            o3 = new O(window);
        }
        int r5 = Build.VERSION.SDK_INT;
        if (r5 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (r5 >= 23) {
            q2.d dVar = (q2.d) t0Var.f4719b;
            if (dVar != null) {
                int r22 = io.flutter.plugin.platform.d.f3564c[dVar.ordinal()];
                if (r22 != 1) {
                    if (r22 == 2) {
                        o3.b(false);
                    }
                } else {
                    o3.b(true);
                }
            }
            Integer num = (Integer) t0Var.f4718a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = (Boolean) t0Var.f4720c;
        if (bool != null && r5 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (r5 >= 26) {
            q2.d dVar2 = (q2.d) t0Var.f4722e;
            if (dVar2 != null) {
                int r23 = io.flutter.plugin.platform.d.f3564c[dVar2.ordinal()];
                if (r23 != 1) {
                    if (r23 == 2) {
                        o3.a(false);
                    }
                } else {
                    o3.a(true);
                }
            }
            Integer num2 = (Integer) t0Var.f4721d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = (Integer) t0Var.f4723f;
        if (num3 != null && r5 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) t0Var.g;
        if (bool2 != null && r5 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f175N = t0Var;
    }

    public void e() {
        ((AbstractActivityC0292d) this.f172K).getWindow().getDecorView().setSystemUiVisibility(this.f171J);
        t0 t0Var = (t0) this.f175N;
        if (t0Var != null) {
            d(t0Var);
        }
    }

    public a(w wVar) {
        this.f171J = 0;
        this.f174M = new HashMap();
        this.f175N = new HashSet();
        this.f172K = new ArrayList();
        this.f173L = new ArrayList();
        try {
            this.f175N = wVar.f5479a.w();
        } catch (C0551f unused) {
            X.b("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        for (Set set : (Set) this.f175N) {
            ArrayList arrayList = new ArrayList(set);
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                HashMap hashMap = (HashMap) this.f174M;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new ArrayList());
                }
                if (!hashMap.containsKey(str2)) {
                    hashMap.put(str2, new ArrayList());
                }
                ((List) hashMap.get(str)).add((String) arrayList.get(1));
                ((List) hashMap.get(str2)).add((String) arrayList.get(0));
            }
        }
    }

    public a(AbstractActivityC0292d abstractActivityC0292d, J j3, AbstractActivityC0292d abstractActivityC0292d2) {
        A.c cVar = new A.c(26, this);
        this.f172K = abstractActivityC0292d;
        this.f173L = j3;
        j3.f3304L = cVar;
        this.f174M = abstractActivityC0292d2;
        this.f171J = 1280;
    }

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f172K = hashSet;
        this.f173L = new HashSet();
        this.f171J = 0;
        this.f175N = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            AbstractC0628j0.a(cls2, "Null interface");
        }
        Collections.addAll((HashSet) this.f172K, clsArr);
    }
}
