package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DOUBLE uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0125x {
    private static final /* synthetic */ EnumC0125x[] $VALUES;
    public static final EnumC0125x BOOL;
    public static final EnumC0125x BOOL_LIST;
    public static final EnumC0125x BOOL_LIST_PACKED;
    public static final EnumC0125x BYTES;
    public static final EnumC0125x BYTES_LIST;
    public static final EnumC0125x DOUBLE;
    public static final EnumC0125x DOUBLE_LIST;
    public static final EnumC0125x DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC0125x ENUM;
    public static final EnumC0125x ENUM_LIST;
    public static final EnumC0125x ENUM_LIST_PACKED;
    public static final EnumC0125x FIXED32;
    public static final EnumC0125x FIXED32_LIST;
    public static final EnumC0125x FIXED32_LIST_PACKED;
    public static final EnumC0125x FIXED64;
    public static final EnumC0125x FIXED64_LIST;
    public static final EnumC0125x FIXED64_LIST_PACKED;
    public static final EnumC0125x FLOAT;
    public static final EnumC0125x FLOAT_LIST;
    public static final EnumC0125x FLOAT_LIST_PACKED;
    public static final EnumC0125x GROUP;
    public static final EnumC0125x GROUP_LIST;
    public static final EnumC0125x INT32;
    public static final EnumC0125x INT32_LIST;
    public static final EnumC0125x INT32_LIST_PACKED;
    public static final EnumC0125x INT64;
    public static final EnumC0125x INT64_LIST;
    public static final EnumC0125x INT64_LIST_PACKED;
    public static final EnumC0125x MAP;
    public static final EnumC0125x MESSAGE;
    public static final EnumC0125x MESSAGE_LIST;
    public static final EnumC0125x SFIXED32;
    public static final EnumC0125x SFIXED32_LIST;
    public static final EnumC0125x SFIXED32_LIST_PACKED;
    public static final EnumC0125x SFIXED64;
    public static final EnumC0125x SFIXED64_LIST;
    public static final EnumC0125x SFIXED64_LIST_PACKED;
    public static final EnumC0125x SINT32;
    public static final EnumC0125x SINT32_LIST;
    public static final EnumC0125x SINT32_LIST_PACKED;
    public static final EnumC0125x SINT64;
    public static final EnumC0125x SINT64_LIST;
    public static final EnumC0125x SINT64_LIST_PACKED;
    public static final EnumC0125x STRING;
    public static final EnumC0125x STRING_LIST;
    public static final EnumC0125x UINT32;
    public static final EnumC0125x UINT32_LIST;
    public static final EnumC0125x UINT32_LIST_PACKED;
    public static final EnumC0125x UINT64;
    public static final EnumC0125x UINT64_LIST;
    public static final EnumC0125x UINT64_LIST_PACKED;
    private static final EnumC0125x[] VALUES;
    private final EnumC0124w collection;
    private final Class<?> elementType;
    private final int id;
    private final J javaType;
    private final boolean primitiveScalar;

    static {
        EnumC0124w enumC0124w = EnumC0124w.SCALAR;
        J j3 = J.DOUBLE;
        EnumC0125x enumC0125x = new EnumC0125x("DOUBLE", 0, 0, enumC0124w, j3);
        DOUBLE = enumC0125x;
        J j4 = J.FLOAT;
        EnumC0125x enumC0125x2 = new EnumC0125x("FLOAT", 1, 1, enumC0124w, j4);
        FLOAT = enumC0125x2;
        J j5 = J.LONG;
        EnumC0125x enumC0125x3 = new EnumC0125x("INT64", 2, 2, enumC0124w, j5);
        INT64 = enumC0125x3;
        EnumC0125x enumC0125x4 = new EnumC0125x("UINT64", 3, 3, enumC0124w, j5);
        UINT64 = enumC0125x4;
        J j6 = J.INT;
        EnumC0125x enumC0125x5 = new EnumC0125x("INT32", 4, 4, enumC0124w, j6);
        INT32 = enumC0125x5;
        EnumC0125x enumC0125x6 = new EnumC0125x("FIXED64", 5, 5, enumC0124w, j5);
        FIXED64 = enumC0125x6;
        EnumC0125x enumC0125x7 = new EnumC0125x("FIXED32", 6, 6, enumC0124w, j6);
        FIXED32 = enumC0125x7;
        J j7 = J.BOOLEAN;
        EnumC0125x enumC0125x8 = new EnumC0125x("BOOL", 7, 7, enumC0124w, j7);
        BOOL = enumC0125x8;
        J j8 = J.STRING;
        EnumC0125x enumC0125x9 = new EnumC0125x("STRING", 8, 8, enumC0124w, j8);
        STRING = enumC0125x9;
        J j9 = J.MESSAGE;
        EnumC0125x enumC0125x10 = new EnumC0125x("MESSAGE", 9, 9, enumC0124w, j9);
        MESSAGE = enumC0125x10;
        J j10 = J.BYTE_STRING;
        EnumC0125x enumC0125x11 = new EnumC0125x("BYTES", 10, 10, enumC0124w, j10);
        BYTES = enumC0125x11;
        EnumC0125x enumC0125x12 = new EnumC0125x("UINT32", 11, 11, enumC0124w, j6);
        UINT32 = enumC0125x12;
        J j11 = J.ENUM;
        EnumC0125x enumC0125x13 = new EnumC0125x("ENUM", 12, 12, enumC0124w, j11);
        ENUM = enumC0125x13;
        EnumC0125x enumC0125x14 = new EnumC0125x("SFIXED32", 13, 13, enumC0124w, j6);
        SFIXED32 = enumC0125x14;
        EnumC0125x enumC0125x15 = new EnumC0125x("SFIXED64", 14, 14, enumC0124w, j5);
        SFIXED64 = enumC0125x15;
        EnumC0125x enumC0125x16 = new EnumC0125x("SINT32", 15, 15, enumC0124w, j6);
        SINT32 = enumC0125x16;
        EnumC0125x enumC0125x17 = new EnumC0125x("SINT64", 16, 16, enumC0124w, j5);
        SINT64 = enumC0125x17;
        EnumC0125x enumC0125x18 = new EnumC0125x("GROUP", 17, 17, enumC0124w, j9);
        GROUP = enumC0125x18;
        EnumC0124w enumC0124w2 = EnumC0124w.VECTOR;
        EnumC0125x enumC0125x19 = new EnumC0125x("DOUBLE_LIST", 18, 18, enumC0124w2, j3);
        DOUBLE_LIST = enumC0125x19;
        EnumC0125x enumC0125x20 = new EnumC0125x("FLOAT_LIST", 19, 19, enumC0124w2, j4);
        FLOAT_LIST = enumC0125x20;
        EnumC0125x enumC0125x21 = new EnumC0125x("INT64_LIST", 20, 20, enumC0124w2, j5);
        INT64_LIST = enumC0125x21;
        EnumC0125x enumC0125x22 = new EnumC0125x("UINT64_LIST", 21, 21, enumC0124w2, j5);
        UINT64_LIST = enumC0125x22;
        EnumC0125x enumC0125x23 = new EnumC0125x("INT32_LIST", 22, 22, enumC0124w2, j6);
        INT32_LIST = enumC0125x23;
        EnumC0125x enumC0125x24 = new EnumC0125x("FIXED64_LIST", 23, 23, enumC0124w2, j5);
        FIXED64_LIST = enumC0125x24;
        EnumC0125x enumC0125x25 = new EnumC0125x("FIXED32_LIST", 24, 24, enumC0124w2, j6);
        FIXED32_LIST = enumC0125x25;
        EnumC0125x enumC0125x26 = new EnumC0125x("BOOL_LIST", 25, 25, enumC0124w2, j7);
        BOOL_LIST = enumC0125x26;
        EnumC0125x enumC0125x27 = new EnumC0125x("STRING_LIST", 26, 26, enumC0124w2, j8);
        STRING_LIST = enumC0125x27;
        EnumC0125x enumC0125x28 = new EnumC0125x("MESSAGE_LIST", 27, 27, enumC0124w2, j9);
        MESSAGE_LIST = enumC0125x28;
        EnumC0125x enumC0125x29 = new EnumC0125x("BYTES_LIST", 28, 28, enumC0124w2, j10);
        BYTES_LIST = enumC0125x29;
        EnumC0125x enumC0125x30 = new EnumC0125x("UINT32_LIST", 29, 29, enumC0124w2, j6);
        UINT32_LIST = enumC0125x30;
        EnumC0125x enumC0125x31 = new EnumC0125x("ENUM_LIST", 30, 30, enumC0124w2, j11);
        ENUM_LIST = enumC0125x31;
        EnumC0125x enumC0125x32 = new EnumC0125x("SFIXED32_LIST", 31, 31, enumC0124w2, j6);
        SFIXED32_LIST = enumC0125x32;
        EnumC0125x enumC0125x33 = new EnumC0125x("SFIXED64_LIST", 32, 32, enumC0124w2, j5);
        SFIXED64_LIST = enumC0125x33;
        EnumC0125x enumC0125x34 = new EnumC0125x("SINT32_LIST", 33, 33, enumC0124w2, j6);
        SINT32_LIST = enumC0125x34;
        EnumC0125x enumC0125x35 = new EnumC0125x("SINT64_LIST", 34, 34, enumC0124w2, j5);
        SINT64_LIST = enumC0125x35;
        EnumC0124w enumC0124w3 = EnumC0124w.PACKED_VECTOR;
        EnumC0125x enumC0125x36 = new EnumC0125x("DOUBLE_LIST_PACKED", 35, 35, enumC0124w3, j3);
        DOUBLE_LIST_PACKED = enumC0125x36;
        EnumC0125x enumC0125x37 = new EnumC0125x("FLOAT_LIST_PACKED", 36, 36, enumC0124w3, j4);
        FLOAT_LIST_PACKED = enumC0125x37;
        EnumC0125x enumC0125x38 = new EnumC0125x("INT64_LIST_PACKED", 37, 37, enumC0124w3, j5);
        INT64_LIST_PACKED = enumC0125x38;
        EnumC0125x enumC0125x39 = new EnumC0125x("UINT64_LIST_PACKED", 38, 38, enumC0124w3, j5);
        UINT64_LIST_PACKED = enumC0125x39;
        EnumC0125x enumC0125x40 = new EnumC0125x("INT32_LIST_PACKED", 39, 39, enumC0124w3, j6);
        INT32_LIST_PACKED = enumC0125x40;
        EnumC0125x enumC0125x41 = new EnumC0125x("FIXED64_LIST_PACKED", 40, 40, enumC0124w3, j5);
        FIXED64_LIST_PACKED = enumC0125x41;
        EnumC0125x enumC0125x42 = new EnumC0125x("FIXED32_LIST_PACKED", 41, 41, enumC0124w3, j6);
        FIXED32_LIST_PACKED = enumC0125x42;
        EnumC0125x enumC0125x43 = new EnumC0125x("BOOL_LIST_PACKED", 42, 42, enumC0124w3, j7);
        BOOL_LIST_PACKED = enumC0125x43;
        EnumC0125x enumC0125x44 = new EnumC0125x("UINT32_LIST_PACKED", 43, 43, enumC0124w3, j6);
        UINT32_LIST_PACKED = enumC0125x44;
        EnumC0125x enumC0125x45 = new EnumC0125x("ENUM_LIST_PACKED", 44, 44, enumC0124w3, j11);
        ENUM_LIST_PACKED = enumC0125x45;
        EnumC0125x enumC0125x46 = new EnumC0125x("SFIXED32_LIST_PACKED", 45, 45, enumC0124w3, j6);
        SFIXED32_LIST_PACKED = enumC0125x46;
        EnumC0125x enumC0125x47 = new EnumC0125x("SFIXED64_LIST_PACKED", 46, 46, enumC0124w3, j5);
        SFIXED64_LIST_PACKED = enumC0125x47;
        EnumC0125x enumC0125x48 = new EnumC0125x("SINT32_LIST_PACKED", 47, 47, enumC0124w3, j6);
        SINT32_LIST_PACKED = enumC0125x48;
        EnumC0125x enumC0125x49 = new EnumC0125x("SINT64_LIST_PACKED", 48, 48, enumC0124w3, j5);
        SINT64_LIST_PACKED = enumC0125x49;
        EnumC0125x enumC0125x50 = new EnumC0125x("GROUP_LIST", 49, 49, enumC0124w2, j9);
        GROUP_LIST = enumC0125x50;
        EnumC0125x enumC0125x51 = new EnumC0125x("MAP", 50, 50, EnumC0124w.MAP, J.VOID);
        MAP = enumC0125x51;
        $VALUES = new EnumC0125x[]{enumC0125x, enumC0125x2, enumC0125x3, enumC0125x4, enumC0125x5, enumC0125x6, enumC0125x7, enumC0125x8, enumC0125x9, enumC0125x10, enumC0125x11, enumC0125x12, enumC0125x13, enumC0125x14, enumC0125x15, enumC0125x16, enumC0125x17, enumC0125x18, enumC0125x19, enumC0125x20, enumC0125x21, enumC0125x22, enumC0125x23, enumC0125x24, enumC0125x25, enumC0125x26, enumC0125x27, enumC0125x28, enumC0125x29, enumC0125x30, enumC0125x31, enumC0125x32, enumC0125x33, enumC0125x34, enumC0125x35, enumC0125x36, enumC0125x37, enumC0125x38, enumC0125x39, enumC0125x40, enumC0125x41, enumC0125x42, enumC0125x43, enumC0125x44, enumC0125x45, enumC0125x46, enumC0125x47, enumC0125x48, enumC0125x49, enumC0125x50, enumC0125x51};
        EMPTY_TYPES = new Type[0];
        EnumC0125x[] values = values();
        VALUES = new EnumC0125x[values.length];
        for (EnumC0125x enumC0125x52 : values) {
            VALUES[enumC0125x52.id] = enumC0125x52;
        }
    }

    public EnumC0125x(String str, int r22, int r3, EnumC0124w enumC0124w, J j3) {
        int r12;
        this.id = r3;
        this.collection = enumC0124w;
        this.javaType = j3;
        int r13 = AbstractC0123v.f2421a[enumC0124w.ordinal()];
        boolean z3 = true;
        if (r13 != 1) {
            if (r13 != 2) {
                this.elementType = null;
            } else {
                this.elementType = j3.a();
            }
        } else {
            this.elementType = j3.a();
        }
        this.primitiveScalar = (enumC0124w != EnumC0124w.SCALAR || (r12 = AbstractC0123v.f2422b[j3.ordinal()]) == 1 || r12 == 2 || r12 == 3) ? false : false;
    }

    public static EnumC0125x valueOf(String str) {
        return (EnumC0125x) Enum.valueOf(EnumC0125x.class, str);
    }

    public static EnumC0125x[] values() {
        return (EnumC0125x[]) $VALUES.clone();
    }

    public final int a() {
        return this.id;
    }
}
