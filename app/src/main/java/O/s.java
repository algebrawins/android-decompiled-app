package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.example.catering_inventory.R;
import f0.w;
import java.lang.reflect.Field;
import p.K;
import p.M;
import p.N;

/* loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: K  reason: collision with root package name */
    public final Context f4466K;

    /* renamed from: L  reason: collision with root package name */
    public final j f4467L;

    /* renamed from: M  reason: collision with root package name */
    public final h f4468M;

    /* renamed from: N  reason: collision with root package name */
    public final boolean f4469N;

    /* renamed from: O  reason: collision with root package name */
    public final int f4470O;

    /* renamed from: P  reason: collision with root package name */
    public final int f4471P;

    /* renamed from: Q  reason: collision with root package name */
    public final N f4472Q;

    /* renamed from: T  reason: collision with root package name */
    public m f4475T;

    /* renamed from: U  reason: collision with root package name */
    public View f4476U;

    /* renamed from: V  reason: collision with root package name */
    public View f4477V;

    /* renamed from: W  reason: collision with root package name */
    public o f4478W;

    /* renamed from: X  reason: collision with root package name */
    public ViewTreeObserver f4479X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f4480Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f4481Z;
    public int a0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f4483c0;

    /* renamed from: R  reason: collision with root package name */
    public final ViewTreeObserver$OnGlobalLayoutListenerC0397c f4473R = new ViewTreeObserver$OnGlobalLayoutListenerC0397c(this, 1);

    /* renamed from: S  reason: collision with root package name */
    public final d f4474S = new d(this, 1);

    /* renamed from: b0  reason: collision with root package name */
    public int f4482b0 = 0;

    /* JADX WARN: Type inference failed for: r6v1, types: [p.N, p.K] */
    public s(int r4, Context context, View view, j jVar, boolean z3) {
        this.f4466K = context;
        this.f4467L = jVar;
        this.f4469N = z3;
        this.f4468M = new h(jVar, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f4471P = r4;
        Resources resources = context.getResources();
        this.f4470O = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4476U = view;
        this.f4472Q = new K(context, r4);
        jVar.b(this, context);
    }

    @Override // o.p
    public final void a(j jVar, boolean z3) {
        if (jVar != this.f4467L) {
            return;
        }
        dismiss();
        o oVar = this.f4478W;
        if (oVar != null) {
            oVar.a(jVar, z3);
        }
    }

    @Override // o.p
    public final void b(o oVar) {
        this.f4478W = oVar;
    }

    @Override // o.r
    public final void d() {
        View view;
        boolean z3;
        Rect rect;
        if (!g()) {
            if (!this.f4480Y && (view = this.f4476U) != null) {
                this.f4477V = view;
                N n3 = this.f4472Q;
                n3.f4556e0.setOnDismissListener(this);
                n3.f4548V = this;
                n3.f4555d0 = true;
                n3.f4556e0.setFocusable(true);
                View view2 = this.f4477V;
                if (this.f4479X == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f4479X = viewTreeObserver;
                if (z3) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f4473R);
                }
                view2.addOnAttachStateChangeListener(this.f4474S);
                n3.f4547U = view2;
                n3.f4545S = this.f4482b0;
                boolean z4 = this.f4481Z;
                Context context = this.f4466K;
                h hVar = this.f4468M;
                if (!z4) {
                    this.a0 = l.m(hVar, context, this.f4470O);
                    this.f4481Z = true;
                }
                int r12 = this.a0;
                Drawable background = n3.f4556e0.getBackground();
                if (background != null) {
                    Rect rect2 = n3.f4553b0;
                    background.getPadding(rect2);
                    n3.f4539M = rect2.left + rect2.right + r12;
                } else {
                    n3.f4539M = r12;
                }
                n3.f4556e0.setInputMethodMode(2);
                Rect rect3 = this.f4454J;
                if (rect3 != null) {
                    rect = new Rect(rect3);
                } else {
                    rect = null;
                }
                n3.f4554c0 = rect;
                n3.d();
                M m3 = n3.f4538L;
                m3.setOnKeyListener(this);
                if (this.f4483c0) {
                    j jVar = this.f4467L;
                    if (jVar.f4418l != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m3, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(jVar.f4418l);
                        }
                        frameLayout.setEnabled(false);
                        m3.addHeaderView(frameLayout, null, false);
                    }
                }
                n3.b(hVar);
                n3.d();
                return;
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // o.r
    public final void dismiss() {
        if (g()) {
            this.f4472Q.dismiss();
        }
    }

    @Override // o.p
    public final boolean e() {
        return false;
    }

    @Override // o.p
    public final void f() {
        this.f4481Z = false;
        h hVar = this.f4468M;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // o.r
    public final boolean g() {
        if (!this.f4480Y && this.f4472Q.f4556e0.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // o.r
    public final ListView h() {
        return this.f4472Q.f4538L;
    }

    @Override // o.p
    public final boolean j(t tVar) {
        int r22;
        if (tVar.hasVisibleItems()) {
            View view = this.f4477V;
            n nVar = new n(this.f4471P, this.f4466K, view, tVar, this.f4469N);
            o oVar = this.f4478W;
            nVar.f4462h = oVar;
            l lVar = nVar.f4463i;
            if (lVar != null) {
                lVar.b(oVar);
            }
            boolean u3 = l.u(tVar);
            nVar.g = u3;
            l lVar2 = nVar.f4463i;
            if (lVar2 != null) {
                lVar2.o(u3);
            }
            nVar.f4464j = this.f4475T;
            this.f4475T = null;
            this.f4467L.c(false);
            N n3 = this.f4472Q;
            int r3 = n3.f4540N;
            if (!n3.f4542P) {
                r22 = 0;
            } else {
                r22 = n3.f4541O;
            }
            int r4 = this.f4482b0;
            View view2 = this.f4476U;
            Field field = w.f3200a;
            if ((Gravity.getAbsoluteGravity(r4, view2.getLayoutDirection()) & 7) == 5) {
                r3 += this.f4476U.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f4460e != null) {
                    nVar.d(r3, r22, true, true);
                }
            }
            o oVar2 = this.f4478W;
            if (oVar2 != null) {
                oVar2.f(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // o.l
    public final void n(View view) {
        this.f4476U = view;
    }

    @Override // o.l
    public final void o(boolean z3) {
        this.f4468M.f4403L = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4480Y = true;
        this.f4467L.c(true);
        ViewTreeObserver viewTreeObserver = this.f4479X;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4479X = this.f4477V.getViewTreeObserver();
            }
            this.f4479X.removeGlobalOnLayoutListener(this.f4473R);
            this.f4479X = null;
        }
        this.f4477V.removeOnAttachStateChangeListener(this.f4474S);
        m mVar = this.f4475T;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int r22, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && r22 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // o.l
    public final void p(int r12) {
        this.f4482b0 = r12;
    }

    @Override // o.l
    public final void q(int r22) {
        this.f4472Q.f4540N = r22;
    }

    @Override // o.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4475T = (m) onDismissListener;
    }

    @Override // o.l
    public final void s(boolean z3) {
        this.f4483c0 = z3;
    }

    @Override // o.l
    public final void t(int r22) {
        N n3 = this.f4472Q;
        n3.f4541O = r22;
        n3.f4542P = true;
    }

    @Override // o.l
    public final void l(j jVar) {
    }
}
