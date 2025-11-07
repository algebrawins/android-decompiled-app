package androidx.camera.core.impl;

import D.C0036q;
import android.util.Range;
import w.C0485A;
import w.C0488D;

/* loaded from: classes.dex */
public interface k0 extends I.l, I.n, H {

    /* renamed from: E  reason: collision with root package name */
    public static final C0076c f2215E;

    /* renamed from: F  reason: collision with root package name */
    public static final C0076c f2216F;

    /* renamed from: G  reason: collision with root package name */
    public static final C0076c f2217G;

    /* renamed from: x  reason: collision with root package name */
    public static final C0076c f2218x = new C0076c("camerax.core.useCase.defaultSessionConfig", c0.class, null);

    /* renamed from: y  reason: collision with root package name */
    public static final C0076c f2219y = new C0076c("camerax.core.useCase.defaultCaptureConfig", C0096y.class, null);

    /* renamed from: z  reason: collision with root package name */
    public static final C0076c f2220z = new C0076c("camerax.core.useCase.sessionConfigUnpacker", C0488D.class, null);

    /* renamed from: A  reason: collision with root package name */
    public static final C0076c f2211A = new C0076c("camerax.core.useCase.captureConfigUnpacker", C0485A.class, null);

    /* renamed from: B  reason: collision with root package name */
    public static final C0076c f2212B = new C0076c("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE, null);

    /* renamed from: C  reason: collision with root package name */
    public static final C0076c f2213C = new C0076c("camerax.core.useCase.cameraSelector", C0036q.class, null);

    /* renamed from: D  reason: collision with root package name */
    public static final C0076c f2214D = new C0076c("camerax.core.useCase.targetFrameRate", Range.class, null);

    static {
        Class cls = Boolean.TYPE;
        f2215E = new C0076c("camerax.core.useCase.zslDisabled", cls, null);
        f2216F = new C0076c("camerax.core.useCase.highResolutionDisabled", cls, null);
        f2217G = new C0076c("camerax.core.useCase.captureType", m0.class, null);
    }

    boolean O();

    Range W();

    int i();

    m0 m();

    C0036q p();

    boolean t();

    c0 u();

    int v();

    C0488D y();
}
