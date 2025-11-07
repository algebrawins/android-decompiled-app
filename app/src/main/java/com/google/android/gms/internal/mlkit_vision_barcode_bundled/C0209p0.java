package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209p0 extends AbstractC0214s0 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f2957c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0214s0
    public final void a(long j3, Object obj) {
        Object unmodifiableList;
        List list = (List) AbstractC0181e1.i(j3, obj);
        if (list instanceof InterfaceC0207o0) {
            unmodifiableList = ((InterfaceC0207o0) list).c();
        } else {
            if (f2957c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof G0) && (list instanceof i0)) {
                E e4 = (E) ((i0) list);
                boolean z3 = e4.f2786J;
                if (z3 && z3) {
                    e4.f2786J = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC0181e1.p(j3, obj, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0214s0
    public final void b(long j3, Object obj, Object obj2) {
        C0204n0 c0204n0;
        List list = (List) AbstractC0181e1.i(j3, obj2);
        int size = list.size();
        List list2 = (List) AbstractC0181e1.i(j3, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC0207o0) {
                list2 = new C0204n0(size);
            } else if ((list2 instanceof G0) && (list2 instanceof i0)) {
                list2 = ((i0) list2).b(size);
            } else {
                list2 = new ArrayList(size);
            }
            AbstractC0181e1.p(j3, obj, list2);
        } else {
            if (f2957c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                AbstractC0181e1.p(j3, obj, arrayList);
                c0204n0 = arrayList;
            } else if (list2 instanceof Z0) {
                C0204n0 c0204n02 = new C0204n0(list2.size() + size);
                c0204n02.addAll(c0204n02.f2948K.size(), (Z0) list2);
                AbstractC0181e1.p(j3, obj, c0204n02);
                c0204n0 = c0204n02;
            } else if ((list2 instanceof G0) && (list2 instanceof i0)) {
                i0 i0Var = (i0) list2;
                if (!((E) i0Var).f2786J) {
                    list2 = i0Var.b(list2.size() + size);
                    AbstractC0181e1.p(j3, obj, list2);
                }
            }
            list2 = c0204n0;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        AbstractC0181e1.p(j3, obj, list);
    }
}
