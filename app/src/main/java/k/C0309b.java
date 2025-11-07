package k;

import R.l;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;

/* renamed from: k.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309b extends Drawable.ConstantState {

    /* renamed from: A  reason: collision with root package name */
    public boolean f3897A;

    /* renamed from: B  reason: collision with root package name */
    public ColorFilter f3898B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f3899C;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f3900D;

    /* renamed from: E  reason: collision with root package name */
    public PorterDuff.Mode f3901E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f3902F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f3903G;

    /* renamed from: H  reason: collision with root package name */
    public int[][] f3904H;

    /* renamed from: I  reason: collision with root package name */
    public R.e f3905I;

    /* renamed from: J  reason: collision with root package name */
    public l f3906J;

    /* renamed from: a  reason: collision with root package name */
    public final C0312e f3907a;

    /* renamed from: b  reason: collision with root package name */
    public Resources f3908b;

    /* renamed from: c  reason: collision with root package name */
    public int f3909c;

    /* renamed from: d  reason: collision with root package name */
    public int f3910d;

    /* renamed from: e  reason: collision with root package name */
    public int f3911e;

    /* renamed from: f  reason: collision with root package name */
    public SparseArray f3912f;
    public Drawable[] g;

    /* renamed from: h  reason: collision with root package name */
    public int f3913h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3914i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3915j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f3916k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3917l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3918m;

    /* renamed from: n  reason: collision with root package name */
    public int f3919n;

    /* renamed from: o  reason: collision with root package name */
    public int f3920o;

    /* renamed from: p  reason: collision with root package name */
    public int f3921p;

    /* renamed from: q  reason: collision with root package name */
    public int f3922q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3923r;

    /* renamed from: s  reason: collision with root package name */
    public int f3924s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3925t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3926u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3927v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3928w;

    /* renamed from: x  reason: collision with root package name */
    public int f3929x;

    /* renamed from: y  reason: collision with root package name */
    public int f3930y;

    /* renamed from: z  reason: collision with root package name */
    public int f3931z;

    public C0309b(C0309b c0309b, C0312e c0312e, Resources resources) {
        Resources resources2;
        int r6;
        this.f3909c = 160;
        this.f3914i = false;
        this.f3917l = false;
        this.f3928w = true;
        this.f3930y = 0;
        this.f3931z = 0;
        this.f3907a = c0312e;
        if (resources != null) {
            resources2 = resources;
        } else if (c0309b != null) {
            resources2 = c0309b.f3908b;
        } else {
            resources2 = null;
        }
        this.f3908b = resources2;
        if (c0309b != null) {
            r6 = c0309b.f3909c;
        } else {
            r6 = 0;
        }
        int r3 = AbstractC0313f.f3943V;
        r6 = resources != null ? resources.getDisplayMetrics().densityDpi : r6;
        int r22 = r6 != 0 ? r6 : 160;
        this.f3909c = r22;
        if (c0309b != null) {
            this.f3910d = c0309b.f3910d;
            this.f3911e = c0309b.f3911e;
            this.f3926u = true;
            this.f3927v = true;
            this.f3914i = c0309b.f3914i;
            this.f3917l = c0309b.f3917l;
            this.f3928w = c0309b.f3928w;
            this.f3929x = c0309b.f3929x;
            this.f3930y = c0309b.f3930y;
            this.f3931z = c0309b.f3931z;
            this.f3897A = c0309b.f3897A;
            this.f3898B = c0309b.f3898B;
            this.f3899C = c0309b.f3899C;
            this.f3900D = c0309b.f3900D;
            this.f3901E = c0309b.f3901E;
            this.f3902F = c0309b.f3902F;
            this.f3903G = c0309b.f3903G;
            if (c0309b.f3909c == r22) {
                if (c0309b.f3915j) {
                    this.f3916k = new Rect(c0309b.f3916k);
                    this.f3915j = true;
                }
                if (c0309b.f3918m) {
                    this.f3919n = c0309b.f3919n;
                    this.f3920o = c0309b.f3920o;
                    this.f3921p = c0309b.f3921p;
                    this.f3922q = c0309b.f3922q;
                    this.f3918m = true;
                }
            }
            if (c0309b.f3923r) {
                this.f3924s = c0309b.f3924s;
                this.f3923r = true;
            }
            if (c0309b.f3925t) {
                this.f3925t = true;
            }
            Drawable[] drawableArr = c0309b.g;
            this.g = new Drawable[drawableArr.length];
            this.f3913h = c0309b.f3913h;
            SparseArray sparseArray = c0309b.f3912f;
            if (sparseArray != null) {
                this.f3912f = sparseArray.clone();
            } else {
                this.f3912f = new SparseArray(this.f3913h);
            }
            int r7 = this.f3913h;
            for (int r12 = 0; r12 < r7; r12++) {
                Drawable drawable = drawableArr[r12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f3912f.put(r12, constantState);
                    } else {
                        this.g[r12] = drawableArr[r12];
                    }
                }
            }
        } else {
            this.g = new Drawable[10];
            this.f3913h = 0;
        }
        if (c0309b != null) {
            this.f3904H = c0309b.f3904H;
        } else {
            this.f3904H = new int[this.g.length];
        }
        if (c0309b != null) {
            this.f3905I = c0309b.f3905I;
            this.f3906J = c0309b.f3906J;
            return;
        }
        this.f3905I = new R.e();
        this.f3906J = new l();
    }

    public final int a(Drawable drawable) {
        int r02 = this.f3913h;
        if (r02 >= this.g.length) {
            int r12 = r02 + 10;
            Drawable[] drawableArr = new Drawable[r12];
            System.arraycopy(this.g, 0, drawableArr, 0, r02);
            this.g = drawableArr;
            int[][] r13 = new int[r12];
            System.arraycopy(this.f3904H, 0, r13, 0, r02);
            this.f3904H = r13;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f3907a);
        this.g[r02] = drawable;
        this.f3913h++;
        this.f3911e = drawable.getChangingConfigurations() | this.f3911e;
        this.f3923r = false;
        this.f3925t = false;
        this.f3916k = null;
        this.f3915j = false;
        this.f3918m = false;
        this.f3926u = false;
        return r02;
    }

    public final void b() {
        this.f3918m = true;
        c();
        int r02 = this.f3913h;
        Drawable[] drawableArr = this.g;
        this.f3920o = -1;
        this.f3919n = -1;
        this.f3922q = 0;
        this.f3921p = 0;
        for (int r22 = 0; r22 < r02; r22++) {
            Drawable drawable = drawableArr[r22];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f3919n) {
                this.f3919n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f3920o) {
                this.f3920o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f3921p) {
                this.f3921p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f3922q) {
                this.f3922q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f3912f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int r12 = 0; r12 < size; r12++) {
                int keyAt = this.f3912f.keyAt(r12);
                Drawable[] drawableArr = this.g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f3912f.valueAt(r12)).newDrawable(this.f3908b);
                if (Build.VERSION.SDK_INT >= 23) {
                    newDrawable.setLayoutDirection(this.f3929x);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f3907a);
                drawableArr[keyAt] = mutate;
            }
            this.f3912f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int r02 = this.f3913h;
        Drawable[] drawableArr = this.g;
        for (int r3 = 0; r3 < r02; r3++) {
            Drawable drawable = drawableArr[r3];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f3912f.get(r3);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int r6) {
        int indexOfKey;
        Drawable drawable = this.g[r6];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f3912f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(r6)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f3912f.valueAt(indexOfKey)).newDrawable(this.f3908b);
        if (Build.VERSION.SDK_INT >= 23) {
            newDrawable.setLayoutDirection(this.f3929x);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f3907a);
        this.g[r6] = mutate;
        this.f3912f.removeAt(indexOfKey);
        if (this.f3912f.size() == 0) {
            this.f3912f = null;
        }
        return mutate;
    }

    public final int e(int[] r5) {
        int[][] r02 = this.f3904H;
        int r12 = this.f3913h;
        for (int r22 = 0; r22 < r12; r22++) {
            if (StateSet.stateSetMatches(r02[r22], r5)) {
                return r22;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3910d | this.f3911e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0312e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0312e(this, resources);
    }
}
