package y;

import D.C0042x;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import x1.AbstractC0624h4;

/* renamed from: y.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775d implements InterfaceC0773b {

    /* renamed from: a  reason: collision with root package name */
    public static final x.t f6166a = new x.t(new Object());

    /* renamed from: b  reason: collision with root package name */
    public static final Set f6167b = Collections.singleton(C0042x.f480d);

    @Override // y.InterfaceC0773b
    public final DynamicRangeProfiles a() {
        return null;
    }

    @Override // y.InterfaceC0773b
    public final Set b(C0042x c0042x) {
        boolean equals = C0042x.f480d.equals(c0042x);
        AbstractC0624h4.a("DynamicRange is not supported: " + c0042x, equals);
        return f6167b;
    }

    @Override // y.InterfaceC0773b
    public final Set c() {
        return f6167b;
    }
}
