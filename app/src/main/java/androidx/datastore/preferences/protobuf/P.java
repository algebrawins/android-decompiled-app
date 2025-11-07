package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class P implements X {

    /* renamed from: a  reason: collision with root package name */
    public X[] f2304a;

    @Override // androidx.datastore.preferences.protobuf.X
    public final boolean a(Class cls) {
        for (X x3 : this.f2304a) {
            if (x3.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final h0 b(Class cls) {
        X[] xArr;
        for (X x3 : this.f2304a) {
            if (x3.a(cls)) {
                return x3.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
