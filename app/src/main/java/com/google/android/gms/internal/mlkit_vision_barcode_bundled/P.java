package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Map;

/* loaded from: classes.dex */
public final class P {
    public static int a(Map.Entry entry) {
        return ((Y) entry.getKey()).f2865J;
    }

    public static S b(Object obj) {
        return ((X) obj).zza;
    }

    public static void c(Object obj) {
        ((X) obj).zza.e();
    }

    public static void d(C0220v0 c0220v0, Map.Entry entry) {
        Y y3 = (Y) entry.getKey();
        EnumC0190h1 enumC0190h1 = EnumC0190h1.zza;
        int ordinal = y3.f2866K.ordinal();
        int r02 = y3.f2865J;
        switch (ordinal) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                c0220v0.h(r02, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                c0220v0.l(r02, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                c0220v0.o(((Long) entry.getValue()).longValue(), r02);
                return;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                c0220v0.d(((Long) entry.getValue()).longValue(), r02);
                return;
            case 4:
                c0220v0.n(r02, ((Integer) entry.getValue()).intValue());
                return;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                c0220v0.k(((Long) entry.getValue()).longValue(), r02);
                return;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0220v0.j(r02, ((Integer) entry.getValue()).intValue());
                return;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0220v0.e(r02, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                ((M) c0220v0.f2985a).C((String) entry.getValue(), r02);
                return;
            case 9:
                c0220v0.m(r02, entry.getValue(), H0.f2796c.b(entry.getValue().getClass()));
                return;
            case 10:
                c0220v0.p(r02, entry.getValue(), H0.f2796c.b(entry.getValue().getClass()));
                return;
            case 11:
                c0220v0.g(r02, (L) entry.getValue());
                return;
            case 12:
                c0220v0.c(r02, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                c0220v0.n(r02, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                c0220v0.r(r02, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                c0220v0.s(((Long) entry.getValue()).longValue(), r02);
                return;
            case 16:
                c0220v0.a(r02, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                c0220v0.b(((Long) entry.getValue()).longValue(), r02);
                return;
            default:
                return;
        }
    }
}
