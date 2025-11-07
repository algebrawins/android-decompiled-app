package h1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f3274m;

    public l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f3274m = bArr;
    }

    @Override // h1.k
    public final byte[] Y() {
        return this.f3274m;
    }
}
