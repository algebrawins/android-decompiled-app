package t0;

import androidx.lifecycle.A;
import androidx.lifecycle.r;

/* renamed from: t0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458c implements A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DialogInterface$OnCancelListenerC0459d f4977a;

    public C0458c(DialogInterface$OnCancelListenerC0459d dialogInterface$OnCancelListenerC0459d) {
        this.f4977a = dialogInterface$OnCancelListenerC0459d;
    }

    @Override // androidx.lifecycle.A
    public final void a(Object obj) {
        if (((r) obj) != null) {
            DialogInterface$OnCancelListenerC0459d dialogInterface$OnCancelListenerC0459d = this.f4977a;
            if (dialogInterface$OnCancelListenerC0459d.f4979Z) {
                dialogInterface$OnCancelListenerC0459d.getClass();
                throw new IllegalStateException("Fragment " + dialogInterface$OnCancelListenerC0459d + " did not return a View from onCreateView() or this was called before onCreateView().");
            }
        }
    }
}
