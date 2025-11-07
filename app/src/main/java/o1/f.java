package o1;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.libraries.barhopper.RecognitionOptions;
import n1.C0393a;
import x1.AbstractC0751y4;

/* loaded from: classes.dex */
public final class f extends zaa {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f4491l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C1.g f4492m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C1.g gVar, int r22) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
        this.f4491l = r22;
        this.f4492m = gVar;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, o1.d
    public void I(Status status, n1.c cVar) {
        switch (this.f4491l) {
            case 1:
                AbstractC0751y4.a(status, cVar, this.f4492m);
                return;
            default:
                super.I(status, cVar);
                return;
        }
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, o1.d
    public void n(Status status, C0393a c0393a) {
        switch (this.f4491l) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                AbstractC0751y4.a(status, c0393a, this.f4492m);
                return;
            default:
                super.n(status, c0393a);
                return;
        }
    }
}
