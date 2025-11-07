package n0;

/* loaded from: classes.dex */
public final class b0 implements D2.g {

    /* renamed from: J  reason: collision with root package name */
    public final b0 f4258J;

    /* renamed from: K  reason: collision with root package name */
    public final N f4259K;

    public b0(b0 b0Var, N n3) {
        N2.g.e(n3, "instance");
        this.f4258J = b0Var;
        this.f4259K = n3;
    }

    public final void c(N n3) {
        if (this.f4259K != n3) {
            b0 b0Var = this.f4258J;
            if (b0Var != null) {
                b0Var.c(n3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override // D2.i
    public final D2.g f(D2.h hVar) {
        return x1.Z.a(this, hVar);
    }

    @Override // D2.g
    public final D2.h getKey() {
        return a0.f4257J;
    }

    @Override // D2.i
    public final Object j(Object obj, M2.p pVar) {
        return pVar.g(obj, this);
    }

    @Override // D2.i
    public final D2.i k(D2.i iVar) {
        N2.g.e(iVar, "context");
        if (iVar == D2.j.f492J) {
            return this;
        }
        return (D2.i) iVar.j(this, new D2.b(1));
    }

    @Override // D2.i
    public final D2.i n(D2.h hVar) {
        return x1.Z.b(this, hVar);
    }
}
