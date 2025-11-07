package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class l implements r, p, AdapterView.OnItemClickListener {

    /* renamed from: J  reason: collision with root package name */
    public Rect f4454J;

    public static int m(ListAdapter listAdapter, Context context, int r12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int r5 = 0;
        int r6 = 0;
        for (int r02 = 0; r02 < count; r02++) {
            int itemViewType = listAdapter.getItemViewType(r02);
            if (itemViewType != r6) {
                view = null;
                r6 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(r02, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= r12) {
                return r12;
            }
            if (measuredWidth > r5) {
                r5 = measuredWidth;
            }
        }
        return r5;
    }

    public static boolean u(j jVar) {
        int size = jVar.f4413f.size();
        for (int r22 = 0; r22 < size; r22++) {
            MenuItem item = jVar.getItem(r22);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // o.p
    public final boolean i(k kVar) {
        return false;
    }

    @Override // o.p
    public final boolean k(k kVar) {
        return false;
    }

    public abstract void l(j jVar);

    public abstract void n(View view);

    public abstract void o(boolean z3);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int r3, long j3) {
        h hVar;
        int r32;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            hVar = (h) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            hVar = (h) listAdapter;
        }
        j jVar = hVar.f4401J;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(r3);
        if (!(this instanceof g)) {
            r32 = 0;
        } else {
            r32 = 4;
        }
        jVar.p(menuItem, this, r32);
    }

    public abstract void p(int r12);

    public abstract void q(int r12);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z3);

    public abstract void t(int r12);

    @Override // o.p
    public final void c(Context context, j jVar) {
    }
}
