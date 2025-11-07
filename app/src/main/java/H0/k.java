package H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k LOG;
    public static final k QUIET;
    public static final k STRICT;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, H0.k] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, H0.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, H0.k] */
    static {
        ?? r3 = new Enum("STRICT", 0);
        STRICT = r3;
        ?? r4 = new Enum("LOG", 1);
        LOG = r4;
        ?? r5 = new Enum("QUIET", 2);
        QUIET = r5;
        $VALUES = new k[]{r3, r4, r5};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
