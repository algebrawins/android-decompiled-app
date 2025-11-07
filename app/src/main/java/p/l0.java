package p;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class l0 implements View.OnClickListener {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f4654J = 0;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f4655K;

    public l0(q0 q0Var) {
        this.f4655K = q0Var;
        q0Var.f4679a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o.k kVar;
        switch (this.f4654J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                m0 m0Var = ((Toolbar) this.f4655K).f2090u0;
                if (m0Var == null) {
                    kVar = null;
                } else {
                    kVar = m0Var.f4660K;
                }
                if (kVar != null) {
                    kVar.collapseActionView();
                    return;
                }
                return;
            default:
                q0 q0Var = (q0) this.f4655K;
                if (q0Var.f4688k != null) {
                    q0Var.getClass();
                    return;
                }
                return;
        }
    }

    public l0(Toolbar toolbar) {
        this.f4655K = toolbar;
    }
}
