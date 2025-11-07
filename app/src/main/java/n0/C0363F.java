package n0;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Serializable;

/* renamed from: n0.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363F extends F2.g implements M2.l {

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ int f4186N = 0;

    /* renamed from: O  reason: collision with root package name */
    public int f4187O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ N f4188P;

    /* renamed from: Q  reason: collision with root package name */
    public Object f4189Q;

    /* renamed from: R  reason: collision with root package name */
    public final /* synthetic */ Object f4190R;

    /* renamed from: S  reason: collision with root package name */
    public final /* synthetic */ Serializable f4191S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363F(N2.o oVar, N n3, N2.m mVar, D2.d dVar) {
        super(1, dVar);
        this.f4190R = oVar;
        this.f4188P = n3;
        this.f4191S = mVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [M2.p, F2.g] */
    @Override // M2.l
    public final Object h(Object obj) {
        D2.d dVar = (D2.d) obj;
        switch (this.f4186N) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new C0363F((N2.o) this.f4190R, this.f4188P, (N2.m) this.f4191S, dVar).k(B2.i.f210a);
            default:
                return new C0363F(this.f4188P, (D2.i) this.f4190R, (M2.p) ((F2.g) this.f4191S), dVar).k(B2.i.f210a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Type inference failed for: r6v2, types: [M2.p, F2.g] */
    @Override // F2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C0363F.k(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363F(N n3, D2.i iVar, M2.p pVar, D2.d dVar) {
        super(1, dVar);
        this.f4188P = n3;
        this.f4190R = iVar;
        this.f4191S = (F2.g) pVar;
    }
}
