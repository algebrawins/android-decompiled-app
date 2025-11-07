package p;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.example.catering_inventory.R;

/* loaded from: classes.dex */
public final class X implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f4582a;

    public X(SearchView searchView) {
        this.f4582a = searchView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int r22, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        int r32;
        int r62;
        SearchView searchView = this.f4582a;
        View view2 = searchView.j0;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f1999d0.getPaddingLeft();
            Rect rect = new Rect();
            boolean a4 = w0.a(searchView);
            if (searchView.f2017y0) {
                r32 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            } else {
                r32 = 0;
            }
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1997b0;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            if (a4) {
                r62 = -rect.left;
            } else {
                r62 = paddingLeft - (rect.left + r32);
            }
            searchAutoComplete.setDropDownHorizontalOffset(r62);
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + r32) - paddingLeft);
        }
    }
}
