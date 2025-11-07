package e3;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3133a;

    /* renamed from: b  reason: collision with root package name */
    public int f3134b;

    /* renamed from: c  reason: collision with root package name */
    public int f3135c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3136d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3137e;

    /* renamed from: f  reason: collision with root package name */
    public q f3138f;
    public q g;

    public q() {
        this.f3133a = new byte[8192];
        this.f3137e = true;
        this.f3136d = false;
    }

    public final q a() {
        q qVar = this.f3138f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.g;
        N2.g.b(qVar2);
        qVar2.f3138f = this.f3138f;
        q qVar3 = this.f3138f;
        N2.g.b(qVar3);
        qVar3.g = this.g;
        this.f3138f = null;
        this.g = null;
        return qVar;
    }

    public final void b(q qVar) {
        N2.g.e(qVar, "segment");
        qVar.g = this;
        qVar.f3138f = this.f3138f;
        q qVar2 = this.f3138f;
        N2.g.b(qVar2);
        qVar2.g = qVar;
        this.f3138f = qVar;
    }

    public final q c() {
        this.f3136d = true;
        return new q(this.f3133a, this.f3134b, this.f3135c, true);
    }

    public final void d(q qVar, int r7) {
        N2.g.e(qVar, "sink");
        if (qVar.f3137e) {
            int r02 = qVar.f3135c;
            int r12 = r02 + r7;
            byte[] bArr = qVar.f3133a;
            if (r12 > 8192) {
                if (!qVar.f3136d) {
                    int r4 = qVar.f3134b;
                    if (r12 - r4 <= 8192) {
                        C2.h.a(0, r4, r02, bArr, bArr);
                        qVar.f3135c -= qVar.f3134b;
                        qVar.f3134b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int r03 = qVar.f3135c;
            int r13 = this.f3134b;
            C2.h.a(r03, r13, r13 + r7, this.f3133a, bArr);
            qVar.f3135c += r7;
            this.f3134b += r7;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public q(byte[] bArr, int r3, int r4, boolean z3) {
        N2.g.e(bArr, "data");
        this.f3133a = bArr;
        this.f3134b = r3;
        this.f3135c = r4;
        this.f3136d = z3;
        this.f3137e = false;
    }
}
