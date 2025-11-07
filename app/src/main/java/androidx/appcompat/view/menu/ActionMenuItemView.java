package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import i.a;
import o.AbstractC0396b;
import o.View$OnTouchListenerC0395a;
import o.i;
import o.j;
import o.k;
import o.q;
import p.C0421u;
import p.InterfaceC0411j;
import x1.I4;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0421u implements q, View.OnClickListener, InterfaceC0411j {

    /* renamed from: N  reason: collision with root package name */
    public k f1894N;

    /* renamed from: O  reason: collision with root package name */
    public CharSequence f1895O;

    /* renamed from: P  reason: collision with root package name */
    public Drawable f1896P;

    /* renamed from: Q  reason: collision with root package name */
    public i f1897Q;

    /* renamed from: R  reason: collision with root package name */
    public View$OnTouchListenerC0395a f1898R;

    /* renamed from: S  reason: collision with root package name */
    public AbstractC0396b f1899S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f1900T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f1901U;

    /* renamed from: V  reason: collision with root package name */
    public final int f1902V;

    /* renamed from: W  reason: collision with root package name */
    public int f1903W;
    public final int a0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1900T = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3386c, 0, 0);
        this.f1902V = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.a0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1903W = -1;
        setSaveEnabled(false);
    }

    @Override // p.InterfaceC0411j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // o.q
    public final void b(k kVar) {
        int r02;
        this.f1894N = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.getTitleCondensed());
        setId(kVar.f4429a);
        if (kVar.isVisible()) {
            r02 = 0;
        } else {
            r02 = 8;
        }
        setVisibility(r02);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f1898R == null) {
            this.f1898R = new View$OnTouchListenerC0395a(this);
        }
    }

    @Override // p.InterfaceC0411j
    public final boolean c() {
        if (!TextUtils.isEmpty(getText()) && this.f1894N.getIcon() == null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int r12 = configuration.screenWidthDp;
        int r22 = configuration.screenHeightDp;
        if (r12 < 480 && ((r12 < 640 || r22 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void f() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f1895O);
        if (this.f1896P != null && ((this.f1894N.f4452y & 4) != 4 || (!this.f1900T && !this.f1901U))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        CharSequence charSequence3 = null;
        if (z5) {
            charSequence = this.f1895O;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f1894N.f4444q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z5) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f1894N.f4433e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f1894N.f4445r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z5) {
                charSequence3 = this.f1894N.f4433e;
            }
            I4.a(this, charSequence3);
            return;
        }
        I4.a(this, charSequence5);
    }

    @Override // o.q
    public k getItemData() {
        return this.f1894N;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f1897Q;
        if (iVar != null) {
            iVar.a(this.f1894N);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1900T = e();
        f();
    }

    @Override // p.C0421u, android.widget.TextView, android.view.View
    public final void onMeasure(int r6, int r7) {
        int r62;
        int r12;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (r12 = this.f1903W) >= 0) {
            super.setPadding(r12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(r6, r7);
        int mode = View.MeasureSpec.getMode(r6);
        int size = View.MeasureSpec.getSize(r6);
        int measuredWidth = getMeasuredWidth();
        int r3 = this.f1902V;
        if (mode == Integer.MIN_VALUE) {
            r62 = Math.min(size, r3);
        } else {
            r62 = r3;
        }
        if (mode != 1073741824 && r3 > 0 && measuredWidth < r62) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(r62, 1073741824), r7);
        }
        if (isEmpty && this.f1896P != null) {
            super.setPadding((getMeasuredWidth() - this.f1896P.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View$OnTouchListenerC0395a view$OnTouchListenerC0395a;
        if (this.f1894N.hasSubMenu() && (view$OnTouchListenerC0395a = this.f1898R) != null && view$OnTouchListenerC0395a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f1901U != z3) {
            this.f1901U = z3;
            k kVar = this.f1894N;
            if (kVar != null) {
                j jVar = kVar.f4441n;
                jVar.f4417k = true;
                jVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1896P = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int r22 = this.a0;
            if (intrinsicWidth > r22) {
                intrinsicHeight = (int) (intrinsicHeight * (r22 / intrinsicWidth));
                intrinsicWidth = r22;
            }
            if (intrinsicHeight > r22) {
                intrinsicWidth = (int) (intrinsicWidth * (r22 / intrinsicHeight));
            } else {
                r22 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, r22);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(i iVar) {
        this.f1897Q = iVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int r12, int r22, int r3, int r4) {
        this.f1903W = r12;
        super.setPadding(r12, r22, r3, r4);
    }

    public void setPopupCallback(AbstractC0396b abstractC0396b) {
        this.f1899S = abstractC0396b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1895O = charSequence;
        f();
    }
}
