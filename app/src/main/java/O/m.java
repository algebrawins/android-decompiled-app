package o;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class m implements PopupWindow.OnDismissListener {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ n f4455J;

    public m(n nVar) {
        this.f4455J = nVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4455J.c();
    }
}
