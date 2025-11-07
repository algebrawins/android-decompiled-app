package h2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ s[] $VALUES;
    public static final s BOTH;
    public static final s LEFT;
    public static final s NONE;
    public static final s RIGHT;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, h2.s] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, h2.s] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, h2.s] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, h2.s] */
    static {
        ?? r4 = new Enum("NONE", 0);
        NONE = r4;
        ?? r5 = new Enum("LEFT", 1);
        LEFT = r5;
        ?? r6 = new Enum("RIGHT", 2);
        RIGHT = r6;
        ?? r7 = new Enum("BOTH", 3);
        BOTH = r7;
        $VALUES = new s[]{r4, r5, r6, r7};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
