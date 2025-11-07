package x1;

/* loaded from: classes.dex */
public final class N implements S {

    /* renamed from: a  reason: collision with root package name */
    public final int f5675a;

    /* renamed from: b  reason: collision with root package name */
    public final Q f5676b;

    public N(int r12, Q q3) {
        this.f5675a = r12;
        this.f5676b = q3;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return S.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        N n3 = (N) ((S) obj);
        if (this.f5675a == n3.f5675a && this.f5676b.equals(n3.f5676b)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f5675a ^ 14552422) + (this.f5676b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f5675a + "intEncoding=" + this.f5676b + ')';
    }
}
