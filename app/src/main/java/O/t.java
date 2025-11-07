package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class t extends j implements SubMenu {

    /* renamed from: v  reason: collision with root package name */
    public final j f4484v;

    /* renamed from: w  reason: collision with root package name */
    public final k f4485w;

    public t(Context context, j jVar, k kVar) {
        super(context);
        this.f4484v = jVar;
        this.f4485w = kVar;
    }

    @Override // o.j
    public final boolean d(k kVar) {
        return this.f4484v.d(kVar);
    }

    @Override // o.j
    public final boolean e(j jVar, MenuItem menuItem) {
        super.e(jVar, menuItem);
        return this.f4484v.e(jVar, menuItem);
    }

    @Override // o.j
    public final boolean f(k kVar) {
        return this.f4484v.f(kVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4485w;
    }

    @Override // o.j
    public final j j() {
        return this.f4484v.j();
    }

    @Override // o.j
    public final boolean l() {
        return this.f4484v.l();
    }

    @Override // o.j
    public final boolean m() {
        return this.f4484v.m();
    }

    @Override // o.j
    public final boolean n() {
        return this.f4484v.n();
    }

    @Override // o.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f4484v.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4485w.setIcon(drawable);
        return this;
    }

    @Override // o.j, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f4484v.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int r3) {
        q(0, null, r3, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int r3) {
        q(r3, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int r22) {
        this.f4485w.setIcon(r22);
        return this;
    }
}
