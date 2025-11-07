package D;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.camera2.CaptureResult;
import android.net.Uri;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0080g;
import androidx.camera.core.impl.EnumC0097z;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d2.C0235c;
import h.C0274a;
import h.C0275b;
import h.C0276c;
import h.C0277d;
import h2.AbstractActivityC0292d;
import h2.J;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p.t0;
import q0.k;
import r2.InterfaceC0445b;
import w2.C0531a;
import w2.C0532b;
import w2.q;
import x1.AbstractC0601e5;
import x1.AbstractC0657m5;
import x1.AbstractC0681p5;
import x1.AbstractC0703s4;
import x1.AbstractC0711t4;
import x1.AbstractC0719u4;
import x1.AbstractC0723v0;
import x2.C0764c;
import y1.C0789a;

/* loaded from: classes.dex */
public abstract /* synthetic */ class C {
    public static HashMap A(Class cls, x1.N n3) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, n3);
        return hashMap;
    }

    public static HashMap B(Class cls, C0789a c0789a) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, c0789a);
        return hashMap;
    }

    public static Map C(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void D(androidx.camera.core.impl.g0 g0Var, androidx.camera.core.impl.f0 f0Var, long j3, androidx.camera.core.impl.e0 e0Var) {
        e0Var.a(new C0080g(g0Var, f0Var, j3));
    }

    public static /* synthetic */ void E(com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0 i0Var) {
        if (i0Var != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void F(J0 j0) {
        if (j0 != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void G(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void H(HashMap hashMap) {
        Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static String I(String str, String str2) {
        return str + str2;
    }

    public static androidx.camera.core.impl.S J(androidx.camera.core.impl.A a4, androidx.camera.core.impl.A a5) {
        androidx.camera.core.impl.O b3;
        if (a4 == null && a5 == null) {
            return androidx.camera.core.impl.S.f2152L;
        }
        if (a5 != null) {
            b3 = androidx.camera.core.impl.O.c(a5);
        } else {
            b3 = androidx.camera.core.impl.O.b();
        }
        if (a4 != null) {
            for (C0076c c0076c : a4.o()) {
                K(b3, a5, a4, c0076c);
            }
        }
        return androidx.camera.core.impl.S.a(b3);
    }

    public static void K(androidx.camera.core.impl.O o3, androidx.camera.core.impl.A a4, androidx.camera.core.impl.A a5, C0076c c0076c) {
        if (Objects.equals(c0076c, androidx.camera.core.impl.J.f2146v)) {
            O.b bVar = (O.b) a5.i0(c0076c, null);
            O.b bVar2 = (O.b) a4.i0(c0076c, null);
            EnumC0097z g02 = a5.g0(c0076c);
            if (bVar == null) {
                bVar = bVar2;
            } else if (bVar2 != null) {
                A.f fVar = new A.f(7, false);
                fVar.f10K = bVar2.f1010a;
                fVar.f11L = bVar2.f1011b;
                O.a aVar = bVar.f1010a;
                if (aVar != null) {
                    fVar.f10K = aVar;
                }
                O.c cVar = bVar.f1011b;
                if (cVar != null) {
                    fVar.f11L = cVar;
                }
                bVar = new O.b((O.a) fVar.f10K, (O.c) fVar.f11L, null);
            }
            o3.f(c0076c, g02, bVar);
            return;
        }
        o3.f(c0076c, a5.g0(c0076c), a5.e(c0076c));
    }

    public static void L(r2.f fVar, final io.flutter.plugins.imagepicker.m mVar) {
        R1.a j3 = fVar.j();
        io.flutter.plugins.imagepicker.w wVar = io.flutter.plugins.imagepicker.w.f3657d;
        a1.i iVar = new a1.i(fVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages", (r2.l) wVar, j3);
        if (mVar != null) {
            iVar.l(new InterfaceC0445b() { // from class: io.flutter.plugins.imagepicker.s
                /* JADX WARN: Type inference failed for: r12v28, types: [h.f, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v42, types: [h.f, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v8, types: [h.f, java.lang.Object] */
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j4) {
                    j jVar;
                    Intent intent;
                    Intent intent2;
                    h hVar;
                    j jVar2;
                    Intent intent3;
                    h hVar2;
                    j jVar3;
                    Intent intent4;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            y yVar = (y) arrayList2.get(0);
                            u uVar = (u) arrayList2.get(1);
                            r rVar = (r) arrayList2.get(2);
                            t tVar = new t(arrayList, j4, 0);
                            t0 t0Var = mVar.f3638K;
                            if (t0Var != null && ((AbstractActivityC0292d) t0Var.f4719b) != null) {
                                jVar = (j) t0Var.f4720c;
                            } else {
                                jVar = null;
                            }
                            if (jVar == null) {
                                tVar.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            }
                            x xVar = yVar.f3659b;
                            if (xVar != null) {
                                if (k.f3633a[xVar.ordinal()] != 1) {
                                    hVar = h.REAR;
                                } else {
                                    hVar = h.FRONT;
                                }
                                jVar.f3629R = hVar;
                            }
                            boolean booleanValue = rVar.f3645a.booleanValue();
                            C0276c c0276c = C0276c.f3246a;
                            AbstractActivityC0292d abstractActivityC0292d = jVar.f3622K;
                            if (booleanValue) {
                                int a4 = AbstractC0703s4.a(rVar);
                                boolean booleanValue2 = rVar.f3646b.booleanValue();
                                if (!jVar.m(uVar, null, tVar)) {
                                    j.c(tVar);
                                    return;
                                }
                                if (booleanValue2) {
                                    C0274a c0274a = new C0274a(a4);
                                    C0235c c0235c = new C0235c(1);
                                    c0235c.f3003K = c0276c;
                                    intent2 = c0274a.a(abstractActivityC0292d, c0235c);
                                } else {
                                    intent2 = new Intent("android.intent.action.GET_CONTENT");
                                    intent2.setType("image/*");
                                    intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                }
                                abstractActivityC0292d.startActivityForResult(intent2, 2346);
                                return;
                            }
                            int r12 = k.f3634b[yVar.f3658a.ordinal()];
                            if (r12 != 1) {
                                if (r12 == 2) {
                                    if (!jVar.m(uVar, null, tVar)) {
                                        j.c(tVar);
                                        return;
                                    }
                                    if (jVar.l()) {
                                        f fVar2 = jVar.f3625N;
                                        if (AbstractC0723v0.a(fVar2.f3617a, "android.permission.CAMERA") != 0) {
                                            AbstractC0723v0.c(fVar2.f3617a, new String[]{"android.permission.CAMERA"}, 2345);
                                            return;
                                        }
                                    }
                                    jVar.j();
                                    return;
                                }
                                return;
                            }
                            boolean booleanValue3 = rVar.f3646b.booleanValue();
                            if (!jVar.m(uVar, null, tVar)) {
                                j.c(tVar);
                                return;
                            }
                            if (booleanValue3) {
                                ?? obj2 = new Object();
                                C0235c c0235c2 = new C0235c(1);
                                c0235c2.f3003K = c0276c;
                                intent = obj2.a(abstractActivityC0292d, c0235c2);
                            } else {
                                intent = new Intent("android.intent.action.GET_CONTENT");
                                intent.setType("image/*");
                            }
                            abstractActivityC0292d.startActivityForResult(intent, 2342);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            y yVar2 = (y) arrayList4.get(0);
                            A a5 = (A) arrayList4.get(1);
                            r rVar2 = (r) arrayList4.get(2);
                            t tVar2 = new t(arrayList3, j4, 1);
                            t0 t0Var2 = mVar.f3638K;
                            if (t0Var2 != null && ((AbstractActivityC0292d) t0Var2.f4719b) != null) {
                                jVar2 = (j) t0Var2.f4720c;
                            } else {
                                jVar2 = null;
                            }
                            if (jVar2 == null) {
                                tVar2.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            }
                            x xVar2 = yVar2.f3659b;
                            if (xVar2 != null) {
                                if (k.f3633a[xVar2.ordinal()] != 1) {
                                    hVar2 = h.REAR;
                                } else {
                                    hVar2 = h.FRONT;
                                }
                                jVar2.f3629R = hVar2;
                            }
                            if (rVar2.f3645a.booleanValue()) {
                                tVar2.a(new RuntimeException("Multi-video selection is not implemented"));
                                return;
                            }
                            int r13 = k.f3634b[yVar2.f3658a.ordinal()];
                            if (r13 != 1) {
                                if (r13 == 2) {
                                    if (!jVar2.m(null, a5, tVar2)) {
                                        j.c(tVar2);
                                        return;
                                    }
                                    if (jVar2.l()) {
                                        f fVar3 = jVar2.f3625N;
                                        if (AbstractC0723v0.a(fVar3.f3617a, "android.permission.CAMERA") != 0) {
                                            AbstractC0723v0.c(fVar3.f3617a, new String[]{"android.permission.CAMERA"}, 2355);
                                            return;
                                        }
                                    }
                                    jVar2.k();
                                    return;
                                }
                                return;
                            }
                            boolean booleanValue4 = rVar2.f3646b.booleanValue();
                            if (!jVar2.m(null, a5, tVar2)) {
                                j.c(tVar2);
                                return;
                            }
                            AbstractActivityC0292d abstractActivityC0292d2 = jVar2.f3622K;
                            if (booleanValue4) {
                                ?? obj3 = new Object();
                                C0277d c0277d = C0277d.f3247a;
                                C0235c c0235c3 = new C0235c(1);
                                c0235c3.f3003K = c0277d;
                                intent3 = obj3.a(abstractActivityC0292d2, c0235c3);
                            } else {
                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                intent3.setType("video/*");
                            }
                            abstractActivityC0292d2.startActivityForResult(intent3, 2352);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            v vVar = (v) arrayList6.get(0);
                            r rVar3 = (r) arrayList6.get(1);
                            t tVar3 = new t(arrayList5, j4, 2);
                            t0 t0Var3 = mVar.f3638K;
                            if (t0Var3 != null && ((AbstractActivityC0292d) t0Var3.f4719b) != null) {
                                jVar3 = (j) t0Var3.f4720c;
                            } else {
                                jVar3 = null;
                            }
                            if (jVar3 == null) {
                                tVar3.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            } else if (!jVar3.m(vVar.f3656a, null, tVar3)) {
                                j.c(tVar3);
                                return;
                            } else {
                                boolean booleanValue5 = rVar3.f3646b.booleanValue();
                                AbstractActivityC0292d abstractActivityC0292d3 = jVar3.f3622K;
                                if (booleanValue5) {
                                    boolean booleanValue6 = rVar3.f3645a.booleanValue();
                                    C0275b c0275b = C0275b.f3245a;
                                    if (booleanValue6) {
                                        C0274a c0274a2 = new C0274a(AbstractC0703s4.a(rVar3));
                                        C0235c c0235c4 = new C0235c(1);
                                        c0235c4.f3003K = c0275b;
                                        intent4 = c0274a2.a(abstractActivityC0292d3, c0235c4);
                                    } else {
                                        ?? obj4 = new Object();
                                        C0235c c0235c5 = new C0235c(1);
                                        c0235c5.f3003K = c0275b;
                                        intent4 = obj4.a(abstractActivityC0292d3, c0235c5);
                                    }
                                } else {
                                    Intent intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", rVar3.f3645a);
                                    intent4 = intent5;
                                }
                                abstractActivityC0292d3.startActivityForResult(intent4, 2347);
                                return;
                            }
                        default:
                            m mVar2 = mVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, mVar2.b());
                            } catch (Throwable th) {
                                arrayList7 = AbstractC0711t4.a(th);
                            }
                            j4.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar.l(null);
        }
        a1.i iVar2 = new a1.i(fVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos", (r2.l) wVar, j3);
        if (mVar != null) {
            iVar2.l(new InterfaceC0445b() { // from class: io.flutter.plugins.imagepicker.s
                /* JADX WARN: Type inference failed for: r12v28, types: [h.f, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v42, types: [h.f, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v8, types: [h.f, java.lang.Object] */
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j4) {
                    j jVar;
                    Intent intent;
                    Intent intent2;
                    h hVar;
                    j jVar2;
                    Intent intent3;
                    h hVar2;
                    j jVar3;
                    Intent intent4;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            y yVar = (y) arrayList2.get(0);
                            u uVar = (u) arrayList2.get(1);
                            r rVar = (r) arrayList2.get(2);
                            t tVar = new t(arrayList, j4, 0);
                            t0 t0Var = mVar.f3638K;
                            if (t0Var != null && ((AbstractActivityC0292d) t0Var.f4719b) != null) {
                                jVar = (j) t0Var.f4720c;
                            } else {
                                jVar = null;
                            }
                            if (jVar == null) {
                                tVar.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            }
                            x xVar = yVar.f3659b;
                            if (xVar != null) {
                                if (k.f3633a[xVar.ordinal()] != 1) {
                                    hVar = h.REAR;
                                } else {
                                    hVar = h.FRONT;
                                }
                                jVar.f3629R = hVar;
                            }
                            boolean booleanValue = rVar.f3645a.booleanValue();
                            C0276c c0276c = C0276c.f3246a;
                            AbstractActivityC0292d abstractActivityC0292d = jVar.f3622K;
                            if (booleanValue) {
                                int a4 = AbstractC0703s4.a(rVar);
                                boolean booleanValue2 = rVar.f3646b.booleanValue();
                                if (!jVar.m(uVar, null, tVar)) {
                                    j.c(tVar);
                                    return;
                                }
                                if (booleanValue2) {
                                    C0274a c0274a = new C0274a(a4);
                                    C0235c c0235c = new C0235c(1);
                                    c0235c.f3003K = c0276c;
                                    intent2 = c0274a.a(abstractActivityC0292d, c0235c);
                                } else {
                                    intent2 = new Intent("android.intent.action.GET_CONTENT");
                                    intent2.setType("image/*");
                                    intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                }
                                abstractActivityC0292d.startActivityForResult(intent2, 2346);
                                return;
                            }
                            int r12 = k.f3634b[yVar.f3658a.ordinal()];
                            if (r12 != 1) {
                                if (r12 == 2) {
                                    if (!jVar.m(uVar, null, tVar)) {
                                        j.c(tVar);
                                        return;
                                    }
                                    if (jVar.l()) {
                                        f fVar2 = jVar.f3625N;
                                        if (AbstractC0723v0.a(fVar2.f3617a, "android.permission.CAMERA") != 0) {
                                            AbstractC0723v0.c(fVar2.f3617a, new String[]{"android.permission.CAMERA"}, 2345);
                                            return;
                                        }
                                    }
                                    jVar.j();
                                    return;
                                }
                                return;
                            }
                            boolean booleanValue3 = rVar.f3646b.booleanValue();
                            if (!jVar.m(uVar, null, tVar)) {
                                j.c(tVar);
                                return;
                            }
                            if (booleanValue3) {
                                ?? obj2 = new Object();
                                C0235c c0235c2 = new C0235c(1);
                                c0235c2.f3003K = c0276c;
                                intent = obj2.a(abstractActivityC0292d, c0235c2);
                            } else {
                                intent = new Intent("android.intent.action.GET_CONTENT");
                                intent.setType("image/*");
                            }
                            abstractActivityC0292d.startActivityForResult(intent, 2342);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            y yVar2 = (y) arrayList4.get(0);
                            A a5 = (A) arrayList4.get(1);
                            r rVar2 = (r) arrayList4.get(2);
                            t tVar2 = new t(arrayList3, j4, 1);
                            t0 t0Var2 = mVar.f3638K;
                            if (t0Var2 != null && ((AbstractActivityC0292d) t0Var2.f4719b) != null) {
                                jVar2 = (j) t0Var2.f4720c;
                            } else {
                                jVar2 = null;
                            }
                            if (jVar2 == null) {
                                tVar2.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            }
                            x xVar2 = yVar2.f3659b;
                            if (xVar2 != null) {
                                if (k.f3633a[xVar2.ordinal()] != 1) {
                                    hVar2 = h.REAR;
                                } else {
                                    hVar2 = h.FRONT;
                                }
                                jVar2.f3629R = hVar2;
                            }
                            if (rVar2.f3645a.booleanValue()) {
                                tVar2.a(new RuntimeException("Multi-video selection is not implemented"));
                                return;
                            }
                            int r13 = k.f3634b[yVar2.f3658a.ordinal()];
                            if (r13 != 1) {
                                if (r13 == 2) {
                                    if (!jVar2.m(null, a5, tVar2)) {
                                        j.c(tVar2);
                                        return;
                                    }
                                    if (jVar2.l()) {
                                        f fVar3 = jVar2.f3625N;
                                        if (AbstractC0723v0.a(fVar3.f3617a, "android.permission.CAMERA") != 0) {
                                            AbstractC0723v0.c(fVar3.f3617a, new String[]{"android.permission.CAMERA"}, 2355);
                                            return;
                                        }
                                    }
                                    jVar2.k();
                                    return;
                                }
                                return;
                            }
                            boolean booleanValue4 = rVar2.f3646b.booleanValue();
                            if (!jVar2.m(null, a5, tVar2)) {
                                j.c(tVar2);
                                return;
                            }
                            AbstractActivityC0292d abstractActivityC0292d2 = jVar2.f3622K;
                            if (booleanValue4) {
                                ?? obj3 = new Object();
                                C0277d c0277d = C0277d.f3247a;
                                C0235c c0235c3 = new C0235c(1);
                                c0235c3.f3003K = c0277d;
                                intent3 = obj3.a(abstractActivityC0292d2, c0235c3);
                            } else {
                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                intent3.setType("video/*");
                            }
                            abstractActivityC0292d2.startActivityForResult(intent3, 2352);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            v vVar = (v) arrayList6.get(0);
                            r rVar3 = (r) arrayList6.get(1);
                            t tVar3 = new t(arrayList5, j4, 2);
                            t0 t0Var3 = mVar.f3638K;
                            if (t0Var3 != null && ((AbstractActivityC0292d) t0Var3.f4719b) != null) {
                                jVar3 = (j) t0Var3.f4720c;
                            } else {
                                jVar3 = null;
                            }
                            if (jVar3 == null) {
                                tVar3.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            } else if (!jVar3.m(vVar.f3656a, null, tVar3)) {
                                j.c(tVar3);
                                return;
                            } else {
                                boolean booleanValue5 = rVar3.f3646b.booleanValue();
                                AbstractActivityC0292d abstractActivityC0292d3 = jVar3.f3622K;
                                if (booleanValue5) {
                                    boolean booleanValue6 = rVar3.f3645a.booleanValue();
                                    C0275b c0275b = C0275b.f3245a;
                                    if (booleanValue6) {
                                        C0274a c0274a2 = new C0274a(AbstractC0703s4.a(rVar3));
                                        C0235c c0235c4 = new C0235c(1);
                                        c0235c4.f3003K = c0275b;
                                        intent4 = c0274a2.a(abstractActivityC0292d3, c0235c4);
                                    } else {
                                        ?? obj4 = new Object();
                                        C0235c c0235c5 = new C0235c(1);
                                        c0235c5.f3003K = c0275b;
                                        intent4 = obj4.a(abstractActivityC0292d3, c0235c5);
                                    }
                                } else {
                                    Intent intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", rVar3.f3645a);
                                    intent4 = intent5;
                                }
                                abstractActivityC0292d3.startActivityForResult(intent4, 2347);
                                return;
                            }
                        default:
                            m mVar2 = mVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, mVar2.b());
                            } catch (Throwable th) {
                                arrayList7 = AbstractC0711t4.a(th);
                            }
                            j4.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar2.l(null);
        }
        a1.i iVar3 = new a1.i(fVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia", (r2.l) wVar, (R1.a) null);
        if (mVar != null) {
            iVar3.l(new InterfaceC0445b() { // from class: io.flutter.plugins.imagepicker.s
                /* JADX WARN: Type inference failed for: r12v28, types: [h.f, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v42, types: [h.f, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v8, types: [h.f, java.lang.Object] */
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j4) {
                    j jVar;
                    Intent intent;
                    Intent intent2;
                    h hVar;
                    j jVar2;
                    Intent intent3;
                    h hVar2;
                    j jVar3;
                    Intent intent4;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            y yVar = (y) arrayList2.get(0);
                            u uVar = (u) arrayList2.get(1);
                            r rVar = (r) arrayList2.get(2);
                            t tVar = new t(arrayList, j4, 0);
                            t0 t0Var = mVar.f3638K;
                            if (t0Var != null && ((AbstractActivityC0292d) t0Var.f4719b) != null) {
                                jVar = (j) t0Var.f4720c;
                            } else {
                                jVar = null;
                            }
                            if (jVar == null) {
                                tVar.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            }
                            x xVar = yVar.f3659b;
                            if (xVar != null) {
                                if (k.f3633a[xVar.ordinal()] != 1) {
                                    hVar = h.REAR;
                                } else {
                                    hVar = h.FRONT;
                                }
                                jVar.f3629R = hVar;
                            }
                            boolean booleanValue = rVar.f3645a.booleanValue();
                            C0276c c0276c = C0276c.f3246a;
                            AbstractActivityC0292d abstractActivityC0292d = jVar.f3622K;
                            if (booleanValue) {
                                int a4 = AbstractC0703s4.a(rVar);
                                boolean booleanValue2 = rVar.f3646b.booleanValue();
                                if (!jVar.m(uVar, null, tVar)) {
                                    j.c(tVar);
                                    return;
                                }
                                if (booleanValue2) {
                                    C0274a c0274a = new C0274a(a4);
                                    C0235c c0235c = new C0235c(1);
                                    c0235c.f3003K = c0276c;
                                    intent2 = c0274a.a(abstractActivityC0292d, c0235c);
                                } else {
                                    intent2 = new Intent("android.intent.action.GET_CONTENT");
                                    intent2.setType("image/*");
                                    intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                }
                                abstractActivityC0292d.startActivityForResult(intent2, 2346);
                                return;
                            }
                            int r12 = k.f3634b[yVar.f3658a.ordinal()];
                            if (r12 != 1) {
                                if (r12 == 2) {
                                    if (!jVar.m(uVar, null, tVar)) {
                                        j.c(tVar);
                                        return;
                                    }
                                    if (jVar.l()) {
                                        f fVar2 = jVar.f3625N;
                                        if (AbstractC0723v0.a(fVar2.f3617a, "android.permission.CAMERA") != 0) {
                                            AbstractC0723v0.c(fVar2.f3617a, new String[]{"android.permission.CAMERA"}, 2345);
                                            return;
                                        }
                                    }
                                    jVar.j();
                                    return;
                                }
                                return;
                            }
                            boolean booleanValue3 = rVar.f3646b.booleanValue();
                            if (!jVar.m(uVar, null, tVar)) {
                                j.c(tVar);
                                return;
                            }
                            if (booleanValue3) {
                                ?? obj2 = new Object();
                                C0235c c0235c2 = new C0235c(1);
                                c0235c2.f3003K = c0276c;
                                intent = obj2.a(abstractActivityC0292d, c0235c2);
                            } else {
                                intent = new Intent("android.intent.action.GET_CONTENT");
                                intent.setType("image/*");
                            }
                            abstractActivityC0292d.startActivityForResult(intent, 2342);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            y yVar2 = (y) arrayList4.get(0);
                            A a5 = (A) arrayList4.get(1);
                            r rVar2 = (r) arrayList4.get(2);
                            t tVar2 = new t(arrayList3, j4, 1);
                            t0 t0Var2 = mVar.f3638K;
                            if (t0Var2 != null && ((AbstractActivityC0292d) t0Var2.f4719b) != null) {
                                jVar2 = (j) t0Var2.f4720c;
                            } else {
                                jVar2 = null;
                            }
                            if (jVar2 == null) {
                                tVar2.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            }
                            x xVar2 = yVar2.f3659b;
                            if (xVar2 != null) {
                                if (k.f3633a[xVar2.ordinal()] != 1) {
                                    hVar2 = h.REAR;
                                } else {
                                    hVar2 = h.FRONT;
                                }
                                jVar2.f3629R = hVar2;
                            }
                            if (rVar2.f3645a.booleanValue()) {
                                tVar2.a(new RuntimeException("Multi-video selection is not implemented"));
                                return;
                            }
                            int r13 = k.f3634b[yVar2.f3658a.ordinal()];
                            if (r13 != 1) {
                                if (r13 == 2) {
                                    if (!jVar2.m(null, a5, tVar2)) {
                                        j.c(tVar2);
                                        return;
                                    }
                                    if (jVar2.l()) {
                                        f fVar3 = jVar2.f3625N;
                                        if (AbstractC0723v0.a(fVar3.f3617a, "android.permission.CAMERA") != 0) {
                                            AbstractC0723v0.c(fVar3.f3617a, new String[]{"android.permission.CAMERA"}, 2355);
                                            return;
                                        }
                                    }
                                    jVar2.k();
                                    return;
                                }
                                return;
                            }
                            boolean booleanValue4 = rVar2.f3646b.booleanValue();
                            if (!jVar2.m(null, a5, tVar2)) {
                                j.c(tVar2);
                                return;
                            }
                            AbstractActivityC0292d abstractActivityC0292d2 = jVar2.f3622K;
                            if (booleanValue4) {
                                ?? obj3 = new Object();
                                C0277d c0277d = C0277d.f3247a;
                                C0235c c0235c3 = new C0235c(1);
                                c0235c3.f3003K = c0277d;
                                intent3 = obj3.a(abstractActivityC0292d2, c0235c3);
                            } else {
                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                intent3.setType("video/*");
                            }
                            abstractActivityC0292d2.startActivityForResult(intent3, 2352);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            v vVar = (v) arrayList6.get(0);
                            r rVar3 = (r) arrayList6.get(1);
                            t tVar3 = new t(arrayList5, j4, 2);
                            t0 t0Var3 = mVar.f3638K;
                            if (t0Var3 != null && ((AbstractActivityC0292d) t0Var3.f4719b) != null) {
                                jVar3 = (j) t0Var3.f4720c;
                            } else {
                                jVar3 = null;
                            }
                            if (jVar3 == null) {
                                tVar3.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            } else if (!jVar3.m(vVar.f3656a, null, tVar3)) {
                                j.c(tVar3);
                                return;
                            } else {
                                boolean booleanValue5 = rVar3.f3646b.booleanValue();
                                AbstractActivityC0292d abstractActivityC0292d3 = jVar3.f3622K;
                                if (booleanValue5) {
                                    boolean booleanValue6 = rVar3.f3645a.booleanValue();
                                    C0275b c0275b = C0275b.f3245a;
                                    if (booleanValue6) {
                                        C0274a c0274a2 = new C0274a(AbstractC0703s4.a(rVar3));
                                        C0235c c0235c4 = new C0235c(1);
                                        c0235c4.f3003K = c0275b;
                                        intent4 = c0274a2.a(abstractActivityC0292d3, c0235c4);
                                    } else {
                                        ?? obj4 = new Object();
                                        C0235c c0235c5 = new C0235c(1);
                                        c0235c5.f3003K = c0275b;
                                        intent4 = obj4.a(abstractActivityC0292d3, c0235c5);
                                    }
                                } else {
                                    Intent intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", rVar3.f3645a);
                                    intent4 = intent5;
                                }
                                abstractActivityC0292d3.startActivityForResult(intent4, 2347);
                                return;
                            }
                        default:
                            m mVar2 = mVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, mVar2.b());
                            } catch (Throwable th) {
                                arrayList7 = AbstractC0711t4.a(th);
                            }
                            j4.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar3.l(null);
        }
        a1.i iVar4 = new a1.i(fVar, "dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults", (r2.l) wVar, j3);
        if (mVar != null) {
            iVar4.l(new InterfaceC0445b() { // from class: io.flutter.plugins.imagepicker.s
                /* JADX WARN: Type inference failed for: r12v28, types: [h.f, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v42, types: [h.f, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r12v8, types: [h.f, java.lang.Object] */
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j4) {
                    j jVar;
                    Intent intent;
                    Intent intent2;
                    h hVar;
                    j jVar2;
                    Intent intent3;
                    h hVar2;
                    j jVar3;
                    Intent intent4;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = (ArrayList) obj;
                            y yVar = (y) arrayList2.get(0);
                            u uVar = (u) arrayList2.get(1);
                            r rVar = (r) arrayList2.get(2);
                            t tVar = new t(arrayList, j4, 0);
                            t0 t0Var = mVar.f3638K;
                            if (t0Var != null && ((AbstractActivityC0292d) t0Var.f4719b) != null) {
                                jVar = (j) t0Var.f4720c;
                            } else {
                                jVar = null;
                            }
                            if (jVar == null) {
                                tVar.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            }
                            x xVar = yVar.f3659b;
                            if (xVar != null) {
                                if (k.f3633a[xVar.ordinal()] != 1) {
                                    hVar = h.REAR;
                                } else {
                                    hVar = h.FRONT;
                                }
                                jVar.f3629R = hVar;
                            }
                            boolean booleanValue = rVar.f3645a.booleanValue();
                            C0276c c0276c = C0276c.f3246a;
                            AbstractActivityC0292d abstractActivityC0292d = jVar.f3622K;
                            if (booleanValue) {
                                int a4 = AbstractC0703s4.a(rVar);
                                boolean booleanValue2 = rVar.f3646b.booleanValue();
                                if (!jVar.m(uVar, null, tVar)) {
                                    j.c(tVar);
                                    return;
                                }
                                if (booleanValue2) {
                                    C0274a c0274a = new C0274a(a4);
                                    C0235c c0235c = new C0235c(1);
                                    c0235c.f3003K = c0276c;
                                    intent2 = c0274a.a(abstractActivityC0292d, c0235c);
                                } else {
                                    intent2 = new Intent("android.intent.action.GET_CONTENT");
                                    intent2.setType("image/*");
                                    intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                }
                                abstractActivityC0292d.startActivityForResult(intent2, 2346);
                                return;
                            }
                            int r12 = k.f3634b[yVar.f3658a.ordinal()];
                            if (r12 != 1) {
                                if (r12 == 2) {
                                    if (!jVar.m(uVar, null, tVar)) {
                                        j.c(tVar);
                                        return;
                                    }
                                    if (jVar.l()) {
                                        f fVar2 = jVar.f3625N;
                                        if (AbstractC0723v0.a(fVar2.f3617a, "android.permission.CAMERA") != 0) {
                                            AbstractC0723v0.c(fVar2.f3617a, new String[]{"android.permission.CAMERA"}, 2345);
                                            return;
                                        }
                                    }
                                    jVar.j();
                                    return;
                                }
                                return;
                            }
                            boolean booleanValue3 = rVar.f3646b.booleanValue();
                            if (!jVar.m(uVar, null, tVar)) {
                                j.c(tVar);
                                return;
                            }
                            if (booleanValue3) {
                                ?? obj2 = new Object();
                                C0235c c0235c2 = new C0235c(1);
                                c0235c2.f3003K = c0276c;
                                intent = obj2.a(abstractActivityC0292d, c0235c2);
                            } else {
                                intent = new Intent("android.intent.action.GET_CONTENT");
                                intent.setType("image/*");
                            }
                            abstractActivityC0292d.startActivityForResult(intent, 2342);
                            return;
                        case 1:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj;
                            y yVar2 = (y) arrayList4.get(0);
                            A a5 = (A) arrayList4.get(1);
                            r rVar2 = (r) arrayList4.get(2);
                            t tVar2 = new t(arrayList3, j4, 1);
                            t0 t0Var2 = mVar.f3638K;
                            if (t0Var2 != null && ((AbstractActivityC0292d) t0Var2.f4719b) != null) {
                                jVar2 = (j) t0Var2.f4720c;
                            } else {
                                jVar2 = null;
                            }
                            if (jVar2 == null) {
                                tVar2.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            }
                            x xVar2 = yVar2.f3659b;
                            if (xVar2 != null) {
                                if (k.f3633a[xVar2.ordinal()] != 1) {
                                    hVar2 = h.REAR;
                                } else {
                                    hVar2 = h.FRONT;
                                }
                                jVar2.f3629R = hVar2;
                            }
                            if (rVar2.f3645a.booleanValue()) {
                                tVar2.a(new RuntimeException("Multi-video selection is not implemented"));
                                return;
                            }
                            int r13 = k.f3634b[yVar2.f3658a.ordinal()];
                            if (r13 != 1) {
                                if (r13 == 2) {
                                    if (!jVar2.m(null, a5, tVar2)) {
                                        j.c(tVar2);
                                        return;
                                    }
                                    if (jVar2.l()) {
                                        f fVar3 = jVar2.f3625N;
                                        if (AbstractC0723v0.a(fVar3.f3617a, "android.permission.CAMERA") != 0) {
                                            AbstractC0723v0.c(fVar3.f3617a, new String[]{"android.permission.CAMERA"}, 2355);
                                            return;
                                        }
                                    }
                                    jVar2.k();
                                    return;
                                }
                                return;
                            }
                            boolean booleanValue4 = rVar2.f3646b.booleanValue();
                            if (!jVar2.m(null, a5, tVar2)) {
                                j.c(tVar2);
                                return;
                            }
                            AbstractActivityC0292d abstractActivityC0292d2 = jVar2.f3622K;
                            if (booleanValue4) {
                                ?? obj3 = new Object();
                                C0277d c0277d = C0277d.f3247a;
                                C0235c c0235c3 = new C0235c(1);
                                c0235c3.f3003K = c0277d;
                                intent3 = obj3.a(abstractActivityC0292d2, c0235c3);
                            } else {
                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                intent3.setType("video/*");
                            }
                            abstractActivityC0292d2.startActivityForResult(intent3, 2352);
                            return;
                        case 2:
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = (ArrayList) obj;
                            v vVar = (v) arrayList6.get(0);
                            r rVar3 = (r) arrayList6.get(1);
                            t tVar3 = new t(arrayList5, j4, 2);
                            t0 t0Var3 = mVar.f3638K;
                            if (t0Var3 != null && ((AbstractActivityC0292d) t0Var3.f4719b) != null) {
                                jVar3 = (j) t0Var3.f4720c;
                            } else {
                                jVar3 = null;
                            }
                            if (jVar3 == null) {
                                tVar3.a(new q("no_activity", "image_picker plugin requires a foreground activity."));
                                return;
                            } else if (!jVar3.m(vVar.f3656a, null, tVar3)) {
                                j.c(tVar3);
                                return;
                            } else {
                                boolean booleanValue5 = rVar3.f3646b.booleanValue();
                                AbstractActivityC0292d abstractActivityC0292d3 = jVar3.f3622K;
                                if (booleanValue5) {
                                    boolean booleanValue6 = rVar3.f3645a.booleanValue();
                                    C0275b c0275b = C0275b.f3245a;
                                    if (booleanValue6) {
                                        C0274a c0274a2 = new C0274a(AbstractC0703s4.a(rVar3));
                                        C0235c c0235c4 = new C0235c(1);
                                        c0235c4.f3003K = c0275b;
                                        intent4 = c0274a2.a(abstractActivityC0292d3, c0235c4);
                                    } else {
                                        ?? obj4 = new Object();
                                        C0235c c0235c5 = new C0235c(1);
                                        c0235c5.f3003K = c0275b;
                                        intent4 = obj4.a(abstractActivityC0292d3, c0235c5);
                                    }
                                } else {
                                    Intent intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", rVar3.f3645a);
                                    intent4 = intent5;
                                }
                                abstractActivityC0292d3.startActivityForResult(intent4, 2347);
                                return;
                            }
                        default:
                            m mVar2 = mVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, mVar2.b());
                            } catch (Throwable th) {
                                arrayList7 = AbstractC0711t4.a(th);
                            }
                            j4.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar4.l(null);
        }
    }

    public static void M(r2.f fVar, final io.flutter.plugins.pathprovider.e eVar) {
        R1.a j3 = fVar.j();
        io.flutter.plugins.pathprovider.b bVar = io.flutter.plugins.pathprovider.b.f3662d;
        a1.i iVar = new a1.i(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", (r2.l) bVar, j3);
        if (eVar != null) {
            iVar.l(new InterfaceC0445b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j4) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f3664J.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0719u4.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f3664J;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0681p5.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0719u4.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f3664J;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0681p5.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0719u4.a(th3);
                            }
                            j4.h(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f3664J.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0719u4.a(th4);
                            }
                            j4.h(arrayList4);
                            return;
                        case 4:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f3664J.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0719u4.a(th5);
                            }
                            j4.h(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f3664J.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0719u4.a(th6);
                            }
                            j4.h(arrayList6);
                            return;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0719u4.a(th7);
                            }
                            j4.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            iVar.l(null);
        }
        a1.i iVar2 = new a1.i(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", (r2.l) bVar, fVar.j());
        if (eVar != null) {
            iVar2.l(new InterfaceC0445b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j4) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f3664J.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0719u4.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f3664J;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0681p5.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0719u4.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f3664J;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0681p5.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0719u4.a(th3);
                            }
                            j4.h(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f3664J.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0719u4.a(th4);
                            }
                            j4.h(arrayList4);
                            return;
                        case 4:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f3664J.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0719u4.a(th5);
                            }
                            j4.h(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f3664J.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0719u4.a(th6);
                            }
                            j4.h(arrayList6);
                            return;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0719u4.a(th7);
                            }
                            j4.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            iVar2.l(null);
        }
        a1.i iVar3 = new a1.i(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", (r2.l) bVar, fVar.j());
        if (eVar != null) {
            iVar3.l(new InterfaceC0445b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j4) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f3664J.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0719u4.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f3664J;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0681p5.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0719u4.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f3664J;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0681p5.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0719u4.a(th3);
                            }
                            j4.h(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f3664J.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0719u4.a(th4);
                            }
                            j4.h(arrayList4);
                            return;
                        case 4:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f3664J.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0719u4.a(th5);
                            }
                            j4.h(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f3664J.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0719u4.a(th6);
                            }
                            j4.h(arrayList6);
                            return;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0719u4.a(th7);
                            }
                            j4.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            iVar3.l(null);
        }
        a1.i iVar4 = new a1.i(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", (r2.l) bVar, fVar.j());
        if (eVar != null) {
            iVar4.l(new InterfaceC0445b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j4) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f3664J.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0719u4.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f3664J;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0681p5.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0719u4.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f3664J;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0681p5.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0719u4.a(th3);
                            }
                            j4.h(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f3664J.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0719u4.a(th4);
                            }
                            j4.h(arrayList4);
                            return;
                        case 4:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f3664J.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0719u4.a(th5);
                            }
                            j4.h(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f3664J.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0719u4.a(th6);
                            }
                            j4.h(arrayList6);
                            return;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0719u4.a(th7);
                            }
                            j4.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            iVar4.l(null);
        }
        a1.i iVar5 = new a1.i(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", (r2.l) bVar, fVar.j());
        if (eVar != null) {
            iVar5.l(new InterfaceC0445b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j4) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f3664J.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0719u4.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f3664J;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0681p5.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0719u4.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f3664J;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0681p5.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0719u4.a(th3);
                            }
                            j4.h(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f3664J.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0719u4.a(th4);
                            }
                            j4.h(arrayList4);
                            return;
                        case 4:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f3664J.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0719u4.a(th5);
                            }
                            j4.h(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f3664J.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0719u4.a(th6);
                            }
                            j4.h(arrayList6);
                            return;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0719u4.a(th7);
                            }
                            j4.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            iVar5.l(null);
        }
        a1.i iVar6 = new a1.i(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", (r2.l) bVar, fVar.j());
        if (eVar != null) {
            iVar6.l(new InterfaceC0445b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j4) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f3664J.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0719u4.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f3664J;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0681p5.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0719u4.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f3664J;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0681p5.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0719u4.a(th3);
                            }
                            j4.h(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f3664J.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0719u4.a(th4);
                            }
                            j4.h(arrayList4);
                            return;
                        case 4:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f3664J.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0719u4.a(th5);
                            }
                            j4.h(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f3664J.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0719u4.a(th6);
                            }
                            j4.h(arrayList6);
                            return;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0719u4.a(th7);
                            }
                            j4.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            iVar6.l(null);
        }
        a1.i iVar7 = new a1.i(fVar, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", (r2.l) bVar, fVar.j());
        if (eVar != null) {
            iVar7.l(new InterfaceC0445b() { // from class: io.flutter.plugins.pathprovider.a
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j4) {
                    File[] externalCacheDirs;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            e eVar2 = eVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, eVar2.f3664J.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0719u4.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            e eVar3 = eVar;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = eVar3.f3664J;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(AbstractC0681p5.a(context), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0719u4.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            e eVar4 = eVar;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = eVar4.f3664J;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(AbstractC0681p5.a(context2), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0719u4.a(th3);
                            }
                            j4.h(arrayList3);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            e eVar5 = eVar;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, eVar5.f3664J.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0719u4.a(th4);
                            }
                            j4.h(arrayList4);
                            return;
                        case 4:
                            e eVar6 = eVar;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String str = null;
                                File externalFilesDir = eVar6.f3664J.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    str = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, str);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0719u4.a(th5);
                            }
                            j4.h(arrayList5);
                            return;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            e eVar7 = eVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                eVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : eVar7.f3664J.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0719u4.a(th6);
                            }
                            j4.h(arrayList6);
                            return;
                        default:
                            e eVar8 = eVar;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, eVar8.a((c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0719u4.a(th7);
                            }
                            j4.h(arrayList8);
                            return;
                    }
                }
            });
        } else {
            iVar7.l(null);
        }
    }

    public static void N(r2.f fVar, final C0531a c0531a) {
        R1.a j3 = fVar.j();
        C0532b c0532b = C0532b.f5362e;
        a1.i iVar = new a1.i(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", (r2.l) c0532b, j3);
        if (c0531a != null) {
            iVar.l(new InterfaceC0445b() { // from class: w2.c
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            C0531a c0531a2 = c0531a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0531a2.f5360J.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0601e5.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            C0531a c0531a3 = c0531a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0531a3.f5360J.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0601e5.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            C0531a c0531a4 = c0531a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0531a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0601e5.a(th3);
                            }
                            j4.h(arrayList4);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0531a c0531a5 = c0531a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0531a5.f5360J.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0601e5.a(th4);
                            }
                            j4.h(arrayList6);
                            return;
                        case 4:
                            C0531a c0531a6 = c0531a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                c0531a6.getClass();
                                String d5 = Double.toString(d4.doubleValue());
                                SharedPreferences.Editor edit = c0531a6.f5360J.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0601e5.a(th5);
                            }
                            j4.h(arrayList8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            C0531a c0531a7 = c0531a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0531a7.f5360J.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0601e5.a(th6);
                            }
                            j4.h(arrayList10);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0531a c0531a8 = c0531a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0531a8.f5360J.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0531a8.f5361K.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0601e5.a(th7);
                            }
                            j4.h(arrayList12);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0531a c0531a9 = c0531a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0531a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0601e5.a(th8);
                            }
                            j4.h(arrayList14);
                            return;
                        default:
                            C0531a c0531a10 = c0531a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0531a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0601e5.a(th9);
                            }
                            j4.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            iVar.l(null);
        }
        a1.i iVar2 = new a1.i(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", (r2.l) c0532b, j3);
        if (c0531a != null) {
            iVar2.l(new InterfaceC0445b() { // from class: w2.c
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            C0531a c0531a2 = c0531a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0531a2.f5360J.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0601e5.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            C0531a c0531a3 = c0531a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0531a3.f5360J.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0601e5.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            C0531a c0531a4 = c0531a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0531a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0601e5.a(th3);
                            }
                            j4.h(arrayList4);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0531a c0531a5 = c0531a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0531a5.f5360J.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0601e5.a(th4);
                            }
                            j4.h(arrayList6);
                            return;
                        case 4:
                            C0531a c0531a6 = c0531a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                c0531a6.getClass();
                                String d5 = Double.toString(d4.doubleValue());
                                SharedPreferences.Editor edit = c0531a6.f5360J.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0601e5.a(th5);
                            }
                            j4.h(arrayList8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            C0531a c0531a7 = c0531a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0531a7.f5360J.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0601e5.a(th6);
                            }
                            j4.h(arrayList10);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0531a c0531a8 = c0531a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0531a8.f5360J.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0531a8.f5361K.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0601e5.a(th7);
                            }
                            j4.h(arrayList12);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0531a c0531a9 = c0531a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0531a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0601e5.a(th8);
                            }
                            j4.h(arrayList14);
                            return;
                        default:
                            C0531a c0531a10 = c0531a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0531a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0601e5.a(th9);
                            }
                            j4.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            iVar2.l(null);
        }
        a1.i iVar3 = new a1.i(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", (r2.l) c0532b, j3);
        if (c0531a != null) {
            iVar3.l(new InterfaceC0445b() { // from class: w2.c
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            C0531a c0531a2 = c0531a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0531a2.f5360J.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0601e5.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            C0531a c0531a3 = c0531a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0531a3.f5360J.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0601e5.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            C0531a c0531a4 = c0531a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0531a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0601e5.a(th3);
                            }
                            j4.h(arrayList4);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0531a c0531a5 = c0531a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0531a5.f5360J.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0601e5.a(th4);
                            }
                            j4.h(arrayList6);
                            return;
                        case 4:
                            C0531a c0531a6 = c0531a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                c0531a6.getClass();
                                String d5 = Double.toString(d4.doubleValue());
                                SharedPreferences.Editor edit = c0531a6.f5360J.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0601e5.a(th5);
                            }
                            j4.h(arrayList8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            C0531a c0531a7 = c0531a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0531a7.f5360J.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0601e5.a(th6);
                            }
                            j4.h(arrayList10);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0531a c0531a8 = c0531a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0531a8.f5360J.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0531a8.f5361K.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0601e5.a(th7);
                            }
                            j4.h(arrayList12);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0531a c0531a9 = c0531a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0531a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0601e5.a(th8);
                            }
                            j4.h(arrayList14);
                            return;
                        default:
                            C0531a c0531a10 = c0531a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0531a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0601e5.a(th9);
                            }
                            j4.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            iVar3.l(null);
        }
        a1.i iVar4 = new a1.i(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", (r2.l) c0532b, j3);
        if (c0531a != null) {
            iVar4.l(new InterfaceC0445b() { // from class: w2.c
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            C0531a c0531a2 = c0531a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0531a2.f5360J.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0601e5.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            C0531a c0531a3 = c0531a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0531a3.f5360J.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0601e5.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            C0531a c0531a4 = c0531a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0531a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0601e5.a(th3);
                            }
                            j4.h(arrayList4);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0531a c0531a5 = c0531a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0531a5.f5360J.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0601e5.a(th4);
                            }
                            j4.h(arrayList6);
                            return;
                        case 4:
                            C0531a c0531a6 = c0531a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                c0531a6.getClass();
                                String d5 = Double.toString(d4.doubleValue());
                                SharedPreferences.Editor edit = c0531a6.f5360J.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0601e5.a(th5);
                            }
                            j4.h(arrayList8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            C0531a c0531a7 = c0531a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0531a7.f5360J.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0601e5.a(th6);
                            }
                            j4.h(arrayList10);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0531a c0531a8 = c0531a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0531a8.f5360J.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0531a8.f5361K.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0601e5.a(th7);
                            }
                            j4.h(arrayList12);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0531a c0531a9 = c0531a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0531a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0601e5.a(th8);
                            }
                            j4.h(arrayList14);
                            return;
                        default:
                            C0531a c0531a10 = c0531a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0531a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0601e5.a(th9);
                            }
                            j4.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            iVar4.l(null);
        }
        a1.i iVar5 = new a1.i(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", (r2.l) c0532b, j3);
        if (c0531a != null) {
            iVar5.l(new InterfaceC0445b() { // from class: w2.c
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            C0531a c0531a2 = c0531a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0531a2.f5360J.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0601e5.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            C0531a c0531a3 = c0531a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0531a3.f5360J.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0601e5.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            C0531a c0531a4 = c0531a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0531a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0601e5.a(th3);
                            }
                            j4.h(arrayList4);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0531a c0531a5 = c0531a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0531a5.f5360J.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0601e5.a(th4);
                            }
                            j4.h(arrayList6);
                            return;
                        case 4:
                            C0531a c0531a6 = c0531a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                c0531a6.getClass();
                                String d5 = Double.toString(d4.doubleValue());
                                SharedPreferences.Editor edit = c0531a6.f5360J.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0601e5.a(th5);
                            }
                            j4.h(arrayList8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            C0531a c0531a7 = c0531a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0531a7.f5360J.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0601e5.a(th6);
                            }
                            j4.h(arrayList10);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0531a c0531a8 = c0531a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0531a8.f5360J.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0531a8.f5361K.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0601e5.a(th7);
                            }
                            j4.h(arrayList12);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0531a c0531a9 = c0531a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0531a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0601e5.a(th8);
                            }
                            j4.h(arrayList14);
                            return;
                        default:
                            C0531a c0531a10 = c0531a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0531a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0601e5.a(th9);
                            }
                            j4.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            iVar5.l(null);
        }
        a1.i iVar6 = new a1.i(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", (r2.l) c0532b, j3);
        if (c0531a != null) {
            iVar6.l(new InterfaceC0445b() { // from class: w2.c
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            C0531a c0531a2 = c0531a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0531a2.f5360J.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0601e5.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            C0531a c0531a3 = c0531a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0531a3.f5360J.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0601e5.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            C0531a c0531a4 = c0531a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0531a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0601e5.a(th3);
                            }
                            j4.h(arrayList4);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0531a c0531a5 = c0531a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0531a5.f5360J.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0601e5.a(th4);
                            }
                            j4.h(arrayList6);
                            return;
                        case 4:
                            C0531a c0531a6 = c0531a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                c0531a6.getClass();
                                String d5 = Double.toString(d4.doubleValue());
                                SharedPreferences.Editor edit = c0531a6.f5360J.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0601e5.a(th5);
                            }
                            j4.h(arrayList8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            C0531a c0531a7 = c0531a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0531a7.f5360J.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0601e5.a(th6);
                            }
                            j4.h(arrayList10);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0531a c0531a8 = c0531a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0531a8.f5360J.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0531a8.f5361K.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0601e5.a(th7);
                            }
                            j4.h(arrayList12);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0531a c0531a9 = c0531a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0531a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0601e5.a(th8);
                            }
                            j4.h(arrayList14);
                            return;
                        default:
                            C0531a c0531a10 = c0531a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0531a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0601e5.a(th9);
                            }
                            j4.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            iVar6.l(null);
        }
        a1.i iVar7 = new a1.i(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", (r2.l) c0532b, j3);
        if (c0531a != null) {
            iVar7.l(new InterfaceC0445b() { // from class: w2.c
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            C0531a c0531a2 = c0531a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0531a2.f5360J.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0601e5.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            C0531a c0531a3 = c0531a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0531a3.f5360J.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0601e5.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            C0531a c0531a4 = c0531a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0531a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0601e5.a(th3);
                            }
                            j4.h(arrayList4);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0531a c0531a5 = c0531a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0531a5.f5360J.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0601e5.a(th4);
                            }
                            j4.h(arrayList6);
                            return;
                        case 4:
                            C0531a c0531a6 = c0531a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                c0531a6.getClass();
                                String d5 = Double.toString(d4.doubleValue());
                                SharedPreferences.Editor edit = c0531a6.f5360J.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0601e5.a(th5);
                            }
                            j4.h(arrayList8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            C0531a c0531a7 = c0531a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0531a7.f5360J.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0601e5.a(th6);
                            }
                            j4.h(arrayList10);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0531a c0531a8 = c0531a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0531a8.f5360J.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0531a8.f5361K.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0601e5.a(th7);
                            }
                            j4.h(arrayList12);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0531a c0531a9 = c0531a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0531a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0601e5.a(th8);
                            }
                            j4.h(arrayList14);
                            return;
                        default:
                            C0531a c0531a10 = c0531a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0531a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0601e5.a(th9);
                            }
                            j4.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            iVar7.l(null);
        }
        a1.i iVar8 = new a1.i(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", (r2.l) c0532b, j3);
        if (c0531a != null) {
            iVar8.l(new InterfaceC0445b() { // from class: w2.c
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            C0531a c0531a2 = c0531a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0531a2.f5360J.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0601e5.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            C0531a c0531a3 = c0531a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0531a3.f5360J.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0601e5.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            C0531a c0531a4 = c0531a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0531a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0601e5.a(th3);
                            }
                            j4.h(arrayList4);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0531a c0531a5 = c0531a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0531a5.f5360J.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0601e5.a(th4);
                            }
                            j4.h(arrayList6);
                            return;
                        case 4:
                            C0531a c0531a6 = c0531a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                c0531a6.getClass();
                                String d5 = Double.toString(d4.doubleValue());
                                SharedPreferences.Editor edit = c0531a6.f5360J.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0601e5.a(th5);
                            }
                            j4.h(arrayList8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            C0531a c0531a7 = c0531a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0531a7.f5360J.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0601e5.a(th6);
                            }
                            j4.h(arrayList10);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0531a c0531a8 = c0531a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0531a8.f5360J.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0531a8.f5361K.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0601e5.a(th7);
                            }
                            j4.h(arrayList12);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0531a c0531a9 = c0531a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0531a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0601e5.a(th8);
                            }
                            j4.h(arrayList14);
                            return;
                        default:
                            C0531a c0531a10 = c0531a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0531a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0601e5.a(th9);
                            }
                            j4.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            iVar8.l(null);
        }
        a1.i iVar9 = new a1.i(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", (r2.l) c0532b, j3);
        if (c0531a != null) {
            iVar9.l(new InterfaceC0445b() { // from class: w2.c
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            C0531a c0531a2 = c0531a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(c0531a2.f5360J.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = AbstractC0601e5.a(th);
                            }
                            j4.h(arrayList);
                            return;
                        case 1:
                            C0531a c0531a3 = c0531a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(c0531a3.f5360J.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0601e5.a(th2);
                            }
                            j4.h(arrayList2);
                            return;
                        case 2:
                            C0531a c0531a4 = c0531a;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, c0531a4.c((String) arrayList5.get(0), (String) arrayList5.get(1)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0601e5.a(th3);
                            }
                            j4.h(arrayList4);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            C0531a c0531a5 = c0531a;
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(c0531a5.f5360J.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0601e5.a(th4);
                            }
                            j4.h(arrayList6);
                            return;
                        case 4:
                            C0531a c0531a6 = c0531a;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str = (String) arrayList9.get(0);
                            Double d4 = (Double) arrayList9.get(1);
                            try {
                                c0531a6.getClass();
                                String d5 = Double.toString(d4.doubleValue());
                                SharedPreferences.Editor edit = c0531a6.f5360J.edit();
                                arrayList8.add(0, Boolean.valueOf(edit.putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d5).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = AbstractC0601e5.a(th5);
                            }
                            j4.h(arrayList8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            C0531a c0531a7 = c0531a;
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(c0531a7.f5360J.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = AbstractC0601e5.a(th6);
                            }
                            j4.h(arrayList10);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0531a c0531a8 = c0531a;
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str2 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                SharedPreferences.Editor edit2 = c0531a8.f5360J.edit();
                                arrayList12.add(0, Boolean.valueOf(edit2.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0531a8.f5361K.o(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = AbstractC0601e5.a(th7);
                            }
                            j4.h(arrayList12);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0531a c0531a9 = c0531a;
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, c0531a9.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = AbstractC0601e5.a(th8);
                            }
                            j4.h(arrayList14);
                            return;
                        default:
                            C0531a c0531a10 = c0531a;
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, c0531a10.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = AbstractC0601e5.a(th9);
                            }
                            j4.h(arrayList16);
                            return;
                    }
                }
            });
        } else {
            iVar9.l(null);
        }
    }

    public static void O(r2.f fVar, final w2.q qVar) {
        C0764c c0764c = C0764c.f6153d;
        a1.i iVar = new a1.i(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", (r2.l) c0764c, (R1.a) null);
        if (qVar != null) {
            iVar.l(new InterfaceC0445b() { // from class: x2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j3) {
                    Boolean bool;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            q qVar2 = qVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, qVar2.a((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0657m5.a(th);
                            }
                            j3.h(arrayList);
                            return;
                        case 1:
                            q qVar3 = qVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0657m5.a(th2);
                            }
                            if (((AbstractActivityC0292d) qVar3.f5403L) != null) {
                                try {
                                    ((AbstractActivityC0292d) qVar3.f5403L).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", q.b(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                j3.h(arrayList2);
                                return;
                            }
                            throw new C0763b();
                        case 2:
                            q qVar4 = qVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, qVar4.d((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0766e) arrayList5.get(2), (C0762a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0657m5.a(th3);
                            }
                            j3.h(arrayList4);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            q qVar5 = qVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, qVar5.e());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0657m5.a(th4);
                            }
                            j3.h(arrayList6);
                            return;
                        default:
                            q qVar6 = qVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                qVar6.getClass();
                                ((Context) qVar6.f5401J).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0657m5.a(th5);
                            }
                            j3.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar.l(null);
        }
        a1.i iVar2 = new a1.i(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", (r2.l) c0764c, (R1.a) null);
        if (qVar != null) {
            iVar2.l(new InterfaceC0445b() { // from class: x2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j3) {
                    Boolean bool;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            q qVar2 = qVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, qVar2.a((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0657m5.a(th);
                            }
                            j3.h(arrayList);
                            return;
                        case 1:
                            q qVar3 = qVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0657m5.a(th2);
                            }
                            if (((AbstractActivityC0292d) qVar3.f5403L) != null) {
                                try {
                                    ((AbstractActivityC0292d) qVar3.f5403L).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", q.b(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                j3.h(arrayList2);
                                return;
                            }
                            throw new C0763b();
                        case 2:
                            q qVar4 = qVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, qVar4.d((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0766e) arrayList5.get(2), (C0762a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0657m5.a(th3);
                            }
                            j3.h(arrayList4);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            q qVar5 = qVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, qVar5.e());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0657m5.a(th4);
                            }
                            j3.h(arrayList6);
                            return;
                        default:
                            q qVar6 = qVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                qVar6.getClass();
                                ((Context) qVar6.f5401J).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0657m5.a(th5);
                            }
                            j3.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar2.l(null);
        }
        a1.i iVar3 = new a1.i(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", (r2.l) c0764c, (R1.a) null);
        if (qVar != null) {
            iVar3.l(new InterfaceC0445b() { // from class: x2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j3) {
                    Boolean bool;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            q qVar2 = qVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, qVar2.a((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0657m5.a(th);
                            }
                            j3.h(arrayList);
                            return;
                        case 1:
                            q qVar3 = qVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0657m5.a(th2);
                            }
                            if (((AbstractActivityC0292d) qVar3.f5403L) != null) {
                                try {
                                    ((AbstractActivityC0292d) qVar3.f5403L).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", q.b(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                j3.h(arrayList2);
                                return;
                            }
                            throw new C0763b();
                        case 2:
                            q qVar4 = qVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, qVar4.d((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0766e) arrayList5.get(2), (C0762a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0657m5.a(th3);
                            }
                            j3.h(arrayList4);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            q qVar5 = qVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, qVar5.e());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0657m5.a(th4);
                            }
                            j3.h(arrayList6);
                            return;
                        default:
                            q qVar6 = qVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                qVar6.getClass();
                                ((Context) qVar6.f5401J).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0657m5.a(th5);
                            }
                            j3.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar3.l(null);
        }
        a1.i iVar4 = new a1.i(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", (r2.l) c0764c, (R1.a) null);
        if (qVar != null) {
            iVar4.l(new InterfaceC0445b() { // from class: x2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j3) {
                    Boolean bool;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            q qVar2 = qVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, qVar2.a((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0657m5.a(th);
                            }
                            j3.h(arrayList);
                            return;
                        case 1:
                            q qVar3 = qVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0657m5.a(th2);
                            }
                            if (((AbstractActivityC0292d) qVar3.f5403L) != null) {
                                try {
                                    ((AbstractActivityC0292d) qVar3.f5403L).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", q.b(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                j3.h(arrayList2);
                                return;
                            }
                            throw new C0763b();
                        case 2:
                            q qVar4 = qVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, qVar4.d((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0766e) arrayList5.get(2), (C0762a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0657m5.a(th3);
                            }
                            j3.h(arrayList4);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            q qVar5 = qVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, qVar5.e());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0657m5.a(th4);
                            }
                            j3.h(arrayList6);
                            return;
                        default:
                            q qVar6 = qVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                qVar6.getClass();
                                ((Context) qVar6.f5401J).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0657m5.a(th5);
                            }
                            j3.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar4.l(null);
        }
        a1.i iVar5 = new a1.i(fVar, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", (r2.l) c0764c, (R1.a) null);
        if (qVar != null) {
            iVar5.l(new InterfaceC0445b() { // from class: x2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, J j3) {
                    Boolean bool;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            q qVar2 = qVar;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, qVar2.a((String) ((ArrayList) obj).get(0)));
                            } catch (Throwable th) {
                                arrayList = AbstractC0657m5.a(th);
                            }
                            j3.h(arrayList);
                            return;
                        case 1:
                            q qVar3 = qVar;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            String str = (String) arrayList3.get(0);
                            Map map = (Map) arrayList3.get(1);
                            try {
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0657m5.a(th2);
                            }
                            if (((AbstractActivityC0292d) qVar3.f5403L) != null) {
                                try {
                                    ((AbstractActivityC0292d) qVar3.f5403L).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", q.b(map)));
                                    bool = Boolean.TRUE;
                                } catch (ActivityNotFoundException unused) {
                                    bool = Boolean.FALSE;
                                }
                                arrayList2.add(0, bool);
                                j3.h(arrayList2);
                                return;
                            }
                            throw new C0763b();
                        case 2:
                            q qVar4 = qVar;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            try {
                                arrayList4.add(0, qVar4.d((String) arrayList5.get(0), (Boolean) arrayList5.get(1), (C0766e) arrayList5.get(2), (C0762a) arrayList5.get(3)));
                            } catch (Throwable th3) {
                                arrayList4 = AbstractC0657m5.a(th3);
                            }
                            j3.h(arrayList4);
                            return;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            q qVar5 = qVar;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, qVar5.e());
                            } catch (Throwable th4) {
                                arrayList6 = AbstractC0657m5.a(th4);
                            }
                            j3.h(arrayList6);
                            return;
                        default:
                            q qVar6 = qVar;
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                qVar6.getClass();
                                ((Context) qVar6.f5401J).sendBroadcast(new Intent("close action"));
                                arrayList7.add(0, null);
                            } catch (Throwable th5) {
                                arrayList7 = AbstractC0657m5.a(th5);
                            }
                            j3.h(arrayList7);
                            return;
                    }
                }
            });
        } else {
            iVar5.l(null);
        }
    }

    public static boolean a(androidx.camera.core.impl.V v3, C0076c c0076c) {
        return v3.V().q(c0076c);
    }

    public static void b(androidx.camera.core.impl.V v3, C.f fVar) {
        v3.V().X(fVar);
    }

    public static CaptureResult c() {
        return c();
    }

    public static androidx.camera.core.impl.m0 d(androidx.camera.core.impl.k0 k0Var) {
        return (androidx.camera.core.impl.m0) k0Var.e(androidx.camera.core.impl.k0.f2217G);
    }

    public static C0042x e(androidx.camera.core.impl.k0 k0Var) {
        C0042x c0042x = (C0042x) k0Var.i0(androidx.camera.core.impl.H.f2136m, C0042x.f479c);
        c0042x.getClass();
        return c0042x;
    }

    public static EnumC0097z f(androidx.camera.core.impl.V v3, C0076c c0076c) {
        return v3.V().g0(c0076c);
    }

    public static Set g(androidx.camera.core.impl.V v3, C0076c c0076c) {
        return v3.V().J(c0076c);
    }

    public static int h(androidx.camera.core.impl.k0 k0Var) {
        return ((Integer) k0Var.e(androidx.camera.core.impl.k0.f2212B)).intValue();
    }

    public static int i(androidx.camera.core.impl.k0 k0Var) {
        return ((Integer) k0Var.i0(androidx.camera.core.impl.k0.f2212B, 0)).intValue();
    }

    public static String j(androidx.camera.core.impl.k0 k0Var) {
        return (String) k0Var.e(I.l.f780b);
    }

    public static String k(androidx.camera.core.impl.k0 k0Var, String str) {
        return (String) k0Var.i0(I.l.f780b, str);
    }

    public static boolean l(androidx.camera.core.impl.k0 k0Var) {
        return ((Boolean) k0Var.i0(androidx.camera.core.impl.k0.f2216F, Boolean.FALSE)).booleanValue();
    }

    public static boolean m(androidx.camera.core.impl.k0 k0Var) {
        return ((Boolean) k0Var.i0(androidx.camera.core.impl.k0.f2215E, Boolean.FALSE)).booleanValue();
    }

    public static Set n(androidx.camera.core.impl.V v3) {
        return v3.V().o();
    }

    public static Object o(androidx.camera.core.impl.V v3, C0076c c0076c) {
        return v3.V().e(c0076c);
    }

    public static Object p(androidx.camera.core.impl.V v3, C0076c c0076c, Object obj) {
        return v3.V().i0(c0076c, obj);
    }

    public static Object q(androidx.camera.core.impl.V v3, C0076c c0076c, EnumC0097z enumC0097z) {
        return v3.V().E(c0076c, enumC0097z);
    }

    public static int r(int r02, int r12, int r22) {
        return com.google.android.gms.internal.mlkit_vision_barcode_bundled.M.L(r02) + r12 + r22;
    }

    public static int s(int r02, int r12, int r22, int r3) {
        return com.google.android.gms.internal.mlkit_vision_barcode_bundled.M.L(r02) + r12 + r22 + r3;
    }

    public static androidx.camera.core.impl.e0 t(ArrayList arrayList, androidx.camera.core.impl.e0 e0Var) {
        arrayList.add(e0Var);
        return new androidx.camera.core.impl.e0();
    }

    public static ClassCastException u(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String v(int r12, String str, String str2) {
        return str + r12 + str2;
    }

    public static String w(String str, int r22) {
        return str + r22;
    }

    public static String x(String str, int r22, String str2, int r4) {
        return str + r22 + str2 + r4;
    }

    public static String y(String str, String str2) {
        return str + str2;
    }

    public static String z(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }
}
