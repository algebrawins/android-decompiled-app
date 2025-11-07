package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT64 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class D0 {
    private static final /* synthetic */ D0[] $VALUES;
    public static final D0 BOOL;
    public static final D0 BYTES;
    public static final D0 DOUBLE;
    public static final D0 ENUM;
    public static final D0 FIXED32;
    public static final D0 FIXED64;
    public static final D0 FLOAT;
    public static final D0 GROUP;
    public static final D0 INT32;
    public static final D0 INT64;
    public static final D0 MESSAGE;
    public static final D0 SFIXED32;
    public static final D0 SFIXED64;
    public static final D0 SINT32;
    public static final D0 SINT64;
    public static final D0 STRING;
    public static final D0 UINT32;
    public static final D0 UINT64;
    private final E0 javaType;
    private final int wireType;

    static {
        D0 d02 = new D0("DOUBLE", 0, E0.DOUBLE, 1);
        DOUBLE = d02;
        D0 d03 = new D0("FLOAT", 1, E0.FLOAT, 5);
        FLOAT = d03;
        E0 e02 = E0.LONG;
        D0 d04 = new D0("INT64", 2, e02, 0);
        INT64 = d04;
        D0 d05 = new D0("UINT64", 3, e02, 0);
        UINT64 = d05;
        E0 e03 = E0.INT;
        D0 d06 = new D0("INT32", 4, e03, 0);
        INT32 = d06;
        D0 d07 = new D0("FIXED64", 5, e02, 1);
        FIXED64 = d07;
        D0 d08 = new D0("FIXED32", 6, e03, 5);
        FIXED32 = d08;
        D0 d09 = new D0("BOOL", 7, E0.BOOLEAN, 0);
        BOOL = d09;
        D0 d010 = new D0("STRING", 8, E0.STRING, 2);
        STRING = d010;
        E0 e04 = E0.MESSAGE;
        D0 d011 = new D0("GROUP", 9, e04, 3);
        GROUP = d011;
        D0 d012 = new D0("MESSAGE", 10, e04, 2);
        MESSAGE = d012;
        D0 d013 = new D0("BYTES", 11, E0.BYTE_STRING, 2);
        BYTES = d013;
        D0 d014 = new D0("UINT32", 12, e03, 0);
        UINT32 = d014;
        D0 d015 = new D0("ENUM", 13, E0.ENUM, 0);
        ENUM = d015;
        D0 d016 = new D0("SFIXED32", 14, e03, 5);
        SFIXED32 = d016;
        D0 d017 = new D0("SFIXED64", 15, e02, 1);
        SFIXED64 = d017;
        D0 d018 = new D0("SINT32", 16, e03, 0);
        SINT32 = d018;
        D0 d019 = new D0("SINT64", 17, e02, 0);
        SINT64 = d019;
        $VALUES = new D0[]{d02, d03, d04, d05, d06, d07, d08, d09, d010, d011, d012, d013, d014, d015, d016, d017, d018, d019};
    }

    public D0(String str, int r22, E0 e02, int r4) {
        this.javaType = e02;
        this.wireType = r4;
    }

    public static D0 valueOf(String str) {
        return (D0) Enum.valueOf(D0.class, str);
    }

    public static D0[] values() {
        return (D0[]) $VALUES.clone();
    }

    public final E0 a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }
}
