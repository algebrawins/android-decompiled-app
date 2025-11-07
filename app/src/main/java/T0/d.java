package T0;

import D.C;
import U0.e;
import U0.f;
import U0.g;
import U0.i;
import U0.j;
import U0.k;
import U0.l;
import U0.n;
import U0.o;
import U0.q;
import U0.r;
import U0.s;
import U0.t;
import U0.u;
import U0.v;
import W0.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import d1.InterfaceC0232a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final A.a f1214a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f1215b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1216c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f1217d;

    /* renamed from: e  reason: collision with root package name */
    public final InterfaceC0232a f1218e;

    /* renamed from: f  reason: collision with root package name */
    public final InterfaceC0232a f1219f;
    public final int g;

    public d(Context context, InterfaceC0232a interfaceC0232a, InterfaceC0232a interfaceC0232a2) {
        J1.d dVar = new J1.d();
        U0.c cVar = U0.c.f1262a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f1274a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        U0.d dVar2 = U0.d.f1264a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        U0.b bVar = U0.b.f1250a;
        dVar.a(U0.a.class, bVar);
        dVar.a(U0.h.class, bVar);
        e eVar = e.f1267a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f1281a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f799d = true;
        this.f1214a = new A.a(16, dVar);
        this.f1216c = context;
        this.f1215b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f1217d = b(a.f1203c);
        this.f1218e = interfaceC0232a2;
        this.f1219f = interfaceC0232a;
        this.g = 40000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException(C.I("Invalid url: ", str), e4);
        }
    }

    public final V0.b a(V0.b bVar) {
        int type;
        int subtype;
        NetworkInfo activeNetworkInfo = this.f1215b.getActiveNetworkInfo();
        V0.a c4 = bVar.c();
        int r12 = Build.VERSION.SDK_INT;
        HashMap hashMap = (HashMap) c4.f1361O;
        if (hashMap != null) {
            hashMap.put("sdk-version", String.valueOf(r12));
            c4.a("model", Build.MODEL);
            c4.a("hardware", Build.HARDWARE);
            c4.a("device", Build.DEVICE);
            c4.a("product", Build.PRODUCT);
            c4.a("os-uild", Build.ID);
            c4.a("manufacturer", Build.MANUFACTURER);
            c4.a("fingerprint", Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
            HashMap hashMap2 = (HashMap) c4.f1361O;
            if (hashMap2 != null) {
                hashMap2.put("tz-offset", String.valueOf(offset));
                if (activeNetworkInfo == null) {
                    type = u.NONE.b();
                } else {
                    type = activeNetworkInfo.getType();
                }
                HashMap hashMap3 = (HashMap) c4.f1361O;
                if (hashMap3 != null) {
                    hashMap3.put("net-type", String.valueOf(type));
                    int r22 = -1;
                    if (activeNetworkInfo == null) {
                        subtype = t.UNKNOWN_MOBILE_SUBTYPE.b();
                    } else {
                        subtype = activeNetworkInfo.getSubtype();
                        if (subtype == -1) {
                            subtype = t.COMBINED.b();
                        } else if (t.a(subtype) == null) {
                            subtype = 0;
                        }
                    }
                    HashMap hashMap4 = (HashMap) c4.f1361O;
                    if (hashMap4 != null) {
                        hashMap4.put("mobile-subtype", String.valueOf(subtype));
                        c4.a("country", Locale.getDefault().getCountry());
                        c4.a("locale", Locale.getDefault().getLanguage());
                        Context context = this.f1216c;
                        c4.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
                        try {
                            r22 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException e4) {
                            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Unable to find version code for package", e4);
                        }
                        c4.a("application_build", Integer.toString(r22));
                        return c4.c();
                    }
                    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                }
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
}
