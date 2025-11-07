package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: c  reason: collision with root package name */
    public static final H0 f2796c = new H0();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f2798b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final C0220v0 f2797a = new C0220v0(0);

    public static H0 a() {
        return f2796c;
    }

    public final N0 b(Class cls) {
        D0 d02;
        Class cls2;
        Charset charset = AbstractC0192j0.f2920a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f2798b;
            N0 n02 = (N0) concurrentHashMap.get(cls);
            if (n02 == null) {
                C0220v0 c0220v0 = this.f2797a;
                c0220v0.getClass();
                Class cls3 = O0.f2831a;
                if (!AbstractC0168a0.class.isAssignableFrom(cls) && (cls2 = O0.f2831a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                J0 a4 = ((C0218u0) c0220v0.f2985a).a(cls);
                if ((a4.f2808d & 2) == 2) {
                    boolean isAssignableFrom = AbstractC0168a0.class.isAssignableFrom(cls);
                    D d4 = a4.f2805a;
                    if (isAssignableFrom) {
                        d02 = new D0(O0.f2833c, Q.f2841a, d4);
                    } else {
                        W0 w0 = O0.f2832b;
                        P p2 = Q.f2842b;
                        if (p2 != null) {
                            d02 = new D0(w0, p2, d4);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    n02 = d02;
                } else if (AbstractC0168a0.class.isAssignableFrom(cls)) {
                    if (a4.b() - 1 != 1) {
                        int r22 = F0.f2788a;
                        C0212r0 c0212r0 = AbstractC0214s0.f2966b;
                        W0 w02 = O0.f2833c;
                        P p3 = Q.f2841a;
                        int r5 = AbstractC0226y0.f2994a;
                        n02 = C0.C(a4, c0212r0, w02, p3);
                    } else {
                        int r23 = F0.f2788a;
                        C0212r0 c0212r02 = AbstractC0214s0.f2966b;
                        W0 w03 = O0.f2833c;
                        int r52 = AbstractC0226y0.f2994a;
                        n02 = C0.C(a4, c0212r02, w03, null);
                    }
                } else if (a4.b() - 1 != 1) {
                    int r24 = F0.f2788a;
                    C0209p0 c0209p0 = AbstractC0214s0.f2965a;
                    W0 w04 = O0.f2832b;
                    P p4 = Q.f2842b;
                    if (p4 != null) {
                        int r53 = AbstractC0226y0.f2994a;
                        n02 = C0.C(a4, c0209p0, w04, p4);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    int r25 = F0.f2788a;
                    C0209p0 c0209p02 = AbstractC0214s0.f2965a;
                    W0 w05 = O0.f2832b;
                    int r54 = AbstractC0226y0.f2994a;
                    n02 = C0.C(a4, c0209p02, w05, null);
                }
                N0 n03 = (N0) concurrentHashMap.putIfAbsent(cls, n02);
                if (n03 != null) {
                    return n03;
                }
            }
            return n02;
        }
        throw new NullPointerException("messageType");
    }
}
