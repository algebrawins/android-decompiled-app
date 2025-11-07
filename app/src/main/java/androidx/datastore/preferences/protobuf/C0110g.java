package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110g extends C0111h {

    /* renamed from: N  reason: collision with root package name */
    public final int f2345N;

    /* renamed from: O  reason: collision with root package name */
    public final int f2346O;

    public C0110g(byte[] bArr, int r3, int r4) {
        super(bArr);
        C0111h.h(r3, r3 + r4, bArr.length);
        this.f2345N = r3;
        this.f2346O = r4;
    }

    @Override // androidx.datastore.preferences.protobuf.C0111h
    public final byte e(int r5) {
        int r12 = this.f2346O;
        if (((r12 - (r5 + 1)) | r5) < 0) {
            if (r5 < 0) {
                throw new ArrayIndexOutOfBoundsException(D.C.w("Index < 0: ", r5));
            }
            throw new ArrayIndexOutOfBoundsException(D.C.x("Index > length: ", r5, ", ", r12));
        }
        return this.f2353K[this.f2345N + r5];
    }

    @Override // androidx.datastore.preferences.protobuf.C0111h
    public final void j(byte[] bArr, int r5) {
        System.arraycopy(this.f2353K, this.f2345N, bArr, 0, r5);
    }

    @Override // androidx.datastore.preferences.protobuf.C0111h
    public final int k() {
        return this.f2345N;
    }

    @Override // androidx.datastore.preferences.protobuf.C0111h
    public final byte l(int r22) {
        return this.f2353K[this.f2345N + r22];
    }

    @Override // androidx.datastore.preferences.protobuf.C0111h
    public final int size() {
        return this.f2346O;
    }
}
