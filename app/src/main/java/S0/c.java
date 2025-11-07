package S0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c DEFAULT;
    public static final c HIGHEST;
    public static final c VERY_LOW;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, S0.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, S0.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, S0.c] */
    static {
        ?? r3 = new Enum("DEFAULT", 0);
        DEFAULT = r3;
        ?? r4 = new Enum("VERY_LOW", 1);
        VERY_LOW = r4;
        ?? r5 = new Enum("HIGHEST", 2);
        HIGHEST = r5;
        $VALUES = new c[]{r3, r4, r5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
