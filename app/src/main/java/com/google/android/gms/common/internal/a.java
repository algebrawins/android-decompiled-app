package com.google.android.gms.common.internal;

import A0.RunnableC0004e;
import E.d;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import h1.C0281a;
import h1.C0283c;
import h1.C0284d;
import h1.C0285e;
import i1.c;
import i1.g;
import i1.h;
import j1.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import k1.C;
import k1.C0331A;
import k1.C0332B;
import k1.C0335c;
import k1.C0341j;
import k1.D;
import k1.G;
import k1.InterfaceC0333a;
import k1.InterfaceC0336d;
import k1.InterfaceC0339g;
import k1.r;
import k1.t;
import k1.w;
import k1.y;
import k1.z;

/* loaded from: classes.dex */
public abstract class a implements c {

    /* renamed from: x  reason: collision with root package name */
    public static final C0283c[] f2739x = new C0283c[0];

    /* renamed from: a  reason: collision with root package name */
    public volatile String f2740a;

    /* renamed from: b  reason: collision with root package name */
    public d f2741b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2742c;

    /* renamed from: d  reason: collision with root package name */
    public final G f2743d;

    /* renamed from: e  reason: collision with root package name */
    public final y f2744e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f2745f;
    public final Object g;

    /* renamed from: h  reason: collision with root package name */
    public InterfaceC0339g f2746h;

    /* renamed from: i  reason: collision with root package name */
    public InterfaceC0333a f2747i;

    /* renamed from: j  reason: collision with root package name */
    public IInterface f2748j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f2749k;

    /* renamed from: l  reason: collision with root package name */
    public z f2750l;

    /* renamed from: m  reason: collision with root package name */
    public int f2751m;

    /* renamed from: n  reason: collision with root package name */
    public final C0341j f2752n;

    /* renamed from: o  reason: collision with root package name */
    public final C0341j f2753o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2754p;

    /* renamed from: q  reason: collision with root package name */
    public final String f2755q;

    /* renamed from: r  reason: collision with root package name */
    public volatile String f2756r;

    /* renamed from: s  reason: collision with root package name */
    public C0281a f2757s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2758t;

    /* renamed from: u  reason: collision with root package name */
    public volatile C f2759u;

    /* renamed from: v  reason: collision with root package name */
    public final AtomicInteger f2760v;

    /* renamed from: w  reason: collision with root package name */
    public final Set f2761w;

    public a(Context context, Looper looper, int r7, V0.a aVar, g gVar, h hVar) {
        synchronized (G.g) {
            try {
                if (G.f4008h == null) {
                    G.f4008h = new G(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G g = G.f4008h;
        Object obj = C0284d.f3259c;
        w.e(gVar);
        w.e(hVar);
        C0341j c0341j = new C0341j(gVar);
        C0341j c0341j2 = new C0341j(hVar);
        this.f2740a = null;
        this.f2745f = new Object();
        this.g = new Object();
        this.f2749k = new ArrayList();
        this.f2751m = 1;
        this.f2757s = null;
        this.f2758t = false;
        this.f2759u = null;
        this.f2760v = new AtomicInteger(0);
        w.f(context, "Context must not be null");
        this.f2742c = context;
        w.f(looper, "Looper must not be null");
        w.f(g, "Supervisor must not be null");
        this.f2743d = g;
        this.f2744e = new y(this, looper);
        this.f2754p = r7;
        this.f2752n = c0341j;
        this.f2753o = c0341j2;
        this.f2755q = (String) aVar.f1360N;
        Set<Scope> set = (Set) aVar.f1359M;
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2761w = set;
    }

    public static /* bridge */ /* synthetic */ void u(a aVar) {
        int r12;
        int r02;
        synchronized (aVar.f2745f) {
            r12 = aVar.f2751m;
        }
        if (r12 == 3) {
            aVar.f2758t = true;
            r02 = 5;
        } else {
            r02 = 4;
        }
        y yVar = aVar.f2744e;
        yVar.sendMessage(yVar.obtainMessage(r02, aVar.f2760v.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean v(a aVar, int r3, int r4, IInterface iInterface) {
        synchronized (aVar.f2745f) {
            try {
                if (aVar.f2751m != r3) {
                    return false;
                }
                aVar.w(r4, iInterface);
                return true;
            } finally {
            }
        }
    }

    @Override // i1.c
    public final void a(A.c cVar) {
        ((m) cVar.f5K).f3827x.f3810m.post(new RunnableC0004e(12, cVar));
    }

    @Override // i1.c
    public final boolean b() {
        boolean z3;
        synchronized (this.f2745f) {
            int r12 = this.f2751m;
            z3 = true;
            if (r12 != 2 && r12 != 3) {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // i1.c
    public final C0283c[] c() {
        C c4 = this.f2759u;
        if (c4 == null) {
            return null;
        }
        return c4.f3993b;
    }

    @Override // i1.c
    public final boolean d() {
        boolean z3;
        synchronized (this.f2745f) {
            if (this.f2751m == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // i1.c
    public final void e() {
        if (d() && this.f2741b != null) {
            return;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @Override // i1.c
    public final void f(InterfaceC0336d interfaceC0336d, Set set) {
        Bundle p2 = p();
        int r5 = this.f2754p;
        String str = this.f2756r;
        int r6 = C0285e.f3261a;
        Scope[] scopeArr = C0335c.f4023o;
        Bundle bundle = new Bundle();
        C0283c[] c0283cArr = C0335c.f4024p;
        C0335c c0335c = new C0335c(6, r5, r6, null, null, scopeArr, bundle, null, c0283cArr, c0283cArr, true, 0, false, str);
        c0335c.f4028d = this.f2742c.getPackageName();
        c0335c.g = p2;
        if (set != null) {
            c0335c.f4030f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (k()) {
            c0335c.f4031h = new Account("<<default account>>", "com.google");
            if (interfaceC0336d != null) {
                c0335c.f4029e = interfaceC0336d.asBinder();
            }
        }
        c0335c.f4032i = f2739x;
        c0335c.f4033j = o();
        if (this instanceof o1.h) {
            c0335c.f4036m = true;
        }
        try {
            synchronized (this.g) {
                try {
                    InterfaceC0339g interfaceC0339g = this.f2746h;
                    if (interfaceC0339g != null) {
                        ((t) interfaceC0339g).N(new zzd(this, this.f2760v.get()), c0335c);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            y yVar = this.f2744e;
            yVar.sendMessage(yVar.obtainMessage(6, this.f2760v.get(), 3));
        } catch (RemoteException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int r02 = this.f2760v.get();
            C0331A c0331a = new C0331A(this, 8, null, null);
            y yVar2 = this.f2744e;
            yVar2.sendMessage(yVar2.obtainMessage(1, r02, -1, c0331a));
        } catch (SecurityException e6) {
            throw e6;
        } catch (RuntimeException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int r022 = this.f2760v.get();
            C0331A c0331a2 = new C0331A(this, 8, null, null);
            y yVar22 = this.f2744e;
            yVar22.sendMessage(yVar22.obtainMessage(1, r022, -1, c0331a2));
        }
    }

    @Override // i1.c
    public final String g() {
        return this.f2740a;
    }

    @Override // i1.c
    public final Set h() {
        if (k()) {
            return this.f2761w;
        }
        return Collections.emptySet();
    }

    @Override // i1.c
    public final void i() {
        this.f2760v.incrementAndGet();
        synchronized (this.f2749k) {
            try {
                int size = this.f2749k.size();
                for (int r22 = 0; r22 < size; r22++) {
                    ((r) this.f2749k.get(r22)).c();
                }
                this.f2749k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.g) {
            this.f2746h = null;
        }
        w(1, null);
    }

    @Override // i1.c
    public final void j(String str) {
        this.f2740a = str;
        i();
    }

    @Override // i1.c
    public boolean k() {
        return false;
    }

    @Override // i1.c
    public final void m(InterfaceC0333a interfaceC0333a) {
        this.f2747i = interfaceC0333a;
        w(2, null);
    }

    public abstract IInterface n(IBinder iBinder);

    public C0283c[] o() {
        return f2739x;
    }

    public Bundle p() {
        return new Bundle();
    }

    public final IInterface q() {
        IInterface iInterface;
        synchronized (this.f2745f) {
            try {
                if (this.f2751m != 5) {
                    if (d()) {
                        iInterface = this.f2748j;
                        w.f(iInterface, "Client is connected but service is null");
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String r();

    public abstract String s();

    public boolean t() {
        if (l() >= 211700000) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, E.d] */
    public final void w(int r9, IInterface iInterface) {
        boolean z3;
        d dVar;
        boolean z4 = false;
        if (r9 != 4) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (iInterface != null) {
            z4 = true;
        }
        if (z3 == z4) {
            synchronized (this.f2745f) {
                try {
                    this.f2751m = r9;
                    this.f2748j = iInterface;
                    if (r9 != 1) {
                        if (r9 != 2 && r9 != 3) {
                            if (r9 == 4) {
                                w.e(iInterface);
                                System.currentTimeMillis();
                            }
                        } else {
                            z zVar = this.f2750l;
                            if (zVar != null && (dVar = this.f2741b) != null) {
                                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) dVar.f508b) + " on com.google.android.gms");
                                G g = this.f2743d;
                                String str = (String) this.f2741b.f508b;
                                w.e(str);
                                this.f2741b.getClass();
                                if (this.f2755q == null) {
                                    this.f2742c.getClass();
                                }
                                g.b(str, zVar, this.f2741b.f507a);
                                this.f2760v.incrementAndGet();
                            }
                            z zVar2 = new z(this, this.f2760v.get());
                            this.f2750l = zVar2;
                            String s3 = s();
                            boolean t3 = t();
                            ?? obj = new Object();
                            obj.f508b = s3;
                            obj.f507a = t3;
                            this.f2741b = obj;
                            if (t3 && l() < 17895000) {
                                throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f2741b.f508b)));
                            }
                            G g3 = this.f2743d;
                            String str2 = (String) this.f2741b.f508b;
                            w.e(str2);
                            this.f2741b.getClass();
                            String str3 = this.f2755q;
                            if (str3 == null) {
                                str3 = this.f2742c.getClass().getName();
                            }
                            if (!g3.c(new D(str2, this.f2741b.f507a), zVar2, str3)) {
                                Log.w("GmsClient", "unable to connect to service: " + ((String) this.f2741b.f508b) + " on com.google.android.gms");
                                int r92 = this.f2760v.get();
                                C0332B c0332b = new C0332B(this, 16);
                                y yVar = this.f2744e;
                                yVar.sendMessage(yVar.obtainMessage(7, r92, -1, c0332b));
                            }
                        }
                    } else {
                        z zVar3 = this.f2750l;
                        if (zVar3 != null) {
                            G g4 = this.f2743d;
                            String str4 = (String) this.f2741b.f508b;
                            w.e(str4);
                            this.f2741b.getClass();
                            if (this.f2755q == null) {
                                this.f2742c.getClass();
                            }
                            g4.b(str4, zVar3, this.f2741b.f507a);
                            this.f2750l = null;
                        }
                    }
                } finally {
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }
}
