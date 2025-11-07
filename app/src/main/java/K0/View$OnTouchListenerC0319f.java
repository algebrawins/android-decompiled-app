package k0;

import A0.RunnableC0004e;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import p.AbstractC0400B;

/* renamed from: k0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC0319f implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    public static final int f3965r = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    public final C0314a f3966a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f3967b;

    /* renamed from: c  reason: collision with root package name */
    public final ListView f3968c;

    /* renamed from: d  reason: collision with root package name */
    public RunnableC0004e f3969d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f3970e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f3971f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3972h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f3973i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f3974j;

    /* renamed from: k  reason: collision with root package name */
    public final float[] f3975k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3976l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3977m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3978n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3979o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3980p;

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0400B f3981q;

    /* JADX WARN: Type inference failed for: r1v0, types: [k0.a, java.lang.Object] */
    public View$OnTouchListenerC0319f(AbstractC0400B abstractC0400B) {
        ?? obj = new Object();
        obj.f3960e = Long.MIN_VALUE;
        obj.g = -1L;
        obj.f3961f = 0L;
        this.f3966a = obj;
        this.f3967b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3970e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3971f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3973i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3974j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3975k = fArr5;
        this.f3968c = abstractC0400B;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3972h = f3965r;
        obj.f3956a = 500;
        obj.f3957b = 500;
        this.f3981q = abstractC0400B;
    }

    public static float b(float f2, float f4, float f5) {
        if (f2 > f5) {
            return f5;
        }
        if (f2 < f4) {
            return f4;
        }
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f3970e
            r0 = r0[r4]
            float[] r1 = r3.f3971f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            android.view.animation.AccelerateInterpolator r6 = r3.f3967b
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L2e
        L26:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r5 = r6.getInterpolation(r5)
        L2e:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L38
        L37:
            r5 = 0
        L38:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3d
            return r2
        L3d:
            float[] r0 = r3.f3973i
            r0 = r0[r4]
            float[] r1 = r3.f3974j
            r1 = r1[r4]
            float[] r2 = r3.f3975k
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L54
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L54:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.View$OnTouchListenerC0319f.a(int, float, float, float):float");
    }

    public final float c(float f2, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int r12 = this.g;
        if (r12 != 0 && r12 != 1) {
            if (r12 == 2 && f2 < 0.0f) {
                return f2 / (-f4);
            }
        } else if (f2 < f4) {
            if (f2 >= 0.0f) {
                return 1.0f - (f2 / f4);
            }
            if (this.f3979o && r12 == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int r12 = 0;
        if (this.f3977m) {
            this.f3979o = false;
            return;
        }
        C0314a c0314a = this.f3966a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int r5 = (int) (currentAnimationTimeMillis - c0314a.f3960e);
        int r4 = c0314a.f3957b;
        if (r5 > r4) {
            r12 = r4;
        } else if (r5 >= 0) {
            r12 = r5;
        }
        c0314a.f3963i = r12;
        c0314a.f3962h = c0314a.a(currentAnimationTimeMillis);
        c0314a.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        AbstractC0400B abstractC0400B;
        int count;
        C0314a c0314a = this.f3966a;
        float f2 = c0314a.f3959d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(c0314a.f3958c);
        if (abs == 0 || (count = (abstractC0400B = this.f3981q).getCount()) == 0) {
            return false;
        }
        int childCount = abstractC0400B.getChildCount();
        int firstVisiblePosition = abstractC0400B.getFirstVisiblePosition();
        int r6 = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (r6 >= count && abstractC0400B.getChildAt(childCount - 1).getBottom() <= abstractC0400B.getHeight()) {
                return false;
            }
        } else if (abs >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && abstractC0400B.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f3980p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7d
        L16:
            r7.d()
            goto L7d
        L1a:
            r7.f3978n = r2
            r7.f3976l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f3968c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            k0.a r9 = r7.f3966a
            r9.f3958c = r0
            r9.f3959d = r8
            boolean r8 = r7.f3979o
            if (r8 != 0) goto L7d
            boolean r8 = r7.e()
            if (r8 == 0) goto L7d
            A0.e r8 = r7.f3969d
            if (r8 != 0) goto L61
            A0.e r8 = new A0.e
            r9 = 16
            r8.<init>(r9, r7)
            r7.f3969d = r8
        L61:
            r7.f3979o = r2
            r7.f3977m = r2
            boolean r8 = r7.f3976l
            if (r8 != 0) goto L76
            int r8 = r7.f3972h
            if (r8 <= 0) goto L76
            A0.e r9 = r7.f3969d
            long r5 = (long) r8
            java.lang.reflect.Field r8 = f0.w.f3200a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            A0.e r8 = r7.f3969d
            r8.run()
        L7b:
            r7.f3976l = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.View$OnTouchListenerC0319f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
