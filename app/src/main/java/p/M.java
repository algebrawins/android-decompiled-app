package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class M extends AbstractC0400B {

    /* renamed from: W  reason: collision with root package name */
    public final int f4557W;
    public final int a0;

    /* renamed from: b0  reason: collision with root package name */
    public L f4558b0;

    /* renamed from: c0  reason: collision with root package name */
    public o.k f4559c0;

    public M(Context context, boolean z3) {
        super(context, z3);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f4557W = 21;
            this.a0 = 22;
            return;
        }
        this.f4557W = 22;
        this.a0 = 21;
    }

    @Override // p.AbstractC0400B, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        o.h hVar;
        int r12;
        o.k kVar;
        int pointToPosition;
        int r22;
        if (this.f4558b0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                r12 = headerViewListAdapter.getHeadersCount();
                hVar = (o.h) headerViewListAdapter.getWrappedAdapter();
            } else {
                hVar = (o.h) adapter;
                r12 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (r22 = pointToPosition - r12) >= 0 && r22 < hVar.getCount()) {
                kVar = hVar.getItem(r22);
            } else {
                kVar = null;
            }
            o.k kVar2 = this.f4559c0;
            if (kVar2 != kVar) {
                o.j jVar = hVar.f4401J;
                if (kVar2 != null) {
                    this.f4558b0.c(jVar, kVar2);
                }
                this.f4559c0 = kVar;
                if (kVar != null) {
                    this.f4558b0.a(jVar, kVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r5, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && r5 == this.f4557W) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView != null && r5 == this.a0) {
            setSelection(-1);
            ((o.h) getAdapter()).f4401J.c(false);
            return true;
        } else {
            return super.onKeyDown(r5, keyEvent);
        }
    }

    public void setHoverListener(L l3) {
        this.f4558b0 = l3;
    }

    @Override // p.AbstractC0400B, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
