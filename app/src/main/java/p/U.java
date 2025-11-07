package p;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class U implements TextWatcher {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ SearchView f4578J;

    public U(SearchView searchView) {
        this.f4578J = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int r3, int r4, int r5) {
        SearchView searchView = this.f4578J;
        Editable text = searchView.f1997b0.getText();
        searchView.f1990H0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.t(!isEmpty);
        int r02 = 8;
        if (searchView.f1989G0 && !searchView.f2018z0 && isEmpty) {
            searchView.f2002g0.setVisibility(8);
            r02 = 0;
        }
        searchView.f2004i0.setVisibility(r02);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int r22, int r3, int r4) {
    }
}
