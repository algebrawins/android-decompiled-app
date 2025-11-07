package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212r0 extends AbstractC0214s0 {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0214s0
    public final void a(long j3, Object obj) {
        E e4 = (E) ((i0) AbstractC0181e1.i(j3, obj));
        if (e4.f2786J) {
            e4.f2786J = false;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0214s0
    public final void b(long j3, Object obj, Object obj2) {
        i0 i0Var = (i0) AbstractC0181e1.i(j3, obj);
        i0 i0Var2 = (i0) AbstractC0181e1.i(j3, obj2);
        int size = i0Var.size();
        int size2 = i0Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((E) i0Var).f2786J) {
                i0Var = i0Var.b(size2 + size);
            }
            i0Var.addAll(i0Var2);
        }
        if (size > 0) {
            i0Var2 = i0Var;
        }
        AbstractC0181e1.p(j3, obj, i0Var2);
    }
}
