package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ SearchView f2097J;

    public b(SearchView searchView) {
        this.f2097J = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int r9, KeyEvent keyEvent) {
        int length;
        SearchView searchView = this.f2097J;
        if (searchView.f1992K0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f1997b0;
        if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
            if (searchView.f1992K0 != null && searchView.f1983A0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (r9 != 66 && r9 != 84 && r9 != 61) {
                    if (r9 != 21 && r9 != 22) {
                        if (r9 == 19) {
                            searchAutoComplete.getListSelection();
                        }
                    } else {
                        if (r9 == 21) {
                            length = 0;
                        } else {
                            length = searchAutoComplete.length();
                        }
                        searchAutoComplete.setSelection(length);
                        searchAutoComplete.setListSelection(0);
                        searchAutoComplete.clearListSelection();
                        Method method = SearchView.P0.f659c;
                        if (method == null) {
                            return true;
                        }
                        try {
                            method.invoke(searchAutoComplete, Boolean.TRUE);
                            return true;
                        } catch (Exception unused) {
                            return true;
                        }
                    }
                } else {
                    searchView.l(searchAutoComplete.getListSelection());
                    return true;
                }
            }
            return false;
        } else if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || r9 != 66) {
            return false;
        } else {
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.h("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
    }
}
