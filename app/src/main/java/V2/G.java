package V2;

/* loaded from: classes.dex */
public final class G implements N {

    /* renamed from: J  reason: collision with root package name */
    public final boolean f1393J;

    public G(boolean z3) {
        this.f1393J = z3;
    }

    @Override // V2.N
    public final boolean b() {
        return this.f1393J;
    }

    @Override // V2.N
    public final d0 f() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f1393J) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
