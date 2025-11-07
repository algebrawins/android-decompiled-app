package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.c1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175c1 extends AbstractC0178d1 {
    public C0175c1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0178d1
    public final double a(long j3, Object obj) {
        return Double.longBitsToDouble(this.f2896a.getLong(obj, j3));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0178d1
    public final float b(long j3, Object obj) {
        return Float.intBitsToFloat(this.f2896a.getInt(obj, j3));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0178d1
    public final void c(Object obj, long j3, boolean z3) {
        if (AbstractC0181e1.g) {
            AbstractC0181e1.b(obj, j3, z3 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC0181e1.c(obj, j3, z3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0178d1
    public final void d(Object obj, long j3, byte b3) {
        if (AbstractC0181e1.g) {
            AbstractC0181e1.b(obj, j3, b3);
        } else {
            AbstractC0181e1.c(obj, j3, b3);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0178d1
    public final void e(Object obj, long j3, double d4) {
        this.f2896a.putLong(obj, j3, Double.doubleToLongBits(d4));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0178d1
    public final void f(Object obj, long j3, float f2) {
        this.f2896a.putInt(obj, j3, Float.floatToIntBits(f2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0178d1
    public final boolean g(long j3, Object obj) {
        if (AbstractC0181e1.g) {
            return AbstractC0181e1.q(j3, obj);
        }
        return AbstractC0181e1.r(j3, obj);
    }
}
