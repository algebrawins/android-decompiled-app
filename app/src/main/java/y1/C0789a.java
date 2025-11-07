package y1;

/* renamed from: y1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0789a implements InterfaceC0807d {

    /* renamed from: a  reason: collision with root package name */
    public final int f6339a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC0801c f6340b;

    public C0789a(int r12, EnumC0801c enumC0801c) {
        this.f6339a = r12;
        this.f6340b = enumC0801c;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC0807d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC0807d)) {
            return false;
        }
        C0789a c0789a = (C0789a) ((InterfaceC0807d) obj);
        if (this.f6339a == c0789a.f6339a && this.f6340b.equals(c0789a.f6340b)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f6339a ^ 14552422) + (this.f6340b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f6339a + "intEncoding=" + this.f6340b + ')';
    }
}
