package D;

import D.C0029j;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC0086n;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d2.C0233a;
import d2.C0235c;
import d2.C0236d;
import e0.InterfaceC0247a;
import h1.C0287g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p.C0419s;
import w.C0501k;
import w.C0511v;
import w.InterfaceC0500j;
import x1.AbstractC0636k0;
import x1.AbstractC0699s0;

/* renamed from: D.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0023c implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f367J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f368K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f369L;

    public /* synthetic */ RunnableC0023c(int r12, Object obj, Object obj2) {
        this.f367J = r12;
        this.f368K = obj;
        this.f369L = obj2;
    }

    private final void a() {
        androidx.camera.core.impl.D d4 = (androidx.camera.core.impl.D) this.f368K;
        String str = (String) this.f369L;
        d4.getClass();
        try {
            d4.f2113e.get();
            d4.e(androidx.camera.core.impl.D.f2108n.decrementAndGet(), androidx.camera.core.impl.D.f2107m.get(), "Surface terminated");
        } catch (Exception e4) {
            x1.X.b("DeferrableSurface", "Unexpected surface termination for " + d4 + "\nStack Trace:\n" + str);
            synchronized (d4.f2109a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", d4, Boolean.valueOf(d4.f2111c), Integer.valueOf(d4.f2110b)), e4);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        Handler handler;
        switch (this.f367J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                B0.e eVar = (B0.e) this.f368K;
                eVar.getClass();
                ((androidx.camera.core.impl.K) this.f369L).a(eVar);
                return;
            case 1:
                ((f0) this.f368K).a();
                f0 f0Var = (f0) this.f369L;
                if (f0Var != null) {
                    f0Var.a();
                    return;
                }
                return;
            case 2:
                b0 b0Var = (b0) this.f368K;
                b0Var.getClass();
                ((androidx.camera.core.impl.K) this.f369L).a(b0Var);
                return;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((d0) this.f368K).b((n0) this.f369L);
                return;
            case 4:
                N.f fVar = (N.f) this.f368K;
                N.n nVar = (N.n) this.f369L;
                G.e eVar2 = fVar.f890c;
                I.d dVar = new I.d(1, fVar, nVar);
                synchronized (nVar.f948J) {
                    nVar.f954P = eVar2;
                    nVar.f953O = dVar;
                    z3 = nVar.f955Q;
                }
                if (z3) {
                    nVar.a();
                }
                Surface surface = nVar.f949K;
                N.h hVar = fVar.f888a;
                hVar.d(true);
                hVar.c();
                HashMap hashMap = hVar.f908b;
                if (!hashMap.containsKey(surface)) {
                    hashMap.put(surface, N.h.f906t);
                }
                fVar.f894h.put(nVar, surface);
                return;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                final N.f fVar2 = (N.f) this.f368K;
                fVar2.f895i++;
                N.h hVar2 = fVar2.f888a;
                hVar2.d(true);
                hVar2.c();
                final SurfaceTexture surfaceTexture = new SurfaceTexture(hVar2.f914i);
                n0 n0Var = (n0) this.f369L;
                Size size = n0Var.f424b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface2 = new Surface(surfaceTexture);
                n0Var.a(surface2, fVar2.f890c, new InterfaceC0247a() { // from class: N.e
                    @Override // e0.InterfaceC0247a
                    public final void accept(Object obj) {
                        C0029j c0029j = (C0029j) obj;
                        f fVar3 = f.this;
                        fVar3.getClass();
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        fVar3.f895i--;
                        fVar3.a();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(fVar2, fVar2.f891d);
                return;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                N.n nVar2 = (N.n) this.f368K;
                nVar2.getClass();
                ((InterfaceC0247a) ((AtomicReference) this.f369L).get()).accept(new i(nVar2));
                return;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C0419s) this.f368K).b((Typeface) this.f369L);
                return;
            case 8:
                a();
                return;
            case 9:
                H.j jVar = (H.j) this.f368K;
                if (!jVar.isDone()) {
                    ((S.i) this.f369L).b(new TimeoutException("Cannot complete surfaceList within 5000"));
                    jVar.cancel(true);
                    return;
                }
                return;
            case 10:
                r2.g gVar = (r2.g) ((C0235c) this.f368K).f3003K;
                if (gVar != null) {
                    gVar.a(this.f369L);
                    return;
                }
                return;
            case 11:
                e2.d dVar2 = (e2.d) this.f369L;
                ((q2.n) this.f368K).c(C2.t.b(new B2.c("textureId", Long.valueOf(dVar2.f3095d)), new B2.c("size", C2.t.b(new B2.c("width", Double.valueOf(dVar2.f3092a)), new B2.c("height", Double.valueOf(dVar2.f3093b)))), new B2.c("currentTorchState", Integer.valueOf(dVar2.f3094c)), new B2.c("numberOfCameras", Integer.valueOf(dVar2.f3096e))));
                return;
            case 12:
                Exception exc = (Exception) this.f368K;
                boolean z4 = exc instanceof C0233a;
                q2.n nVar3 = (q2.n) this.f369L;
                if (z4) {
                    nVar3.a("MobileScanner", "Called start() while already started", null);
                    return;
                } else if (exc instanceof C0236d) {
                    nVar3.a("MobileScanner", "Error occurred when setting up camera!", null);
                    return;
                } else if (exc instanceof d2.t) {
                    nVar3.a("MobileScanner", "No camera found or failed to open camera!", null);
                    return;
                } else {
                    nVar3.a("MobileScanner", "Unknown error occurred.", null);
                    return;
                }
            case 13:
                d2.q qVar = (d2.q) this.f368K;
                q2.n nVar4 = (q2.n) qVar.f3054P;
                if (nVar4 != null) {
                    nVar4.c(C2.t.b(new B2.c("name", "barcode"), new B2.c("data", (List) this.f369L)));
                }
                qVar.f3054P = null;
                return;
            case 14:
                d2.q qVar2 = (d2.q) this.f368K;
                q2.n nVar5 = (q2.n) qVar2.f3054P;
                if (nVar5 != null) {
                    nVar5.a("MobileScanner", (String) this.f369L, null);
                }
                qVar2.f3054P = null;
                return;
            case 15:
                final C0501k c0501k = (C0501k) this.f368K;
                final long r3 = c0501k.r();
                H.f.e(true, AbstractC0699s0.a(new S.j() { // from class: w.d
                    @Override // S.j
                    public final Object a0(final S.i iVar) {
                        C0501k c0501k2 = C0501k.this;
                        c0501k2.getClass();
                        final long j3 = r3;
                        c0501k2.a(new InterfaceC0500j() { // from class: w.f
                            @Override // w.InterfaceC0500j
                            public final boolean a(TotalCaptureResult totalCaptureResult) {
                                Long l3;
                                long j4 = j3;
                                boolean z5 = false;
                                if (totalCaptureResult.getRequest() != null) {
                                    Object tag = totalCaptureResult.getRequest().getTag();
                                    if ((tag instanceof androidx.camera.core.impl.h0) && (l3 = (Long) ((androidx.camera.core.impl.h0) tag).f2206a.get("CameraControlSessionUpdateId")) != null && l3.longValue() >= j4) {
                                        z5 = true;
                                    }
                                }
                                if (z5) {
                                    iVar.a(null);
                                    return true;
                                }
                                return false;
                            }
                        });
                        return "waitForSessionUpdateId:" + j3;
                    }
                }), (S.i) this.f369L, AbstractC0636k0.a());
                return;
            case 16:
                ((androidx.camera.core.impl.i) this.f368K).b((InterfaceC0086n) this.f369L);
                return;
            case 17:
                ((androidx.camera.core.impl.i) this.f368K).c((C0287g) this.f369L);
                return;
            case 18:
                w.i iVar = (w.i) this.f368K;
                iVar.getClass();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = (HashSet) iVar.f5166b;
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    InterfaceC0500j interfaceC0500j = (InterfaceC0500j) it.next();
                    if (interfaceC0500j.a((TotalCaptureResult) this.f369L)) {
                        hashSet.add(interfaceC0500j);
                    }
                }
                if (!hashSet.isEmpty()) {
                    hashSet2.removeAll(hashSet);
                    return;
                }
                return;
            case 19:
                C0511v c0511v = (C0511v) this.f368K;
                E.c cVar = c0511v.a0;
                S.i iVar2 = (S.i) this.f369L;
                if (cVar == null) {
                    iVar2.a(Boolean.FALSE);
                    return;
                } else {
                    iVar2.a(Boolean.valueOf(c0511v.f5243J.u(C0511v.t(cVar))));
                    return;
                }
            case 20:
                ((Surface) this.f368K).release();
                ((SurfaceTexture) this.f369L).release();
                return;
            case 21:
                C0511v c0511v2 = (C0511v) this.f368K;
                c0511v2.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str = (String) this.f369L;
                sb.append(str);
                sb.append(" INACTIVE");
                c0511v2.q(sb.toString(), null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0511v2.f5243J.f11L;
                if (linkedHashMap.containsKey(str)) {
                    androidx.camera.core.impl.i0 i0Var = (androidx.camera.core.impl.i0) linkedHashMap.get(str);
                    i0Var.f2210d = false;
                    if (!i0Var.f2209c) {
                        linkedHashMap.remove(str);
                    }
                }
                c0511v2.I();
                return;
            default:
                ((ProfileInstallerInitializer) this.f368K).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = y0.j.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new y0.g((Context) this.f369L, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
        }
    }
}
