package p;

import androidx.appcompat.widget.SearchView;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f4579J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ SearchView f4580K;

    public /* synthetic */ V(SearchView searchView, int r22) {
        this.f4579J = r22;
        this.f4580K = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4579J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f4580K.q();
                return;
            default:
                l0.b bVar = this.f4580K.f1983A0;
                if (bVar instanceof g0) {
                    bVar.b(null);
                    return;
                }
                return;
        }
    }
}
