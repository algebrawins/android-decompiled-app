package d2;

import A0.C0001b;
import D.RunnableC0023c;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import android.window.BackEvent;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h2.AbstractActivityC0292d;
import h2.J;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.C0322i;
import k1.C0343l;
import m1.C0352a;
import n0.C0385s;
import n0.InterfaceC0375h;
import o1.C0398a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.L;
import q2.w;
import s2.C0454a;
import t2.InterfaceC0461a;
import u1.AbstractC0474b;

/* renamed from: d2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0235c implements r2.h, r2.d, j1.i, Y2.d, L, r2.m, InterfaceC0375h {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f3002J;

    /* renamed from: K  reason: collision with root package name */
    public Object f3003K;

    public /* synthetic */ C0235c(int r12) {
        this.f3002J = r12;
    }

    public static HashMap k(BackEvent backEvent) {
        float touchX;
        float touchY;
        List list;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        if (!Float.isNaN(touchX) && !Float.isNaN(touchY)) {
            list = Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY));
        } else {
            list = null;
        }
        hashMap.put("touchOffset", list);
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02fe, code lost:
        if (r8 != true) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b A[Catch: JSONException -> 0x003b, TryCatch #4 {JSONException -> 0x003b, blocks: (B:6:0x001a, B:7:0x002b, B:59:0x00df, B:60:0x00e4, B:61:0x0115, B:68:0x013b, B:64:0x012e, B:67:0x0135, B:69:0x014a, B:70:0x0170, B:72:0x0174, B:76:0x0181, B:78:0x018b, B:79:0x0198, B:74:0x0179, B:80:0x019d, B:82:0x01af, B:83:0x01b7, B:85:0x01bf, B:87:0x01d3, B:88:0x01d6, B:96:0x01fd, B:97:0x020d, B:162:0x0323, B:167:0x033d, B:169:0x034f, B:171:0x0362, B:170:0x035f, B:95:0x01f4, B:104:0x0243, B:111:0x0261, B:123:0x02a7, B:160:0x031b, B:165:0x0335, B:174:0x0367, B:9:0x0030, B:14:0x003e, B:17:0x0049, B:20:0x0055, B:23:0x0061, B:26:0x006c, B:29:0x0077, B:32:0x0081, B:35:0x008b, B:38:0x0095, B:41:0x009f, B:44:0x00a9, B:47:0x00b4, B:50:0x00bf, B:53:0x00ca, B:113:0x026a, B:115:0x0274, B:116:0x0277, B:118:0x028f, B:120:0x02a1, B:119:0x0298), top: B:180:0x001a, inners: #1, #5, #7, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198 A[Catch: JSONException -> 0x003b, TryCatch #4 {JSONException -> 0x003b, blocks: (B:6:0x001a, B:7:0x002b, B:59:0x00df, B:60:0x00e4, B:61:0x0115, B:68:0x013b, B:64:0x012e, B:67:0x0135, B:69:0x014a, B:70:0x0170, B:72:0x0174, B:76:0x0181, B:78:0x018b, B:79:0x0198, B:74:0x0179, B:80:0x019d, B:82:0x01af, B:83:0x01b7, B:85:0x01bf, B:87:0x01d3, B:88:0x01d6, B:96:0x01fd, B:97:0x020d, B:162:0x0323, B:167:0x033d, B:169:0x034f, B:171:0x0362, B:170:0x035f, B:95:0x01f4, B:104:0x0243, B:111:0x0261, B:123:0x02a7, B:160:0x031b, B:165:0x0335, B:174:0x0367, B:9:0x0030, B:14:0x003e, B:17:0x0049, B:20:0x0055, B:23:0x0061, B:26:0x006c, B:29:0x0077, B:32:0x0081, B:35:0x008b, B:38:0x0095, B:41:0x009f, B:44:0x00a9, B:47:0x00b4, B:50:0x00bf, B:53:0x00ca, B:113:0x026a, B:115:0x0274, B:116:0x0277, B:118:0x028f, B:120:0x02a1, B:119:0x0298), top: B:180:0x001a, inners: #1, #5, #7, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n(h2.J r21, q2.n r22) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C0235c.n(h2.J, q2.n):void");
    }

    @Override // p.L
    public void a(o.j jVar, o.k kVar) {
        o.g gVar = (o.g) this.f3003K;
        o.f fVar = null;
        gVar.f4381O.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f4383Q;
        int size = arrayList.size();
        int r4 = 0;
        while (true) {
            if (r4 < size) {
                if (jVar == ((o.f) arrayList.get(r4)).f4375b) {
                    break;
                }
                r4++;
            } else {
                r4 = -1;
                break;
            }
        }
        if (r4 == -1) {
            return;
        }
        int r42 = r4 + 1;
        if (r42 < arrayList.size()) {
            fVar = (o.f) arrayList.get(r42);
        }
        gVar.f4381O.postAtTime(new o.e(this, fVar, kVar, jVar), jVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // r2.h
    public void b(r2.g gVar) {
        this.f3003K = gVar;
    }

    @Override // p.L
    public void c(o.j jVar, o.k kVar) {
        ((o.g) this.f3003K).f4381O.removeCallbacksAndMessages(jVar);
    }

    @Override // n0.InterfaceC0375h
    public Object d(M2.p pVar, F2.g gVar) {
        return ((InterfaceC0375h) this.f3003K).d(new r0.c(pVar, null), gVar);
    }

    @Override // r2.h
    public void e() {
        this.f3003K = null;
    }

    @Override // n0.InterfaceC0375h
    public Y2.d f() {
        return ((InterfaceC0375h) this.f3003K).f();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractMap, java.util.HashMap, N.o] */
    public void g(String str) {
        Object orDefault;
        PointerIcon systemIcon;
        J j3 = (J) this.f3003K;
        InterfaceC0461a interfaceC0461a = (InterfaceC0461a) j3.f3303K;
        if (J.f3301N == null) {
            ?? hashMap = new HashMap();
            hashMap.put("alias", 1010);
            hashMap.put("allScroll", 1013);
            hashMap.put("basic", 1000);
            hashMap.put("cell", 1006);
            hashMap.put("click", 1002);
            hashMap.put("contextMenu", 1001);
            hashMap.put("copy", 1011);
            hashMap.put("forbidden", 1012);
            hashMap.put("grab", 1020);
            hashMap.put("grabbing", 1021);
            hashMap.put("help", 1003);
            hashMap.put("move", 1013);
            hashMap.put("none", 0);
            hashMap.put("noDrop", 1012);
            hashMap.put("precise", 1007);
            hashMap.put("text", 1008);
            hashMap.put("resizeColumn", 1014);
            hashMap.put("resizeDown", 1015);
            hashMap.put("resizeUpLeft", 1016);
            hashMap.put("resizeDownRight", 1017);
            hashMap.put("resizeLeft", 1014);
            hashMap.put("resizeLeftRight", 1014);
            hashMap.put("resizeRight", 1014);
            hashMap.put("resizeRow", 1015);
            hashMap.put("resizeUp", 1015);
            hashMap.put("resizeUpDown", 1015);
            hashMap.put("resizeUpLeft", 1017);
            hashMap.put("resizeUpRight", 1016);
            hashMap.put("resizeUpLeftDownRight", 1017);
            hashMap.put("resizeUpRightDownLeft", 1016);
            hashMap.put("verticalText", 1009);
            hashMap.put("wait", 1004);
            hashMap.put("zoomIn", 1018);
            hashMap.put("zoomOut", 1019);
            J.f3301N = hashMap;
        }
        orDefault = J.f3301N.getOrDefault(str, 1000);
        systemIcon = PointerIcon.getSystemIcon(((h2.t) ((InterfaceC0461a) j3.f3303K)).getContext(), ((Integer) orDefault).intValue());
        interfaceC0461a.setPointerIcon(systemIcon);
    }

    @Override // Y2.d
    public Object h(Y2.e eVar, D2.d dVar) {
        Object h3 = ((A.f) this.f3003K).h(new C0385s(eVar, 0), dVar);
        if (h3 == E2.a.COROUTINE_SUSPENDED) {
            return h3;
        }
        return B2.i.f210a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // r2.m
    public void i(J j3, q2.n nVar) {
        String str;
        char c4;
        char c5;
        Bundle bundle;
        boolean z3 = false;
        switch (this.f3002J) {
            case 15:
                J j4 = (J) this.f3003K;
                if (((C0235c) j4.f3304L) != null) {
                    String str2 = (String) j3.f3303K;
                    str2.getClass();
                    if (!str2.equals("Localization.getStringResource")) {
                        nVar.b();
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) j3.f3304L;
                    try {
                        String string = jSONObject.getString("key");
                        if (jSONObject.has("locale")) {
                            str = jSONObject.getString("locale");
                        } else {
                            str = null;
                        }
                        nVar.c(((C0235c) j4.f3304L).m(string, str));
                        return;
                    } catch (JSONException e4) {
                        nVar.a("error", e4.getMessage(), null);
                        return;
                    }
                }
                return;
            case 16:
            case 19:
            default:
                J j5 = (J) this.f3003K;
                if (((C0235c) j5.f3304L) != null) {
                    String str3 = (String) j3.f3303K;
                    str3.getClass();
                    Object obj = j3.f3304L;
                    switch (str3.hashCode()) {
                        case -1779068172:
                            if (str3.equals("TextInput.setPlatformViewClient")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1015421462:
                            if (str3.equals("TextInput.setEditingState")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -37561188:
                            if (str3.equals("TextInput.setClient")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 270476819:
                            if (str3.equals("TextInput.hide")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 270803918:
                            if (str3.equals("TextInput.show")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 649192816:
                            if (str3.equals("TextInput.sendAppPrivateCommand")) {
                                c5 = 5;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1204752139:
                            if (str3.equals("TextInput.setEditableSizeAndTransform")) {
                                c5 = 6;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1727570905:
                            if (str3.equals("TextInput.finishAutofillContext")) {
                                c5 = 7;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1904427655:
                            if (str3.equals("TextInput.clearClient")) {
                                c5 = '\b';
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 2113369584:
                            if (str3.equals("TextInput.requestAutofill")) {
                                c5 = '\t';
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    switch (c5) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            try {
                                JSONObject jSONObject2 = (JSONObject) obj;
                                ((C0235c) j5.f3304L).u(jSONObject2.getInt("platformViewId"), jSONObject2.optBoolean("usesVirtualDisplay", false));
                                nVar.c(null);
                                return;
                            } catch (JSONException e5) {
                                nVar.a("error", e5.getMessage(), null);
                                return;
                            }
                        case 1:
                            try {
                                ((C0235c) j5.f3304L).t(q2.v.a((JSONObject) obj));
                                nVar.c(null);
                                return;
                            } catch (JSONException e6) {
                                nVar.a("error", e6.getMessage(), null);
                                return;
                            }
                        case 2:
                            try {
                                JSONArray jSONArray = (JSONArray) obj;
                                ((C0235c) j5.f3304L).q(jSONArray.getInt(0), q2.s.a(jSONArray.getJSONObject(1)));
                                nVar.c(null);
                                return;
                            } catch (NoSuchFieldException | JSONException e7) {
                                nVar.a("error", e7.getMessage(), null);
                                return;
                            }
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) ((C0235c) j5.f3304L).f3003K;
                            if (((io.flutter.plugin.editing.j) kVar.f3547e.f2651b) == io.flutter.plugin.editing.j.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                                kVar.c();
                            } else {
                                kVar.c();
                                kVar.f3544b.hideSoftInputFromWindow(kVar.f3543a.getApplicationWindowToken(), 0);
                            }
                            nVar.c(null);
                            return;
                        case 4:
                            io.flutter.plugin.editing.k kVar2 = (io.flutter.plugin.editing.k) ((C0235c) j5.f3304L).f3003K;
                            View view = kVar2.f3543a;
                            q2.s sVar = kVar2.f3548f;
                            InputMethodManager inputMethodManager = kVar2.f3544b;
                            if (sVar != null && sVar.g.f4847a == w.NONE) {
                                kVar2.c();
                                inputMethodManager.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
                            } else {
                                view.requestFocus();
                                inputMethodManager.showSoftInput(view, 0);
                            }
                            nVar.c(null);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            try {
                                JSONObject jSONObject3 = (JSONObject) obj;
                                String string2 = jSONObject3.getString("action");
                                String string3 = jSONObject3.getString("data");
                                if (string3 != null && !string3.isEmpty()) {
                                    bundle = new Bundle();
                                    bundle.putString("data", string3);
                                } else {
                                    bundle = null;
                                }
                                io.flutter.plugin.editing.k kVar3 = (io.flutter.plugin.editing.k) ((C0235c) j5.f3304L).f3003K;
                                kVar3.f3544b.sendAppPrivateCommand(kVar3.f3543a, string2, bundle);
                                nVar.c(null);
                                return;
                            } catch (JSONException e8) {
                                nVar.a("error", e8.getMessage(), null);
                                return;
                            }
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            try {
                                JSONObject jSONObject4 = (JSONObject) obj;
                                double d4 = jSONObject4.getDouble("width");
                                double d5 = jSONObject4.getDouble("height");
                                JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                                double[] dArr = new double[16];
                                for (int r14 = 0; r14 < 16; r14++) {
                                    dArr[r14] = jSONArray2.getDouble(r14);
                                }
                                ((C0235c) j5.f3304L).r(d4, d5, dArr);
                                nVar.c(null);
                                return;
                            } catch (JSONException e9) {
                                nVar.a("error", e9.getMessage(), null);
                                return;
                            }
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0235c c0235c = (C0235c) j5.f3304L;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AutofillManager autofillManager = ((io.flutter.plugin.editing.k) c0235c.f3003K).f3545c;
                                if (autofillManager != null) {
                                    if (booleanValue) {
                                        autofillManager.commit();
                                    } else {
                                        autofillManager.cancel();
                                    }
                                }
                            } else {
                                c0235c.getClass();
                            }
                            nVar.c(null);
                            return;
                        case '\b':
                            io.flutter.plugin.editing.k kVar4 = (io.flutter.plugin.editing.k) ((C0235c) j5.f3304L).f3003K;
                            io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) kVar4.f3547e.f2651b;
                            io.flutter.plugin.editing.j jVar2 = io.flutter.plugin.editing.j.VIRTUAL_DISPLAY_PLATFORM_VIEW;
                            if (jVar != jVar2) {
                                kVar4.f3549h.e(kVar4);
                                kVar4.c();
                                kVar4.f3548f = null;
                                kVar4.d(null);
                                io.flutter.plugin.editing.j jVar3 = io.flutter.plugin.editing.j.NO_TARGET;
                                kVar4.f3547e = new c0.f(jVar3, 0);
                                if (jVar3 == jVar2) {
                                    kVar4.f3557p = false;
                                }
                                kVar4.f3554m = null;
                            }
                            nVar.c(null);
                            return;
                        case '\t':
                            int r3 = Build.VERSION.SDK_INT;
                            io.flutter.plugin.editing.k kVar5 = (io.flutter.plugin.editing.k) ((C0235c) j5.f3304L).f3003K;
                            if (r3 >= 26) {
                                if (kVar5.f3545c != null && kVar5.g != null) {
                                    int[] r4 = new int[2];
                                    View view2 = kVar5.f3543a;
                                    view2.getLocationOnScreen(r4);
                                    Rect rect = new Rect(kVar5.f3554m);
                                    rect.offset(r4[0], r4[1]);
                                    kVar5.f3545c.notifyViewEntered(view2, ((String) kVar5.f3548f.f4844j.f1832J).hashCode(), rect);
                                }
                            } else {
                                kVar5.getClass();
                            }
                            nVar.c(null);
                            return;
                        default:
                            nVar.b();
                            return;
                    }
                }
                return;
            case 17:
                n(j3, nVar);
                return;
            case 18:
                C0322i c0322i = (C0322i) this.f3003K;
                if (((C0235c) c0322i.f3983K) != null) {
                    String str4 = (String) j3.f3303K;
                    str4.getClass();
                    Object obj2 = j3.f3304L;
                    switch (str4.hashCode()) {
                        case -1352294148:
                            if (str4.equals("create")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -756050293:
                            if (str4.equals("clearFocus")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 110550847:
                            if (str4.equals("touch")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 576796989:
                            if (str4.equals("setDirection")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 751366695:
                            if (str4.equals("isSurfaceControlEnabled")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1671767583:
                            if (str4.equals("dispose")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            Map map = (Map) obj2;
                            if (map.containsKey("params")) {
                                ByteBuffer.wrap((byte[]) map.get("params"));
                            }
                            try {
                                ((Integer) map.get("id")).getClass();
                                String str5 = (String) map.get("viewType");
                                ((Integer) map.get("direction")).getClass();
                                if (((io.flutter.plugin.platform.i) ((C0235c) c0322i.f3983K).f3003K).f3565a.f1033a.get(str5) == null) {
                                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str5);
                                }
                                throw new ClassCastException();
                            } catch (IllegalStateException e10) {
                                nVar.a("error", Log.getStackTraceString(e10), null);
                                return;
                            }
                        case 1:
                            int intValue = ((Integer) obj2).intValue();
                            try {
                                if (((io.flutter.plugin.platform.i) ((C0235c) c0322i.f3983K).f3003K).g.get(intValue) == null) {
                                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                                    nVar.c(null);
                                    return;
                                }
                                throw new ClassCastException();
                            } catch (IllegalStateException e11) {
                                nVar.a("error", Log.getStackTraceString(e11), null);
                                return;
                            }
                        case 2:
                            List list = (List) obj2;
                            int intValue2 = ((Integer) list.get(0)).intValue();
                            Number number = (Number) list.get(1);
                            Number number2 = (Number) list.get(2);
                            ((Integer) list.get(3)).getClass();
                            ((Integer) list.get(4)).getClass();
                            list.get(5);
                            list.get(6);
                            ((Integer) list.get(7)).getClass();
                            ((Integer) list.get(8)).getClass();
                            ((Double) list.get(9)).getClass();
                            ((Double) list.get(10)).getClass();
                            ((Integer) list.get(11)).getClass();
                            ((Integer) list.get(12)).getClass();
                            ((Integer) list.get(13)).getClass();
                            ((Integer) list.get(14)).getClass();
                            ((Number) list.get(15)).longValue();
                            try {
                                C0235c c0235c2 = (C0235c) c0322i.f3983K;
                                c0235c2.getClass();
                                io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) c0235c2.f3003K;
                                float f2 = iVar.f3566b.getResources().getDisplayMetrics().density;
                                if (iVar.g.get(intValue2) == null) {
                                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                                    nVar.c(null);
                                    return;
                                }
                                throw new ClassCastException();
                            } catch (IllegalStateException e12) {
                                nVar.a("error", Log.getStackTraceString(e12), null);
                                return;
                            }
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            Map map2 = (Map) obj2;
                            int intValue3 = ((Integer) map2.get("id")).intValue();
                            ((Integer) map2.get("direction")).getClass();
                            try {
                                if (((io.flutter.plugin.platform.i) ((C0235c) c0322i.f3983K).f3003K).g.get(intValue3) == null) {
                                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                                    nVar.c(null);
                                    return;
                                }
                                throw new ClassCastException();
                            } catch (IllegalStateException e13) {
                                nVar.a("error", Log.getStackTraceString(e13), null);
                                return;
                            }
                        case 4:
                            FlutterJNI flutterJNI = ((io.flutter.plugin.platform.i) ((C0235c) c0322i.f3983K).f3003K).f3568d;
                            if (flutterJNI != null) {
                                z3 = flutterJNI.IsSurfaceControlEnabled();
                            }
                            nVar.c(Boolean.valueOf(z3));
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            try {
                                ((C0235c) c0322i.f3983K).l(((Integer) ((Map) obj2).get("id")).intValue());
                                nVar.c(null);
                                return;
                            } catch (IllegalStateException e14) {
                                nVar.a("error", Log.getStackTraceString(e14), null);
                                return;
                            }
                        default:
                            nVar.b();
                            return;
                    }
                }
                return;
            case 20:
                String str6 = (String) j3.f3303K;
                str6.getClass();
                q2.o oVar = (q2.o) this.f3003K;
                if (!str6.equals("get")) {
                    if (!str6.equals("put")) {
                        nVar.b();
                        return;
                    }
                    oVar.f4826b = (byte[]) j3.f3304L;
                    nVar.c(null);
                    return;
                }
                oVar.f4830f = true;
                if (!oVar.f4829e && oVar.f4825a) {
                    oVar.f4828d = nVar;
                    return;
                } else {
                    nVar.c(q2.o.a(oVar.f4826b));
                    return;
                }
        }
    }

    @Override // j1.i
    public void j(Object obj, Object obj2) {
        switch (this.f3002J) {
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                C1.g gVar = (C1.g) obj2;
                C0352a c0352a = (C0352a) ((m1.c) obj).q();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(c0352a.f5025n);
                AbstractC0474b.c(obtain, (C0343l) this.f3003K);
                try {
                    c0352a.f5024m.transact(1, obtain, null, 1);
                    obtain.recycle();
                    gVar.f239a.h(null);
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            default:
                o1.f fVar = new o1.f((C1.g) obj2, 0);
                o1.e eVar = (o1.e) ((o1.h) obj).q();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(eVar.f5025n);
                AbstractC0474b.d(obtain2, fVar);
                AbstractC0474b.c(obtain2, (C0398a) this.f3003K);
                eVar.D(obtain2, 1);
                return;
        }
    }

    public void l(int r3) {
        if (((io.flutter.plugin.platform.i) this.f3003K).g.get(r3) == null) {
            Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + r3);
            return;
        }
        throw new ClassCastException();
    }

    public String m(String str, String str2) {
        C0454a c0454a = (C0454a) this.f3003K;
        Context context = c0454a.f4974b;
        AbstractActivityC0292d abstractActivityC0292d = c0454a.f4974b;
        if (str2 != null) {
            Locale a4 = C0454a.a(str2);
            Configuration configuration = new Configuration(abstractActivityC0292d.getResources().getConfiguration());
            configuration.setLocale(a4);
            context = abstractActivityC0292d.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", abstractActivityC0292d.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    @Override // r2.d
    public void o(ByteBuffer byteBuffer, j2.g gVar) {
        r2.t.f4898b.getClass();
        r2.t.c(byteBuffer);
        ((j2.b) this.f3003K).getClass();
    }

    public void p(Map map) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0023c(10, this, map));
    }

    public void q(int r5, q2.s sVar) {
        q2.v vVar;
        io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) this.f3003K;
        kVar.c();
        kVar.f3548f = sVar;
        kVar.f3547e = new c0.f(io.flutter.plugin.editing.j.FRAMEWORK_CLIENT, r5);
        kVar.f3549h.e(kVar);
        a1.i iVar = sVar.f4844j;
        if (iVar != null) {
            vVar = (q2.v) iVar.f1834L;
        } else {
            vVar = null;
        }
        kVar.f3549h = new io.flutter.plugin.editing.f(vVar, kVar.f3543a);
        kVar.d(sVar);
        kVar.f3550i = true;
        if (((io.flutter.plugin.editing.j) kVar.f3547e.f2651b) == io.flutter.plugin.editing.j.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            kVar.f3557p = false;
        }
        kVar.f3554m = null;
        kVar.f3549h.a(kVar);
    }

    public void r(double d4, double d5, double[] dArr) {
        boolean z3;
        io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) this.f3003K;
        kVar.getClass();
        double[] dArr2 = new double[4];
        if (dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        double d6 = dArr[12];
        double d7 = dArr[15];
        double d8 = d6 / d7;
        dArr2[1] = d8;
        dArr2[0] = d8;
        double d9 = dArr[13] / d7;
        dArr2[3] = d9;
        dArr2[2] = d9;
        B0.e eVar = new B0.e(z3, dArr, dArr2);
        eVar.d(d4, 0.0d);
        eVar.d(d4, d5);
        eVar.d(0.0d, d5);
        double d10 = kVar.f3543a.getContext().getResources().getDisplayMetrics().density;
        kVar.f3554m = new Rect((int) (dArr2[0] * d10), (int) (dArr2[2] * d10), (int) Math.ceil(dArr2[1] * d10), (int) Math.ceil(dArr2[3] * d10));
    }

    public void t(q2.v vVar) {
        q2.v vVar2;
        int r4;
        int r5;
        io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) this.f3003K;
        View view = kVar.f3543a;
        if (!kVar.f3550i && (vVar2 = kVar.f3556o) != null && (r4 = vVar2.f4853d) >= 0 && (r5 = vVar2.f4854e) > r4) {
            int r52 = r5 - r4;
            int r6 = vVar.f4854e;
            int r7 = vVar.f4853d;
            boolean z3 = true;
            if (r52 == r6 - r7) {
                int r62 = 0;
                while (true) {
                    if (r62 < r52) {
                        if (vVar2.f4850a.charAt(r62 + r4) != vVar.f4850a.charAt(r62 + r7)) {
                            break;
                        }
                        r62++;
                    } else {
                        z3 = false;
                        break;
                    }
                }
            }
            kVar.f3550i = z3;
        }
        kVar.f3556o = vVar;
        kVar.f3549h.f(vVar);
        if (kVar.f3550i) {
            kVar.f3544b.restartInput(view);
            kVar.f3550i = false;
        }
    }

    public void u(int r4, boolean z3) {
        io.flutter.plugin.editing.k kVar = (io.flutter.plugin.editing.k) this.f3003K;
        if (z3) {
            View view = kVar.f3543a;
            view.requestFocus();
            kVar.f3547e = new c0.f(io.flutter.plugin.editing.j.VIRTUAL_DISPLAY_PLATFORM_VIEW, r4);
            kVar.f3544b.restartInput(view);
            kVar.f3550i = false;
            return;
        }
        kVar.getClass();
        kVar.f3547e = new c0.f(io.flutter.plugin.editing.j.PHYSICAL_DISPLAY_PLATFORM_VIEW, r4);
        kVar.f3551j = null;
    }

    public /* synthetic */ C0235c(int r12, Object obj) {
        this.f3002J = r12;
        this.f3003K = obj;
    }

    public /* synthetic */ C0235c(o1.g gVar, C0398a c0398a) {
        this.f3002J = 10;
        this.f3003K = c0398a;
    }

    public C0235c() {
        this.f3002J = 12;
        this.f3003K = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, r2.m] */
    public C0235c(j2.b bVar, int r6) {
        this.f3002J = r6;
        switch (r6) {
            case 16:
                new C0001b(bVar, "flutter/mousecursor", r2.s.f4896a, 26).U(new C0322i(9, this));
                return;
            case 17:
            case 18:
            case 20:
            default:
                ?? obj = new Object();
                C0001b c0001b = new C0001b(bVar, "flutter/backgesture", r2.s.f4896a, 26);
                this.f3003K = c0001b;
                c0001b.U(obj);
                return;
            case 19:
                new C0001b(bVar, "flutter/platform_views", r2.s.f4896a, 26).U(new C0322i(11, this));
                return;
            case 21:
                new C0001b(bVar, "flutter/scribe", r2.k.f4892a, 26).U(new C0322i(14, this));
                return;
            case 22:
                new C0001b(bVar, "flutter/spellcheck", r2.s.f4896a, 26).U(new C0322i(15, this));
                return;
        }
    }

    public C0235c(r2.f fVar) {
        this.f3002J = 14;
        this.f3003K = new a1.i(fVar, "flutter/keyevent", (r2.l) r2.j.f4891a, (R1.a) null);
    }

    public C0235c(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.f3002J = 28;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3003K = new J(cameraCaptureSession, (C0322i) null);
        } else {
            this.f3003K = new J(cameraCaptureSession, new C0322i(23, handler));
        }
    }
}
