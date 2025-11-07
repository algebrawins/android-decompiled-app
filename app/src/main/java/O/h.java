package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: J  reason: collision with root package name */
    public final j f4401J;

    /* renamed from: K  reason: collision with root package name */
    public int f4402K = -1;

    /* renamed from: L  reason: collision with root package name */
    public boolean f4403L;

    /* renamed from: M  reason: collision with root package name */
    public final boolean f4404M;

    /* renamed from: N  reason: collision with root package name */
    public final LayoutInflater f4405N;

    /* renamed from: O  reason: collision with root package name */
    public final int f4406O;

    public h(j jVar, LayoutInflater layoutInflater, boolean z3, int r5) {
        this.f4404M = z3;
        this.f4405N = layoutInflater;
        this.f4401J = jVar;
        this.f4406O = r5;
        a();
    }

    public final void a() {
        j jVar = this.f4401J;
        k kVar = jVar.f4425s;
        if (kVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.f4416j;
            int size = arrayList.size();
            for (int r3 = 0; r3 < size; r3++) {
                if (((k) arrayList.get(r3)) == kVar) {
                    this.f4402K = r3;
                    return;
                }
            }
        }
        this.f4402K = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final k getItem(int r3) {
        ArrayList k3;
        j jVar = this.f4401J;
        if (this.f4404M) {
            jVar.i();
            k3 = jVar.f4416j;
        } else {
            k3 = jVar.k();
        }
        int r12 = this.f4402K;
        if (r12 >= 0 && r3 >= r12) {
            r3++;
        }
        return (k) k3.get(r3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k3;
        j jVar = this.f4401J;
        if (this.f4404M) {
            jVar.i();
            k3 = jVar.f4416j;
        } else {
            k3 = jVar.k();
        }
        if (this.f4402K < 0) {
            return k3.size();
        }
        return k3.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return r3;
    }

    @Override // android.widget.Adapter
    public final View getView(int r6, View view, ViewGroup viewGroup) {
        int r12;
        boolean z3 = false;
        if (view == null) {
            view = this.f4405N.inflate(this.f4406O, viewGroup, false);
        }
        int r8 = getItem(r6).f4430b;
        int r13 = r6 - 1;
        if (r13 >= 0) {
            r12 = getItem(r13).f4430b;
        } else {
            r12 = r8;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4401J.l() && r8 != r12) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        q qVar = (q) view;
        if (this.f4403L) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.b(getItem(r6));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
