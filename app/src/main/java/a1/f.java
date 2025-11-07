package a1;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b1.InterfaceC0147c;
import c1.C0159a;
import c1.InterfaceC0161c;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final g f1818J;

    /* renamed from: K  reason: collision with root package name */
    public final V0.c f1819K;

    /* renamed from: L  reason: collision with root package name */
    public final int f1820L;

    /* renamed from: M  reason: collision with root package name */
    public final Runnable f1821M;

    public f(g gVar, V0.c cVar, int r3, Runnable runnable) {
        this.f1818J = gVar;
        this.f1819K = cVar;
        this.f1820L = r3;
        this.f1821M = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f1818J;
        V0.c cVar = this.f1819K;
        int r22 = this.f1820L;
        Runnable runnable = this.f1821M;
        try {
            try {
                InterfaceC0161c interfaceC0161c = gVar.f1827f;
                InterfaceC0147c interfaceC0147c = gVar.f1824c;
                interfaceC0147c.getClass();
                ((b1.h) interfaceC0161c).h(new A.c(19, interfaceC0147c));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) gVar.f1822a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    gVar.a(cVar, r22);
                } else {
                    ((b1.h) gVar.f1827f).h(new U1.h(r22, gVar, cVar));
                }
            } catch (C0159a unused) {
                gVar.f1825d.a(cVar, r22 + 1, false);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
