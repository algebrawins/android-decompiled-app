package j1;

import D.C;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import h1.AbstractC0286f;
import h1.C0281a;
import h1.C0283c;
import h1.C0284d;
import h1.C0285e;
import h2.J;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k1.C0341j;
import k1.C0342k;
import k1.C0343l;
import k1.G;
import u1.AbstractC0476d;
import u1.HandlerC0477e;
import x1.L4;

/* renamed from: j1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304c implements Handler.Callback {

    /* renamed from: o  reason: collision with root package name */
    public static final Status f3795o = new Status("Sign-out occurred while this API call was in progress.", 4);

    /* renamed from: p  reason: collision with root package name */
    public static final Status f3796p = new Status("The user must be signed in to make this API call.", 4);

    /* renamed from: q  reason: collision with root package name */
    public static final Object f3797q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public static C0304c f3798r;

    /* renamed from: a  reason: collision with root package name */
    public long f3799a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3800b;

    /* renamed from: c  reason: collision with root package name */
    public C0343l f3801c;

    /* renamed from: d  reason: collision with root package name */
    public m1.b f3802d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f3803e;

    /* renamed from: f  reason: collision with root package name */
    public final C0284d f3804f;
    public final J g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f3805h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f3806i;

    /* renamed from: j  reason: collision with root package name */
    public final ConcurrentHashMap f3807j;

    /* renamed from: k  reason: collision with root package name */
    public final R.c f3808k;

    /* renamed from: l  reason: collision with root package name */
    public final R.c f3809l;

    /* renamed from: m  reason: collision with root package name */
    public final HandlerC0477e f3810m;

    /* renamed from: n  reason: collision with root package name */
    public volatile boolean f3811n;

    /* JADX WARN: Type inference failed for: r2v5, types: [u1.e, android.os.Handler] */
    public C0304c(Context context, Looper looper) {
        C0284d c0284d = C0284d.f3260d;
        this.f3799a = 10000L;
        this.f3800b = false;
        boolean z3 = true;
        this.f3805h = new AtomicInteger(1);
        this.f3806i = new AtomicInteger(0);
        this.f3807j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f3808k = new R.c(0);
        this.f3809l = new R.c(0);
        this.f3811n = true;
        this.f3803e = context;
        ?? handler = new Handler(looper, this);
        this.f3810m = handler;
        this.f3804f = c0284d;
        this.g = new J(7);
        PackageManager packageManager = context.getPackageManager();
        if (L4.f5666d == null) {
            L4.f5666d = Boolean.valueOf((Build.VERSION.SDK_INT < 26 || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : false);
        }
        if (L4.f5666d.booleanValue()) {
            this.f3811n = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static Status c(C0302a c0302a, C0281a c0281a) {
        String valueOf = String.valueOf(c0281a);
        return new Status(1, 17, "API: " + ((String) c0302a.f3787b.f3304L) + " is not available on this device. Connection failed with: " + valueOf, c0281a.f3251c, c0281a);
    }

    public static C0304c e(Context context) {
        C0304c c0304c;
        synchronized (f3797q) {
            try {
                if (f3798r == null) {
                    Looper looper = G.a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = C0284d.f3259c;
                    f3798r = new C0304c(applicationContext, looper);
                }
                c0304c = f3798r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0304c;
    }

    public final boolean a() {
        if (this.f3800b) {
            return false;
        }
        C0342k c0342k = (C0342k) C0341j.b().f4051a;
        if (c0342k != null && !c0342k.f4053b) {
            return false;
        }
        int r02 = ((SparseIntArray) this.g.f3303K).get(203400000, -1);
        if (r02 != -1 && r02 != 0) {
            return false;
        }
        return true;
    }

    public final boolean b(C0281a c0281a, int r11) {
        PendingIntent pendingIntent;
        boolean z3;
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent pendingIntent2;
        Boolean bool;
        C0284d c0284d = this.f3804f;
        Context context = this.f3803e;
        c0284d.getClass();
        synchronized (C2.h.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = C2.h.f267a;
            pendingIntent = null;
            if (context2 != null && (bool = C2.h.f268b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            C2.h.f268b = null;
            if (Build.VERSION.SDK_INT >= 26) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                C2.h.f268b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    C2.h.f268b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    C2.h.f268b = Boolean.FALSE;
                }
            }
            C2.h.f267a = applicationContext;
            booleanValue = C2.h.f268b.booleanValue();
        }
        if (!booleanValue) {
            int r22 = c0281a.f3250b;
            if (r22 == 0 || (pendingIntent2 = c0281a.f3251c) == null) {
                Intent b3 = c0284d.b(r22, context, null);
                if (b3 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, b3, v1.b.f5046a | 134217728);
                }
                pendingIntent2 = pendingIntent;
            }
            if (pendingIntent2 != null) {
                int r10 = c0281a.f3250b;
                int r23 = GoogleApiActivity.f2722K;
                Intent intent = new Intent(context, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent2);
                intent.putExtra("failing_client_id", r11);
                intent.putExtra("notify_manager", true);
                c0284d.g(context, r10, PendingIntent.getActivity(context, 0, intent, AbstractC0476d.f5030a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final m d(i1.f fVar) {
        C0302a c0302a = fVar.f3413e;
        ConcurrentHashMap concurrentHashMap = this.f3807j;
        m mVar = (m) concurrentHashMap.get(c0302a);
        if (mVar == null) {
            mVar = new m(this, fVar);
            concurrentHashMap.put(c0302a, mVar);
        }
        if (mVar.f3816m.k()) {
            this.f3809l.add(c0302a);
        }
        mVar.j();
        return mVar;
    }

    public final void f(C0281a c0281a, int r5) {
        if (!b(c0281a, r5)) {
            HandlerC0477e handlerC0477e = this.f3810m;
            handlerC0477e.sendMessage(handlerC0477e.obtainMessage(5, r5, 0, c0281a));
        }
    }

    /* JADX WARN: Type inference failed for: r1v53, types: [i1.f, m1.b] */
    /* JADX WARN: Type inference failed for: r1v66, types: [i1.f, m1.b] */
    /* JADX WARN: Type inference failed for: r2v24, types: [i1.f, m1.b] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        C0283c[] b3;
        int r02 = message.what;
        long j3 = 300000;
        m mVar = null;
        switch (r02) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j3 = 10000;
                }
                this.f3799a = j3;
                this.f3810m.removeMessages(12);
                for (C0302a c0302a : this.f3807j.keySet()) {
                    HandlerC0477e handlerC0477e = this.f3810m;
                    handlerC0477e.sendMessageDelayed(handlerC0477e.obtainMessage(12, c0302a), this.f3799a);
                }
                break;
            case 2:
                throw C.u(message.obj);
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                for (m mVar2 : this.f3807j.values()) {
                    k1.w.b(mVar2.f3827x.f3810m);
                    mVar2.f3825v = null;
                    mVar2.j();
                }
                break;
            case 4:
            case 8:
            case 13:
                v vVar = (v) message.obj;
                m mVar3 = (m) this.f3807j.get(vVar.f3850c.f3413e);
                if (mVar3 == null) {
                    mVar3 = d(vVar.f3850c);
                }
                if (mVar3.f3816m.k() && this.f3806i.get() != vVar.f3849b) {
                    vVar.f3848a.c(f3795o);
                    mVar3.m();
                    break;
                } else {
                    mVar3.k(vVar.f3848a);
                    break;
                }
                break;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                int r03 = message.arg1;
                C0281a c0281a = (C0281a) message.obj;
                Iterator it = this.f3807j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        m mVar4 = (m) it.next();
                        if (mVar4.f3821r == r03) {
                            mVar = mVar4;
                        }
                    }
                }
                if (mVar != null) {
                    int r04 = c0281a.f3250b;
                    if (r04 == 13) {
                        this.f3804f.getClass();
                        int r22 = AbstractC0286f.f3265c;
                        String a4 = C0281a.a(r04);
                        String str = c0281a.f3252d;
                        mVar.b(new Status("Error resolution was canceled by the user, original error message: " + a4 + ": " + str, 17));
                        break;
                    } else {
                        mVar.b(c(mVar.f3817n, c0281a));
                        break;
                    }
                } else {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + r03 + " while trying to fail enqueued calls.", new Exception());
                    break;
                }
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (this.f3803e.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f3803e.getApplicationContext();
                    ComponentCallbacks2C0303b componentCallbacks2C0303b = ComponentCallbacks2C0303b.f3790N;
                    synchronized (componentCallbacks2C0303b) {
                        try {
                            if (!componentCallbacks2C0303b.f3794M) {
                                application.registerActivityLifecycleCallbacks(componentCallbacks2C0303b);
                                application.registerComponentCallbacks(componentCallbacks2C0303b);
                                componentCallbacks2C0303b.f3794M = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    componentCallbacks2C0303b.a(new k(this));
                    AtomicBoolean atomicBoolean = componentCallbacks2C0303b.f3792K;
                    boolean z3 = atomicBoolean.get();
                    AtomicBoolean atomicBoolean2 = componentCallbacks2C0303b.f3791J;
                    if (!z3) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            atomicBoolean2.set(true);
                        }
                    }
                    if (!atomicBoolean2.get()) {
                        this.f3799a = 300000L;
                        break;
                    }
                }
                break;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                d((i1.f) message.obj);
                break;
            case 9:
                if (this.f3807j.containsKey(message.obj)) {
                    m mVar5 = (m) this.f3807j.get(message.obj);
                    k1.w.b(mVar5.f3827x.f3810m);
                    if (mVar5.f3823t) {
                        mVar5.j();
                        break;
                    }
                }
                break;
            case 10:
                Iterator it2 = this.f3809l.iterator();
                while (true) {
                    R.g gVar = (R.g) it2;
                    if (gVar.hasNext()) {
                        m mVar6 = (m) this.f3807j.remove((C0302a) gVar.next());
                        if (mVar6 != null) {
                            mVar6.m();
                        }
                    } else {
                        this.f3809l.clear();
                        break;
                    }
                }
            case 11:
                if (this.f3807j.containsKey(message.obj)) {
                    m mVar7 = (m) this.f3807j.get(message.obj);
                    C0304c c0304c = mVar7.f3827x;
                    k1.w.b(c0304c.f3810m);
                    boolean z4 = mVar7.f3823t;
                    if (z4) {
                        if (z4) {
                            C0304c c0304c2 = mVar7.f3827x;
                            HandlerC0477e handlerC0477e2 = c0304c2.f3810m;
                            C0302a c0302a2 = mVar7.f3817n;
                            handlerC0477e2.removeMessages(11, c0302a2);
                            c0304c2.f3810m.removeMessages(9, c0302a2);
                            mVar7.f3823t = false;
                        }
                        if (c0304c.f3804f.c(c0304c.f3803e, C0285e.f3261a) == 18) {
                            status = new Status("Connection timed out waiting for Google Play services update to complete.", 21);
                        } else {
                            status = new Status("API failed to connect while resuming due to an unknown error.", 22);
                        }
                        mVar7.b(status);
                        mVar7.f3816m.j("Timing out connection while resuming.");
                        break;
                    }
                }
                break;
            case 12:
                if (this.f3807j.containsKey(message.obj)) {
                    m mVar8 = (m) this.f3807j.get(message.obj);
                    k1.w.b(mVar8.f3827x.f3810m);
                    i1.c cVar = mVar8.f3816m;
                    if (cVar.d() && mVar8.f3820q.size() == 0) {
                        J j4 = mVar8.f3818o;
                        if (((Map) j4.f3303K).isEmpty() && ((Map) j4.f3304L).isEmpty()) {
                            cVar.j("Timing out service connection.");
                            break;
                        } else {
                            mVar8.g();
                            break;
                        }
                    }
                }
                break;
            case 14:
                throw C.u(message.obj);
            case 15:
                n nVar = (n) message.obj;
                if (this.f3807j.containsKey(nVar.f3828a)) {
                    m mVar9 = (m) this.f3807j.get(nVar.f3828a);
                    if (mVar9.f3824u.contains(nVar) && !mVar9.f3823t) {
                        if (!mVar9.f3816m.d()) {
                            mVar9.j();
                            break;
                        } else {
                            mVar9.d();
                            break;
                        }
                    }
                }
                break;
            case 16:
                n nVar2 = (n) message.obj;
                if (this.f3807j.containsKey(nVar2.f3828a)) {
                    m mVar10 = (m) this.f3807j.get(nVar2.f3828a);
                    if (mVar10.f3824u.remove(nVar2)) {
                        C0304c c0304c3 = mVar10.f3827x;
                        c0304c3.f3810m.removeMessages(15, nVar2);
                        c0304c3.f3810m.removeMessages(16, nVar2);
                        C0283c c0283c = nVar2.f3829b;
                        LinkedList<s> linkedList = mVar10.f3815l;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        for (s sVar : linkedList) {
                            if ((sVar instanceof s) && (b3 = sVar.b(mVar10)) != null) {
                                int length = b3.length;
                                int r9 = 0;
                                while (true) {
                                    if (r9 >= length) {
                                        break;
                                    } else if (k1.w.h(b3[r9], c0283c)) {
                                        if (r9 >= 0) {
                                            arrayList.add(sVar);
                                        }
                                    } else {
                                        r9++;
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int r5 = 0; r5 < size; r5++) {
                            s sVar2 = (s) arrayList.get(r5);
                            linkedList.remove(sVar2);
                            sVar2.d(new i1.l(c0283c));
                        }
                        break;
                    }
                }
                break;
            case 17:
                C0343l c0343l = this.f3801c;
                if (c0343l != null) {
                    if (c0343l.f4057a > 0 || a()) {
                        if (this.f3802d == null) {
                            this.f3802d = new i1.f(this.f3803e, m1.b.f4118i, k1.m.f4059c, i1.e.f3407b);
                        }
                        this.f3802d.c(c0343l);
                    }
                    this.f3801c = null;
                    break;
                }
                break;
            case 18:
                u uVar = (u) message.obj;
                if (uVar.f3846c == 0) {
                    C0343l c0343l2 = new C0343l(uVar.f3845b, Arrays.asList(uVar.f3844a));
                    if (this.f3802d == null) {
                        this.f3802d = new i1.f(this.f3803e, m1.b.f4118i, k1.m.f4059c, i1.e.f3407b);
                    }
                    this.f3802d.c(c0343l2);
                    break;
                } else {
                    C0343l c0343l3 = this.f3801c;
                    if (c0343l3 != null) {
                        List list = c0343l3.f4058b;
                        if (c0343l3.f4057a == uVar.f3845b && (list == null || list.size() < uVar.f3847d)) {
                            C0343l c0343l4 = this.f3801c;
                            k1.i iVar = uVar.f3844a;
                            if (c0343l4.f4058b == null) {
                                c0343l4.f4058b = new ArrayList();
                            }
                            c0343l4.f4058b.add(iVar);
                        } else {
                            this.f3810m.removeMessages(17);
                            C0343l c0343l5 = this.f3801c;
                            if (c0343l5 != null) {
                                if (c0343l5.f4057a > 0 || a()) {
                                    if (this.f3802d == null) {
                                        this.f3802d = new i1.f(this.f3803e, m1.b.f4118i, k1.m.f4059c, i1.e.f3407b);
                                    }
                                    this.f3802d.c(c0343l5);
                                }
                                this.f3801c = null;
                            }
                        }
                    }
                    if (this.f3801c == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(uVar.f3844a);
                        this.f3801c = new C0343l(uVar.f3845b, arrayList2);
                        HandlerC0477e handlerC0477e3 = this.f3810m;
                        handlerC0477e3.sendMessageDelayed(handlerC0477e3.obtainMessage(17), uVar.f3846c);
                        break;
                    }
                }
                break;
            case 19:
                this.f3800b = false;
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + r02);
                return false;
        }
        return true;
    }
}
