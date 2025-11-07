package D;

import android.os.Handler;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.EnumC0097z;
import java.util.Set;
import java.util.concurrent.Executor;
import u.C0462a;
import u.C0463b;
import u.C0464c;

/* renamed from: D.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041w implements I.l {

    /* renamed from: K  reason: collision with root package name */
    public static final C0076c f471K = new C0076c("camerax.core.appConfig.cameraFactoryProvider", C0462a.class, null);

    /* renamed from: L  reason: collision with root package name */
    public static final C0076c f472L = new C0076c("camerax.core.appConfig.deviceSurfaceManagerProvider", C0463b.class, null);

    /* renamed from: M  reason: collision with root package name */
    public static final C0076c f473M = new C0076c("camerax.core.appConfig.useCaseConfigFactoryProvider", C0464c.class, null);

    /* renamed from: N  reason: collision with root package name */
    public static final C0076c f474N = new C0076c("camerax.core.appConfig.cameraExecutor", Executor.class, null);

    /* renamed from: O  reason: collision with root package name */
    public static final C0076c f475O = new C0076c("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    /* renamed from: P  reason: collision with root package name */
    public static final C0076c f476P = new C0076c("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

    /* renamed from: Q  reason: collision with root package name */
    public static final C0076c f477Q = new C0076c("camerax.core.appConfig.availableCamerasLimiter", C0036q.class, null);

    /* renamed from: J  reason: collision with root package name */
    public final androidx.camera.core.impl.S f478J;

    public C0041w(androidx.camera.core.impl.S s3) {
        this.f478J = s3;
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ Object E(C0076c c0076c, EnumC0097z enumC0097z) {
        return C.q(this, c0076c, enumC0097z);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ Set J(C0076c c0076c) {
        return C.g(this, c0076c);
    }

    @Override // I.l
    public final /* synthetic */ String L() {
        throw null;
    }

    @Override // I.l
    public final /* synthetic */ String N(String str) {
        throw null;
    }

    @Override // androidx.camera.core.impl.V
    public final androidx.camera.core.impl.A V() {
        return this.f478J;
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ void X(C.f fVar) {
        C.b(this, fVar);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ Object e(C0076c c0076c) {
        return C.o(this, c0076c);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ EnumC0097z g0(C0076c c0076c) {
        return C.f(this, c0076c);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ Object i0(C0076c c0076c, Object obj) {
        return C.p(this, c0076c, obj);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ Set o() {
        return C.n(this);
    }

    @Override // androidx.camera.core.impl.A
    public final /* synthetic */ boolean q(C0076c c0076c) {
        return C.a(this, c0076c);
    }
}
