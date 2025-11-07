package p;

import A0.RunnableC0004e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.catering_inventory.R;
import java.lang.reflect.Field;
import k0.View$OnTouchListenerC0319f;

/* renamed from: p.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0400B extends ListView {

    /* renamed from: J  reason: collision with root package name */
    public final Rect f4496J;

    /* renamed from: K  reason: collision with root package name */
    public int f4497K;

    /* renamed from: L  reason: collision with root package name */
    public int f4498L;

    /* renamed from: M  reason: collision with root package name */
    public int f4499M;

    /* renamed from: N  reason: collision with root package name */
    public int f4500N;

    /* renamed from: O  reason: collision with root package name */
    public int f4501O;

    /* renamed from: P  reason: collision with root package name */
    public final Field f4502P;

    /* renamed from: Q  reason: collision with root package name */
    public C0399A f4503Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f4504R;

    /* renamed from: S  reason: collision with root package name */
    public final boolean f4505S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f4506T;

    /* renamed from: U  reason: collision with root package name */
    public View$OnTouchListenerC0319f f4507U;

    /* renamed from: V  reason: collision with root package name */
    public RunnableC0004e f4508V;

    public AbstractC0400B(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f4496J = new Rect();
        this.f4497K = 0;
        this.f4498L = 0;
        this.f4499M = 0;
        this.f4500N = 0;
        this.f4505S = z3;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f4502P = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
        }
    }

    public final int a(int r12, int r13) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int r02 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int r7 = 0;
        for (int r6 = 0; r6 < count; r6++) {
            int itemViewType = adapter.getItemViewType(r6);
            if (itemViewType != r7) {
                view = null;
                r7 = itemViewType;
            }
            view = adapter.getView(r6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int r9 = layoutParams.height;
            if (r9 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r9, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(r12, makeMeasureSpec);
            view.forceLayout();
            if (r6 > 0) {
                r02 += dividerHeight;
            }
            r02 += view.getMeasuredHeight();
            if (r02 >= r13) {
                return r13;
            }
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.AbstractC0400B.b(int, android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4496J;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4508V != null) {
            return;
        }
        super.drawableStateChanged();
        C0399A c0399a = this.f4503Q;
        if (c0399a != null) {
            c0399a.f4495K = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f4506T && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f4505S && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f4505S && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f4505S && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f4505S && this.f4504R) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f4508V = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4508V == null) {
            RunnableC0004e runnableC0004e = new RunnableC0004e(17, this);
            this.f4508V = runnableC0004e;
            post(runnableC0004e);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.f4506T && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4501O = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0004e runnableC0004e = this.f4508V;
        if (runnableC0004e != null) {
            AbstractC0400B abstractC0400B = (AbstractC0400B) runnableC0004e.f101K;
            abstractC0400B.f4508V = null;
            abstractC0400B.removeCallbacks(runnableC0004e);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f4504R = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.A, android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0399A c0399a = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f4494J;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f4494J = drawable;
            drawable.setCallback(drawable2);
            drawable2.f4495K = true;
            c0399a = drawable2;
        }
        this.f4503Q = c0399a;
        super.setSelector(c0399a);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f4497K = rect.left;
        this.f4498L = rect.top;
        this.f4499M = rect.right;
        this.f4500N = rect.bottom;
    }
}
