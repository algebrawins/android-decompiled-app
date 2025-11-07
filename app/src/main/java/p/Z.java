package p;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class Z implements AdapterView.OnItemClickListener {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ SearchView f4584J;

    public Z(SearchView searchView) {
        this.f4584J = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int r3, long j3) {
        this.f4584J.l(r3);
    }
}
