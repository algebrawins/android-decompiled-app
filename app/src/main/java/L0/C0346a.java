package l0;

import android.database.DataSetObserver;
import com.google.android.libraries.barhopper.RecognitionOptions;
import p.K;
import p.g0;

/* renamed from: l0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346a extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4092a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4093b;

    public /* synthetic */ C0346a(int r12, Object obj) {
        this.f4092a = r12;
        this.f4093b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f4092a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                g0 g0Var = (g0) this.f4093b;
                g0Var.f4094J = true;
                g0Var.notifyDataSetChanged();
                return;
            default:
                K k3 = (K) this.f4093b;
                if (k3.f4556e0.isShowing()) {
                    k3.d();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f4092a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                g0 g0Var = (g0) this.f4093b;
                g0Var.f4094J = false;
                g0Var.notifyDataSetInvalidated();
                return;
            default:
                ((K) this.f4093b).dismiss();
                return;
        }
    }
}
