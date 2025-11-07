package E0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import x1.AbstractC0739x0;
import x1.D0;

/* loaded from: classes.dex */
public final class q extends h {

    /* renamed from: S  reason: collision with root package name */
    public static final PorterDuff.Mode f586S = PorterDuff.Mode.SRC_IN;

    /* renamed from: K  reason: collision with root package name */
    public o f587K;

    /* renamed from: L  reason: collision with root package name */
    public PorterDuffColorFilter f588L;

    /* renamed from: M  reason: collision with root package name */
    public ColorFilter f589M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f590N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f591O;

    /* renamed from: P  reason: collision with root package name */
    public final float[] f592P;

    /* renamed from: Q  reason: collision with root package name */
    public final Matrix f593Q;

    /* renamed from: R  reason: collision with root package name */
    public final Rect f594R;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, E0.o] */
    public q() {
        this.f591O = true;
        this.f592P = new float[9];
        this.f593Q = new Matrix();
        this.f594R = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f576c = null;
        constantState.f577d = f586S;
        constantState.f575b = new n();
        this.f587K = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            Z.a.b(drawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f594R;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f589M;
            if (colorFilter == null) {
                colorFilter = this.f588L;
            }
            Matrix matrix = this.f593Q;
            canvas.getMatrix(matrix);
            float[] fArr = this.f592P;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min((int) RecognitionOptions.PDF417, (int) (rect.width() * abs));
            int min2 = Math.min((int) RecognitionOptions.PDF417, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && D0.a(this) == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                o oVar = this.f587K;
                Bitmap bitmap = oVar.f579f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != oVar.f579f.getHeight()) {
                    oVar.f579f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    oVar.f583k = true;
                }
                if (!this.f591O) {
                    o oVar2 = this.f587K;
                    oVar2.f579f.eraseColor(0);
                    Canvas canvas2 = new Canvas(oVar2.f579f);
                    n nVar = oVar2.f575b;
                    nVar.a(nVar.g, n.f559p, canvas2, min, min2);
                } else {
                    o oVar3 = this.f587K;
                    if (oVar3.f583k || oVar3.g != oVar3.f576c || oVar3.f580h != oVar3.f577d || oVar3.f582j != oVar3.f578e || oVar3.f581i != oVar3.f575b.getRootAlpha()) {
                        o oVar4 = this.f587K;
                        oVar4.f579f.eraseColor(0);
                        Canvas canvas3 = new Canvas(oVar4.f579f);
                        n nVar2 = oVar4.f575b;
                        nVar2.a(nVar2.g, n.f559p, canvas3, min, min2);
                        o oVar5 = this.f587K;
                        oVar5.g = oVar5.f576c;
                        oVar5.f580h = oVar5.f577d;
                        oVar5.f581i = oVar5.f575b.getRootAlpha();
                        oVar5.f582j = oVar5.f578e;
                        oVar5.f583k = false;
                    }
                }
                o oVar6 = this.f587K;
                if (oVar6.f575b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (oVar6.f584l == null) {
                        Paint paint2 = new Paint();
                        oVar6.f584l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    oVar6.f584l.setAlpha(oVar6.f575b.getRootAlpha());
                    oVar6.f584l.setColorFilter(colorFilter);
                    paint = oVar6.f584l;
                }
                canvas.drawBitmap(oVar6.f579f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f587K.f575b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f587K.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return Z.a.c(drawable);
        }
        return this.f589M;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f535J != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f535J.getConstantState());
        }
        this.f587K.f574a = getChangingConfigurations();
        return this.f587K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f587K.f575b.f567i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f587K.f575b.f566h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f587K.f578e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            o oVar = this.f587K;
            if (oVar != null) {
                n nVar = oVar.f575b;
                if (nVar.f572n == null) {
                    nVar.f572n = Boolean.valueOf(nVar.g.a());
                }
                if (nVar.f572n.booleanValue() || ((colorStateList = this.f587K.f576c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, E0.o] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f590N && super.mutate() == this) {
            o oVar = this.f587K;
            ?? constantState = new Drawable.ConstantState();
            constantState.f576c = null;
            constantState.f577d = f586S;
            if (oVar != null) {
                constantState.f574a = oVar.f574a;
                n nVar = new n(oVar.f575b);
                constantState.f575b = nVar;
                if (oVar.f575b.f564e != null) {
                    nVar.f564e = new Paint(oVar.f575b.f564e);
                }
                if (oVar.f575b.f563d != null) {
                    constantState.f575b.f563d = new Paint(oVar.f575b.f563d);
                }
                constantState.f576c = oVar.f576c;
                constantState.f577d = oVar.f577d;
                constantState.f578e = oVar.f578e;
            }
            this.f587K = constantState;
            this.f590N = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r6) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.setState(r6);
        }
        o oVar = this.f587K;
        ColorStateList colorStateList = oVar.f576c;
        if (colorStateList != null && (mode = oVar.f577d) != null) {
            this.f588L = a(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        } else {
            z3 = false;
        }
        n nVar = oVar.f575b;
        if (nVar.f572n == null) {
            nVar.f572n = Boolean.valueOf(nVar.g.a());
        }
        if (nVar.f572n.booleanValue()) {
            boolean b3 = oVar.f575b.g.b(r6);
            oVar.f583k |= b3;
            if (b3) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r22) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.setAlpha(r22);
        } else if (this.f587K.f575b.getRootAlpha() != r22) {
            this.f587K.f575b.setRootAlpha(r22);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f587K.f578e = z3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f589M = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r22) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            D0.b(drawable, r22);
        } else {
            setTintList(ColorStateList.valueOf(r22));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            Z.a.h(drawable, colorStateList);
            return;
        }
        o oVar = this.f587K;
        if (oVar.f576c != colorStateList) {
            oVar.f576c = colorStateList;
            this.f588L = a(colorStateList, oVar.f577d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            Z.a.i(drawable, mode);
            return;
        }
        o oVar = this.f587K;
        if (oVar.f577d != mode) {
            oVar.f577d = mode;
            this.f588L = a(oVar.f576c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19, types: [E0.j, E0.m, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        n nVar;
        int r19;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f535J;
        if (drawable != null) {
            Z.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f587K;
        oVar.f575b = new n();
        TypedArray h3 = X.b.h(resources, theme, attributeSet, a.f513a);
        o oVar2 = this.f587K;
        n nVar2 = oVar2.f575b;
        int r02 = !X.b.e(xmlPullParser, "tintMode") ? -1 : h3.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (r02 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (r02 != 5) {
            if (r02 != 9) {
                switch (r02) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f577d = mode;
        int r12 = 1;
        ColorStateList colorStateList = null;
        if (X.b.e(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            h3.getValue(1, typedValue);
            int r11 = typedValue.type;
            if (r11 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (r11 >= 28 && r11 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = h3.getResources();
                int resourceId = h3.getResourceId(1, 0);
                ThreadLocal threadLocal = X.c.f1549a;
                try {
                    colorStateList = X.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e4) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            oVar2.f576c = colorStateList2;
        }
        boolean z3 = oVar2.f578e;
        if (X.b.e(xmlPullParser, "autoMirrored")) {
            z3 = h3.getBoolean(5, z3);
        }
        oVar2.f578e = z3;
        float f2 = nVar2.f568j;
        if (X.b.e(xmlPullParser, "viewportWidth")) {
            f2 = h3.getFloat(7, f2);
        }
        nVar2.f568j = f2;
        float f4 = nVar2.f569k;
        if (X.b.e(xmlPullParser, "viewportHeight")) {
            f4 = h3.getFloat(8, f4);
        }
        nVar2.f569k = f4;
        if (nVar2.f568j <= 0.0f) {
            throw new XmlPullParserException(h3.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f4 > 0.0f) {
            nVar2.f566h = h3.getDimension(3, nVar2.f566h);
            float dimension = h3.getDimension(2, nVar2.f567i);
            nVar2.f567i = dimension;
            if (nVar2.f566h <= 0.0f) {
                throw new XmlPullParserException(h3.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = nVar2.getAlpha();
                if (X.b.e(xmlPullParser, "alpha")) {
                    alpha = h3.getFloat(4, alpha);
                }
                nVar2.setAlpha(alpha);
                String string = h3.getString(0);
                if (string != null) {
                    nVar2.f571m = string;
                    nVar2.f573o.put(string, nVar2);
                }
                h3.recycle();
                oVar.f574a = getChangingConfigurations();
                oVar.f583k = true;
                o oVar3 = this.f587K;
                n nVar3 = oVar3.f575b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nVar3.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z4 = true;
                for (int r13 = 3; eventType != r12 && (xmlPullParser.getDepth() >= depth || eventType != r13); r13 = 3) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar = (k) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        r19 = depth;
                        R.b bVar = nVar3.f573o;
                        if (equals) {
                            ?? mVar = new m();
                            mVar.f537e = 0.0f;
                            mVar.g = 1.0f;
                            mVar.f539h = 1.0f;
                            mVar.f540i = 0.0f;
                            mVar.f541j = 1.0f;
                            mVar.f542k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            mVar.f543l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            mVar.f544m = join3;
                            nVar = nVar3;
                            mVar.f545n = 4.0f;
                            TypedArray h4 = X.b.h(resources, theme, attributeSet, a.f515c);
                            if (X.b.e(xmlPullParser, "pathData")) {
                                String string2 = h4.getString(0);
                                if (string2 != null) {
                                    mVar.f557b = string2;
                                }
                                String string3 = h4.getString(2);
                                if (string3 != null) {
                                    mVar.f556a = AbstractC0739x0.c(string3);
                                }
                                mVar.f538f = X.b.b(h4, xmlPullParser, theme, "fillColor", 1);
                                float f5 = mVar.f539h;
                                if (X.b.e(xmlPullParser, "fillAlpha")) {
                                    f5 = h4.getFloat(12, f5);
                                }
                                mVar.f539h = f5;
                                int r112 = !X.b.e(xmlPullParser, "strokeLineCap") ? -1 : h4.getInt(8, -1);
                                Paint.Cap cap3 = mVar.f543l;
                                if (r112 != 0) {
                                    join = join3;
                                    if (r112 != 1) {
                                        cap = r112 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                mVar.f543l = cap;
                                int r15 = !X.b.e(xmlPullParser, "strokeLineJoin") ? -1 : h4.getInt(9, -1);
                                Paint.Join join4 = mVar.f544m;
                                if (r15 == 0) {
                                    join2 = join;
                                } else if (r15 != 1) {
                                    join2 = r15 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                mVar.f544m = join2;
                                float f6 = mVar.f545n;
                                if (X.b.e(xmlPullParser, "strokeMiterLimit")) {
                                    f6 = h4.getFloat(10, f6);
                                }
                                mVar.f545n = f6;
                                mVar.f536d = X.b.b(h4, xmlPullParser, theme, "strokeColor", 3);
                                float f7 = mVar.g;
                                if (X.b.e(xmlPullParser, "strokeAlpha")) {
                                    f7 = h4.getFloat(11, f7);
                                }
                                mVar.g = f7;
                                float f8 = mVar.f537e;
                                if (X.b.e(xmlPullParser, "strokeWidth")) {
                                    f8 = h4.getFloat(4, f8);
                                }
                                mVar.f537e = f8;
                                float f9 = mVar.f541j;
                                if (X.b.e(xmlPullParser, "trimPathEnd")) {
                                    f9 = h4.getFloat(6, f9);
                                }
                                mVar.f541j = f9;
                                float f10 = mVar.f542k;
                                if (X.b.e(xmlPullParser, "trimPathOffset")) {
                                    f10 = h4.getFloat(7, f10);
                                }
                                mVar.f542k = f10;
                                float f11 = mVar.f540i;
                                if (X.b.e(xmlPullParser, "trimPathStart")) {
                                    f11 = h4.getFloat(5, f11);
                                }
                                mVar.f540i = f11;
                                int r113 = mVar.f558c;
                                if (X.b.e(xmlPullParser, "fillType")) {
                                    r113 = h4.getInt(13, r113);
                                }
                                mVar.f558c = r113;
                            }
                            h4.recycle();
                            kVar.f547b.add(mVar);
                            if (mVar.getPathName() != null) {
                                bVar.put(mVar.getPathName(), mVar);
                            }
                            oVar3.f574a = oVar3.f574a;
                            z4 = false;
                        } else {
                            nVar = nVar3;
                            if ("clip-path".equals(name)) {
                                m mVar2 = new m();
                                if (X.b.e(xmlPullParser, "pathData")) {
                                    TypedArray h5 = X.b.h(resources, theme, attributeSet, a.f516d);
                                    String string4 = h5.getString(0);
                                    if (string4 != null) {
                                        mVar2.f557b = string4;
                                    }
                                    String string5 = h5.getString(1);
                                    if (string5 != null) {
                                        mVar2.f556a = AbstractC0739x0.c(string5);
                                    }
                                    mVar2.f558c = !X.b.e(xmlPullParser, "fillType") ? 0 : h5.getInt(2, 0);
                                    h5.recycle();
                                }
                                kVar.f547b.add(mVar2);
                                if (mVar2.getPathName() != null) {
                                    bVar.put(mVar2.getPathName(), mVar2);
                                }
                                oVar3.f574a = oVar3.f574a;
                            } else if ("group".equals(name)) {
                                k kVar2 = new k();
                                TypedArray h6 = X.b.h(resources, theme, attributeSet, a.f514b);
                                float f12 = kVar2.f548c;
                                if (X.b.e(xmlPullParser, "rotation")) {
                                    f12 = h6.getFloat(5, f12);
                                }
                                kVar2.f548c = f12;
                                kVar2.f549d = h6.getFloat(1, kVar2.f549d);
                                kVar2.f550e = h6.getFloat(2, kVar2.f550e);
                                float f13 = kVar2.f551f;
                                if (X.b.e(xmlPullParser, "scaleX")) {
                                    f13 = h6.getFloat(3, f13);
                                }
                                kVar2.f551f = f13;
                                float f14 = kVar2.g;
                                if (X.b.e(xmlPullParser, "scaleY")) {
                                    f14 = h6.getFloat(4, f14);
                                }
                                kVar2.g = f14;
                                float f15 = kVar2.f552h;
                                if (X.b.e(xmlPullParser, "translateX")) {
                                    f15 = h6.getFloat(6, f15);
                                }
                                kVar2.f552h = f15;
                                float f16 = kVar2.f553i;
                                if (X.b.e(xmlPullParser, "translateY")) {
                                    f16 = h6.getFloat(7, f16);
                                }
                                kVar2.f553i = f16;
                                String string6 = h6.getString(0);
                                if (string6 != null) {
                                    kVar2.f555k = string6;
                                }
                                kVar2.c();
                                h6.recycle();
                                kVar.f547b.add(kVar2);
                                arrayDeque.push(kVar2);
                                if (kVar2.getGroupName() != null) {
                                    bVar.put(kVar2.getGroupName(), kVar2);
                                }
                                oVar3.f574a = oVar3.f574a;
                            }
                        }
                    } else {
                        nVar = nVar3;
                        r19 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = r19;
                    nVar3 = nVar;
                    r12 = 1;
                }
                if (!z4) {
                    this.f588L = a(oVar.f576c, oVar.f577d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(h3.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(h3.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public q(o oVar) {
        this.f591O = true;
        this.f592P = new float[9];
        this.f593Q = new Matrix();
        this.f594R = new Rect();
        this.f587K = oVar;
        this.f588L = a(oVar.f576c, oVar.f577d);
    }
}
