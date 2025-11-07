package I;

import D.C0029j;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e0.InterfaceC0247a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC0247a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f747a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f748b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f749c;

    public /* synthetic */ d(int r12, Object obj, Object obj2) {
        this.f747a = r12;
        this.f748b = obj;
        this.f749c = obj2;
    }

    @Override // e0.InterfaceC0247a
    public final void accept(Object obj) {
        switch (this.f747a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C0029j c0029j = (C0029j) obj;
                ((Surface) this.f748b).release();
                ((SurfaceTexture) this.f749c).release();
                return;
            default:
                D.i iVar = (D.i) obj;
                N.f fVar = (N.f) this.f748b;
                N.n nVar = (N.n) this.f749c;
                nVar.close();
                Surface surface = (Surface) fVar.f894h.remove(nVar);
                if (surface != null) {
                    N.h hVar = fVar.f888a;
                    hVar.d(true);
                    hVar.c();
                    hVar.q(surface, true);
                    return;
                }
                return;
        }
    }
}
