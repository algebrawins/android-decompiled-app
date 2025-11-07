package q0;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0111h;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.InterfaceC0105d0;
import androidx.datastore.preferences.protobuf.h0;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class k extends D {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC0105d0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        D.l(k.class, kVar);
    }

    public static i F() {
        return (i) ((A) DEFAULT_INSTANCE.e(C.NEW_BUILDER));
    }

    public static void n(k kVar, long j3) {
        kVar.valueCase_ = 4;
        kVar.value_ = Long.valueOf(j3);
    }

    public static void o(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.valueCase_ = 5;
        kVar.value_ = str;
    }

    public static void p(k kVar, h hVar) {
        kVar.getClass();
        kVar.value_ = hVar;
        kVar.valueCase_ = 6;
    }

    public static void q(k kVar, double d4) {
        kVar.valueCase_ = 7;
        kVar.value_ = Double.valueOf(d4);
    }

    public static void r(k kVar, C0111h c0111h) {
        kVar.getClass();
        kVar.valueCase_ = 8;
        kVar.value_ = c0111h;
    }

    public static void s(k kVar, boolean z3) {
        kVar.valueCase_ = 1;
        kVar.value_ = Boolean.valueOf(z3);
    }

    public static void t(k kVar, float f2) {
        kVar.valueCase_ = 2;
        kVar.value_ = Float.valueOf(f2);
    }

    public static void u(k kVar, int r22) {
        kVar.valueCase_ = 3;
        kVar.value_ = Integer.valueOf(r22);
    }

    public static k x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String C() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final h D() {
        if (this.valueCase_ == 6) {
            return (h) this.value_;
        }
        return h.o();
    }

    public final j E() {
        switch (this.valueCase_) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return j.VALUE_NOT_SET;
            case 1:
                return j.BOOLEAN;
            case 2:
                return j.FLOAT;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return j.INTEGER;
            case 4:
                return j.LONG;
            case STRING_FIELD_NUMBER /* 5 */:
                return j.STRING;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return j.STRING_SET;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return j.DOUBLE;
            case 8:
                return j.BYTES;
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.datastore.preferences.protobuf.d0, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.D
    public final Object e(C c4) {
        switch (AbstractC0432c.f4798a[c4.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new A(DEFAULT_INSTANCE);
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new h0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0105d0 interfaceC0105d0 = PARSER;
                InterfaceC0105d0 interfaceC0105d02 = interfaceC0105d0;
                if (interfaceC0105d0 == null) {
                    synchronized (k.class) {
                        try {
                            InterfaceC0105d0 interfaceC0105d03 = PARSER;
                            InterfaceC0105d0 interfaceC0105d04 = interfaceC0105d03;
                            if (interfaceC0105d03 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                interfaceC0105d04 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC0105d02;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0111h w() {
        if (this.valueCase_ == 8) {
            return (C0111h) this.value_;
        }
        return C0111h.f2350L;
    }

    public final double y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
