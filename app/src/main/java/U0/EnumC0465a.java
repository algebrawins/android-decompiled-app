package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0465a {
    private static final /* synthetic */ EnumC0465a[] $VALUES;
    public static final EnumC0465a DETECT_FRAGMENT_REUSE;
    public static final EnumC0465a DETECT_FRAGMENT_TAG_USAGE;
    public static final EnumC0465a DETECT_RETAIN_INSTANCE_USAGE;
    public static final EnumC0465a DETECT_SET_USER_VISIBLE_HINT;
    public static final EnumC0465a DETECT_TARGET_FRAGMENT_USAGE;
    public static final EnumC0465a DETECT_WRONG_FRAGMENT_CONTAINER;
    public static final EnumC0465a DETECT_WRONG_NESTED_HIERARCHY;
    public static final EnumC0465a PENALTY_DEATH;
    public static final EnumC0465a PENALTY_LOG;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, u0.a] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, u0.a] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, u0.a] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, u0.a] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, u0.a] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, u0.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u0.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, u0.a] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Enum, u0.a] */
    static {
        ?? r9 = new Enum("PENALTY_LOG", 0);
        PENALTY_LOG = r9;
        ?? r10 = new Enum("PENALTY_DEATH", 1);
        PENALTY_DEATH = r10;
        ?? r11 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        DETECT_FRAGMENT_REUSE = r11;
        ?? r12 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        DETECT_FRAGMENT_TAG_USAGE = r12;
        ?? r13 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        DETECT_WRONG_NESTED_HIERARCHY = r13;
        ?? r14 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        DETECT_RETAIN_INSTANCE_USAGE = r14;
        ?? r15 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        DETECT_SET_USER_VISIBLE_HINT = r15;
        ?? r3 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        DETECT_TARGET_FRAGMENT_USAGE = r3;
        ?? r22 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        DETECT_WRONG_FRAGMENT_CONTAINER = r22;
        $VALUES = new EnumC0465a[]{r9, r10, r11, r12, r13, r14, r15, r3, r22};
    }

    public static EnumC0465a valueOf(String str) {
        return (EnumC0465a) Enum.valueOf(EnumC0465a.class, str);
    }

    public static EnumC0465a[] values() {
        return (EnumC0465a[]) $VALUES.clone();
    }
}
