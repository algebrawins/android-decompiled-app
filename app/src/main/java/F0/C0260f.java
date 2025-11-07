package f0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: f0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260f {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f3187a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f3188b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f3189c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3190d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f3191e;

    public C0260f(ViewGroup viewGroup) {
        this.f3189c = viewGroup;
    }

    public final boolean a(float f2, float f4, boolean z3) {
        ViewParent e4;
        if (!this.f3190d || (e4 = e(0)) == null) {
            return false;
        }
        try {
            return AbstractC0253B.a(e4, this.f3189c, f2, f4, z3);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedFling", e5);
            return false;
        }
    }

    public final boolean b(float f2, float f4) {
        ViewParent e4;
        if (!this.f3190d || (e4 = e(0)) == null) {
            return false;
        }
        try {
            return AbstractC0253B.b(e4, this.f3189c, f2, f4);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedPreFling", e5);
            return false;
        }
    }

    public final boolean c(int r8, int r9, int[] r10, int[] r11, int r12) {
        ViewParent e4;
        int r4;
        int r5;
        if (!this.f3190d || (e4 = e(r12)) == null) {
            return false;
        }
        if (r8 == 0 && r9 == 0) {
            if (r11 == null) {
                return false;
            }
            r11[0] = 0;
            r11[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f3189c;
        if (r11 != null) {
            viewGroup.getLocationInWindow(r11);
            r4 = r11[0];
            r5 = r11[1];
        } else {
            r4 = 0;
            r5 = 0;
        }
        if (r10 == null) {
            if (this.f3191e == null) {
                this.f3191e = new int[2];
            }
            r10 = this.f3191e;
        }
        r10[0] = 0;
        r10[1] = 0;
        if (e4 instanceof InterfaceC0261g) {
            ((InterfaceC0261g) e4).d(r8, r9, r10, r12);
        } else if (r12 == 0) {
            try {
                AbstractC0253B.c(e4, viewGroup, r8, r9, r10);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedPreScroll", e5);
            }
        }
        if (r11 != null) {
            viewGroup.getLocationInWindow(r11);
            r11[0] = r11[0] - r4;
            r11[1] = r11[1] - r5;
        }
        if (r10[0] == 0 && r10[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int r17, int r18, int r19, int r20, int[] r21, int r22, int[] r23) {
        ViewParent e4;
        int r14;
        int r15;
        int[] r9;
        if (!this.f3190d || (e4 = e(r22)) == null) {
            return false;
        }
        if (r17 == 0 && r18 == 0 && r19 == 0 && r20 == 0) {
            if (r21 != null) {
                r21[0] = 0;
                r21[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f3189c;
        if (r21 != null) {
            viewGroup.getLocationInWindow(r21);
            r14 = r21[0];
            r15 = r21[1];
        } else {
            r14 = 0;
            r15 = 0;
        }
        if (r23 == null) {
            if (this.f3191e == null) {
                this.f3191e = new int[2];
            }
            int[] r24 = this.f3191e;
            r24[0] = 0;
            r24[1] = 0;
            r9 = r24;
        } else {
            r9 = r23;
        }
        if (e4 instanceof InterfaceC0262h) {
            ((InterfaceC0262h) e4).e(viewGroup, r17, r18, r19, r20, r22, r9);
        } else {
            r9[0] = r9[0] + r19;
            r9[1] = r9[1] + r20;
            if (e4 instanceof InterfaceC0261g) {
                ((InterfaceC0261g) e4).b(viewGroup, r17, r18, r19, r20, r22);
            } else if (r22 == 0) {
                try {
                    AbstractC0253B.d(e4, viewGroup, r17, r18, r19, r20);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedScroll", e5);
                }
            }
        }
        if (r21 != null) {
            viewGroup.getLocationInWindow(r21);
            r21[0] = r21[0] - r14;
            r21[1] = r21[1] - r15;
        }
        return true;
    }

    public final ViewParent e(int r22) {
        if (r22 != 0) {
            if (r22 != 1) {
                return null;
            }
            return this.f3188b;
        }
        return this.f3187a;
    }

    public final boolean f(int r12) {
        if (e(r12) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int r12, int r13) {
        boolean f2;
        if (f(r13)) {
            return true;
        }
        if (this.f3190d) {
            View view = this.f3189c;
            ViewParent parent = view.getParent();
            View view2 = view;
            while (parent != null) {
                boolean z3 = parent instanceof InterfaceC0261g;
                if (z3) {
                    f2 = ((InterfaceC0261g) parent).f(view2, view, r12, r13);
                } else {
                    if (r13 == 0) {
                        try {
                            f2 = AbstractC0253B.f(parent, view2, view, r12);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                        }
                    }
                    f2 = false;
                }
                if (f2) {
                    if (r13 != 0) {
                        if (r13 == 1) {
                            this.f3188b = parent;
                        }
                    } else {
                        this.f3187a = parent;
                    }
                    if (z3) {
                        ((InterfaceC0261g) parent).a(view2, view, r12, r13);
                    } else if (r13 == 0) {
                        try {
                            AbstractC0253B.e(parent, view2, view, r12);
                        } catch (AbstractMethodError e5) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e5);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
                parent = parent.getParent();
                view2 = view2;
            }
        }
        return false;
    }

    public final void h(int r5) {
        ViewParent e4 = e(r5);
        if (e4 != null) {
            boolean z3 = e4 instanceof InterfaceC0261g;
            ViewGroup viewGroup = this.f3189c;
            if (z3) {
                ((InterfaceC0261g) e4).c(viewGroup, r5);
            } else if (r5 == 0) {
                try {
                    AbstractC0253B.g(e4, viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (r5 != 0) {
                if (r5 == 1) {
                    this.f3188b = null;
                    return;
                }
                return;
            }
            this.f3187a = null;
        }
    }
}
