package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.example.catering_inventory.R;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: J  reason: collision with root package name */
    public final int f2099J;

    /* renamed from: K  reason: collision with root package name */
    public final int f2100K;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2099J = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f2100K = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r22, int r3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f2099J * 2), this.f2100K), 1073741824), r3);
    }
}
