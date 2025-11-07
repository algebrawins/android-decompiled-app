package A0;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0256b;

/* loaded from: classes.dex */
public final class M extends C0256b {

    /* renamed from: d  reason: collision with root package name */
    public final N f55d;

    public M(N n3) {
        this.f55d = n3;
    }

    @Override // f0.C0256b
    public final void b(View view, g0.h hVar) {
        this.f3177a.onInitializeAccessibilityNodeInfo(view, hVar.f3238a);
        N n3 = this.f55d;
        if (!n3.f56d.l()) {
            RecyclerView recyclerView = n3.f56d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().getClass();
                RecyclerView.j(view);
            }
        }
    }

    @Override // f0.C0256b
    public final boolean c(View view, int r22, Bundle bundle) {
        if (super.c(view, r22, bundle)) {
            return true;
        }
        N n3 = this.f55d;
        if (!n3.f56d.l()) {
            RecyclerView recyclerView = n3.f56d;
            if (recyclerView.getLayoutManager() != null) {
                F f2 = recyclerView.getLayoutManager().f163b.f2532J;
            }
        }
        return false;
    }
}
