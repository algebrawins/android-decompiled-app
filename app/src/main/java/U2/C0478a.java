package u2;

import A0.C0001b;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import h2.J;
import i2.d;
import java.util.HashMap;
import java.util.List;
import n2.InterfaceC0394a;
import q2.n;
import r2.o;

/* renamed from: u2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0478a implements InterfaceC0394a, o2.a, o {

    /* renamed from: J  reason: collision with root package name */
    public final PackageManager f5031J;

    /* renamed from: K  reason: collision with root package name */
    public d f5032K;

    /* renamed from: L  reason: collision with root package name */
    public HashMap f5033L;

    /* renamed from: M  reason: collision with root package name */
    public final HashMap f5034M = new HashMap();

    public C0478a(J j3) {
        this.f5031J = (PackageManager) j3.f3303K;
        j3.f3304L = this;
    }

    @Override // o2.a
    public final void a(d dVar) {
        this.f5032K = dVar;
        dVar.f3444d.add(this);
    }

    @Override // r2.o
    public final boolean b(int r3, int r4, Intent intent) {
        String str;
        HashMap hashMap = this.f5034M;
        if (!hashMap.containsKey(Integer.valueOf(r3))) {
            return false;
        }
        if (r4 == -1) {
            str = intent.getStringExtra("android.intent.extra.PROCESS_TEXT");
        } else {
            str = null;
        }
        ((n) hashMap.remove(Integer.valueOf(r3))).c(str);
        return true;
    }

    @Override // o2.a
    public final void c(d dVar) {
        this.f5032K = dVar;
        dVar.f3444d.add(this);
    }

    @Override // o2.a
    public final void d() {
        this.f5032K.f3444d.remove(this);
        this.f5032K = null;
    }

    public final void e(String str, String str2, boolean z3, n nVar) {
        if (this.f5032K == null) {
            nVar.a("error", "Plugin not bound to an Activity", null);
        } else if (Build.VERSION.SDK_INT < 23) {
            nVar.a("error", "Android version not supported", null);
        } else {
            HashMap hashMap = this.f5033L;
            if (hashMap == null) {
                nVar.a("error", "Can not process text actions before calling queryTextActions", null);
                return;
            }
            ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
            if (resolveInfo == null) {
                nVar.a("error", "Text processing activity not found", null);
                return;
            }
            int hashCode = nVar.hashCode();
            this.f5034M.put(Integer.valueOf(hashCode), nVar);
            Intent intent = new Intent();
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent.setClassName(activityInfo.packageName, activityInfo.name);
            intent.setAction("android.intent.action.PROCESS_TEXT");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
            intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z3);
            this.f5032K.f3441a.startActivityForResult(intent, hashCode);
        }
    }

    @Override // o2.a
    public final void g() {
        this.f5032K.f3444d.remove(this);
        this.f5032K = null;
    }

    public final HashMap i() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f5033L;
        PackageManager packageManager = this.f5031J;
        if (hashMap == null) {
            this.f5033L = new HashMap();
            int r02 = Build.VERSION.SDK_INT;
            if (r02 >= 23) {
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if (r02 >= 33) {
                    of = PackageManager.ResolveInfoFlags.of(0L);
                    queryIntentActivities = packageManager.queryIntentActivities(type, of);
                } else {
                    queryIntentActivities = packageManager.queryIntentActivities(type, 0);
                }
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    String str = resolveInfo.activityInfo.name;
                    resolveInfo.loadLabel(packageManager).toString();
                    this.f5033L.put(str, resolveInfo);
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f5033L.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f5033L.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
    }

    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
    }
}
