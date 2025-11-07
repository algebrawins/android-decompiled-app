package A0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: A0.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016s extends AbstractC0017t {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f156K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0016s(z zVar, int r22) {
        super(zVar);
        this.f156K = r22;
    }

    @Override // A0.AbstractC0017t
    public final int i(View view) {
        switch (this.f156K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((z) this.f157J).getClass();
                return view.getRight() + ((A) view.getLayoutParams()).f31a.right + ((ViewGroup.MarginLayoutParams) ((A) view.getLayoutParams())).rightMargin;
            default:
                ((z) this.f157J).getClass();
                return view.getBottom() + ((A) view.getLayoutParams()).f31a.bottom + ((ViewGroup.MarginLayoutParams) ((A) view.getLayoutParams())).bottomMargin;
        }
    }

    @Override // A0.AbstractC0017t
    public final int n(View view) {
        switch (this.f156K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((z) this.f157J).getClass();
                return (view.getLeft() - ((A) view.getLayoutParams()).f31a.left) - ((ViewGroup.MarginLayoutParams) ((A) view.getLayoutParams())).leftMargin;
            default:
                ((z) this.f157J).getClass();
                return (view.getTop() - ((A) view.getLayoutParams()).f31a.top) - ((ViewGroup.MarginLayoutParams) ((A) view.getLayoutParams())).topMargin;
        }
    }

    @Override // A0.AbstractC0017t
    public final int o() {
        switch (this.f156K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                z zVar = (z) this.f157J;
                return zVar.f167f - zVar.t();
            default:
                z zVar2 = (z) this.f157J;
                return zVar2.g - zVar2.r();
        }
    }

    @Override // A0.AbstractC0017t
    public final int p() {
        switch (this.f156K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((z) this.f157J).s();
            default:
                return ((z) this.f157J).u();
        }
    }

    @Override // A0.AbstractC0017t
    public final int q() {
        switch (this.f156K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                z zVar = (z) this.f157J;
                return (zVar.f167f - zVar.s()) - zVar.t();
            default:
                z zVar2 = (z) this.f157J;
                return (zVar2.g - zVar2.u()) - zVar2.r();
        }
    }
}
