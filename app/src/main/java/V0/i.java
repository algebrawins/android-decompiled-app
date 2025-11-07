package V0;

import A0.C0001b;
import A0.RunnableC0004e;
import android.content.Context;
import d1.InterfaceC0232a;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static volatile d f1383e;

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0232a f1384a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0232a f1385b;

    /* renamed from: c  reason: collision with root package name */
    public final Z0.c f1386c;

    /* renamed from: d  reason: collision with root package name */
    public final a1.g f1387d;

    public i(InterfaceC0232a interfaceC0232a, InterfaceC0232a interfaceC0232a2, Z0.c cVar, a1.g gVar, a1.h hVar) {
        this.f1384a = interfaceC0232a;
        this.f1385b = interfaceC0232a2;
        this.f1386c = cVar;
        this.f1387d = gVar;
        hVar.getClass();
        hVar.f1828a.execute(new RunnableC0004e(8, hVar));
    }

    public static i a() {
        d dVar = f1383e;
        if (dVar != null) {
            return (i) dVar.f1375N.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f1383e == null) {
            synchronized (i.class) {
                try {
                    if (f1383e == null) {
                        A.a aVar = new A.a(19);
                        context.getClass();
                        aVar.f1K = context;
                        f1383e = aVar.m0();
                    }
                } finally {
                }
            }
        }
    }

    public final C0001b c(T0.a aVar) {
        Set singleton;
        byte[] bytes;
        if (aVar instanceof e) {
            aVar.getClass();
            singleton = Collections.unmodifiableSet(T0.a.f1204d);
        } else {
            singleton = Collections.singleton(new S0.b("proto"));
        }
        C0001b a4 = c.a();
        aVar.getClass();
        a4.f85L = "cct";
        String str = aVar.f1206a;
        String str2 = aVar.f1207b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a4.f84K = bytes;
        return new C0001b(singleton, a4.h(), this, 9);
    }
}
