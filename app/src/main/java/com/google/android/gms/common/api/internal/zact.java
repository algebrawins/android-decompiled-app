package com.google.android.gms.common.api.internal;

import A1.b;
import A1.c;
import B1.d;
import B1.f;
import H.e;
import V0.a;
import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.signin.internal.zac;
import h1.C0281a;
import i1.g;
import i1.h;
import j1.o;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import k1.p;
import k1.w;
import org.json.JSONException;
import u1.AbstractC0474b;
import u1.HandlerC0477e;

/* loaded from: classes.dex */
public final class zact extends zac implements g, h {

    /* renamed from: s  reason: collision with root package name */
    public static final b f2731s = c.f170a;

    /* renamed from: l  reason: collision with root package name */
    public final Context f2732l;

    /* renamed from: m  reason: collision with root package name */
    public final HandlerC0477e f2733m;

    /* renamed from: n  reason: collision with root package name */
    public final b f2734n;

    /* renamed from: o  reason: collision with root package name */
    public final Set f2735o;

    /* renamed from: p  reason: collision with root package name */
    public final a f2736p;

    /* renamed from: q  reason: collision with root package name */
    public B1.a f2737q;

    /* renamed from: r  reason: collision with root package name */
    public o f2738r;

    public zact(Context context, HandlerC0477e handlerC0477e, a aVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f2732l = context;
        this.f2733m = handlerC0477e;
        this.f2736p = aVar;
        this.f2735o = (Set) aVar.f1358L;
        this.f2734n = f2731s;
    }

    @Override // i1.h
    public final void D(C0281a c0281a) {
        this.f2738r.e(c0281a);
    }

    @Override // i1.g
    public final void Q(int r12) {
        this.f2737q.i();
    }

    @Override // i1.g
    public final void Y() {
        GoogleSignInAccount googleSignInAccount;
        B1.a aVar = this.f2737q;
        aVar.getClass();
        try {
            aVar.f189z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = aVar.f2742c;
                ReentrantLock reentrantLock = g1.a.f3239c;
                w.e(context);
                ReentrantLock reentrantLock2 = g1.a.f3239c;
                reentrantLock2.lock();
                if (g1.a.f3240d == null) {
                    g1.a.f3240d = new g1.a(context.getApplicationContext());
                }
                g1.a aVar2 = g1.a.f3240d;
                reentrantLock2.unlock();
                String a4 = aVar2.a("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(a4)) {
                    String a5 = aVar2.a("googleSignInAccount:" + a4);
                    if (a5 != null) {
                        try {
                            googleSignInAccount = GoogleSignInAccount.a(a5);
                        } catch (JSONException unused) {
                        }
                        Integer num = aVar.f187B;
                        w.e(num);
                        p pVar = new p(2, account, num.intValue(), googleSignInAccount);
                        d dVar = (d) aVar.q();
                        f fVar = new f(1, pVar);
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(dVar.f5025n);
                        AbstractC0474b.c(obtain, fVar);
                        AbstractC0474b.d(obtain, this);
                        dVar.D(obtain, 12);
                    }
                }
            }
            googleSignInAccount = null;
            Integer num2 = aVar.f187B;
            w.e(num2);
            p pVar2 = new p(2, account, num2.intValue(), googleSignInAccount);
            d dVar2 = (d) aVar.q();
            f fVar2 = new f(1, pVar2);
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(dVar2.f5025n);
            AbstractC0474b.c(obtain2, fVar2);
            AbstractC0474b.d(obtain2, this);
            dVar2.D(obtain2, 12);
        } catch (RemoteException e4) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                l0(new B1.g(1, new C0281a(8, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    @Override // com.google.android.gms.signin.internal.zac, B1.c
    public final void l0(B1.g gVar) {
        this.f2733m.post(new e(this, gVar, 17, false));
    }
}
