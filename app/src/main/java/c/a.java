package C;

import S.i;
import S.j;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements j {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f211J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ e f212K;

    public /* synthetic */ a(e eVar, int r22) {
        this.f211J = r22;
        this.f212K = eVar;
    }

    @Override // S.j
    public final Object a0(final i iVar) {
        switch (this.f211J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                final e eVar = this.f212K;
                eVar.getClass();
                eVar.f224d.execute(new Runnable() { // from class: C.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                eVar.b(iVar);
                                return;
                            default:
                                eVar.b(iVar);
                                return;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final e eVar2 = this.f212K;
                eVar2.getClass();
                eVar2.f224d.execute(new Runnable() { // from class: C.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                eVar2.b(iVar);
                                return;
                            default:
                                eVar2.b(iVar);
                                return;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
