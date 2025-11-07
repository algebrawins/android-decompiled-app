package io.flutter.plugins.pathprovider;

import java.nio.ByteBuffer;
import r2.q;
import r2.r;

/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: d  reason: collision with root package name */
    public static final b f3662d = new Object();

    @Override // r2.r
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        if (b3 != -127) {
            return super.f(b3, byteBuffer);
        }
        Object e4 = e(byteBuffer);
        if (e4 == null) {
            return null;
        }
        return c.values()[((Long) e4).intValue()];
    }

    @Override // r2.r
    public final void k(q qVar, Object obj) {
        Integer valueOf;
        if (obj instanceof c) {
            qVar.write(129);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(((c) obj).index);
            }
            k(qVar, valueOf);
            return;
        }
        super.k(qVar, obj);
    }
}
