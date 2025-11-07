package A0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f0.C0256b;

/* loaded from: classes.dex */
public final class N extends C0256b {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f56d;

    public N(RecyclerView recyclerView) {
        this.f56d = recyclerView;
        new M(this);
    }

    @Override // f0.C0256b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.f56d.l()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().A(accessibilityEvent);
            }
        }
    }

    @Override // f0.C0256b
    public final void b(View view, g0.h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3177a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f3238a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f56d;
        if (!recyclerView.l() && recyclerView.getLayoutManager() != null) {
            z layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f163b;
            F f2 = recyclerView2.f2532J;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f163b.canScrollHorizontally(-1)) {
                accessibilityNodeInfo.addAction(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (layoutManager.f163b.canScrollVertically(1) || layoutManager.f163b.canScrollHorizontally(1)) {
                accessibilityNodeInfo.addAction(RecognitionOptions.AZTEC);
                accessibilityNodeInfo.setScrollable(true);
            }
            J j3 = recyclerView2.f2529G0;
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(f2, j3), layoutManager.q(f2, j3), false, 0));
        }
    }

    @Override // f0.C0256b
    public final boolean c(View view, int r5, Bundle bundle) {
        int r02;
        int s3;
        if (super.c(view, r5, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f56d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        z layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f163b;
        F f2 = recyclerView2.f2532J;
        if (r5 != 4096) {
            if (r5 != 8192) {
                s3 = 0;
                r02 = 0;
            } else {
                if (recyclerView2.canScrollVertically(-1)) {
                    r02 = -((layoutManager.g - layoutManager.u()) - layoutManager.r());
                } else {
                    r02 = 0;
                }
                if (layoutManager.f163b.canScrollHorizontally(-1)) {
                    s3 = -((layoutManager.f167f - layoutManager.s()) - layoutManager.t());
                }
                s3 = 0;
            }
        } else {
            if (recyclerView2.canScrollVertically(1)) {
                r02 = (layoutManager.g - layoutManager.u()) - layoutManager.r();
            } else {
                r02 = 0;
            }
            if (layoutManager.f163b.canScrollHorizontally(1)) {
                s3 = (layoutManager.f167f - layoutManager.s()) - layoutManager.t();
            }
            s3 = 0;
        }
        if (r02 == 0 && s3 == 0) {
            return false;
        }
        layoutManager.f163b.r(s3, r02);
        return true;
    }
}
