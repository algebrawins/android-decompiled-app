package p;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class e0 extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final View f4590a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f4591b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4592c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f4593d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4594e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4595f;

    public e0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f4594e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f4591b = rect3;
        Rect rect4 = new Rect();
        this.f4593d = rect4;
        Rect rect5 = new Rect();
        this.f4592c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int r5 = -scaledTouchSlop;
        rect4.inset(r5, r5);
        rect5.set(rect2);
        this.f4590a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z4 = this.f4595f;
                    this.f4595f = false;
                }
                z3 = true;
                z5 = false;
            } else {
                z4 = this.f4595f;
                if (z4 && !this.f4593d.contains(x3, y3)) {
                    z5 = z4;
                    z3 = false;
                }
            }
            z5 = z4;
            z3 = true;
        } else {
            if (this.f4591b.contains(x3, y3)) {
                this.f4595f = true;
                z3 = true;
            }
            z3 = true;
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        Rect rect = this.f4592c;
        View view = this.f4590a;
        if (z3 && !rect.contains(x3, y3)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x3 - rect.left, y3 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
