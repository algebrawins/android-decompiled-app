package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f2098J;

    public c(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f2098J = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f2098J;
        if (searchAutoComplete.f2021O) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f2021O = false;
        }
    }
}
