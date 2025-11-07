package p;

import A0.C0001b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.example.catering_inventory.R;
import x1.E4;

/* renamed from: p.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0414m extends AutoCompleteTextView {

    /* renamed from: L  reason: collision with root package name */
    public static final int[] f4656L = {16843126};

    /* renamed from: J  reason: collision with root package name */
    public final C0415n f4657J;

    /* renamed from: K  reason: collision with root package name */
    public final C0420t f4658K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0414m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        j0.a(context);
        C0001b P3 = C0001b.P(getContext(), attributeSet, f4656L, R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) P3.f84K).hasValue(0)) {
            setDropDownBackgroundDrawable(P3.E(0));
        }
        P3.S();
        C0415n c0415n = new C0415n(this);
        this.f4657J = c0415n;
        c0415n.b(attributeSet, R.attr.autoCompleteTextViewStyle);
        C0420t c0420t = new C0420t(this);
        this.f4658K = c0420t;
        c0420t.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        c0420t.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0415n c0415n = this.f4657J;
        if (c0415n != null) {
            c0415n.a();
        }
        C0420t c0420t = this.f4658K;
        if (c0420t != null) {
            c0420t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        B0.d dVar;
        C0415n c0415n = this.f4657J;
        if (c0415n == null || (dVar = c0415n.f4666e) == null) {
            return null;
        }
        return (ColorStateList) dVar.f181c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        B0.d dVar;
        C0415n c0415n = this.f4657J;
        if (c0415n == null || (dVar = c0415n.f4666e) == null) {
            return null;
        }
        return (PorterDuff.Mode) dVar.f182d;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0415n c0415n = this.f4657J;
        if (c0415n != null) {
            c0415n.f4664c = -1;
            c0415n.d(null);
            c0415n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r22) {
        super.setBackgroundResource(r22);
        C0415n c0415n = this.f4657J;
        if (c0415n != null) {
            c0415n.c(r22);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E4.d(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r22) {
        setDropDownBackgroundDrawable(j.b.c(getContext(), r22));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0415n c0415n = this.f4657J;
        if (c0415n != null) {
            c0415n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0415n c0415n = this.f4657J;
        if (c0415n != null) {
            c0415n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int r3) {
        super.setTextAppearance(context, r3);
        C0420t c0420t = this.f4658K;
        if (c0420t != null) {
            c0420t.e(context, r3);
        }
    }
}
