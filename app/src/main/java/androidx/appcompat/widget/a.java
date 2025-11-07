package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ SearchView f2096J;

    public a(SearchView searchView) {
        this.f2096J = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String flattenToShortString;
        SearchView searchView = this.f2096J;
        ImageView imageView = searchView.f2001f0;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f1997b0;
        if (view == imageView) {
            searchView.u(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f2016x0;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
            }
        } else if (view == searchView.f2003h0) {
            searchView.k();
        } else if (view == searchView.f2002g0) {
            searchView.o();
        } else if (view == searchView.f2004i0) {
            SearchableInfo searchableInfo = searchView.f1992K0;
            if (searchableInfo != null) {
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.f2013t0);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        if (searchActivity == null) {
                            flattenToShortString = null;
                        } else {
                            flattenToShortString = searchActivity.flattenToShortString();
                        }
                        intent.putExtra("calling_package", flattenToShortString);
                        searchView.getContext().startActivity(intent);
                    } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.i(searchView.f2014u0, searchableInfo));
                    }
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        } else if (view == searchAutoComplete) {
            searchView.j();
        }
    }
}
