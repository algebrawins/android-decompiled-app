package K0;

import com.google.android.libraries.barhopper.RecognitionOptions;
import e0.InterfaceC0247a;
import h2.t;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0247a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f835a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f836b;

    public /* synthetic */ i(int r12, Object obj) {
        this.f835a = r12;
        this.f836b = obj;
    }

    @Override // e0.InterfaceC0247a
    public final void accept(Object obj) {
        switch (this.f835a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((X2.p) ((X2.q) this.f836b)).g((l) obj);
                return;
            default:
                ((t) this.f836b).setWindowInfoListenerDisplayFeatures((l) obj);
                return;
        }
    }
}
