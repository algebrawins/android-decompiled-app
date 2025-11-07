package r;

import java.util.HashMap;

/* renamed from: r.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436a extends C0441f {

    /* renamed from: N  reason: collision with root package name */
    public final HashMap f4855N = new HashMap();

    @Override // r.C0441f
    public final C0438c e(Object obj) {
        return (C0438c) this.f4855N.get(obj);
    }

    @Override // r.C0441f
    public final Object h(Object obj) {
        Object h3 = super.h(obj);
        this.f4855N.remove(obj);
        return h3;
    }
}
