package p;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class G implements AdapterView.OnItemSelectedListener {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f4527J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f4528K;

    public /* synthetic */ G(int r12, Object obj) {
        this.f4527J = r12;
        this.f4528K = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int r3, long j3) {
        M m3;
        switch (this.f4527J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (r3 != -1 && (m3 = ((K) this.f4528K).f4538L) != null) {
                    m3.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f4528K).m(r3);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int r12 = this.f4527J;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
