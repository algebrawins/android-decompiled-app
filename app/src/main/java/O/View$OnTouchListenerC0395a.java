package o;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.libraries.barhopper.RecognitionOptions;
import p.C0408f;
import p.C0409g;
import p.C0410h;
import p.RunnableC0402D;

/* renamed from: o.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC0395a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final float f4355a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4356b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4357c;

    /* renamed from: d  reason: collision with root package name */
    public final View f4358d;

    /* renamed from: e  reason: collision with root package name */
    public RunnableC0402D f4359e;

    /* renamed from: f  reason: collision with root package name */
    public RunnableC0402D f4360f;
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public int f4361h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f4362i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f4363j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ View f4364k;

    public View$OnTouchListenerC0395a(View view) {
        this.f4362i = new int[2];
        this.f4358d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4355a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f4356b = tapTimeout;
        this.f4357c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0402D runnableC0402D = this.f4360f;
        View view = this.f4358d;
        if (runnableC0402D != null) {
            view.removeCallbacks(runnableC0402D);
        }
        RunnableC0402D runnableC0402D2 = this.f4359e;
        if (runnableC0402D2 != null) {
            view.removeCallbacks(runnableC0402D2);
        }
    }

    public final l b() {
        C0408f c0408f;
        switch (this.f4363j) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                AbstractC0396b abstractC0396b = ((ActionMenuItemView) this.f4364k).f1899S;
                if (abstractC0396b == null || (c0408f = ((C0409g) abstractC0396b).f4603a.f4638b0) == null) {
                    return null;
                }
                return c0408f.a();
            default:
                C0408f c0408f2 = ((C0410h) this.f4364k).f4620L.a0;
                if (c0408f2 == null) {
                    return null;
                }
                return c0408f2.a();
        }
    }

    public final boolean c() {
        l b3;
        switch (this.f4363j) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f4364k;
                i iVar = actionMenuItemView.f1897Q;
                if (iVar == null || !iVar.a(actionMenuItemView.f1894N) || (b3 = b()) == null || !b3.g()) {
                    return false;
                }
                return true;
            default:
                ((C0410h) this.f4364k).f4620L.h();
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (r14 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
        if (r4 != 3) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.View$OnTouchListenerC0395a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.f4361h = -1;
        RunnableC0402D runnableC0402D = this.f4359e;
        if (runnableC0402D != null) {
            this.f4358d.removeCallbacks(runnableC0402D);
        }
    }

    /* JADX WARN: 'thıs' call moved to the top of the method (can break code semantics) */
    public View$OnTouchListenerC0395a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f4363j = 0;
        this.f4364k = actionMenuItemView;
    }

    /* JADX WARN: 'thıs' call moved to the top of the method (can break code semantics) */
    public View$OnTouchListenerC0395a(C0410h c0410h, C0410h c0410h2) {
        this(c0410h2);
        this.f4363j = 1;
        this.f4364k = c0410h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
