package w;

import A0.C0001b;
import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageWriter;
import x.C0559n;
import z.AbstractC0957j;

/* loaded from: classes.dex */
public final class p0 implements o0 {

    /* renamed from: J  reason: collision with root package name */
    public final C0559n f5221J;

    /* renamed from: K  reason: collision with root package name */
    public final C0001b f5222K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f5223L = false;

    /* renamed from: M  reason: collision with root package name */
    public final boolean f5224M;

    /* renamed from: N  reason: collision with root package name */
    public final boolean f5225N;

    /* renamed from: O  reason: collision with root package name */
    public D.f0 f5226O;

    /* renamed from: P  reason: collision with root package name */
    public D.a0 f5227P;

    /* renamed from: Q  reason: collision with root package name */
    public D.l0 f5228Q;

    /* renamed from: R  reason: collision with root package name */
    public ImageWriter f5229R;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, I.c] */
    public p0(C0559n c0559n) {
        boolean z3;
        this.f5224M = false;
        this.f5225N = false;
        this.f5221J = c0559n;
        int[] r7 = (int[]) c0559n.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (r7 != null) {
            for (int r4 : r7) {
                if (r4 == 4) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        this.f5224M = z3;
        this.f5225N = AbstractC0957j.f6565a.b(z.I.class) != null;
        this.f5222K = new C0001b((I.c) new Object());
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
        r3 = r3.getValidOutputFormatsForInput(34);
     */
    @Override // w.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.camera.core.impl.Z r11) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.p0.b(androidx.camera.core.impl.Z):void");
    }

    @Override // w.o0
    public final void e(boolean z3) {
        this.f5223L = z3;
    }

    @Override // w.o0
    public final void j(boolean z3) {
    }
}
