package io.flutter.plugin.editing;

import A0.C0001b;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputMethodManager;
import d2.C0235c;
import h2.J;
import q2.s;
import q2.v;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a  reason: collision with root package name */
    public final View f3543a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f3544b;

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f3545c;

    /* renamed from: d  reason: collision with root package name */
    public final J f3546d;

    /* renamed from: e  reason: collision with root package name */
    public c0.f f3547e = new c0.f(j.NO_TARGET, 0);

    /* renamed from: f  reason: collision with root package name */
    public s f3548f;
    public SparseArray g;

    /* renamed from: h  reason: collision with root package name */
    public f f3549h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3550i;

    /* renamed from: j  reason: collision with root package name */
    public c f3551j;

    /* renamed from: k  reason: collision with root package name */
    public final io.flutter.plugin.platform.j f3552k;

    /* renamed from: l  reason: collision with root package name */
    public final io.flutter.plugin.platform.i f3553l;

    /* renamed from: m  reason: collision with root package name */
    public Rect f3554m;

    /* renamed from: n  reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f3555n;

    /* renamed from: o  reason: collision with root package name */
    public v f3556o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3557p;

    public k(View view, J j3, C0235c c0235c, io.flutter.plugin.platform.j jVar, io.flutter.plugin.platform.i iVar) {
        Object systemService;
        this.f3543a = view;
        this.f3549h = new f(null, view);
        this.f3544b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int r6 = Build.VERSION.SDK_INT;
        if (r6 >= 26) {
            systemService = view.getContext().getSystemService(A.e.p());
            this.f3545c = A.e.j(systemService);
        } else {
            this.f3545c = null;
        }
        if (r6 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f3555n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f3546d = j3;
        j3.f3304L = new C0235c(3, this);
        ((C0001b) j3.f3303K).M("TextInputClient.requestExistingInputState", null, null);
        this.f3552k = jVar;
        jVar.f3581e = this;
        this.f3553l = iVar;
        iVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r10 == r0.f4854e) goto L42;
     */
    @Override // io.flutter.plugin.editing.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r17) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.k.a(boolean):void");
    }

    public final void b() {
        this.f3552k.f3581e = null;
        this.f3553l.getClass();
        this.f3546d.f3304L = null;
        c();
        this.f3549h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f3555n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        s sVar;
        a1.i iVar;
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.f3545c) != null && (sVar = this.f3548f) != null && (iVar = sVar.f4844j) != null && this.g != null) {
            autofillManager.notifyViewExited(this.f3543a, ((String) iVar.f1832J).hashCode());
        }
    }

    public final void d(s sVar) {
        a1.i iVar;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (sVar != null && (iVar = sVar.f4844j) != null) {
            SparseArray sparseArray = new SparseArray();
            this.g = sparseArray;
            s[] sVarArr = sVar.f4846l;
            if (sVarArr == null) {
                sparseArray.put(((String) iVar.f1832J).hashCode(), sVar);
                return;
            }
            for (s sVar2 : sVarArr) {
                a1.i iVar2 = sVar2.f4844j;
                if (iVar2 != null) {
                    SparseArray sparseArray2 = this.g;
                    String str = (String) iVar2.f1832J;
                    sparseArray2.put(str.hashCode(), sVar2);
                    AutofillManager autofillManager = this.f3545c;
                    int hashCode = str.hashCode();
                    forText = AutofillValue.forText(((v) iVar2.f1834L).f4850a);
                    autofillManager.notifyValueChanged(this.f3543a, hashCode, forText);
                }
            }
            return;
        }
        this.g = null;
    }
}
