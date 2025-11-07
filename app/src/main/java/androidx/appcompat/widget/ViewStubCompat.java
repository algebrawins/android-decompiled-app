package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p.v0;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: J  reason: collision with root package name */
    public int f2092J;

    /* renamed from: K  reason: collision with root package name */
    public int f2093K;

    /* renamed from: L  reason: collision with root package name */
    public WeakReference f2094L;

    /* renamed from: M  reason: collision with root package name */
    public LayoutInflater f2095M;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2092J = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f3404v, 0, 0);
        this.f2093K = obtainStyledAttributes.getResourceId(2, -1);
        this.f2092J = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f2093K;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f2095M;
    }

    public int getLayoutResource() {
        return this.f2092J;
    }

    @Override // android.view.View
    public final void onMeasure(int r12, int r22) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int r12) {
        this.f2093K = r12;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f2095M = layoutInflater;
    }

    public void setLayoutResource(int r12) {
        this.f2092J = r12;
    }

    @Override // android.view.View
    public void setVisibility(int r4) {
        WeakReference weakReference = this.f2094L;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(r4);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(r4);
        if (r4 == 0 || r4 == 4) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                if (this.f2092J != 0) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutInflater layoutInflater = this.f2095M;
                    if (layoutInflater == null) {
                        layoutInflater = LayoutInflater.from(getContext());
                    }
                    View inflate = layoutInflater.inflate(this.f2092J, viewGroup, false);
                    int r12 = this.f2093K;
                    if (r12 != -1) {
                        inflate.setId(r12);
                    }
                    int indexOfChild = viewGroup.indexOfChild(this);
                    viewGroup.removeViewInLayout(this);
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        viewGroup.addView(inflate, indexOfChild, layoutParams);
                    } else {
                        viewGroup.addView(inflate, indexOfChild);
                    }
                    this.f2094L = new WeakReference(inflate);
                    return;
                }
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
    }

    public void setOnInflateListener(v0 v0Var) {
    }
}
