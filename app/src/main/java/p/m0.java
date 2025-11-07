package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import n.InterfaceC0354a;

/* loaded from: classes.dex */
public final class m0 implements o.p {

    /* renamed from: J  reason: collision with root package name */
    public o.j f4659J;

    /* renamed from: K  reason: collision with root package name */
    public o.k f4660K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Toolbar f4661L;

    public m0(Toolbar toolbar) {
        this.f4661L = toolbar;
    }

    @Override // o.p
    public final void c(Context context, o.j jVar) {
        o.k kVar;
        o.j jVar2 = this.f4659J;
        if (jVar2 != null && (kVar = this.f4660K) != null) {
            jVar2.d(kVar);
        }
        this.f4659J = jVar;
    }

    @Override // o.p
    public final boolean e() {
        return false;
    }

    @Override // o.p
    public final void f() {
        if (this.f4660K != null) {
            o.j jVar = this.f4659J;
            if (jVar != null) {
                int size = jVar.f4413f.size();
                for (int r12 = 0; r12 < size; r12++) {
                    if (this.f4659J.getItem(r12) == this.f4660K) {
                        return;
                    }
                }
            }
            k(this.f4660K);
        }
    }

    @Override // o.p
    public final boolean i(o.k kVar) {
        Toolbar toolbar = this.f4661L;
        toolbar.c();
        ViewParent parent = toolbar.f2066Q.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2066Q);
            }
            toolbar.addView(toolbar.f2066Q);
        }
        View view = kVar.f4453z;
        if (view == null) {
            view = null;
        }
        toolbar.f2067R = view;
        this.f4660K = kVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2067R);
            }
            n0 g = Toolbar.g();
            g.f4668a = (toolbar.f2072W & 112) | 8388611;
            g.f4669b = 2;
            toolbar.f2067R.setLayoutParams(g);
            toolbar.addView(toolbar.f2067R);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((n0) childAt.getLayoutParams()).f4669b != 2 && childAt != toolbar.f2059J) {
                toolbar.removeViewAt(childCount);
                toolbar.f2086q0.add(childAt);
            }
        }
        toolbar.requestLayout();
        kVar.f4428B = true;
        kVar.f4441n.o(false);
        View view2 = toolbar.f2067R;
        if (view2 instanceof InterfaceC0354a) {
            SearchView searchView = (SearchView) ((InterfaceC0354a) view2);
            if (!searchView.f1991I0) {
                searchView.f1991I0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f1997b0;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.J0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        return true;
    }

    @Override // o.p
    public final boolean j(o.t tVar) {
        return false;
    }

    @Override // o.p
    public final boolean k(o.k kVar) {
        Toolbar toolbar = this.f4661L;
        View view = toolbar.f2067R;
        if (view instanceof InterfaceC0354a) {
            SearchView searchView = (SearchView) ((InterfaceC0354a) view);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1997b0;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f1990H0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.J0);
            searchView.f1991I0 = false;
        }
        toolbar.removeView(toolbar.f2067R);
        toolbar.removeView(toolbar.f2066Q);
        toolbar.f2067R = null;
        ArrayList arrayList = toolbar.f2086q0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f4660K = null;
        toolbar.requestLayout();
        kVar.f4428B = false;
        kVar.f4441n.o(false);
        return true;
    }

    @Override // o.p
    public final void a(o.j jVar, boolean z3) {
    }
}
