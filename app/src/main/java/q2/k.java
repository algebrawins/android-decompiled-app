package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k HYBRID_ONLY;
    public static final k TEXTURE_WITH_HYBRID_FALLBACK;
    public static final k TEXTURE_WITH_VIRTUAL_FALLBACK;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, q2.k] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, q2.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, q2.k] */
    static {
        ?? r3 = new Enum("TEXTURE_WITH_VIRTUAL_FALLBACK", 0);
        TEXTURE_WITH_VIRTUAL_FALLBACK = r3;
        ?? r4 = new Enum("TEXTURE_WITH_HYBRID_FALLBACK", 1);
        TEXTURE_WITH_HYBRID_FALLBACK = r4;
        ?? r5 = new Enum("HYBRID_ONLY", 2);
        HYBRID_ONLY = r5;
        $VALUES = new k[]{r3, r4, r5};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
