package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099a0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public final D f2330a;

    /* renamed from: b  reason: collision with root package name */
    public final q0 f2331b;

    /* renamed from: c  reason: collision with root package name */
    public final r f2332c;

    public C0099a0(q0 q0Var, r rVar, D d4) {
        this.f2331b = q0Var;
        rVar.getClass();
        this.f2332c = rVar;
        this.f2330a = d4;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean a(Object obj) {
        this.f2332c.getClass();
        D.C.G(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void b(Object obj, C0115m c0115m, C0119q c0119q) {
        this.f2331b.getClass();
        q0.a(obj);
        this.f2332c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void c(Object obj, Object obj2) {
        j0.A(this.f2331b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void d(Object obj, Q q3) {
        this.f2332c.getClass();
        D.C.G(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final int e(D d4) {
        this.f2331b.getClass();
        return d4.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final int f(D d4) {
        this.f2331b.getClass();
        p0 p0Var = d4.unknownFields;
        int r02 = p0Var.f2408d;
        if (r02 == -1) {
            int r12 = 0;
            for (int r03 = 0; r03 < p0Var.f2405a; r03++) {
                int y3 = C0116n.y(2, p0Var.f2406b[r03] >>> 3);
                r12 += C0116n.h(3, (C0111h) p0Var.f2407c[r03]) + y3 + (C0116n.x(1) * 2);
            }
            p0Var.f2408d = r12;
            return r12;
        }
        return r02;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final D g() {
        D d4 = this.f2330a;
        if (d4 instanceof D) {
            return d4.k();
        }
        return ((A) d4.e(C.NEW_BUILDER)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void h(Object obj) {
        this.f2331b.getClass();
        q0.b(obj);
        this.f2332c.getClass();
        D.C.G(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean i(D d4, Object obj) {
        this.f2331b.getClass();
        if (!d4.unknownFields.equals(((D) obj).unknownFields)) {
            return false;
        }
        return true;
    }
}
