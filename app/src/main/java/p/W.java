package p;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class W implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f4581a;

    public W(SearchView searchView) {
        this.f4581a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        SearchView searchView = this.f4581a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.w0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z3);
        }
    }
}
