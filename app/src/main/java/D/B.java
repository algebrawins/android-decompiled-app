package D;

import androidx.camera.core.impl.C0079f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Iterator;
import x1.AbstractC0612g0;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements androidx.camera.core.impl.a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f279a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f280b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0079f f281c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r0 f282d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.impl.k0 f283e;

    public /* synthetic */ B(r0 r0Var, String str, androidx.camera.core.impl.k0 k0Var, C0079f c0079f, int r5) {
        this.f279a = r5;
        this.f282d = r0Var;
        this.f280b = str;
        this.f283e = k0Var;
        this.f281c = c0079f;
    }

    @Override // androidx.camera.core.impl.a0
    public final void a() {
        switch (this.f279a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                H h3 = (H) this.f282d;
                h3.getClass();
                AbstractC0612g0.a();
                l0 l0Var = h3.f292q;
                if (l0Var != null) {
                    l0Var.a();
                    h3.f292q = null;
                }
                h3.f288m.d();
                String str = this.f280b;
                if (h3.j(str)) {
                    h3.A(h3.B(str, (androidx.camera.core.impl.F) this.f283e, this.f281c).c());
                    h3.n();
                    return;
                }
                return;
            case 1:
                S s3 = (S) this.f282d;
                String str2 = this.f280b;
                if (s3.j(str2)) {
                    E.e eVar = s3.f342r;
                    eVar.getClass();
                    AbstractC0612g0.a();
                    eVar.f512M = true;
                    s3.B(true);
                    androidx.camera.core.impl.Z C3 = s3.C(str2, (androidx.camera.core.impl.G) this.f283e, this.f281c);
                    s3.f340p = C3;
                    s3.A(C3.c());
                    s3.n();
                    E.e eVar2 = s3.f342r;
                    eVar2.getClass();
                    AbstractC0612g0.a();
                    eVar2.f512M = false;
                    eVar2.c();
                    return;
                }
                s3.B(false);
                return;
            case 2:
                e0 e0Var = (e0) this.f282d;
                String str3 = this.f280b;
                if (e0Var.j(str3)) {
                    e0Var.A(e0Var.C(str3, (androidx.camera.core.impl.T) this.f283e, this.f281c).c());
                    e0Var.n();
                    return;
                }
                return;
            default:
                P.a aVar = (P.a) this.f282d;
                aVar.B();
                String str4 = this.f280b;
                if (aVar.j(str4)) {
                    aVar.A(aVar.C(str4, this.f283e, this.f281c));
                    aVar.n();
                    P.c cVar = aVar.f1017n;
                    cVar.getClass();
                    AbstractC0612g0.a();
                    Iterator it = cVar.f1024J.iterator();
                    while (it.hasNext()) {
                        cVar.a((r0) it.next());
                    }
                    return;
                }
                return;
        }
    }
}
