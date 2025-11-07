package p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import d0.C0231a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k0.AbstractC0326m;
import k0.InterfaceC0315b;
import k0.InterfaceC0330q;
import x1.AbstractC0747y0;
import x1.E4;

/* renamed from: p.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0421u extends TextView implements InterfaceC0330q, InterfaceC0315b {

    /* renamed from: J  reason: collision with root package name */
    public final C0415n f4724J;

    /* renamed from: K  reason: collision with root package name */
    public final C0420t f4725K;

    /* renamed from: L  reason: collision with root package name */
    public final h2.J f4726L;

    /* renamed from: M  reason: collision with root package name */
    public Future f4727M;

    public C0421u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public final void d() {
        Future future = this.f4727M;
        if (future != null) {
            try {
                this.f4727M = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    E4.a(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0415n c0415n = this.f4724J;
        if (c0415n != null) {
            c0415n.a();
        }
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            c0420t.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0315b.f3964H) {
            return super.getAutoSizeMaxTextSize();
        }
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            return Math.round(c0420t.f4713i.f4735e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0315b.f3964H) {
            return super.getAutoSizeMinTextSize();
        }
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            return Math.round(c0420t.f4713i.f4734d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0315b.f3964H) {
            return super.getAutoSizeStepGranularity();
        }
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            return Math.round(c0420t.f4713i.f4733c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0315b.f3964H) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            return c0420t.f4713i.f4736f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0315b.f3964H) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C0420t c0420t = this.f4725K;
        if (c0420t == null) {
            return 0;
        }
        return c0420t.f4713i.f4731a;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        B0.d dVar;
        C0415n c0415n = this.f4724J;
        if (c0415n == null || (dVar = c0415n.f4666e) == null) {
            return null;
        }
        return (ColorStateList) dVar.f181c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        B0.d dVar;
        C0415n c0415n = this.f4724J;
        if (c0415n == null || (dVar = c0415n.f4666e) == null) {
            return null;
        }
        return (PorterDuff.Mode) dVar.f182d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        B0.d dVar = this.f4725K.f4712h;
        if (dVar != null) {
            return (ColorStateList) dVar.f181c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        B0.d dVar = this.f4725K.f4712h;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f182d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        h2.J j3;
        if (Build.VERSION.SDK_INT < 28 && (j3 = this.f4726L) != null) {
            TextClassifier textClassifier = (TextClassifier) j3.f3304L;
            if (textClassifier == null) {
                TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0421u) j3.f3303K).getContext().getSystemService(TextClassificationManager.class);
                if (textClassificationManager != null) {
                    return textClassificationManager.getTextClassifier();
                }
                return TextClassifier.NO_OP;
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public C0231a getTextMetricsParamsCompat() {
        return E4.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int r22, int r3, int r4, int r5) {
        super.onLayout(z3, r22, r3, r4, r5);
        C0420t c0420t = this.f4725K;
        if (c0420t != null && !InterfaceC0315b.f3964H) {
            c0420t.f4713i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int r12, int r22) {
        d();
        super.onMeasure(r12, r22);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int r22, int r3, int r4) {
        super.onTextChanged(charSequence, r22, r3, r4);
        C0420t c0420t = this.f4725K;
        if (c0420t != null && !InterfaceC0315b.f3964H) {
            C0423w c0423w = c0420t.f4713i;
            if (c0423w.f4731a != 0) {
                c0423w.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r3, int r4, int r5, int r6) {
        if (InterfaceC0315b.f3964H) {
            super.setAutoSizeTextTypeUniformWithConfiguration(r3, r4, r5, r6);
            return;
        }
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            C0423w c0423w = c0420t.f4713i;
            DisplayMetrics displayMetrics = c0423w.f4739j.getResources().getDisplayMetrics();
            c0423w.i(TypedValue.applyDimension(r6, r3, displayMetrics), TypedValue.applyDimension(r6, r4, displayMetrics), TypedValue.applyDimension(r6, r5, displayMetrics));
            if (c0423w.g()) {
                c0423w.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] r7, int r8) {
        if (InterfaceC0315b.f3964H) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(r7, r8);
            return;
        }
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            C0423w c0423w = c0420t.f4713i;
            c0423w.getClass();
            int length = r7.length;
            if (length > 0) {
                int[] r3 = new int[length];
                if (r8 == 0) {
                    r3 = Arrays.copyOf(r7, length);
                } else {
                    DisplayMetrics displayMetrics = c0423w.f4739j.getResources().getDisplayMetrics();
                    for (int r22 = 0; r22 < length; r22++) {
                        r3[r22] = Math.round(TypedValue.applyDimension(r8, r7[r22], displayMetrics));
                    }
                }
                c0423w.f4736f = C0423w.b(r3);
                if (!c0423w.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(r7));
                }
            } else {
                c0423w.g = false;
            }
            if (c0423w.g()) {
                c0423w.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int r5) {
        if (InterfaceC0315b.f3964H) {
            super.setAutoSizeTextTypeWithDefaults(r5);
            return;
        }
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            C0423w c0423w = c0420t.f4713i;
            if (r5 != 0) {
                if (r5 == 1) {
                    DisplayMetrics displayMetrics = c0423w.f4739j.getResources().getDisplayMetrics();
                    c0423w.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (c0423w.g()) {
                        c0423w.a();
                        return;
                    }
                    return;
                }
                c0423w.getClass();
                throw new IllegalArgumentException(D.C.w("Unknown auto-size text type: ", r5));
            }
            c0423w.f4731a = 0;
            c0423w.f4734d = -1.0f;
            c0423w.f4735e = -1.0f;
            c0423w.f4733c = -1.0f;
            c0423w.f4736f = new int[0];
            c0423w.f4732b = false;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0415n c0415n = this.f4724J;
        if (c0415n != null) {
            c0415n.f4664c = -1;
            c0415n.d(null);
            c0415n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r22) {
        super.setBackgroundResource(r22);
        C0415n c0415n = this.f4724J;
        if (c0415n != null) {
            c0415n.c(r22);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            c0420t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            c0420t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            c0420t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            c0420t.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E4.d(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(r3);
        } else {
            E4.b(this, r3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(r3);
        } else {
            E4.c(this, r3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r3) {
        if (r3 >= 0) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            if (r3 != fontMetricsInt) {
                setLineSpacing(r3 - fontMetricsInt, 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setPrecomputedText(d0.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        E4.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0415n c0415n = this.f4724J;
        if (c0415n != null) {
            c0415n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0415n c0415n = this.f4724J;
        if (c0415n != null) {
            c0415n.f(mode);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, B0.d] */
    @Override // k0.InterfaceC0330q
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z3;
        C0420t c0420t = this.f4725K;
        if (c0420t.f4712h == null) {
            c0420t.f4712h = new Object();
        }
        B0.d dVar = c0420t.f4712h;
        dVar.f181c = colorStateList;
        if (colorStateList != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        dVar.f180b = z3;
        c0420t.f4707b = dVar;
        c0420t.f4708c = dVar;
        c0420t.f4709d = dVar;
        c0420t.f4710e = dVar;
        c0420t.f4711f = dVar;
        c0420t.g = dVar;
        c0420t.b();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, B0.d] */
    @Override // k0.InterfaceC0330q
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        boolean z3;
        C0420t c0420t = this.f4725K;
        if (c0420t.f4712h == null) {
            c0420t.f4712h = new Object();
        }
        B0.d dVar = c0420t.f4712h;
        dVar.f182d = mode;
        if (mode != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        dVar.f179a = z3;
        c0420t.f4707b = dVar;
        c0420t.f4708c = dVar;
        c0420t.f4709d = dVar;
        c0420t.f4710e = dVar;
        c0420t.f4711f = dVar;
        c0420t.g = dVar;
        c0420t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int r3) {
        super.setTextAppearance(context, r3);
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            c0420t.e(context, r3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        h2.J j3;
        if (Build.VERSION.SDK_INT < 28 && (j3 = this.f4726L) != null) {
            j3.f3304L = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<d0.b> future) {
        this.f4727M = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0231a c0231a) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0231a.f2999b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int r22 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                r22 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                r22 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                r22 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                r22 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                r22 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                r22 = 7;
            }
        }
        setTextDirection(r22);
        int r02 = Build.VERSION.SDK_INT;
        TextPaint textPaint = c0231a.f2998a;
        if (r02 < 23) {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(textPaint);
        AbstractC0326m.e(this, c0231a.f3000c);
        AbstractC0326m.h(this, c0231a.f3001d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int r3, float f2) {
        boolean z3 = InterfaceC0315b.f3964H;
        if (z3) {
            super.setTextSize(r3, f2);
            return;
        }
        C0420t c0420t = this.f4725K;
        if (c0420t != null && !z3) {
            C0423w c0423w = c0420t.f4713i;
            if (c0423w.f4731a == 0) {
                c0423w.f(r3, f2);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int r4) {
        Typeface typeface2;
        if (typeface != null && r4 > 0) {
            Context context = getContext();
            AbstractC0747y0 abstractC0747y0 = Y.e.f1643a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, r4);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, r4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0421u(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
        j0.a(context);
        C0415n c0415n = new C0415n(this);
        this.f4724J = c0415n;
        c0415n.b(attributeSet, r3);
        C0420t c0420t = new C0420t(this);
        this.f4725K = c0420t;
        c0420t.d(attributeSet, r3);
        c0420t.b();
        h2.J j3 = new h2.J(8);
        j3.f3303K = this;
        this.f4726L = j3;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(r3 != 0 ? j.b.c(context, r3) : null, r4 != 0 ? j.b.c(context, r4) : null, r5 != 0 ? j.b.c(context, r5) : null, r6 != 0 ? j.b.c(context, r6) : null);
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            c0420t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int r3, int r4, int r5, int r6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(r3 != 0 ? j.b.c(context, r3) : null, r4 != 0 ? j.b.c(context, r4) : null, r5 != 0 ? j.b.c(context, r5) : null, r6 != 0 ? j.b.c(context, r6) : null);
        C0420t c0420t = this.f4725K;
        if (c0420t != null) {
            c0420t.b();
        }
    }
}
