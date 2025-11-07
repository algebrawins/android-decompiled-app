package p;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class Y implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f4583a;

    public Y(SearchView searchView) {
        this.f4583a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int r22, KeyEvent keyEvent) {
        this.f4583a.o();
        return true;
    }
}
