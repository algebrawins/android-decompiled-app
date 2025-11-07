package E0;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: d  reason: collision with root package name */
    public U1.h f536d;

    /* renamed from: e  reason: collision with root package name */
    public float f537e;

    /* renamed from: f  reason: collision with root package name */
    public U1.h f538f;
    public float g;

    /* renamed from: h  reason: collision with root package name */
    public float f539h;

    /* renamed from: i  reason: collision with root package name */
    public float f540i;

    /* renamed from: j  reason: collision with root package name */
    public float f541j;

    /* renamed from: k  reason: collision with root package name */
    public float f542k;

    /* renamed from: l  reason: collision with root package name */
    public Paint.Cap f543l;

    /* renamed from: m  reason: collision with root package name */
    public Paint.Join f544m;

    /* renamed from: n  reason: collision with root package name */
    public float f545n;

    @Override // E0.l
    public final boolean a() {
        if (!this.f538f.b() && !this.f536d.b()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // E0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            U1.h r0 = r6.f538f
            boolean r1 = r0.b()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f1342L
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f1340J
            if (r1 == r4) goto L1e
            r0.f1340J = r1
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            U1.h r1 = r6.f536d
            boolean r4 = r1.b()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f1342L
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f1340J
            if (r7 == r4) goto L3a
            r1.f1340J = r7
            r2 = 1
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.j.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f539h;
    }

    public int getFillColor() {
        return this.f538f.f1340J;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.f536d.f1340J;
    }

    public float getStrokeWidth() {
        return this.f537e;
    }

    public float getTrimPathEnd() {
        return this.f541j;
    }

    public float getTrimPathOffset() {
        return this.f542k;
    }

    public float getTrimPathStart() {
        return this.f540i;
    }

    public void setFillAlpha(float f2) {
        this.f539h = f2;
    }

    public void setFillColor(int r22) {
        this.f538f.f1340J = r22;
    }

    public void setStrokeAlpha(float f2) {
        this.g = f2;
    }

    public void setStrokeColor(int r22) {
        this.f536d.f1340J = r22;
    }

    public void setStrokeWidth(float f2) {
        this.f537e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f541j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f542k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.f540i = f2;
    }
}
