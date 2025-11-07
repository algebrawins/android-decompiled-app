package io.flutter.plugins.imagepicker;

import A0.C0001b;
import D.C;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import h2.AbstractActivityC0292d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import n2.InterfaceC0394a;
import p.t0;

/* loaded from: classes.dex */
public class m implements InterfaceC0394a, o2.a {

    /* renamed from: J  reason: collision with root package name */
    public C0001b f3637J;

    /* renamed from: K  reason: collision with root package name */
    public t0 f3638K;

    /* JADX WARN: Type inference failed for: r3v0, types: [p.t0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [h1.g, java.lang.Object] */
    @Override // o2.a
    public final void a(i2.d dVar) {
        C0001b c0001b = this.f3637J;
        r2.f fVar = (r2.f) c0001b.f84K;
        AbstractActivityC0292d abstractActivityC0292d = dVar.f3441a;
        ?? obj = new Object();
        obj.f4718a = (Application) ((Context) c0001b.f85L);
        obj.f4719b = abstractActivityC0292d;
        obj.f4722e = dVar;
        obj.f4723f = fVar;
        obj.f4720c = new j(abstractActivityC0292d, new f(abstractActivityC0292d, new Object()), new b(abstractActivityC0292d));
        C.L(fVar, this);
        obj.f4721d = new l(this, abstractActivityC0292d);
        dVar.f3444d.add((j) obj.f4720c);
        dVar.f3443c.add((j) obj.f4720c);
        androidx.lifecycle.m lifecycle = dVar.f3442b.getLifecycle();
        obj.g = lifecycle;
        lifecycle.a((l) obj.f4721d);
        this.f3638K = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, io.flutter.plugins.imagepicker.o] */
    /* JADX WARN: Type inference failed for: r12v3, types: [io.flutter.plugins.imagepicker.n, java.lang.Object] */
    public final o b() {
        j jVar;
        boolean z3;
        Object obj;
        int r02;
        ArrayList arrayList;
        int intValue;
        p pVar;
        String str;
        Set<String> stringSet;
        t0 t0Var = this.f3638K;
        if (t0Var != null && ((AbstractActivityC0292d) t0Var.f4719b) != null) {
            jVar = (j) t0Var.f4720c;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            b bVar = jVar.f3624M;
            bVar.getClass();
            HashMap hashMap = new HashMap();
            AbstractActivityC0292d abstractActivityC0292d = bVar.f3607a;
            SharedPreferences sharedPreferences = abstractActivityC0292d.getSharedPreferences("flutter_image_picker_shared_preference", 0);
            boolean z4 = true;
            if (sharedPreferences.contains("flutter_image_picker_image_path") && (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", null)) != null) {
                hashMap.put("pathList", new ArrayList(stringSet));
                z3 = true;
            } else {
                z3 = false;
            }
            if (sharedPreferences.contains("flutter_image_picker_error_code")) {
                String string = sharedPreferences.getString("flutter_image_picker_error_code", "");
                if (sharedPreferences.contains("flutter_image_picker_error_message")) {
                    str = sharedPreferences.getString("flutter_image_picker_error_message", "");
                } else {
                    str = null;
                }
                ?? obj2 = new Object();
                if (string != null) {
                    obj2.f3639a = string;
                    obj2.f3640b = str;
                    hashMap.put("error", obj2);
                } else {
                    throw new IllegalStateException("Nonnull field \"code\" is null.");
                }
            } else {
                z4 = z3;
            }
            if (!z4) {
                obj = "pathList";
            } else {
                if (sharedPreferences.contains("flutter_image_picker_type")) {
                    if (sharedPreferences.getString("flutter_image_picker_type", "").equals("video")) {
                        pVar = p.VIDEO;
                    } else {
                        pVar = p.IMAGE;
                    }
                    hashMap.put("type", pVar);
                }
                obj = "pathList";
                if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                    hashMap.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
                }
                if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                    hashMap.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
                }
                hashMap.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
            }
            if (hashMap.isEmpty()) {
                return null;
            }
            p pVar2 = (p) hashMap.get("type");
            if (pVar2 == null) {
                pVar2 = null;
            }
            n nVar = (n) hashMap.get("error");
            ArrayList arrayList2 = (ArrayList) hashMap.get(obj);
            if (arrayList2 != null) {
                arrayList = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    Double d4 = (Double) hashMap.get("maxWidth");
                    Double d5 = (Double) hashMap.get("maxHeight");
                    Integer num = (Integer) hashMap.get("imageQuality");
                    if (num == null) {
                        intValue = 100;
                    } else {
                        intValue = num.intValue();
                    }
                    arrayList.add(jVar.f3623L.a(str2, d4, d5, intValue));
                }
                r02 = 0;
            } else {
                r02 = 0;
                arrayList = null;
            }
            abstractActivityC0292d.getSharedPreferences("flutter_image_picker_shared_preference", r02).edit().clear().apply();
            ?? obj3 = new Object();
            if (pVar2 != null) {
                obj3.f3641a = pVar2;
                obj3.f3642b = nVar;
                if (arrayList != null) {
                    obj3.f3643c = arrayList;
                    return obj3;
                }
                throw new IllegalStateException("Nonnull field \"paths\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }
        throw new q("no_activity", "image_picker plugin requires a foreground activity.");
    }

    @Override // o2.a
    public final void c(i2.d dVar) {
        a(dVar);
    }

    @Override // o2.a
    public final void d() {
        t0 t0Var = this.f3638K;
        if (t0Var != null) {
            i2.d dVar = (i2.d) t0Var.f4722e;
            if (dVar != null) {
                dVar.f3444d.remove((j) t0Var.f4720c);
                ((i2.d) t0Var.f4722e).f3443c.remove((j) t0Var.f4720c);
                t0Var.f4722e = null;
            }
            androidx.lifecycle.m mVar = (androidx.lifecycle.m) t0Var.g;
            if (mVar != null) {
                mVar.b((l) t0Var.f4721d);
                t0Var.g = null;
            }
            C.L((r2.f) t0Var.f4723f, null);
            Application application = (Application) t0Var.f4718a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks((l) t0Var.f4721d);
                t0Var.f4718a = null;
            }
            t0Var.f4719b = null;
            t0Var.f4721d = null;
            t0Var.f4720c = null;
            this.f3638K = null;
        }
    }

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
        this.f3637J = null;
    }

    @Override // o2.a
    public final void g() {
        d();
    }

    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
        this.f3637J = c0001b;
    }
}
