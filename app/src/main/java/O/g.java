package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.example.catering_inventory.R;
import d2.C0235c;
import f0.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p.K;
import p.M;
import p.N;

/* loaded from: classes.dex */
public final class g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: K  reason: collision with root package name */
    public final Context f4377K;

    /* renamed from: L  reason: collision with root package name */
    public final int f4378L;

    /* renamed from: M  reason: collision with root package name */
    public final int f4379M;

    /* renamed from: N  reason: collision with root package name */
    public final boolean f4380N;

    /* renamed from: O  reason: collision with root package name */
    public final Handler f4381O;

    /* renamed from: W  reason: collision with root package name */
    public View f4389W;

    /* renamed from: X  reason: collision with root package name */
    public View f4390X;

    /* renamed from: Y  reason: collision with root package name */
    public int f4391Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f4392Z;
    public boolean a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f4393b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f4394c0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f4396e0;

    /* renamed from: f0  reason: collision with root package name */
    public o f4397f0;

    /* renamed from: g0  reason: collision with root package name */
    public ViewTreeObserver f4398g0;

    /* renamed from: h0  reason: collision with root package name */
    public m f4399h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f4400i0;

    /* renamed from: P  reason: collision with root package name */
    public final ArrayList f4382P = new ArrayList();

    /* renamed from: Q  reason: collision with root package name */
    public final ArrayList f4383Q = new ArrayList();

    /* renamed from: R  reason: collision with root package name */
    public final ViewTreeObserver$OnGlobalLayoutListenerC0397c f4384R = new ViewTreeObserver$OnGlobalLayoutListenerC0397c(this, 0);

    /* renamed from: S  reason: collision with root package name */
    public final d f4385S = new d(this, 0);

    /* renamed from: T  reason: collision with root package name */
    public final C0235c f4386T = new C0235c(9, this);

    /* renamed from: U  reason: collision with root package name */
    public int f4387U = 0;

    /* renamed from: V  reason: collision with root package name */
    public int f4388V = 0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f4395d0 = false;

    public g(Context context, View view, int r6, boolean z3) {
        this.f4377K = context;
        this.f4389W = view;
        this.f4379M = r6;
        this.f4380N = z3;
        Field field = w.f3200a;
        this.f4391Y = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f4378L = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4381O = new Handler();
    }

    @Override // o.p
    public final void a(j jVar, boolean z3) {
        int r4;
        ArrayList arrayList = this.f4383Q;
        int size = arrayList.size();
        int r42 = 0;
        while (true) {
            if (r42 < size) {
                if (jVar == ((f) arrayList.get(r42)).f4375b) {
                    break;
                }
                r42++;
            } else {
                r42 = -1;
                break;
            }
        }
        if (r42 < 0) {
            return;
        }
        int r22 = r42 + 1;
        if (r22 < arrayList.size()) {
            ((f) arrayList.get(r22)).f4375b.c(false);
        }
        f fVar = (f) arrayList.remove(r42);
        CopyOnWriteArrayList copyOnWriteArrayList = fVar.f4375b.f4424r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z4 = this.f4400i0;
        N n3 = fVar.f4374a;
        if (z4) {
            if (Build.VERSION.SDK_INT >= 23) {
                n3.f4556e0.setExitTransition(null);
            }
            n3.f4556e0.setAnimationStyle(0);
        }
        n3.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4391Y = ((f) arrayList.get(size2 - 1)).f4376c;
        } else {
            View view = this.f4389W;
            Field field = w.f3200a;
            if (view.getLayoutDirection() == 1) {
                r4 = 0;
            } else {
                r4 = 1;
            }
            this.f4391Y = r4;
        }
        if (size2 == 0) {
            dismiss();
            o oVar = this.f4397f0;
            if (oVar != null) {
                oVar.a(jVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.f4398g0;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f4398g0.removeGlobalOnLayoutListener(this.f4384R);
                }
                this.f4398g0 = null;
            }
            this.f4390X.removeOnAttachStateChangeListener(this.f4385S);
            this.f4399h0.onDismiss();
        } else if (z3) {
            ((f) arrayList.get(0)).f4375b.c(false);
        }
    }

    @Override // o.p
    public final void b(o oVar) {
        this.f4397f0 = oVar;
    }

    @Override // o.r
    public final void d() {
        boolean z3;
        if (g()) {
            return;
        }
        ArrayList arrayList = this.f4382P;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((j) it.next());
        }
        arrayList.clear();
        View view = this.f4389W;
        this.f4390X = view;
        if (view != null) {
            if (this.f4398g0 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4398g0 = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4384R);
            }
            this.f4390X.addOnAttachStateChangeListener(this.f4385S);
        }
    }

    @Override // o.r
    public final void dismiss() {
        ArrayList arrayList = this.f4383Q;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int r12 = size - 1; r12 >= 0; r12--) {
                f fVar = fVarArr[r12];
                if (fVar.f4374a.f4556e0.isShowing()) {
                    fVar.f4374a.dismiss();
                }
            }
        }
    }

    @Override // o.p
    public final boolean e() {
        return false;
    }

    @Override // o.p
    public final void f() {
        Iterator it = this.f4383Q.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((f) it.next()).f4374a.f4538L.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.r
    public final boolean g() {
        ArrayList arrayList = this.f4383Q;
        if (arrayList.size() <= 0 || !((f) arrayList.get(0)).f4374a.f4556e0.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // o.r
    public final ListView h() {
        ArrayList arrayList = this.f4383Q;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f4374a.f4538L;
    }

    @Override // o.p
    public final boolean j(t tVar) {
        Iterator it = this.f4383Q.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (tVar == fVar.f4375b) {
                fVar.f4374a.f4538L.requestFocus();
                return true;
            }
        }
        if (tVar.hasVisibleItems()) {
            l(tVar);
            o oVar = this.f4397f0;
            if (oVar != null) {
                oVar.f(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // o.l
    public final void l(j jVar) {
        jVar.b(this, this.f4377K);
        if (g()) {
            v(jVar);
        } else {
            this.f4382P.add(jVar);
        }
    }

    @Override // o.l
    public final void n(View view) {
        if (this.f4389W != view) {
            this.f4389W = view;
            int r02 = this.f4387U;
            Field field = w.f3200a;
            this.f4388V = Gravity.getAbsoluteGravity(r02, view.getLayoutDirection());
        }
    }

    @Override // o.l
    public final void o(boolean z3) {
        this.f4395d0 = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f4383Q;
        int size = arrayList.size();
        int r3 = 0;
        while (true) {
            if (r3 < size) {
                fVar = (f) arrayList.get(r3);
                if (!fVar.f4374a.f4556e0.isShowing()) {
                    break;
                }
                r3++;
            } else {
                fVar = null;
                break;
            }
        }
        if (fVar != null) {
            fVar.f4375b.c(false);
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
    public final void p(int r3) {
        if (this.f4387U != r3) {
            this.f4387U = r3;
            View view = this.f4389W;
            Field field = w.f3200a;
            this.f4388V = Gravity.getAbsoluteGravity(r3, view.getLayoutDirection());
        }
    }

    @Override // o.l
    public final void q(int r22) {
        this.f4392Z = true;
        this.f4393b0 = r22;
    }

    @Override // o.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4399h0 = (m) onDismissListener;
    }

    @Override // o.l
    public final void s(boolean z3) {
        this.f4396e0 = z3;
    }

    @Override // o.l
    public final void t(int r22) {
        this.a0 = true;
        this.f4394c0 = r22;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [p.N, p.K] */
    public final void v(j jVar) {
        View view;
        f fVar;
        Rect rect;
        int r3;
        boolean z3;
        char c4;
        int r12;
        int r32;
        int r122;
        MenuItem menuItem;
        h hVar;
        int r13;
        int r22;
        int firstVisiblePosition;
        Context context = this.f4377K;
        LayoutInflater from = LayoutInflater.from(context);
        h hVar2 = new h(jVar, from, this.f4380N, R.layout.abc_cascading_menu_item_layout);
        if (!g() && this.f4395d0) {
            hVar2.f4403L = true;
        } else if (g()) {
            hVar2.f4403L = l.u(jVar);
        }
        int m3 = l.m(hVar2, context, this.f4378L);
        ?? k3 = new K(context, this.f4379M);
        p.r rVar = k3.f4556e0;
        k3.f4560i0 = this.f4386T;
        k3.f4548V = this;
        rVar.setOnDismissListener(this);
        k3.f4547U = this.f4389W;
        k3.f4545S = this.f4388V;
        k3.f4555d0 = true;
        rVar.setFocusable(true);
        rVar.setInputMethodMode(2);
        k3.b(hVar2);
        Drawable background = rVar.getBackground();
        if (background != null) {
            Rect rect2 = k3.f4553b0;
            background.getPadding(rect2);
            k3.f4539M = rect2.left + rect2.right + m3;
        } else {
            k3.f4539M = m3;
        }
        k3.f4545S = this.f4388V;
        ArrayList arrayList = this.f4383Q;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            j jVar2 = fVar.f4375b;
            int size = jVar2.f4413f.size();
            int r14 = 0;
            while (true) {
                if (r14 < size) {
                    menuItem = jVar2.getItem(r14);
                    if (menuItem.hasSubMenu() && jVar == menuItem.getSubMenu()) {
                        break;
                    }
                    r14++;
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem != null) {
                M m4 = fVar.f4374a.f4538L;
                ListAdapter adapter = m4.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    r13 = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    r13 = 0;
                }
                int count = hVar.getCount();
                int r9 = 0;
                while (true) {
                    if (r9 < count) {
                        if (menuItem == hVar.getItem(r9)) {
                            r22 = -1;
                            break;
                        }
                        r9++;
                    } else {
                        r22 = -1;
                        r9 = -1;
                        break;
                    }
                }
                if (r9 != r22 && (firstVisiblePosition = (r9 + r13) - m4.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m4.getChildCount()) {
                    view = m4.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            view = null;
            fVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT > 28) {
                rVar.setTouchModal(false);
            } else {
                Method method = N.j0;
                if (method != null) {
                    try {
                        method.invoke(rVar, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            }
            int r92 = Build.VERSION.SDK_INT;
            if (r92 >= 23) {
                rVar.setEnterTransition(null);
            }
            M m5 = ((f) arrayList.get(arrayList.size() - 1)).f4374a.f4538L;
            int[] r123 = new int[2];
            m5.getLocationOnScreen(r123);
            Rect rect3 = new Rect();
            this.f4390X.getWindowVisibleDisplayFrame(rect3);
            if (this.f4391Y != 1 ? r123[0] - m3 >= 0 : m5.getWidth() + r123[0] + m3 > rect3.right) {
                r3 = 0;
            } else {
                r3 = 1;
            }
            if (r3 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f4391Y = r3;
            if (r92 >= 26) {
                k3.f4547U = view;
                r32 = 0;
                r12 = 0;
            } else {
                int[] r93 = new int[2];
                this.f4389W.getLocationOnScreen(r93);
                int[] r33 = new int[2];
                view.getLocationOnScreen(r33);
                if ((this.f4388V & 7) == 5) {
                    c4 = 0;
                    r93[0] = this.f4389W.getWidth() + r93[0];
                    r33[0] = view.getWidth() + r33[0];
                } else {
                    c4 = 0;
                }
                r12 = r33[c4] - r93[c4];
                r32 = r33[1] - r93[1];
            }
            if ((this.f4388V & 5) == 5) {
                if (z3) {
                    r122 = r12 + m3;
                } else {
                    r122 = r12 - view.getWidth();
                }
            } else if (z3) {
                r122 = r12 + view.getWidth();
            } else {
                r122 = r12 - m3;
            }
            k3.f4540N = r122;
            k3.f4544R = true;
            k3.f4543Q = true;
            k3.f4541O = r32;
            k3.f4542P = true;
        } else {
            if (this.f4392Z) {
                k3.f4540N = this.f4393b0;
            }
            if (this.a0) {
                k3.f4541O = this.f4394c0;
                k3.f4542P = true;
            }
            Rect rect4 = this.f4454J;
            if (rect4 != null) {
                rect = new Rect(rect4);
            } else {
                rect = null;
            }
            k3.f4554c0 = rect;
        }
        arrayList.add(new f(k3, jVar, this.f4391Y));
        k3.d();
        M m6 = k3.f4538L;
        m6.setOnKeyListener(this);
        if (fVar == null && this.f4396e0 && jVar.f4418l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) m6, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(jVar.f4418l);
            m6.addHeaderView(frameLayout, null, false);
            k3.d();
        }
    }
}
