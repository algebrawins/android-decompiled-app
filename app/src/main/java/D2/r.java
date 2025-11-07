package d2;

/* loaded from: classes.dex */
public final class r implements r2.p {

    /* renamed from: J  reason: collision with root package name */
    public final A.f f3059J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f3060K;

    public r(A.f fVar) {
        this.f3059J = fVar;
    }

    @Override // r2.p
    public final boolean a(int r3, String[] strArr, int[] r5) {
        N2.g.e(strArr, "permissions");
        N2.g.e(r5, "grantResults");
        if (this.f3060K || r3 != 1926) {
            return false;
        }
        this.f3060K = true;
        int length = r5.length;
        A.f fVar = this.f3059J;
        if (length == 0 || r5[0] != 0) {
            fVar.w("CameraAccessDenied", "Camera access permission was denied.");
        } else {
            fVar.w(null, null);
        }
        return true;
    }
}
