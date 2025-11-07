package n0;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: n0.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384q extends F2.g implements M2.q {

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ int f4308N = 1;

    /* renamed from: O  reason: collision with root package name */
    public int f4309O;

    /* renamed from: P  reason: collision with root package name */
    public /* synthetic */ Object f4310P;

    public /* synthetic */ C0384q(int r22, D2.d dVar) {
        super(r22, dVar);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        switch (this.f4308N) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                E2.a aVar = E2.a.COROUTINE_SUSPENDED;
                int r12 = this.f4309O;
                if (r12 != 0) {
                    if (r12 == 1) {
                        P1.a.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    P1.a.b(obj);
                    this.f4309O = 1;
                    if (N.a((N) this.f4310P, this) == aVar) {
                        return aVar;
                    }
                }
                return B2.i.f210a;
            default:
                E2.a aVar2 = E2.a.COROUTINE_SUSPENDED;
                int r13 = this.f4309O;
                if (r13 != 0) {
                    if (r13 == 1) {
                        P1.a.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    P1.a.b(obj);
                    p0.b bVar = (p0.b) this.f4310P;
                    this.f4309O = 1;
                    bVar.getClass();
                    obj = p0.b.a(bVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                return obj;
        }
    }

    public final Object p(Object obj, Object obj2, F2.b bVar) {
        switch (this.f4308N) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Y2.e eVar = (Y2.e) obj;
                Throwable th = (Throwable) obj2;
                return new C0384q((N) this.f4310P, bVar).k(B2.i.f210a);
            default:
                ((Boolean) obj2).getClass();
                C0384q c0384q = new C0384q(3, bVar);
                c0384q.f4310P = (p0.b) obj;
                return c0384q.k(B2.i.f210a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0384q(N n3, D2.d dVar) {
        super(3, dVar);
        this.f4310P = n3;
    }
}
