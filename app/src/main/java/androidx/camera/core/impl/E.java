package androidx.camera.core.impl;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v.C0479a;
import v.C0480b;
import w.C0490F;
import x1.AbstractC0636k0;
import x1.T4;
import y.C0779h;
import y.C0780i;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements S.j, H.a {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ Object f2118J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f2119K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f2120L;

    public /* synthetic */ E(Object obj, Object obj2, Object obj3) {
        this.f2118J = obj;
        this.f2119K = obj2;
        this.f2120L = obj3;
    }

    @Override // S.j
    public Object a0(S.i iVar) {
        H.j jVar = new H.j(new ArrayList((ArrayList) this.f2118J), false, AbstractC0636k0.a());
        G.l lVar = (G.l) this.f2120L;
        ScheduledFuture schedule = ((G.e) this.f2119K).schedule(new N.d(lVar, jVar, iVar, 3), 5000L, TimeUnit.MILLISECONDS);
        D.N n3 = new D.N(12, jVar);
        S.m mVar = iVar.f1189c;
        if (mVar != null) {
            mVar.a(n3, lVar);
        }
        jVar.a(new H.e(0, jVar, new A.f(21, iVar, schedule)), lVar);
        return "surfaceList";
    }

    @Override // H.a
    public E1.a apply(Object obj) {
        E1.a hVar;
        CaptureRequest build;
        InputConfiguration inputConfiguration;
        w.Q q3 = (w.Q) this.f2118J;
        c0 c0Var = (c0) this.f2119K;
        CameraDevice cameraDevice = (CameraDevice) this.f2120L;
        List list = (List) obj;
        synchronized (q3.f5060a) {
            try {
                int r11 = w.N.f5057a[q3.f5070l.ordinal()];
                if (r11 != 1 && r11 != 2) {
                    if (r11 != 3) {
                        if (r11 != 5) {
                            hVar = new H.h(1, new CancellationException("openCaptureSession() not execute in state: " + q3.f5070l));
                        }
                    } else {
                        q3.f5068j.clear();
                        for (int r8 = 0; r8 < list.size(); r8++) {
                            q3.f5068j.put((D) q3.f5069k.get(r8), (Surface) list.get(r8));
                        }
                        q3.f5070l = w.O.OPENING;
                        x1.X.a("CaptureSession", "Opening capture session.");
                        w.P p2 = new w.P(2, Arrays.asList(q3.f5063d, new w.P(1, c0Var.f2181c)));
                        S s3 = c0Var.f2184f.f2247b;
                        A.a aVar = new A.a(7, s3);
                        C0480b c0480b = (C0480b) s3.i0(C0479a.f5040Q, C0480b.a());
                        q3.f5067i = c0480b;
                        c0480b.getClass();
                        List<Object> unmodifiableList = Collections.unmodifiableList(new ArrayList(c0480b.f5043a));
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : unmodifiableList) {
                            if (obj2 == null) {
                                arrayList.add(null);
                            } else {
                                throw new ClassCastException();
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        if (!it.hasNext()) {
                            C0095x c0095x = new C0095x(c0Var.f2184f);
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                c0095x.c(((C0096y) it2.next()).f2247b);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            String str = (String) ((A) aVar.f1K).i0(C0479a.f5042S, null);
                            Iterator it3 = c0Var.f2179a.iterator();
                            while (it3.hasNext()) {
                                C0078e c0078e = (C0078e) it3.next();
                                C0780i d4 = q3.d(c0078e, q3.f5068j, str);
                                if (q3.f5073o.containsKey(c0078e.f2186a)) {
                                    d4.f6170a.i(((Long) q3.f5073o.get(c0078e.f2186a)).longValue());
                                }
                                arrayList3.add(d4);
                            }
                            ArrayList e4 = w.Q.e(arrayList3);
                            w.d0 d0Var = (w.d0) q3.f5064e.f3003K;
                            d0Var.f5139f = p2;
                            y.v vVar = new y.v(e4, d0Var.f5137d, new C0490F(1, d0Var));
                            if (c0Var.f2184f.f2248c == 5 && (inputConfiguration = c0Var.g) != null) {
                                vVar.f6193a.h(C0779h.a(inputConfiguration));
                            }
                            C0096y d5 = c0095x.d();
                            if (cameraDevice == null) {
                                build = null;
                            } else {
                                CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(d5.f2248c);
                                T4.a(createCaptureRequest, d5.f2247b);
                                build = createCaptureRequest.build();
                            }
                            if (build != null) {
                                vVar.f6193a.e(build);
                            }
                            hVar = ((w.d0) q3.f5064e.f3003K).n(cameraDevice, vVar, q3.f5069k);
                        } else if (it.next() == null) {
                            throw null;
                        } else {
                            throw new ClassCastException();
                        }
                    }
                }
                hVar = new H.h(1, new IllegalStateException("openCaptureSession() should not be possible in state: " + q3.f5070l));
            } catch (CameraAccessException e5) {
                hVar = new H.h(1, e5);
            } finally {
            }
        }
        return hVar;
    }
}
