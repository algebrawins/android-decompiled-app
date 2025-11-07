package h2;

import A0.C0001b;
import V2.AbstractC0045a;
import V2.AbstractC0066x;
import V2.C0062t;
import V2.EnumC0065w;
import V2.S;
import V2.V;
import V2.c0;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import d2.C0235c;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import s2.C0454a;
import t2.InterfaceC0461a;
import x1.AbstractC0689q5;

/* loaded from: classes.dex */
public final class t extends FrameLayout implements InterfaceC0461a, F {

    /* renamed from: J  reason: collision with root package name */
    public final n f3355J;

    /* renamed from: K  reason: collision with root package name */
    public final p f3356K;

    /* renamed from: L  reason: collision with root package name */
    public C0299l f3357L;

    /* renamed from: M  reason: collision with root package name */
    public View f3358M;

    /* renamed from: N  reason: collision with root package name */
    public View f3359N;

    /* renamed from: O  reason: collision with root package name */
    public final HashSet f3360O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f3361P;

    /* renamed from: Q  reason: collision with root package name */
    public i2.c f3362Q;

    /* renamed from: R  reason: collision with root package name */
    public final HashSet f3363R;

    /* renamed from: S  reason: collision with root package name */
    public J f3364S;

    /* renamed from: T  reason: collision with root package name */
    public io.flutter.plugin.editing.k f3365T;

    /* renamed from: U  reason: collision with root package name */
    public io.flutter.plugin.editing.h f3366U;

    /* renamed from: V  reason: collision with root package name */
    public C0454a f3367V;

    /* renamed from: W  reason: collision with root package name */
    public C0001b f3368W;
    public C0289a a0;

    /* renamed from: b0  reason: collision with root package name */
    public io.flutter.view.q f3369b0;

    /* renamed from: c0  reason: collision with root package name */
    public TextServicesManager f3370c0;

    /* renamed from: d0  reason: collision with root package name */
    public A.c f3371d0;

    /* renamed from: e0  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.m f3372e0;

    /* renamed from: f0  reason: collision with root package name */
    public final C0235c f3373f0;

    /* renamed from: g0  reason: collision with root package name */
    public final q f3374g0;

    /* renamed from: h0  reason: collision with root package name */
    public final C0293e f3375h0;

    /* renamed from: i0  reason: collision with root package name */
    public K0.i f3376i0;
    public v j0;

    /* JADX WARN: Type inference failed for: r3v7, types: [h2.v, java.lang.Object] */
    public t(AbstractActivityC0292d abstractActivityC0292d, n nVar) {
        super(abstractActivityC0292d, null);
        this.f3360O = new HashSet();
        this.f3363R = new HashSet();
        this.f3372e0 = new io.flutter.embedding.engine.renderer.m();
        this.f3373f0 = new C0235c(2, this);
        this.f3374g0 = new q(this, new Handler(Looper.getMainLooper()));
        this.f3375h0 = new C0293e(2, this);
        this.j0 = new Object();
        this.f3355J = nVar;
        this.f3358M = nVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [io.flutter.embedding.engine.renderer.p, android.view.View] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f3362Q);
        if (!c()) {
            return;
        }
        Iterator it = this.f3363R.iterator();
        if (!it.hasNext()) {
            getContext().getContentResolver().unregisterContentObserver(this.f3374g0);
            io.flutter.plugin.platform.j jVar = this.f3362Q.f3436r;
            int r22 = 0;
            while (true) {
                SparseArray sparseArray2 = jVar.f3588m;
                if (r22 >= sparseArray2.size()) {
                    break;
                }
                jVar.f3579c.removeView((io.flutter.plugin.platform.f) sparseArray2.valueAt(r22));
                r22++;
            }
            int r23 = 0;
            while (true) {
                SparseArray sparseArray3 = jVar.f3586k;
                if (r23 < sparseArray3.size()) {
                    if (sparseArray3.valueAt(r23) == null) {
                        jVar.f3579c.removeView(null);
                        r23++;
                    } else {
                        throw new ClassCastException();
                    }
                } else {
                    jVar.e();
                    if (jVar.f3579c == null) {
                        Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                    } else {
                        int r24 = 0;
                        while (true) {
                            sparseArray = jVar.f3587l;
                            if (r24 >= sparseArray.size()) {
                                break;
                            }
                            jVar.f3579c.removeView((View) sparseArray.valueAt(r24));
                            r24++;
                        }
                        sparseArray.clear();
                    }
                    jVar.f3579c = null;
                    jVar.f3590o = false;
                    SparseArray sparseArray4 = jVar.f3585j;
                    if (sparseArray4.size() <= 0) {
                        io.flutter.plugin.platform.i iVar = this.f3362Q.f3437s;
                        int r25 = 0;
                        while (true) {
                            SparseArray sparseArray5 = iVar.f3571h;
                            if (r25 < sparseArray5.size()) {
                                if (sparseArray5.valueAt(r25) == null) {
                                    iVar.f3567c.removeView(null);
                                    r25++;
                                } else {
                                    throw new ClassCastException();
                                }
                            } else {
                                Surface surface = iVar.f3574k;
                                if (surface != null) {
                                    surface.release();
                                    iVar.f3574k = null;
                                    iVar.f3575l = null;
                                }
                                iVar.f3567c = null;
                                SparseArray sparseArray6 = iVar.g;
                                if (sparseArray6.size() <= 0) {
                                    this.f3362Q.f3436r.a();
                                    this.f3362Q.f3437s.a();
                                    io.flutter.view.q qVar = this.f3369b0;
                                    qVar.f3758t = true;
                                    qVar.f3744e.a();
                                    qVar.f3756r = null;
                                    AccessibilityManager accessibilityManager = qVar.f3742c;
                                    accessibilityManager.removeAccessibilityStateChangeListener(qVar.f3760v);
                                    accessibilityManager.removeTouchExplorationStateChangeListener(qVar.f3761w);
                                    qVar.f3745f.unregisterContentObserver(qVar.f3762x);
                                    C0001b c0001b = qVar.f3741b;
                                    c0001b.f86M = null;
                                    ((FlutterJNI) c0001b.f84K).setAccessibilityDelegate(null);
                                    this.f3369b0 = null;
                                    this.f3365T.f3544b.restartInput(this);
                                    this.f3365T.b();
                                    int size = ((HashSet) this.f3368W.f84K).size();
                                    if (size > 0) {
                                        Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
                                    }
                                    io.flutter.plugin.editing.h hVar = this.f3366U;
                                    if (hVar != null) {
                                        hVar.f3532a.f3003K = null;
                                        SpellCheckerSession spellCheckerSession = hVar.f3534c;
                                        if (spellCheckerSession != null) {
                                            spellCheckerSession.close();
                                        }
                                    }
                                    J j3 = this.f3364S;
                                    if (j3 != null) {
                                        ((C0235c) j3.f3304L).f3003K = null;
                                    }
                                    io.flutter.embedding.engine.renderer.n nVar = this.f3362Q.f3421b;
                                    this.f3361P = false;
                                    nVar.f3498a.removeIsDisplayingFlutterUiListener(this.f3375h0);
                                    nVar.c();
                                    nVar.f3498a.setSemanticsEnabled(false);
                                    View view = this.f3359N;
                                    if (view != null && this.f3358M == this.f3357L) {
                                        this.f3358M = view;
                                    }
                                    this.f3358M.c();
                                    C0299l c0299l = this.f3357L;
                                    if (c0299l != null) {
                                        c0299l.f3334J.close();
                                        removeView(this.f3357L);
                                        this.f3357L = null;
                                    }
                                    this.f3359N = null;
                                    this.f3362Q = null;
                                    return;
                                }
                                sparseArray6.valueAt(0).getClass();
                                throw new ClassCastException();
                            }
                        }
                    } else {
                        sparseArray4.valueAt(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        a1.i iVar;
        a1.i iVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.k kVar = this.f3365T;
        if (Build.VERSION.SDK_INT < 26) {
            kVar.getClass();
            return;
        }
        q2.s sVar = kVar.f3548f;
        if (sVar != null && kVar.g != null && (iVar = sVar.f4844j) != null) {
            HashMap hashMap = new HashMap();
            for (int r5 = 0; r5 < sparseArray.size(); r5++) {
                q2.s sVar2 = (q2.s) kVar.g.get(sparseArray.keyAt(r5));
                if (sVar2 != null && (iVar2 = sVar2.f4844j) != null) {
                    textValue = A.e.l(sparseArray.valueAt(r5)).getTextValue();
                    String charSequence = textValue.toString();
                    q2.v vVar = new q2.v(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    String str = (String) iVar2.f1832J;
                    if (str.equals((String) iVar.f1832J)) {
                        kVar.f3549h.f(vVar);
                    } else {
                        hashMap.put(str, vVar);
                    }
                }
            }
            int r15 = kVar.f3547e.f2650a;
            J j3 = kVar.f3546d;
            j3.getClass();
            String.valueOf(hashMap.size());
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                q2.v vVar2 = (q2.v) entry.getValue();
                hashMap2.put((String) entry.getKey(), J.t(vVar2.f4850a, vVar2.f4851b, vVar2.f4852c, -1, -1));
            }
            ((C0001b) j3.f3303K).M("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(r15), hashMap2), null);
        }
    }

    public final void b() {
        n nVar = this.f3355J;
        if (nVar != null) {
            addView(nVar);
        } else {
            p pVar = this.f3356K;
            if (pVar != null) {
                addView(pVar);
            } else {
                addView(this.f3357L);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.embedding.engine.renderer.p, android.view.View] */
    public final boolean c() {
        i2.c cVar = this.f3362Q;
        if (cVar != null) {
            if (cVar.f3421b == this.f3358M.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        i2.c cVar = this.f3362Q;
        if (cVar != null) {
            io.flutter.plugin.platform.j jVar = cVar.f3436r;
            if (view == null) {
                jVar.getClass();
                return false;
            }
            HashMap hashMap = jVar.f3584i;
            if (!hashMap.containsKey(view.getContext())) {
                return false;
            }
            View view2 = (View) hashMap.get(view.getContext());
            if (view2 == view) {
                return true;
            }
            return view2.checkInputConnectionProxy(view);
        }
        return super.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.t.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        if ((c() && this.f3368W.K(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.m mVar = this.f3372e0;
        mVar.f3481a = f2;
        mVar.f3495p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.n nVar = this.f3362Q.f3421b;
        nVar.getClass();
        if (mVar.f3482b > 0 && mVar.f3483c > 0 && mVar.f3481a > 0.0f) {
            ArrayList arrayList = mVar.f3496q;
            arrayList.size();
            ArrayList arrayList2 = mVar.f3497r;
            arrayList2.size();
            int size = arrayList2.size() + arrayList.size();
            int[] r5 = new int[size * 4];
            int[] r7 = new int[size];
            int[] r6 = new int[size];
            for (int r9 = 0; r9 < arrayList.size(); r9++) {
                io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(r9);
                int r11 = r9 * 4;
                Rect rect = cVar.f3461a;
                r5[r11] = rect.left;
                r5[r11 + 1] = rect.top;
                r5[r11 + 2] = rect.right;
                r5[r11 + 3] = rect.bottom;
                r7[r9] = cVar.f3462b.encodedValue;
                r6[r9] = cVar.f3463c.encodedValue;
            }
            int size2 = arrayList.size() * 4;
            for (int r8 = 0; r8 < arrayList2.size(); r8++) {
                io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(r8);
                int r112 = (r8 * 4) + size2;
                Rect rect2 = cVar2.f3461a;
                r5[r112] = rect2.left;
                r5[r112 + 1] = rect2.top;
                r5[r112 + 2] = rect2.right;
                r5[r112 + 3] = rect2.bottom;
                r7[arrayList.size() + r8] = cVar2.f3462b.encodedValue;
                r6[arrayList.size() + r8] = cVar2.f3463c.encodedValue;
            }
            nVar.f3498a.setViewportMetrics(mVar.f3481a, mVar.f3482b, mVar.f3483c, mVar.f3484d, mVar.f3485e, mVar.f3486f, mVar.g, mVar.f3487h, mVar.f3488i, mVar.f3489j, mVar.f3490k, mVar.f3491l, mVar.f3492m, mVar.f3493n, mVar.f3494o, mVar.f3495p, r5, r7, r6);
        }
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.q qVar = this.f3369b0;
        if (qVar != null && qVar.f3742c.isEnabled()) {
            return this.f3369b0;
        }
        return null;
    }

    public i2.c getAttachedFlutterEngine() {
        return this.f3362Q;
    }

    public r2.f getBinaryMessenger() {
        return this.f3362Q.f3422c;
    }

    public C0299l getCurrentImageSurface() {
        return this.f3357L;
    }

    public io.flutter.embedding.engine.renderer.m getViewportMetrics() {
        return this.f3372e0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bf, code lost:
        r14 = r14.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r14) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.t.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [Y2.d] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        A.c cVar;
        Executor gVar;
        AbstractC0045a abstractC0045a;
        D2.j jVar = D2.j.f492J;
        super.onAttachedToWindow();
        try {
            K0.g gVar2 = K0.h.f834f;
            Context context = getContext();
            gVar2.getClass();
            cVar = new A.c(24, new A.f(K0.g.a(context)));
        } catch (NoClassDefFoundError unused) {
            cVar = null;
        }
        this.f3371d0 = cVar;
        Activity b3 = AbstractC0689q5.b(getContext());
        A.c cVar2 = this.f3371d0;
        if (cVar2 != null && b3 != null) {
            this.f3376i0 = new K0.i(1, this);
            Context context2 = getContext();
            if (Build.VERSION.SDK_INT >= 28) {
                gVar = W.c.a(context2);
            } else {
                gVar = new G.g(new Handler(context2.getMainLooper()));
            }
            K0.i iVar = this.f3376i0;
            A.f fVar = (A.f) cVar2.f5K;
            N2.g.e(gVar, "executor");
            N2.g.e(iVar, "consumer");
            K0.b bVar = (K0.b) fVar.f10K;
            bVar.getClass();
            Y2.c cVar3 = new Y2.c(new K0.k(bVar, b3, null), jVar, -2, X2.a.SUSPEND);
            c3.f fVar2 = V2.D.f1390a;
            W2.c cVar4 = a3.o.f1877a;
            if (cVar4.f(C0062t.f1462K) == null) {
                Y2.c cVar5 = cVar3;
                if (!cVar4.equals(jVar)) {
                    cVar5 = Z2.l.a(cVar3, cVar4, 0, null, 6);
                }
                A.f fVar3 = (A.f) fVar.f11L;
                fVar3.getClass();
                N2.g.e(cVar5, "flow");
                ReentrantLock reentrantLock = (ReentrantLock) fVar3.f10K;
                reentrantLock.lock();
                LinkedHashMap linkedHashMap = (LinkedHashMap) fVar3.f11L;
                try {
                    if (linkedHashMap.get(iVar) == null) {
                        D2.i l3 = new V2.L(gVar);
                        if (l3.f(C0062t.f1462K) == null) {
                            l3 = l3.k(new V(null));
                        }
                        I0.b bVar2 = new I0.b(cVar5, iVar, null);
                        EnumC0065w enumC0065w = EnumC0065w.DEFAULT;
                        D2.i a4 = AbstractC0066x.a(l3, jVar, true);
                        c3.f fVar4 = V2.D.f1390a;
                        if (a4 != fVar4 && a4.f(D2.e.f491J) == null) {
                            a4 = a4.k(fVar4);
                        }
                        enumC0065w.getClass();
                        if (enumC0065w == EnumC0065w.LAZY) {
                            abstractC0045a = new c0(a4, bVar2);
                        } else {
                            abstractC0045a = new AbstractC0045a(a4, true);
                        }
                        abstractC0045a.W(enumC0065w, abstractC0045a, bVar2);
                        linkedHashMap.put(iVar, abstractC0045a);
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            }
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar4).toString());
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f3362Q != null) {
            this.f3367V.b(configuration);
            d();
            AbstractC0689q5.a(getContext(), this.f3362Q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r10) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.t.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        K0.i iVar;
        A.c cVar = this.f3371d0;
        if (cVar != null && (iVar = this.f3376i0) != null) {
            A.f fVar = (A.f) ((A.f) cVar.f5K).f11L;
            fVar.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) fVar.f10K;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f11L;
            try {
                S s3 = (S) linkedHashMap.get(iVar);
                if (s3 != null) {
                    s3.a(null);
                }
                S s4 = (S) linkedHashMap.remove(iVar);
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f3376i0 = null;
        this.f3371d0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z3;
        if (c()) {
            C0289a c0289a = this.a0;
            Context context = getContext();
            c0289a.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            if (motionEvent.getActionMasked() != 7 && motionEvent.getActionMasked() != 8) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (isFromSource && z3) {
                int b3 = C0289a.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0289a.a(motionEvent, motionEvent.getActionIndex(), b3, 0, C0289a.f3305f, allocateDirect, context);
                if (allocateDirect.position() % 288 == 0) {
                    c0289a.f3306a.f3498a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                    return true;
                }
                throw new AssertionError("Packet position is not on field boundary.");
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (!c()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.f3369b0.d(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int r19) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, r19);
        io.flutter.plugin.editing.k kVar = this.f3365T;
        if (Build.VERSION.SDK_INT >= 26) {
            if (kVar.g != null) {
                String str = (String) kVar.f3548f.f4844j.f1832J;
                AutofillId autofillId = viewStructure.getAutofillId();
                for (int r6 = 0; r6 < kVar.g.size(); r6++) {
                    int keyAt = kVar.g.keyAt(r6);
                    a1.i iVar = ((q2.s) kVar.g.valueAt(r6)).f4844j;
                    if (iVar != null) {
                        viewStructure.addChildCount(1);
                        ViewStructure newChild = viewStructure.newChild(r6);
                        newChild.setAutofillId(autofillId, keyAt);
                        String[] strArr = (String[]) iVar.f1833K;
                        if (strArr.length > 0) {
                            newChild.setAutofillHints(strArr);
                        }
                        newChild.setAutofillType(1);
                        newChild.setVisibility(0);
                        String str2 = (String) iVar.f1835M;
                        if (str2 != null) {
                            newChild.setHint(str2);
                        }
                        if (str.hashCode() == keyAt && (rect = kVar.f3554m) != null) {
                            newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), kVar.f3554m.height());
                            newChild.setAutofillValue(AutofillValue.forText(kVar.f3549h));
                        } else {
                            newChild.setDimens(0, 0, 0, 0, 1, 1);
                            newChild.setAutofillValue(AutofillValue.forText(((q2.v) iVar.f1834L).f4850a));
                        }
                    }
                }
                return;
            }
            return;
        }
        kVar.getClass();
    }

    @Override // android.view.View
    public final void onSizeChanged(int r12, int r22, int r3, int r4) {
        super.onSizeChanged(r12, r22, r3, r4);
        io.flutter.embedding.engine.renderer.m mVar = this.f3372e0;
        mVar.f3482b = r12;
        mVar.f3483c = r22;
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        int r14;
        ByteBuffer byteBuffer;
        int r17;
        ByteBuffer byteBuffer2;
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        C0289a c0289a = this.a0;
        Matrix matrix = C0289a.f3305f;
        c0289a.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b3 = C0289a.b(motionEvent.getActionMasked());
        char c4 = 5;
        if (actionMasked != 0 && actionMasked != 5) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 && (actionMasked == 1 || actionMasked == 6)) {
            z4 = true;
        } else {
            z4 = false;
        }
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType != 1) {
            if (toolType != 2) {
                if (toolType != 3) {
                    if (toolType == 4) {
                        c4 = 3;
                    }
                } else {
                    c4 = 1;
                }
            } else {
                c4 = 2;
            }
        } else {
            c4 = 0;
        }
        if (z4 && c4 == 0) {
            r14 = 1;
        } else {
            r14 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + r14) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z3) {
            c0289a.a(motionEvent, motionEvent.getActionIndex(), b3, 0, matrix, allocateDirect, null);
            byteBuffer = allocateDirect;
        } else if (z4) {
            int r6 = 0;
            while (r6 < pointerCount) {
                if (r6 != motionEvent.getActionIndex() && motionEvent.getToolType(r6) == 1) {
                    r17 = r6;
                    byteBuffer2 = allocateDirect;
                    c0289a.a(motionEvent, r6, 5, 1, matrix, allocateDirect, null);
                } else {
                    r17 = r6;
                    byteBuffer2 = allocateDirect;
                }
                r6 = r17 + 1;
                allocateDirect = byteBuffer2;
            }
            byteBuffer = allocateDirect;
            c0289a.a(motionEvent, motionEvent.getActionIndex(), b3, 0, matrix, byteBuffer, null);
            if (r14 != 0) {
                c0289a.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
            }
        } else {
            byteBuffer = allocateDirect;
            for (int r13 = 0; r13 < pointerCount; r13++) {
                c0289a.a(motionEvent, r13, b3, 0, matrix, byteBuffer, null);
            }
        }
        if (byteBuffer.position() % 288 == 0) {
            c0289a.f3306a.f3498a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }

    public void setDelegate(v vVar) {
        this.j0 = vVar;
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
        super.setVisibility(r3);
        View view = this.f3358M;
        if (view instanceof n) {
            ((n) view).setVisibility(r3);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.lang.Object] */
    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(K0.l lVar) {
        K0.b bVar;
        io.flutter.embedding.engine.renderer.e eVar;
        io.flutter.embedding.engine.renderer.d dVar;
        ?? r6 = lVar.f844a;
        ArrayList arrayList = new ArrayList();
        for (K0.c cVar : r6) {
            cVar.f822a.c().toString();
            H0.b bVar2 = cVar.f822a;
            int b3 = bVar2.b();
            K0.b bVar3 = K0.b.f815M;
            if (b3 != 0 && bVar2.a() != 0) {
                bVar = bVar3;
            } else {
                bVar = K0.b.f814L;
            }
            if (bVar == bVar3) {
                eVar = io.flutter.embedding.engine.renderer.e.HINGE;
            } else {
                eVar = io.flutter.embedding.engine.renderer.e.FOLD;
            }
            K0.b bVar4 = K0.b.f816N;
            K0.b bVar5 = cVar.f824c;
            if (bVar5 == bVar4) {
                dVar = io.flutter.embedding.engine.renderer.d.POSTURE_FLAT;
            } else if (bVar5 == K0.b.f817O) {
                dVar = io.flutter.embedding.engine.renderer.d.POSTURE_HALF_OPENED;
            } else {
                dVar = io.flutter.embedding.engine.renderer.d.UNKNOWN;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(bVar2.c(), eVar, dVar));
        }
        ArrayList arrayList2 = this.f3372e0.f3496q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [h2.v, java.lang.Object] */
    public t(AbstractActivityC0292d abstractActivityC0292d, p pVar) {
        super(abstractActivityC0292d, null);
        this.f3360O = new HashSet();
        this.f3363R = new HashSet();
        this.f3372e0 = new io.flutter.embedding.engine.renderer.m();
        this.f3373f0 = new C0235c(2, this);
        this.f3374g0 = new q(this, new Handler(Looper.getMainLooper()));
        this.f3375h0 = new C0293e(2, this);
        this.j0 = new Object();
        this.f3356K = pVar;
        this.f3358M = pVar;
        b();
    }
}
