package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class J {
    private static final /* synthetic */ J[] $VALUES;
    public static final J BOOLEAN;
    public static final J BYTE_STRING;
    public static final J DOUBLE;
    public static final J ENUM;
    public static final J FLOAT;
    public static final J INT;
    public static final J LONG;
    public static final J MESSAGE;
    public static final J STRING;
    public static final J VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        J j3 = new J("VOID", 0, Void.class, Void.class, null);
        VOID = j3;
        Class cls = Integer.TYPE;
        J j4 = new J("INT", 1, cls, Integer.class, 0);
        INT = j4;
        J j5 = new J("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = j5;
        J j6 = new J("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = j6;
        J j7 = new J("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = j7;
        J j8 = new J("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = j8;
        J j9 = new J("STRING", 6, String.class, String.class, "");
        STRING = j9;
        J j10 = new J("BYTE_STRING", 7, C0111h.class, C0111h.class, C0111h.f2350L);
        BYTE_STRING = j10;
        J j11 = new J("ENUM", 8, cls, Integer.class, null);
        ENUM = j11;
        J j12 = new J("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = j12;
        $VALUES = new J[]{j3, j4, j5, j6, j7, j8, j9, j10, j11, j12};
    }

    public J(String str, int r22, Class cls, Class cls2, Serializable serializable) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) $VALUES.clone();
    }

    public final Class a() {
        return this.boxedType;
    }
}
