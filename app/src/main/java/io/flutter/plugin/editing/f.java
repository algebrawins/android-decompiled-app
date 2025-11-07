package io.flutter.plugin.editing;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import q2.v;

/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: J  reason: collision with root package name */
    public int f3520J = 0;

    /* renamed from: K  reason: collision with root package name */
    public int f3521K = 0;

    /* renamed from: L  reason: collision with root package name */
    public final ArrayList f3522L = new ArrayList();

    /* renamed from: M  reason: collision with root package name */
    public final ArrayList f3523M = new ArrayList();

    /* renamed from: N  reason: collision with root package name */
    public final ArrayList f3524N = new ArrayList();

    /* renamed from: O  reason: collision with root package name */
    public String f3525O;

    /* renamed from: P  reason: collision with root package name */
    public String f3526P;

    /* renamed from: Q  reason: collision with root package name */
    public int f3527Q;

    /* renamed from: R  reason: collision with root package name */
    public int f3528R;

    /* renamed from: S  reason: collision with root package name */
    public int f3529S;

    /* renamed from: T  reason: collision with root package name */
    public int f3530T;

    /* renamed from: U  reason: collision with root package name */
    public final d f3531U;

    public f(v vVar, View view) {
        this.f3531U = new d(view, this);
        if (vVar != null) {
            f(vVar);
        }
    }

    public final void a(e eVar) {
        if (this.f3521K > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f3520J > 0) {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f3523M.add(eVar);
            return;
        }
        this.f3522L.add(eVar);
    }

    public final void b() {
        this.f3520J++;
        if (this.f3521K > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f3520J == 1 && !this.f3522L.isEmpty()) {
            this.f3526P = toString();
            this.f3527Q = Selection.getSelectionStart(this);
            this.f3528R = Selection.getSelectionEnd(this);
            this.f3529S = BaseInputConnection.getComposingSpanStart(this);
            this.f3530T = BaseInputConnection.getComposingSpanEnd(this);
        }
    }

    public final void c() {
        boolean z3;
        int r02 = this.f3520J;
        if (r02 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f3522L;
        ArrayList arrayList2 = this.f3523M;
        if (r02 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.f3521K++;
                ((e) it.next()).a(true);
                this.f3521K--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                boolean z4 = !toString().equals(this.f3526P);
                boolean z5 = false;
                if (this.f3527Q == Selection.getSelectionStart(this) && this.f3528R == Selection.getSelectionEnd(this)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                d(z4, z3, (this.f3529S == BaseInputConnection.getComposingSpanStart(this) && this.f3530T == BaseInputConnection.getComposingSpanEnd(this)) ? true : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f3520J--;
    }

    public final void d(boolean z3, boolean z4, boolean z5) {
        if (z3 || z4 || z5) {
            Iterator it = this.f3522L.iterator();
            while (it.hasNext()) {
                this.f3521K++;
                ((e) it.next()).a(z3);
                this.f3521K--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f3521K > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f3522L.remove(eVar);
        if (this.f3520J > 0) {
            this.f3523M.remove(eVar);
        }
    }

    public final void f(v vVar) {
        int r4;
        b();
        replace(0, length(), (CharSequence) vVar.f4850a);
        int r02 = vVar.f4851b;
        if (r02 >= 0) {
            Selection.setSelection(this, r02, vVar.f4852c);
        } else {
            Selection.removeSelection(this);
        }
        int r03 = vVar.f4853d;
        if (r03 >= 0 && r03 < (r4 = vVar.f4854e)) {
            this.f3531U.setComposingRegion(r03, r4);
        } else {
            BaseInputConnection.removeComposingSpans(this);
        }
        this.f3524N.clear();
        c();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [io.flutter.plugin.editing.i, java.lang.Object] */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int r5, int r6, int r7) {
        super.setSpan(obj, r5, r6, r7);
        ArrayList arrayList = this.f3524N;
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        ?? obj2 = new Object();
        obj2.f3540e = selectionStart;
        obj2.f3541f = selectionEnd;
        obj2.g = composingSpanStart;
        obj2.f3542h = composingSpanEnd;
        obj2.f3536a = fVar;
        obj2.f3537b = "";
        obj2.f3538c = -1;
        obj2.f3539d = -1;
        arrayList.add(obj2);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f3525O;
        if (str == null) {
            String spannableStringBuilder = super.toString();
            this.f3525O = spannableStringBuilder;
            return spannableStringBuilder;
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [io.flutter.plugin.editing.i, java.lang.Object] */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int r17, int r18, CharSequence charSequence, int r20, int r21) {
        if (this.f3521K > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int r4 = r18 - r17;
        boolean z3 = r4 != r21 - r20;
        for (int r8 = 0; r8 < r4 && !z3; r8++) {
            z3 |= charAt(r17 + r8) != charSequence.charAt(r20 + r8);
        }
        if (z3) {
            this.f3525O = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(r17, r18, charSequence, r20, r21);
        ArrayList arrayList = this.f3524N;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        ?? obj = new Object();
        obj.f3540e = selectionStart2;
        obj.f3541f = selectionEnd2;
        obj.g = composingSpanStart2;
        obj.f3542h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        obj.f3536a = fVar;
        obj.f3537b = charSequence2;
        obj.f3538c = r17;
        obj.f3539d = r18;
        arrayList.add(obj);
        if (this.f3520J > 0) {
            return replace;
        }
        d(z3, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
