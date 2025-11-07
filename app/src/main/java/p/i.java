package p;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class I implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K f4531a;

    public I(K k3) {
        this.f4531a = k3;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int r3) {
        if (r3 == 1) {
            K k3 = this.f4531a;
            if (k3.f4556e0.getInputMethodMode() != 2 && k3.f4556e0.getContentView() != null) {
                Handler handler = k3.a0;
                H h3 = k3.f4549W;
                handler.removeCallbacks(h3);
                h3.run();
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int r22, int r3, int r4) {
    }
}
