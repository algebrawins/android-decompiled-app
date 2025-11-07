package androidx.camera.core.impl;

import D.AbstractC0024d;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface J extends V {

    /* renamed from: n  reason: collision with root package name */
    public static final C0076c f2138n = new C0076c("camerax.core.imageOutput.targetAspectRatio", AbstractC0024d.class, null);

    /* renamed from: o  reason: collision with root package name */
    public static final C0076c f2139o;

    /* renamed from: p  reason: collision with root package name */
    public static final C0076c f2140p;

    /* renamed from: q  reason: collision with root package name */
    public static final C0076c f2141q;

    /* renamed from: r  reason: collision with root package name */
    public static final C0076c f2142r;

    /* renamed from: s  reason: collision with root package name */
    public static final C0076c f2143s;

    /* renamed from: t  reason: collision with root package name */
    public static final C0076c f2144t;

    /* renamed from: u  reason: collision with root package name */
    public static final C0076c f2145u;

    /* renamed from: v  reason: collision with root package name */
    public static final C0076c f2146v;

    /* renamed from: w  reason: collision with root package name */
    public static final C0076c f2147w;

    static {
        Class cls = Integer.TYPE;
        f2139o = new C0076c("camerax.core.imageOutput.targetRotation", cls, null);
        f2140p = new C0076c("camerax.core.imageOutput.appTargetRotation", cls, null);
        f2141q = new C0076c("camerax.core.imageOutput.mirrorMode", cls, null);
        f2142r = new C0076c("camerax.core.imageOutput.targetResolution", Size.class, null);
        f2143s = new C0076c("camerax.core.imageOutput.defaultResolution", Size.class, null);
        f2144t = new C0076c("camerax.core.imageOutput.maxResolution", Size.class, null);
        f2145u = new C0076c("camerax.core.imageOutput.supportedResolutions", List.class, null);
        f2146v = new C0076c("camerax.core.imageOutput.resolutionSelector", O.b.class, null);
        f2147w = new C0076c("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    O.b A();

    Size K();

    boolean M();

    Size Q();

    List R();

    int S();

    O.b U();

    int d();

    int f0();

    int j();

    Size k();

    ArrayList z();
}
