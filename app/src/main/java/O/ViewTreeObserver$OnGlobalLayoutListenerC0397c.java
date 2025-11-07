package o;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import p.N;

/* renamed from: o.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC0397c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f4365J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ l f4366K;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC0397c(l lVar, int r22) {
        this.f4365J = r22;
        this.f4366K = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f4365J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                g gVar = (g) this.f4366K;
                if (gVar.g()) {
                    ArrayList arrayList = gVar.f4383Q;
                    if (arrayList.size() > 0 && !((f) arrayList.get(0)).f4374a.f4555d0) {
                        View view = gVar.f4390X;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((f) it.next()).f4374a.d();
                            }
                            return;
                        }
                        gVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                s sVar = (s) this.f4366K;
                if (sVar.g()) {
                    N n3 = sVar.f4472Q;
                    if (!n3.f4555d0) {
                        View view2 = sVar.f4477V;
                        if (view2 != null && view2.isShown()) {
                            n3.d();
                            return;
                        } else {
                            sVar.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
