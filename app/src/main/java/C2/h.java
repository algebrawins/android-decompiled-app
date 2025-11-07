package C2;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static Context f267a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f268b;

    public static void a(int r12, int r22, int r3, byte[] bArr, byte[] bArr2) {
        N2.g.e(bArr, "<this>");
        N2.g.e(bArr2, "destination");
        System.arraycopy(bArr, r22, bArr2, r12, r3 - r22);
    }

    public static final void b(Object[] objArr, Object[] objArr2, int r3, int r4, int r5) {
        N2.g.e(objArr, "<this>");
        N2.g.e(objArr2, "destination");
        System.arraycopy(objArr, r4, objArr2, r3, r5 - r4);
    }

    public static final void c(int r3, int r4) {
        if (r3 <= r4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + r3 + ") is greater than size (" + r4 + ").");
    }
}
