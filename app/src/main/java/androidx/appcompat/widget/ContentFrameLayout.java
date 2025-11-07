package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p.InterfaceC0424x;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: J  reason: collision with root package name */
    public TypedValue f1976J;

    /* renamed from: K  reason: collision with root package name */
    public TypedValue f1977K;

    /* renamed from: L  reason: collision with root package name */
    public TypedValue f1978L;

    /* renamed from: M  reason: collision with root package name */
    public TypedValue f1979M;

    /* renamed from: N  reason: collision with root package name */
    public TypedValue f1980N;

    /* renamed from: O  reason: collision with root package name */
    public TypedValue f1981O;

    /* renamed from: P  reason: collision with root package name */
    public final Rect f1982P;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1982P = new Rect();
    }

    public final void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1980N == null) {
            this.f1980N = new TypedValue();
        }
        return this.f1980N;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1981O == null) {
            this.f1981O = new TypedValue();
        }
        return this.f1981O;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1978L == null) {
            this.f1978L = new TypedValue();
        }
        return this.f1978L;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1979M == null) {
            this.f1979M = new TypedValue();
        }
        return this.f1979M;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1976J == null) {
            this.f1976J = new TypedValue();
        }
        return this.f1976J;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1977K == null) {
            this.f1977K = new TypedValue();
        }
        return this.f1977K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0424x interfaceC0424x) {
    }
}
